package com.zelihagokoglan.basiccalculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zelihagokoglan.basiccalculater.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var number1:Int?=null
    var number2:Int?=null
    var result:Int?=null
    private  lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun mySum(view: View){
        number1=binding.editText.text.toString().toInt()
        number2=binding.editText2.text.toString().toInt()
        if(number1==null||number2==null){
            binding.resultText.text="Error"
        }
        else{
             result=number1!!+number2!!
        }
        binding.resultText.text="Result: $result"

    }
    fun mySub(view:View){
        number1=binding.editText.text.toString().toIntOrNull()
        number2=binding.editText2.text.toString().toIntOrNull()
        if(number1==null||number2==null){
            binding.resultText.text="Error"
        }
        else{
             result=number1!!-number2!!
        }
        binding.resultText.text="Result: $result"
    }
    fun multiply(view:View){
        number1=binding.editText.text.toString().toIntOrNull()
        number2=binding.editText2.text.toString().toIntOrNull()
        if(number1==null||number2==null){
            binding.resultText.text="Error"
        }
        else{
             result=number1!!*number2!!
        }
        binding.resultText.text="Result: $result"
    }
    fun myDiv(view:View){
        number1=binding.editText.text.toString().toIntOrNull()
        number2=binding.editText2.text.toString().toIntOrNull()
        if(number1==null||number2==null){
            binding.resultText.text="Error"
        }
        else{
             result=number1!!/number2!!
        }
        binding.resultText.text="Result: $result"
    }


    }
