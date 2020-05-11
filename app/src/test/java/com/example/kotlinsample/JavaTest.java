package com.example.kotlinsample;

import org.junit.Assert;
import org.junit.Test;

import java.net.StandardSocketOptions;

public class JavaTest {

    @Test
    public void test1(){
        Assert.assertEquals(4, 2+2);
    }

    @Test
    public void testGetterSetter(){

        PersonJava personJava = new PersonJava("John");
        personJava.setNickname("APPLE");

        Assert.assertEquals("apple", personJava.getNickname());


        Person person = new Person("John");
        person.setNickname("APPLE");

        Assert.assertEquals("apple", person.getNickname());

    }

    @Test
    public void testFruit(){

        FruitJava fruitJava = new FruitJava();
        fruitJava.fruitName = "사과";
        fruitJava.description = "사과는 맛있다 ㅋㅋ";

        System.out.println(fruitJava);

    }

    @Test
    public void testFruitEquals(){

        FruitJava fruitJava1 = new FruitJava();
        FruitJava fruitJava2 = new FruitJava();

        fruitJava1.fruitName = "바나나";
        fruitJava2.fruitName = "바나나";

        fruitJava1.description = "바나나는 길다";
        fruitJava2.description = "바나나는 길다";

        Assert.assertEquals(fruitJava1.hashCode(), fruitJava2.hashCode());
    }

}
