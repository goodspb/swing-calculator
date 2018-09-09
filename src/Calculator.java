
import javax.swing.*;

import Listeners.ButtonActionListeners.*;
import Listeners.KeyListeners.KeyListenerEntrance;
import Listeners.MenuActionListeners.*;
import Operators.*;
import Status.*;

import java.awt.*;

public class Calculator  {

    private static final int width = 250;
    private static final int height = 300;

    private JPanel mainPanel;
    private JTextField resultField;
    private JLabel tempResultLabel;
    private JButton clearButton;
    private JButton clearErrorButton;
    private JButton backspaceButton;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton zeroButton;
    private JButton pointButton;
    private JButton subButton;
    private JButton addButton;
    private JButton multiButton;
    private JButton divisionButton;
    private JButton equalButton;
    private Status status;

    public Calculator() {
        status = new Status();
        oneButton.addActionListener(new NumberActionListener(resultField, tempResultLabel, status, "1"));
        twoButton.addActionListener(new NumberActionListener(resultField, tempResultLabel, status, "2"));
        threeButton.addActionListener(new NumberActionListener(resultField, tempResultLabel, status, "3"));
        fourButton.addActionListener(new NumberActionListener(resultField, tempResultLabel, status, "4"));
        fiveButton.addActionListener(new NumberActionListener(resultField, tempResultLabel, status, "5"));
        sixButton.addActionListener(new NumberActionListener(resultField, tempResultLabel, status, "6"));
        sevenButton.addActionListener(new NumberActionListener(resultField, tempResultLabel, status, "7"));
        eightButton.addActionListener(new NumberActionListener(resultField, tempResultLabel, status, "8"));
        nineButton.addActionListener(new NumberActionListener(resultField, tempResultLabel, status, "9"));
        zeroButton.addActionListener(new NumberActionListener(resultField, tempResultLabel, status, "0"));
        pointButton.addActionListener(new PointActionListener(resultField, tempResultLabel, status));
        backspaceButton.addActionListener(new BackspaceButtonActionListener(resultField, tempResultLabel, status));
        clearButton.addActionListener(new ClearActionListener(resultField, tempResultLabel, status));
        clearErrorButton.addActionListener(new ClearErrorActionListener(resultField, tempResultLabel, status));
        subButton.addActionListener(new OperatorActionListener(resultField, tempResultLabel, status, new Sub(subButton.getText())));
        addButton.addActionListener(new OperatorActionListener(resultField, tempResultLabel, status, new Add(addButton.getText())));
        multiButton.addActionListener(new OperatorActionListener(resultField, tempResultLabel, status, new Mul(multiButton.getText())));
        divisionButton.addActionListener(new OperatorActionListener(resultField, tempResultLabel, status, new Div(divisionButton.getText())));
        equalButton.addActionListener(new EqualActionListener(resultField, tempResultLabel, status));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("计算器");
        Calculator Calculator = new Calculator();
        frame.setContentPane(Calculator.mainPanel);
        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
        JMenuBar menuBar = new JMenuBar();
        JMenu menuAbout = new JMenu("帮助");
        JMenuItem menuItem = new JMenuItem("关于计算器");
        menuItem.addActionListener(new AboutActionListeners(frame));
        menuAbout.add(menuItem);
        menuBar.add(menuAbout);
        frame.setJMenuBar(menuBar);

        //设置在屏幕中间显示
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();
        int screenWidth = dimension.width;
        int screenHeight = dimension.height;
        int x = (screenWidth - width) / 2;
        int y = (screenHeight - height) / 2;
        frame.setLocation(x, y);

        //添加键盘事件
        frame.addKeyListener(new KeyListenerEntrance(Calculator.resultField, Calculator.status));
        frame.setVisible(true);
        frame.setFocusable(true);
    }

}
