package Listeners.ButtonActionListeners;

import Status.Status;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class BackspaceButtonActionListener extends ButtonActionListenerAbs{

    public BackspaceButtonActionListener(JTextField calculatorResultField, JLabel calculatorTempResultLabel, Status status) {
        super(calculatorResultField, calculatorTempResultLabel, status);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String oldText = calculatorResultField.getText();
        int len = oldText.length();
        if (len <= 1) {
            calculatorResultField.setText("0");
            return;
        }
        String newText = oldText.substring(0, len -1);
        calculatorResultField.setText(newText);
    }
}
