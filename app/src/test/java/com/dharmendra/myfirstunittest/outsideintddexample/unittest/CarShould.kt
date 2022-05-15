package com.dharmendra.myfirstunittest.outsideintddexample.unittest

import com.dharmendra.myfirstunittest.outsideintddexample.Car
import com.dharmendra.myfirstunittest.outsideintddexample.CarEngine
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import junit.framework.Assert.assertEquals
import org.junit.Test

class CarShould {
    private var engine: CarEngine = mock()
    private val car = Car(engine,5.0)

    @Test
    fun looseFuelWhenItTurnsOn(){
        car.turnsOn()

        assertEquals(4.5,car.fuels)
    }

    @Test
    fun turnsOnItsEngine(){
        car.turnsOn()

        verify(engine, times(1)).turnsOn()
    }
}