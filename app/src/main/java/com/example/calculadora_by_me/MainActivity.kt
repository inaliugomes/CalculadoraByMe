package com.example.calculadora_by_me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadora_by_me.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindig : ActivityMainBinding
    var total: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindig = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindig.root)


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