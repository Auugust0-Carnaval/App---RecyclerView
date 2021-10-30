package com.example.meuprimeiroprojeto

class Calculadora {
    fun somar(n1: Int, n2: Int): Int{
        val result = n1 + n2
        return(result)
    }
    fun subtracao(num: Int,num2: Int): Int{
        val resultado = num - num2
        return(resultado)
    }
    fun divisao(numb: Int, numb2: Int): Int{
        val resul = numb / numb2
        return(resul)
    }
    fun mult(number: Int, number2: Int): Int{
        val res = number * number2
        return(res)
    }
}