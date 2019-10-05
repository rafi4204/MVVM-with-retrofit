package com.example.myapplication.ui.main

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("v1/employees")
    fun getEmployeeData(): Call<List<Employee>>
}