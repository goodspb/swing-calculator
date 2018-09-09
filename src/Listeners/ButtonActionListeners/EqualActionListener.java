package Listeners.ButtonActionListeners;

import Operators.Operator;
import Status.Status;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class EqualActionListener extends ButtonActionListenerAbs {

    public EqualActionListener(JTextField calculatorResultField, JLabel calculatorTempResultLabel, Status status) {
        super(calculatorResultField, calculatorTempResultLabel, status);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double after = Double.parseDouble(calculatorResultField.getText());
        Operator operator = status.getLastOperator();
        if (!status.isClearNumber() && operator != null) {
            Double result = operator.run(status.getResult(), after);
            calculatorTempResultLabel.setText("");
            calculatorResultField.setText(doubleToString(result));
            status.setResult(0.0);
            status.setLastOperator(null);
        }
    }
}
