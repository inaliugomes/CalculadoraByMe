package com.example.calculadora_by_me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculadora_by_me.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityMainBinding
    var total: Int = 0;
    var numero: Int = 0;
    var valorEmString: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Use to hide the ActionBar
        supportActionBar?.hide()

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


    }


    override fun onClick(view: View) {

        if (view.id == R.id.button_0) {
            valorString(0)
        } else if (view.id == R.id.button_1) {
            valorString(1)
        } else if (view.id == R.id.button_2) {
            valorString(2)
        } else if (view.id == R.id.button_3) {
            valorString(3)
        } else if (view.id == R.id.button_4) {
            valorString(4)
        } else if (view.id == R.id.button_5) {
            valorString(5)
        } else if (view.id == R.id.button_6) {
            valorString(6)
        } else if (view.id == R.id.button_7) {
            valorString(7)
        } else if (view.id == R.id.button_8) {
            valorString(8)
        } else if (view.id == R.id.button_9) {
            valorString(9)
        }else if(view.id == R.id.button_AC){

            valorEmString = ""
            binding.textInfo.text = ""
        } else if (view.id == R.id.button_delete){
           valorEmString = valorEmString.dropLast(1)
            binding.textInfo.text =  valorEmString
        }else if (view.id == R.id.button_plus){

            valorEmString = valorEmString.plus("+")
            binding.textInfo.text = valorEmString
        }else if (view.id == R.id.button_subtration){

            valorEmString = valorEmString.plus("-")
            binding.textInfo.text = valorEmString

        }else if (view.id == R.id.button_divide){

            valorEmString = valorEmString.plus("÷")
            binding.textInfo.text = valorEmString
        }else if (view.id == R.id.button_x){

            valorEmString = valorEmString.plus("×")
            binding.textInfo.text = valorEmString
        }



    }


    fun valorString(n: Int) {
        val num = n
        valorEmString = valorEmString.plus(num.toString())
        binding.textInfo.text = valorEmString

    }


    fun calcular(b: Int): Int {

        if (1 - 2 == 2) {

            total = total - b

        } else if (-2 == 2) {

            total = total + b
        } else if (-2 == 2) {

            total = total * b
        } else if (-2 == 2) {

            total = total / b
        }


        return total
    }


}