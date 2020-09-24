package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.calculator.viewmodel.ViewModelClass
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var classVM = ViewModelProvider(this).get(ViewModelClass::class.java)
        if (classVM.getNum1()!=0){
            et_numOne.setText(classVM.getNum1().toString())
        }
        if (classVM.getNum2()!=0){
            et_numTwo.setText(classVM.getNum2().toString())
        }
//
//        et_numOne.setText(classVM.getNum1().toString())
//        et_numTwo.setText(classVM.getNum2().toString())
        tv_result.text = classVM.getResult().toString()
        btn_plus.setOnClickListener {
            var numOne = et_numOne.text.toString().toInt()
            var numTwo = et_numTwo.text.toString().toInt()
            tv_result.text = classVM.plus_op(numOne,numTwo).toString()
        }
        btn_minus.setOnClickListener {
            var numOne = et_numOne.text.toString().toInt()
            var numTwo = et_numTwo.text.toString().toInt()
            tv_result.text = classVM.minus_op(numOne,numTwo).toString()
        }
        btn_multiply.setOnClickListener {
            var numOne = et_numOne.text.toString().toInt()
            var numTwo = et_numTwo.text.toString().toInt()
            tv_result.text = classVM.multiply_op(numOne,numTwo).toString()
        }
        btn_divide.setOnClickListener {
            var numOne = et_numOne.text.toString().toInt()
            var numTwo = et_numTwo.text.toString().toInt()
            tv_result.text = classVM.divide_op(numOne,numTwo).toString()
        }
    }
}