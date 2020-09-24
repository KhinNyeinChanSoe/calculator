package com.example.calculator.viewmodel

import androidx.lifecycle.ViewModel

class ViewModelClass : ViewModel() {
    private var num1 = 0
    private var num2 = 0
    private var result = 0
    fun getNum1() = num1
    fun getNum2() = num2
    fun getResult() = result
    fun plus_op(numOne:Int,numTwo:Int) : Int{
        num1 = numOne
        num2 = numTwo
        result = num1+num2
        return result
    }
    fun minus_op(numOne:Int,numTwo:Int) : Int{
        num1 = numOne
        num2 = numTwo
        result = num1-num2
        return result
    }
    fun multiply_op(numOne:Int,numTwo:Int) : Int{
        num1 = numOne
        num2 = numTwo
        result = num1*num2
        return result
    }
    fun divide_op(numOne:Int,numTwo:Int) : Int{
        num1 = numOne
        num2 = numTwo
        result = num1/num2
        return result
    }
}