package com.dharmendra.myfirstunittest.outsideintddexample.unittest

import com.dharmendra.myfirstunittest.outsideintddexample.CarEngine
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.junit.Test

class EngineShould {
    private val engine = CarEngine(false,1)
    @Test
    fun turnOn(){
        engine.turnsOn()
        assertTrue(engine.isTurnedOn)
    }

    @Test
    fun riseTheTemperatureWhenItTurnsOn(){
        engine.turnsOn()

        assertEquals(95,engine.temperature)
    }
}