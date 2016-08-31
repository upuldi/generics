package com.test.gentype;

/**
 * Created by udoluweera on 3/12/14.
 */
public class SimpleClass<T> {

    private T t;

    public void setT(T t) {
        t = this.t;
    }

    public SimpleClass() {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public <TYPE> String simpleTestMethod(SimpleClass2<TYPE> t){
        return null;
    }

}
