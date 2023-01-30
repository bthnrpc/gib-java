package org.gib.exception;

public class CheckedExcpOrnek {

    public void method1() throws InstantiationException, IllegalAccessException {
        Class<Boolean> clazz = boolean.class;

        clazz.newInstance();

        System.out.println("Rest of the program");
    }
}
