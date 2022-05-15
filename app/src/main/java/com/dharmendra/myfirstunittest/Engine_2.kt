package com.dharmendra.myfirstunittest

class Engine_2(
    var cc:Int,var horsePower:Int,var temperature:Int,var isTurnedOn:Boolean
) {

    fun turnOn(){
        isTurnedOn = true
        temperature = 95
    }

    fun turnOff(){
        isTurnedOn = false
        temperature = 15
    }
}