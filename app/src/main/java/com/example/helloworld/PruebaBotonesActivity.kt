package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.helloworld.databinding.ActivityPruebaBotonesBinding

class PruebaBotonesActivity : AppCompatActivity() {

    lateinit var binding: ActivityPruebaBotonesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPruebaBotonesBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.pruebaButton.setOnClickListener{
//            //Toast.makeText(this, "Mensaje informativo", Toast.LENGTH_SHORT).show()
//        }


        binding.plusButton.setOnClickListener {
            val number1 = binding.number1EditText.text.toString().toDoubleOrNull()

            val number2 = binding.number2EditText.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null) {
                val sum = number1 + number2
                binding.resultView.text = sum.toString()
            } else {
                Toast.makeText(this, "Debe introducir ambos números", Toast.LENGTH_SHORT).show()
            }


            binding.substracButton.setOnClickListener {
                val number1 = binding.number1EditText.text.toString().toDoubleOrNull()

                val number2 = binding.number2EditText.text.toString().toDoubleOrNull()

                if (number1 != null && number2 != null) {
                    val sum = number1 - number2
                    binding.resultView.text = sum.toString()
                } else {
                    Toast.makeText(this, "Debe introducir ambos números", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}