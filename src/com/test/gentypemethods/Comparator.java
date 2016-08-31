package com.test.gentypemethods;

import com.test.gentype.SimpleClass;
import com.test.gentype.SimpleClass2;

/**
 * Created by udoluweera on 3/12/14.
 */
public class Comparator {

    public static <K,V> boolean comparePair(Pair<K,V> p1, Pair<K,V> p2 ) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }

    public static <T,N> void someOtherMethod(com.test.gentype.SimpleClass<T> t,SimpleClass2<N> t2) {
        System.out.println(t.getT());
        System.out.println(t2.getN());
    }
}
