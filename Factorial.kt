package com.info.homeworks

class Factorial {
    fun factorial(number:Int):Int{
        var result = 1

        for(i in 1..number){
            result= result * i
        }
        return result
    }
}