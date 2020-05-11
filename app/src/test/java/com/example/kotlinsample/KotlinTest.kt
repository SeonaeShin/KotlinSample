package com.example.kotlinsample

import org.junit.Assert
import org.junit.Test

class KotlinTest {
    @Test
    fun test1(){
        Assert.assertEquals(4, 2+2)
    }

    @Test
    fun testGetterSetter(){

        val person = Person("John")
        person.nickname = "APPLE"
        Assert.assertEquals("apple", person.nickname)

    }

    @Test
    fun testFruit(){

        val fruit1 = Fruit("바나나", "바나나 길어")
        val fruit2 = Fruit("바나나", "바나나 길어")

        println(fruit1)
        println(fruit2)

        Assert.assertEquals(fruit1, fruit2)
        Assert.assertEquals(fruit1.hashCode(), fruit2.hashCode())

    }

    @Test
    fun testLambda1(){
        println(sum(1,2))
        Assert.assertEquals(4,sum(1,3))

        Assert.assertEquals(4,{x:Int, y:Int -> x*y}(2,2))

        val exp = {x:Int, y:Int -> {z:Int -> (x+y)*z}}
        val exp2 = exp(3,2)
        val result = exp2(4)

        Assert.assertEquals(20, result)
    }

    @Test
    fun testCollectionApi(){

        val list = listOf(1, "2", 3, 4, 5.7, 1, 2)

        println(list.filter {item -> item is Int})
        println(list.filter {it is Int})
        println(list.map {"value : ${it}"})
        println(list.filter { it is Int}.map{"value: ${it}"})
        println(list.find{ it is Double})
        val map = list.groupBy { it.javaClass }
        println(map)

        val list2 = listOf(listOf(1,2), listOf(3,4))
        println(list2)

        println(list2.map {"value: ${it}"})

        println(list2.flatMap{ it.toList()})
    }

    @Test
    fun testExtensions(){

        val str = "Hello, Exnentions"

        Assert.assertEquals("s", str.lastString())
    }
}