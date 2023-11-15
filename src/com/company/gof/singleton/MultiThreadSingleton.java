package com.company.gof.singleton;

public class MultiThreadSingleton {
    private static volatile MultiThreadSingleton instance;

    private String value;

    private MultiThreadSingleton(String value) {
        this.value = value;
    }

    public static MultiThreadSingleton getInstance(String value) {
        MultiThreadSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            result = instance;
            if (result == null) {
                instance = result = new MultiThreadSingleton(value);
            }
            return result;
        }
    }

    public String getValue() {
        return value;
    }
}
