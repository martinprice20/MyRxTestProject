package com.example.myrxtestproject.data.remote

import com.example.myrxtestproject.model.ToDo
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface ToDoApi {

    @GET("/todos")
    fun getTodos(): Single<List<ToDo>>

}
