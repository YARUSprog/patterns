package com.company;

import com.company.gof.factorymethod.FactoryMethodService;
import com.company.gof.singleton.SingletonService;

public class Main {

    private static final SingletonService singletonService = new SingletonService();
    private static final FactoryMethodService factoryMethodService = new FactoryMethodService();

    public static void main(String[] args) {
//        singletonService.simpleSingleton();
//        singletonService.notThreadSafeSingleton();
//        singletonService.threadSafeSingleton();

        factoryMethodService.factoryMethodOnDialogExample();
    }
}
