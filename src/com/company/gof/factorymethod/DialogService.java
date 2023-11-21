package com.company.gof.factorymethod;

public class DialogService {
    private static Dialog dialog;

    public void configureDialog() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    public void runDialog() {
        dialog.renderWindow();
    }

}
