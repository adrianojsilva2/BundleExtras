package com.example.bundleextras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bundleextras.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        //guardar o valor da activity anterior
        val bundle = i.extras


        binding.buttonOk.setOnClickListener {
            val numero = binding.editNumero.text.toString().trim().toInt()

            val i = Intent(this, MainActivity3::class.java)
            //adicionar extras e verificar se nao vem vazio
            if (bundle != null) {
                i.putExtras(bundle)
            }
            i.putExtra("numero2", numero)
            startActivity(i)
        }
    }
}