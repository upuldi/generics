package com.test.gentype;

/**
 * Created by udoluweera on 3/12/14.
 */
public class MainTester {

    public static void main(String[]args) {

        SimpleClass<String> simpleClass = new SimpleClass<String>();
        SimpleClass simpleClassRow = simpleClass;
        simpleClassRow.setT(5);

    }

}
