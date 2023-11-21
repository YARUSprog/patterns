package com.company.gof.factorymethod.dialogs;

import com.company.gof.factorymethod.buttons.Button;
import com.company.gof.factorymethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
