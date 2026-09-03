package com.example.petshop

class Sad(date: String): Mood(date){
    override fun feelings(): String {
        return "sad"
    }
}