package Listeners.ButtonActionListeners;

import Status.Status;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ClearActionListener extends ButtonActionListenerAbs {

    public ClearActionListener(JTextField calculatorResultField, JLabel calculatorTempResultLabel, Status status) {
        super(calculatorResultField, calculatorTempResultLabel, status);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calculatorResultField.setText("0");
        calculatorTempResultLabel.setText("");
        status.setResult(0.0);
        status.setLastOperator(null);
        status.setClearNumber(true);
    }
}
