package com.company.gof.factorymethod;

public class FactoryMethodService {

    private final DialogService dialogService = new DialogService();

    public void factoryMethodOnDialogExample() {
        dialogService.configureDialog(true);
        dialogService.runDialog();
    }
}
