package com.test.boundedtypeparameters;

/**
 * Created by udoluweera on 3/12/14.
 */
public class TestClass {

    public <T extends Number ,K extends String> void  someMethod(T t,K k){

        System.out.println("T : " + t + " : " + t.getClass().getName());
        System.out.println("K : " + k + " : " + k.getClass().getName());

        //It also allow to use methods defined in the bounded type.
        System.out.println(" After cal" + t.intValue() * 10);
    }

    public static void main(String[] args) {

        TestClass testClass = new TestClass();
        testClass.someMethod(10,"TEN");

        TestClass testClassTwo = new TestClass();
        // testClassTwo.someMethod(20,20); This fails at compile time



    }
}
