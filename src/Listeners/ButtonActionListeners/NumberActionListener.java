package Listeners.ButtonActionListeners;

import Status.Status;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class NumberActionListener extends ButtonActionListenerAbs{

    private String number;

    public NumberActionListener(
            JTextField calculatorResultField,
            JLabel calculatorTempResultLabel,
            Status status,
            String number
    ) {
        super(calculatorResultField, calculatorTempResultLabel, status);
        this.number = number;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String oldText = calculatorResultField.getText();
        if (oldText.equals("0")) {
            oldText = "";
        }
        if (status.isClearNumber()) {
            oldText = "";
            status.setClearNumber(false);
        }
        calculatorResultField.setText(oldText.concat(number));
    }
}
