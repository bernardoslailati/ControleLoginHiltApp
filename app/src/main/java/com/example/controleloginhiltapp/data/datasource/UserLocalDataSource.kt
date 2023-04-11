package com.example.controleloginhiltapp.data.datasource

import com.example.controleloginhiltapp.data.model.Profile

interface UserLocalDataSource {
    
    fun getProfile(): Profile
    
}