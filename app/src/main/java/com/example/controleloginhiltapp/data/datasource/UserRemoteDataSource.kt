package com.example.controleloginhiltapp.data.datasource

interface UserRemoteDataSource {
    
    fun login(email: String, password: String): Boolean
    
}