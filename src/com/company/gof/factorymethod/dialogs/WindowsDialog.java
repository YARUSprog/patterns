package com.company.gof.factorymethod.dialogs;

import com.company.gof.factorymethod.buttons.Button;
import com.company.gof.factorymethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
