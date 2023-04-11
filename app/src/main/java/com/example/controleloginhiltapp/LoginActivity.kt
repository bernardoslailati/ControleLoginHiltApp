package com.example.controleloginhiltapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.controleloginhiltapp.databinding.ActivityLoginBinding
import com.example.controleloginhiltapp.ui.adapter.ProgrammingLanguageAdapter
import com.example.controleloginhiltapp.ui.viewmodel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityLoginBinding
    
    @Inject
    lateinit var programmingLanguageAdapter: ProgrammingLanguageAdapter
    
    @Inject
    lateinit var loginViewModel: LoginViewModel
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        
        setupView()
    }
    
    private fun setupView() {
        with(binding) {
            rvProgrammingLanguages.adapter = programmingLanguageAdapter
            
            btnLogin.setOnClickListener {
                Toast.makeText(baseContext, "${loginViewModel.getProfile()}", Toast.LENGTH_LONG).show()

//                val isLoggedIn = loginViewModel.login(
//                    email = tietEmail.text.toString(),
//                    password = tietPassword.text.toString()
//                )
//                Toast.makeText(baseContext, "isLoggedIn? $isLoggedIn", Toast.LENGTH_LONG).show()
            }
        }
    }
}