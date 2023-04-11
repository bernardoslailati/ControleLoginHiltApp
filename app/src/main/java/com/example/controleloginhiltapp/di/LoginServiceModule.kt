package com.example.controleloginhiltapp.di

import com.example.controleloginhiltapp.data.network.LoginService
import com.example.controleloginhiltapp.data.network.authentication.FirebaseAuthenticator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object LoginServiceModule {

//    @Provides
//    fun provideLoginRetrofitService(): LoginService {
//        return Retrofit.Builder()
//            .baseUrl("https://my-backend.com")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//            .create(LoginService::class.java)
//    }
    
    @Provides
    fun provideLoginFirebaseService(): LoginService {
        return FirebaseAuthenticator.provideLoginService()
    }
    
}