package Listeners.ButtonActionListeners;

import Status.Status;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class PointActionListener extends ButtonActionListenerAbs {

    private static final String text = ".";

    public PointActionListener(JTextField calculatorResultField, JLabel calculatorTempResultLabel, Status status) {
        super(calculatorResultField, calculatorTempResultLabel, status);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String oldText = calculatorResultField.getText();
        if (status.isClearNumber()) {
            oldText = "0";
            status.setClearNumber(false);
        }
        if (!oldText.contains(text)) {
            calculatorResultField.setText(oldText.concat(text));
        }
    }
}
