package com.example.myapplication

import org.junit.Assert.*

import org.junit.After
import org.junit.Assert
import org.junit.Assume
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    var calculator: Calculator? = null

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @After
    fun tearDown() {
        calculator = null
    }

    @Test
    fun sum() {

       // Assert => то в случае если тест не проходит AssertionError(Exception)
       // Assume => в случае если тест не проходит (Ignored)
        Assert.assertEquals(100, calculator?.sum(40,59))

    }

    @Test
    fun sumdgfagfadfg() {
        Assert.assertEquals(100, calculator?.sum(40,60))
    }

    @Test
    fun test3() {
        Assume.assumeNotNull(4,5,6,7,8,null)
    }

    @Test(expected = NullPointerException::class)
    fun test4() {
        calculator?.getLength("null")
    }

}