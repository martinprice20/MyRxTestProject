package com.example.myrxtestproject.di

import com.example.myrxtestproject.data.MyRepositoryImpl
import com.example.myrxtestproject.data.remote.ToDoApi
import com.example.myrxtestproject.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideToDoApi() : ToDoApi {
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ToDoApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMyRepository(api: ToDoApi) : MyRepository {
        return MyRepositoryImpl(api)
    }
}