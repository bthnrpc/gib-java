package org.gib.exception;

public class CheckedExcpOrnek2 {

    public void method1() throws InstantiationException, IllegalAccessException {
        Class<Boolean> clazz = boolean.class;
        clazz.newInstance();

    }
}
