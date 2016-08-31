package com.test.wildcardcapture;

import com.test.upperboundedwildcards.SimpleClassA;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by udoluweera on 3/15/14.
 */
public class ReadOnlyList<T> extends SimpleClassA {

    public static void main(String[] args) {

        List<? extends Number> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1 = list2;
       // list1.add(10); Compile Error
        list1.add(null);



    }
}
