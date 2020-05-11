package com.example.kotlinsample

fun String.lastString():String {
    return this.get(this.length -1).toString()
}