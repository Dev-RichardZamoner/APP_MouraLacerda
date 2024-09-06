package br.edu.mouralacerda.aula_prova

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTela2 = findViewById<Button>(R.id.btnEntrar)

        btnTela2.setOnClickListener { _: View? ->
            val intent = Intent(this, Tela2::class.java)







                startActivity(intent)
            }
        }
    }

