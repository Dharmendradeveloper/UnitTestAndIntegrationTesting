package com.dharmendra.myfirstunittest.outsideintddexample

class Car(val engine:CarEngine,var fuels:Double) {

    fun turnsOn() {
        fuels -= 0.5
        engine.turnsOn()
    }

}