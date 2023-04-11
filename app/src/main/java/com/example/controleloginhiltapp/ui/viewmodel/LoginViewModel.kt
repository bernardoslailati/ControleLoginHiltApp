package com.example.controleloginhiltapp.ui.viewmodel

import com.example.controleloginhiltapp.data.model.Profile
import com.example.controleloginhiltapp.data.repository.UserRepository
import javax.inject.Inject

class LoginViewModel @Inject constructor(
  private val userRepository: UserRepository
) {
  
  fun login(email: String, password: String): Boolean {
    return userRepository.login(email, password)
  }
  
  fun getProfile(): Profile {
    return userRepository.getProfile()
  }
  
}