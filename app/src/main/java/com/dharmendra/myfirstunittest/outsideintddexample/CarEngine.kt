package com.dharmendra.myfirstunittest.outsideintddexample

class CarEngine(var isTurnedOn:Boolean,var temperature:Int) {
    fun turnsOn() {
        isTurnedOn = true
        temperature = 95
    }

}