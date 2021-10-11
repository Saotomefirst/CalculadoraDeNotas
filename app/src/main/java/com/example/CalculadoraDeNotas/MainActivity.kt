package com.example.CalculadoraDeNotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultado

        btCalcular.setOnClickListener{
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val faltas = Integer.parseInt(faltas.text.toString())

            val media = (nota1 + nota2)/2

            if (faltas > 10) {
                resultado.setText("Aluno Reprovado por Faltas" + "\n" + "Nota Final: $media" + "\n" + "Faltas: $faltas")
            }
            else if (media >= 6) {
                resultado.setText("Aluno Aprovado" + "\n" + "Nota Final: $media" + "\n" + "Faltas: $faltas")
            }
            else {
                resultado.setText("Aluno Reprovado por Nota" + "\n" + "Nota Final: $media" + "\n" + "Faltas: $faltas")
            }

        }
    }
}