package com.test.gentypemethods;


import com.test.gentype.SimpleClass;
import com.test.gentype.SimpleClass2;

/**
 * Created by udoluweera on 3/12/14.
 */
public class MainTester {

    public static void main(String[] args) {

        Pair<Integer,String> pairONe = new Pair<Integer, String>(1,"Apple");
        Pair<Integer,String> pairTwo = new Pair<Integer, String>(1,"Apple");

        boolean b = Comparator.<Integer,String>comparePair(pairONe,pairTwo);
        System.out.println(b);

        /* It is not a must to define the parameterised types when calling the method. */
        boolean b2 = Comparator.<Integer,String>comparePair(pairONe,pairTwo);
        System.out.println(b2);

        SimpleClass<String> simpleClass = new SimpleClass<String>();
        SimpleClass2<Integer> simpleClass2 = new SimpleClass2<Integer>(2);

        Comparator.<String,Integer>someOtherMethod(simpleClass,simpleClass2);
        Comparator.someOtherMethod(simpleClass,simpleClass2);

    }

}
