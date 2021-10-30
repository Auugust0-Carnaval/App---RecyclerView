package com.siangui.new_diceroller

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}