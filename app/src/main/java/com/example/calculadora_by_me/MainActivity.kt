package com.example.calculadora_by_me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculadora_by_me.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),View.OnClickListener {

    lateinit var binding : ActivityMainBinding

    var total: Int = 0;

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


    }






    override fun onClick(view: View) {

        if(view.id == R.id.button_0){

        }
    }



    fun calcular(b : Int) : Int{

        if(1-2 ==2 ) {

            total = total - b

        } else if(-2 ==2  ){

            total = total + b
        }else if(-2 ==2  ){

            total = total * b
        }else if(-2 ==2  ){

            total = total / b
        }


        return total
    }


}