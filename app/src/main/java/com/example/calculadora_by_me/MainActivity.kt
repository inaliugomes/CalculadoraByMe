package com.example.calculadora_by_me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.calculadora_by_me.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityMainBinding


    var valorStringInput: String = ""
    var valorDisplay: String = ""
    var lista = mutableListOf<Any>()
    var total: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Use to hide the ActionBar
        supportActionBar?.hide()

        //Lisiners
        binding.button0.setOnClickListener(this)
        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.button4.setOnClickListener(this)
        binding.button5.setOnClickListener(this)
        binding.button6.setOnClickListener(this)
        binding.button7.setOnClickListener(this)
        binding.button8.setOnClickListener(this)
        binding.button9.setOnClickListener(this)
        binding.buttonAC.setOnClickListener(this)
        binding.buttonDivide.setOnClickListener(this)
        binding.buttonParentese.setOnClickListener(this)
        binding.buttonPlus.setOnClickListener(this)
        binding.buttonSubtration.setOnClickListener(this)
        binding.buttonDot.setOnClickListener(this)
        binding.textInfo.setOnClickListener(this)
        binding.buttonDelete.setOnClickListener(this)
        binding.buttonX.setOnClickListener(this)
        binding.textResult.setOnClickListener(this)
        binding.buttonIqual.setOnClickListener(this)


    }


    override fun onClick(view: View) {

        if (view.id == R.id.button_0) {
            receber(0)

        } else if (view.id == R.id.button_1) {
            receber(1)
        } else if (view.id == R.id.button_2) {
            receber(2)
        } else if (view.id == R.id.button_3) {
            receber(3)

        } else if (view.id == R.id.button_4) {
            receber(4)
        } else if (view.id == R.id.button_5) {
            receber(5)
        } else if (view.id == R.id.button_6) {
            receber(6)
        } else if (view.id == R.id.button_7) {
            receber(7)
        } else if (view.id == R.id.button_8) {
            receber(8)
        } else if (view.id == R.id.button_9) {
            receber(9)
        } else if (view.id == R.id.button_AC) {

            deleteAll()
        } else if (view.id == R.id.button_delete) {
           // deleteLast()
            
        } else if (view.id == R.id.button_plus) {

           sinal("+")


        } else if (view.id == R.id.button_subtration) {

            sinal("-")

        } else if (view.id == R.id.button_divide) {

            sinal("÷")

        } else if (view.id == R.id.button_x) {
            sinal("*")

        } else if (view.id == R.id.button_iqual) {

            if (!valorStringInput.isEmpty()){
                lista.add(valorStringInput.toInt())
            }

            calculadorExpressao(lista)


        }


    }

    fun sinal(sinal :String){

        lista.add(valorStringInput.toInt())
        lista.add(sinal)
        valorDisplay = valorDisplay.plus(sinal)
        binding.textInfo.text = valorDisplay
        valorStringInput = ""
    }

    fun receber(number: Int) {

        //Tranformação do numero em String
        valorStringInput = valorStringInput.plus(number.toString())
        valorDisplay = valorDisplay.plus(number.toString())
        binding.textInfo.text = valorDisplay

    }

    fun calculadorExpressao(elementos: MutableList<Any>): Int {

        //Modolo de 2 para garantir que existe pelo menos dois numero dentro do objeto
        if (elementos.isEmpty() || elementos.size % 2 == 0) {
            total = 0
        }else {
            val primeiroElemento = elementos[0]

            if (primeiroElemento is Integer) {

                total = primeiroElemento.toInt()
            }

            for (i in 1 until elementos.size step 2) {

                val operação = elementos[i] as String
                val numero: Int = elementos[i + 1] as Int

                total = when (operação) {
                    "+" -> total + numero
                    "-" -> total - numero
                    "*" -> total * numero
                    "÷" -> total / numero
                    else -> throw java.lang.IllegalArgumentException("Operação Inválida:")
                }
            }


        }
        binding.textResult.text = total.toString()


        return total
    }

    fun deleteAll() {
        lista.clear()
        valorDisplay = ""
        valorStringInput = ""
        binding.textInfo.text = ""
        binding.textResult.text = ""
    }

    fun deleteLast(){

       valorStringInput = valorStringInput.dropLast(1)
        valorDisplay = valorDisplay.dropLast(1)
        binding.textInfo.text = valorDisplay
    }

}