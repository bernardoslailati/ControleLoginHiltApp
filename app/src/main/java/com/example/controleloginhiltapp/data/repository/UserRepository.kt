package com.example.controleloginhiltapp.data.repository

import com.example.controleloginhiltapp.data.model.Profile

interface UserRepository {
    
    fun login(email: String, password: String): Boolean
    
    fun getProfile(): Profile
    
}