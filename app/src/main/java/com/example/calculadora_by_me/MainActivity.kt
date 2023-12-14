package com.example.calculadora_by_me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.calculadora_by_me.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityMainBinding


    var valorStringInput : String = ""
    var valorDisplay : String = ""
    var lista = mutableListOf<Any>()
    var total : Int = 0
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

        } else if (view.id == R.id.button_1) {
           receber(1)
        } else if (view.id == R.id.button_2) {
            receber(2)
        } else if (view.id == R.id.button_3) {

        } else if (view.id == R.id.button_4) {

        } else if (view.id == R.id.button_5) {

        } else if (view.id == R.id.button_6) {

        } else if (view.id == R.id.button_7) {

        } else if (view.id == R.id.button_8) {

        } else if (view.id == R.id.button_9) {

        }else if(view.id == R.id.button_AC){


        } else if (view.id == R.id.button_delete){


        }else if (view.id == R.id.button_plus){

            lista.add(valorStringInput.toInt())
            lista.add("+")
            valorDisplay = valorDisplay.plus("+")
            binding.textInfo.text = valorDisplay
            valorStringInput = ""


        }else if (view.id == R.id.button_subtration){


        }else if (view.id == R.id.button_divide){



        }else if (view.id == R.id.button_x){


        }else if(view.id == R.id.button_iqual){

         lista.add(valorStringInput.toInt())

         calculadorExpressao(lista)



        }



    }

    fun receber(number : Int ){

        //Tranformação do numero em String
        valorStringInput = valorStringInput.plus(number.toString())
       valorDisplay = valorDisplay.plus(number.toString())
        binding.textInfo.text = valorDisplay

    }

    fun calculadorExpressao(vararg elementos: Any): Int {

        //Modolo de 2 para garantir que existe pelo menos dois numero dentro do objeto
        if (elementos.isEmpty() || elementos.size % 2 == 0){
            throw java.lang.IllegalArgumentException("Expressão Invalida")
        }

        //Atribuição do primeiro valor para nosso resultado
        val primeiroElemento = elementos[0]

        if(primeiroElemento is Integer){

            total = primeiroElemento.toInt()
        }

        for( i in 1 until elementos.size step 2 ){

            val operação = elementos[i] as String
            val numero:Int = elementos[i +1 ] as Int

            total = when(operação){
                "+" -> total + numero
                "-" -> total - numero
                "*" -> total * numero
                "/" -> total / numero
                else -> throw java.lang.IllegalArgumentException("Operação Inválida:")
            }
        }
        binding.textResult.text = total.toString()
        return total
    }








}