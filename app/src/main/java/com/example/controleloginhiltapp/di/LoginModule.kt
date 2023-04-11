package com.example.controleloginhiltapp.di

import com.example.controleloginhiltapp.data.datasource.UserLocalDataSource
import com.example.controleloginhiltapp.data.datasource.UserLocalDataSourceImpl
import com.example.controleloginhiltapp.data.datasource.UserRemoteDataSource
import com.example.controleloginhiltapp.data.datasource.UserRemoteDataSourceImpl
import com.example.controleloginhiltapp.data.repository.UserRepository
import com.example.controleloginhiltapp.data.repository.UserRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class LoginModule {
    
    @Binds
    abstract fun bindUserRemoteDataSource(
        userRemoteDataSourceImpl: UserRemoteDataSourceImpl
    ): UserRemoteDataSource
    
    @Binds
    abstract fun bindUserLocalDataSource(
        userLocalDataSourceImpl: UserLocalDataSourceImpl
    ): UserLocalDataSource
    
    @Binds
    abstract fun bindUserRepository(
        userRepositoryImpl: UserRepositoryImpl
    ): UserRepository
    
}