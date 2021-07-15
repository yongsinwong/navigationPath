package com.tarc.navigationpath

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.tarc.navigationpath.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        binding.loginBtn.setOnClickListener(){
            val inputUsername :String = binding.name.toString()
            val inputPassword :String = binding.pass.toString()

            if (inputUsername == "yong" && inputPassword == "123"){

                Navigation.findNavController(it).navigate(R.id.action_loginFragment_to_questionFragment)

            }else {
                Toast.makeText(context, "Invalid Login", Toast.LENGTH_LONG).show()
            }
        }
        return binding.root
    }

}