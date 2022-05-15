package com.dharmendra.myfirstunittest

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class EngineTest {
    private val engine = Engine_2(2000,189,15,false)

    @Test
    fun engineTurnOn() {
        engine.turnOn()
        assertEquals(true,engine.isTurnedOn)
        assertEquals(95,engine.temperature)
    }

    @Test
    fun engineTurnOff(){
//        engine.turnOn()

        engine.turnOff()

        assertEquals(false,engine.isTurnedOn)
        assertEquals(15,engine.temperature)
    }
}