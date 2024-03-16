package com.example.myrxtestproject.data

import com.example.myrxtestproject.data.remote.ToDoApi
import com.example.myrxtestproject.domain.repository.MyRepository
import com.example.myrxtestproject.model.ToDo
import io.reactivex.rxjava3.core.Single

class MyRepositoryImpl(
    private val api : ToDoApi
) : MyRepository {
    override fun getTodos(): Single<List<ToDo>> {
        TODO("Not yet implemented")
    }
}