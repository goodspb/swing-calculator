package Listeners.MenuActionListeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutActionListeners implements ActionListener {

    private JFrame frame;

    public AboutActionListeners(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame.getContentPane(),"这是一个计算器!");
    }
}
