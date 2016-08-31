package com.test.upperboundedwildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by udoluweera on 3/15/14.
 */
public class TestClass {


    public static void main(String[] args) {

        List<? extends Integer> intList =  new ArrayList<>();
        List<? extends Number> numberList = new ArrayList<>();

        numberList = intList;
        //intList = numberList; Compile Error

        List<SimpleClassB> classBList = new ArrayList<>();
        List<? extends SimpleClassA> simpleClassAList = new ArrayList<>();
        List<? extends SimpleClassB> simpleClassBList = new ArrayList<>();
        List<? extends SimpleClassC> simpleClassCList = new ArrayList<>();

        simpleClassAList = simpleClassBList;
        simpleClassBList = simpleClassCList;
        simpleClassAList = classBList;

        // simpleClassBList = simpleClassAList; Compile Error

        List<? super Integer> intList1 =  new ArrayList<>();
        List<? super Number> numberList2 = new ArrayList<>();

        intList1 = new ArrayList<Number>();

        List<? super SimpleClassA> listWithSimpleClassA = new ArrayList<SimpleClassA>();
        List<? super SimpleClassB> listWithSimpleClassB = new ArrayList<SimpleClassB>();
        List<? super SimpleClassC> listWithSimpleClassC = new ArrayList<SimpleClassC>();

        listWithSimpleClassC = listWithSimpleClassB;
        listWithSimpleClassB = listWithSimpleClassA;
    }
}
