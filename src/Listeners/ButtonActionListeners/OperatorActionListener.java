package Listeners.ButtonActionListeners;

import Operators.*;
import Status.Status;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class OperatorActionListener extends ButtonActionListenerAbs {

    private Operator nowOperator;

    public OperatorActionListener(JTextField calculatorResultField, JLabel calculatorTempResultLabel, Status status, Operator nowOperator) {
        super(calculatorResultField, calculatorTempResultLabel, status);
        this.nowOperator = nowOperator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!status.isClearNumber()) {
            String value = calculatorResultField.getText();
            double after = Double.parseDouble(value);
            if (calculatorTempResultLabel.getText().equals("")) {
                calculatorTempResultLabel.setText(value + " " + nowOperator.getText());
            }
            if (0 == Double.compare(status.getResult(), 0.0)) {
                status.setResult(after);
            }
            Operator operator = status.getLastOperator();
            if (null != operator) {
                Double before = operator.run(status.getResult(), after);
                calculatorResultField.setText(doubleToString(before));
                calculatorTempResultLabel.setText(calculatorTempResultLabel.getText() + value + " " + nowOperator.getText());
                status.setResult(before);
                status.setClearNumber(true);
            }
            status.setLastOperator(nowOperator);
            status.setClearNumber(true);
        }
    }
}
