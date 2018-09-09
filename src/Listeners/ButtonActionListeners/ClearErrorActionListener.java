package Listeners.ButtonActionListeners;

import Status.Status;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ClearErrorActionListener extends ButtonActionListenerAbs {

    public ClearErrorActionListener(JTextField calculatorResultField, JLabel calculatorTempResultLabel, Status status) {
        super(calculatorResultField, calculatorTempResultLabel, status);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calculatorResultField.setText("0");
        status.setClearNumber(true);
    }
}
