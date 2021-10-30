package com.example.meuprimeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.meuprimeiroprojeto.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    /*
    fun1 sendMessage(View : View) {
        val editText = this@MainActivity.findViewById<EditText>(R.id.editTextTextPersonName)
        val message = editText.text.toString()
        val intent = Intent(this@MainActivity,DisplayMessageActivity::class.java).apply{
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
        }*/

    fun sendCalculo(view: View){
        val editTextN1 = findViewById<EditText>(R.id.editTextN1)
        val editTextN2 = findViewById<EditText>(R.id.editTextN2)

        //Convertendo variaveis (val)

        val n1 = editTextN1.text.toString().toInt()
        val n2: Int = editTextN2.text.toString().toInt()

        val calculo = Calculadora().somar(n1, n2).toString()
        val intent = Intent(this, MainActivityResult::class.java).apply{
            putExtra(EXTRA_MESSAGE, calculo)
        }
        startActivity(intent)
    }

    fun SendMenos(view: View){
        val editText1 = findViewById<EditText>(R.id.editTextN1)
        val editText2 = findViewById<EditText>(R.id.editTextN2)

        val num = editText1.text.toString().toInt()
        val num2 = editText2.text.toString().toInt()

        val calc = Calculadora().subtracao(num, num2).toString()
        val intenc = Intent(this, MainActivityResult::class.java).apply {
            putExtra(EXTRA_MESSAGE, calc)
        }
        startActivity(intenc)
    }

    fun SendDivis(view: View){
        val editTextOne = findViewById<EditText>(R.id.editTextN1)
        val editTextTwo = findViewById<EditText>(R.id.editTextN2)

        val numb = editTextOne.text.toString().toInt()
        val numb2 = editTextTwo.text.toString().toInt()

        val calcu = Calculadora().divisao(numb, numb2).toString()
        val inten = Intent(this,MainActivityResult::class.java).apply {
            putExtra(EXTRA_MESSAGE, calcu)
        }
        startActivity(inten)
    }

    fun SendMult(view: View){
        val editTextFirst = findViewById<EditText>(R.id.editTextN1)
        val editTextSecund = findViewById<EditText>(R.id.editTextN2)

        val number = editTextFirst.text.toString().toInt()
        val number2 = editTextSecund.text.toString().toInt()

        val caclar = Calculadora().mult(number, number2).toString()
        val inte = Intent(this, MainActivityResult::class.java).apply {
            putExtra(EXTRA_MESSAGE, caclar)
        }
        startActivity(inte)
    }
 }