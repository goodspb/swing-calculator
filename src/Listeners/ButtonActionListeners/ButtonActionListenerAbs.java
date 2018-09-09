package Listeners.ButtonActionListeners;

import Status.Status;
import javax.swing.*;
import java.awt.event.ActionListener;

abstract class ButtonActionListenerAbs implements ActionListener {

    protected JTextField calculatorResultField;
    protected JLabel calculatorTempResultLabel;
    protected Status status;

    public ButtonActionListenerAbs(JTextField calculatorResultField, JLabel calculatorTempResultLabel, Status status) {
        this.calculatorResultField = calculatorResultField;
        this.calculatorTempResultLabel = calculatorTempResultLabel;
        this.status = status;
    }

    public static String doubleToString(double num) {
        if (num % 1.0 == 0) {
            return String.valueOf((long) num);
        }
        return String.valueOf(num);
    }
}

