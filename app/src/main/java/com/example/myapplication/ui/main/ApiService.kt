package com.example.myapplication.ui.main

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("api/Activities")
    fun getEmployeeData(): Call<List<Employee>>
}