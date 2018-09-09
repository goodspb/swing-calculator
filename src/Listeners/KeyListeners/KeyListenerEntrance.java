package Listeners.KeyListeners;

import Status.Status;

import javax.swing.*;
import java.awt.event.*;

public class KeyListenerEntrance implements java.awt.event.KeyListener {

    private JTextField resultField;
    private Status status;
    private String[] numberArray;

    public KeyListenerEntrance(JTextField resultField, Status status) {
        this.resultField = resultField;
        this.status = status;
        String numbers = "1234567890";
        numberArray = numbers.split("");
    }

    @Override//键被按下
    public void keyPressed(KeyEvent e) {
    }

    @Override//表示具体一个值被输出，例如：F1
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyChar());
        String keyString = String.valueOf(e.getKeyChar());
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i].equals(keyString)) {
                String oldText = resultField.getText();
                if (oldText.equals("0")) {
                    oldText = "";
                }
                if (status.isClearNumber()) {
                    oldText = "";
                    status.setClearNumber(false);
                }
                resultField.setText(oldText.concat(keyString));
                break;
            }
        }
    }
    @Override//键被释放
    public void keyReleased(KeyEvent e) {
    }
}
