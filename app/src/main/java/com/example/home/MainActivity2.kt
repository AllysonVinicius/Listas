package com.example.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.home.users.Aluno
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity2 : AppCompatActivity() {

    var aluno: Aluno? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        aluno = intent.putExtra("aluno", "Aluno")

        findViewById<CircleImageView>(R.id.alunoImagem)
            .setImageResource(R.drawable.ic_launcher_background)


        findViewById<TextView>(R.id.alunoMatricula).text = aluno?.matricula
        findViewById<TextView>(R.id.alunoNome).text = aluno?.nome

    }
}