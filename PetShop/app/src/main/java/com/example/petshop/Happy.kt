package com.example.petshop

class Happy(date: String):Mood(date) {
    override fun feelings(): String {
        return "happy"
    }
}