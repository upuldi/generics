package com.test.gentype;

/**
 * Created by udoluweera on 3/12/14.
 */
public class SimpleClass2<N> {

    private N n;

    public SimpleClass2(N n) {
        this.n = n;
    }

    public N getN() {
        return n;
    }

    public void setN(N n) {
        this.n = n;
    }
}
