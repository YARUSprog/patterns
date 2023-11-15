package com.company;

import com.company.gof.singleton.Singleton;
import com.company.gof.singleton.multithread.MultiThreadSingleton;

public class Main {

    public static void main(String[] args) {
//        simpleSingleton();
//        notThreadSafeSingleton();
        threadSafeSingleton();
    }

    private static void simpleSingleton() {
        System.out.println("\nIf you see the same value, then singleton was reused (yay!)" + "\n" +
                           "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                           "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.getValue());
        System.out.println(anotherSingleton.getValue());
    }

    private static void notThreadSafeSingleton() {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                           "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                           "RESULT:" + "\n");
        Thread threadFoo = new Thread(() -> {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.getValue());
        });
        Thread threadBar = new Thread(() -> {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.getValue());
        });
        threadFoo.start();
        threadBar.start();
    }

    private static void threadSafeSingleton() {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                           "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                           "RESULT:" + "\n");
        Thread threadFoo = new Thread(() -> {
            MultiThreadSingleton singleton = MultiThreadSingleton.getInstance("FOO");
            System.out.println(singleton.getValue());
        });
        Thread threadBar = new Thread(() -> {
            MultiThreadSingleton singleton = MultiThreadSingleton.getInstance("BAR");
            System.out.println(singleton.getValue());
        });
        threadFoo.start();
        threadBar.start();
    }
}
