package com.example.controleloginhiltapp.di

import com.example.controleloginhiltapp.data.mock.mockProgrammingLanguageList
import com.example.controleloginhiltapp.ui.adapter.ProgrammingLanguageAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object ProgrammingLanguageModule {
    
    @Provides
    fun provideProgrammingLanguageAdapter(): ProgrammingLanguageAdapter {
        return ProgrammingLanguageAdapter(programmingLanguageList = mockProgrammingLanguageList)
    }
    
}