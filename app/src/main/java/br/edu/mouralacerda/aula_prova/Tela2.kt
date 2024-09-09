package br.edu.mouralacerda.aula_prova

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val txtNome = findViewById<EditText>(R.id.txtNome)
        val txtRa = findViewById<EditText>(R.id.txtRa)
        val txtCurso = findViewById<EditText>(R.id.txtCurso)
        val txtPeriodo = findViewById<EditText>(R.id.txtPeriodo)
        val btnTela3 = findViewById<Button>(R.id.btnTela3)

        btnTela3.setOnClickListener { _: View? ->
            val nome = txtNome.text.toString().trim()
            val ra = txtRa.text.toString().trim()
            val curso = txtCurso.text.toString().trim()
            val periodo = txtPeriodo.text.toString().trim()

            if (nome.isEmpty() || ra.isEmpty() || curso.isEmpty() || periodo.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, Tela3::class.java)
                intent.putExtra("nome", nome)
                intent.putExtra("ra", ra)
                intent.putExtra("curso", curso)
                intent.putExtra("periodo", periodo)
                startActivity(intent)
            }
        }
    }
}

