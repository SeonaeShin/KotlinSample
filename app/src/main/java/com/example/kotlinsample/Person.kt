package com.example.kotlinsample

class Person(val name: String){
    var age: Int = 0
    var nickname: String = ""
        set(value) {
            field=value.toLowerCase()
        }
}