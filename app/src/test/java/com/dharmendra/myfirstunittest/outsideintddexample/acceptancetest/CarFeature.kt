package com.dharmendra.myfirstunittest.outsideintddexample.acceptancetest

import com.dharmendra.myfirstunittest.outsideintddexample.Car
import com.dharmendra.myfirstunittest.outsideintddexample.CarEngine
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Test

class CarFeature {
    private val engine = CarEngine(false,15)
    private val car = Car(engine,6.0)

    @Test
     fun carLoosingFuelsWhenItTurnsOn(){
        car.turnsOn()
        assertEquals(5.5,car.fuels)
    }

    @Test
    fun carIsTurningOnItsEngineAndIncreasesTheTemperature(){
        car.turnsOn()

        assertEquals(95,car.engine.temperature)
        assertTrue(car.engine.isTurnedOn)
    }
}