package com.example.myrxtestproject.domain.repository

import com.example.myrxtestproject.model.ToDo
import io.reactivex.rxjava3.core.Single

interface MyRepository {
    fun getTodos(): Single<List<ToDo>>
}