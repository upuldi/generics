package com.test.wildcardcapture;

import java.util.List;

/**
 * Created by udoluweera on 3/15/14.
 */
public class wildcarderror {

    public void someMethod(List<?> aList){
        //aList.set(0,aList.get(0));// Compile Error
        someMethodFixedError(aList);
    }

    private <T> void someMethodFixedError(List<T> aList){
        aList.set(0,aList.get(0));
    }

    public void shiftElements(List<? extends Number> firstList ,
                              List<? extends Number> secondList) {

        Number firstListFirstElement = firstList.get(0);
        //firstList.set(0,secondList.get(0)); compile error
        //secondList.set(0,firstListFirstElement); compile error
    }
}
