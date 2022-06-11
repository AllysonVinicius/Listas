package com.example.home.componentes

import com.example.home.users.Aluno

interface IOnClick {

    fun onClickAluno(aluno: Aluno)

    fun onClickElement(position: Int)
}