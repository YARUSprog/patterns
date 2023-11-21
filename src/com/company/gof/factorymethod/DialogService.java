package com.company.gof.factorymethod;

import com.company.gof.factorymethod.dialogs.Dialog;
import com.company.gof.factorymethod.dialogs.HtmlDialog;
import com.company.gof.factorymethod.dialogs.WindowsDialog;

public class DialogService {

    private Dialog dialog;

    public void configureDialog(boolean isWindowsDialog) {
        if (isWindowsDialog) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

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
