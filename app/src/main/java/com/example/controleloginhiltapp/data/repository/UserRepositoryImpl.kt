package com.example.controleloginhiltapp.data.repository

import com.example.controleloginhiltapp.data.datasource.UserLocalDataSource
import com.example.controleloginhiltapp.data.datasource.UserRemoteDataSource
import com.example.controleloginhiltapp.data.model.Profile
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userLocalDataSource: UserLocalDataSource,
    private val userRemoteDataSource: UserRemoteDataSource,
): UserRepository {
    
    override fun login(email: String, password: String): Boolean {
        return userRemoteDataSource.login(email, password)
    }
    
    override fun getProfile(): Profile {
        return userLocalDataSource.getProfile()
    }
}