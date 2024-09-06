package br.edu.mouralacerda.aula_prova

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Tela3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        val txtNome = findViewById<TextView>(R.id.txtNome)
        val txtRA = findViewById<TextView>(R.id.txtRa)
        val txtPeriodo = findViewById<TextView>(R.id.txtPeriodo)
        val txtCurso = findViewById<TextView>(R.id.txtCurso)

        val nome = intent.getStringExtra("nome")
        val ra = intent.getStringExtra("ra")
        val periodo = intent.getStringExtra("periodo") //
        val curso = intent.getStringExtra("curso") //

        txtNome.text = "Nome: $nome"
        txtRA.text = "RA: $ra"
        txtPeriodo.text = "Periodo: $periodo"
        txtCurso.text = "Curso: $curso"
    }
}