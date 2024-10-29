package tapdyrma_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class SwingArithmetics extends JFrame {
    public int res = 0;

    public SwingArithmetics() {
        setTitle("SwingArithmetics");
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(6, 2, 10, 10));


        JLabel firstNumberLabel = new JLabel("first number:");
        JLabel secondNumberLabel = new JLabel("Second number:");
        JLabel resultLabel = new JLabel("Result:");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");
        JButton percent = new JButton("%");
        JButton clear = new JButton("clear");

        JLabel result = new JLabel();
        JTextField x1 = new JTextField("");
        JTextField x2 = new JTextField("");

        Font buttonFont = new Font("Arial", Font.BOLD, 15);
        Font textFieldFont = new Font("Arial", Font.PLAIN, 15);
        result.setFont(textFieldFont);
        x1.setFont(textFieldFont);
        x2.setFont(textFieldFont);
        plus.setFont(buttonFont);
        minus.setFont(buttonFont);
        multiply.setFont(buttonFont);
        divide.setFont(buttonFont);
        percent.setFont(buttonFont);
        clear.setFont(buttonFont);

        Dimension buttonSize = new Dimension(10, 10);
        plus.setPreferredSize(buttonSize);
        minus.setPreferredSize(buttonSize);
        multiply.setPreferredSize(buttonSize);
        divide.setPreferredSize(buttonSize);
        percent.setPreferredSize(buttonSize);
        clear.setPreferredSize(buttonSize);

        ActionListener listenerPlus = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = x_1 + x_2;
                result.setText(String.valueOf(res));
            }
        };

        ActionListener listenerMinus = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = x_1 - x_2;
                result.setText(String.valueOf(res));
            }
        };

        ActionListener listenerMultiply = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = x_1 * x_2;
                result.setText(String.valueOf(res));
            }
        };

        ActionListener listenerDivide = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = x_1 / x_2;
                result.setText(String.valueOf(res));
            }
        };

        ActionListener listenerPercent = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = (x_1 * x_2) / 100;
                result.setText(String.valueOf(res));
            }
        };

        ActionListener listenerClear = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x1.setText("");
                x2.setText("");
                result.setText("");
            }
        };

        plus.addActionListener(listenerPlus);
        minus.addActionListener(listenerMinus);
        multiply.addActionListener(listenerMultiply);
        divide.addActionListener(listenerDivide);
        percent.addActionListener(listenerPercent);
        clear.addActionListener(listenerClear);


        jPanel.add(firstNumberLabel);
        jPanel.add(x1);
        jPanel.add(secondNumberLabel);
        jPanel.add(x2);
        jPanel.add(resultLabel);
        jPanel.add(result);
        jPanel.add(plus);
        jPanel.add(minus);
        jPanel.add(multiply);
        jPanel.add(divide);
        jPanel.add(percent);
        jPanel.add(clear);

        jPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));
        result.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        x1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        x2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        plus.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        minus.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        multiply.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        divide.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        percent.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        clear.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jPanel.setBackground(Color.WHITE);
        result.setBackground(Color.WHITE);

        add(jPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Dimension dimension =toolkit.getScreenSize();
        setBounds(dimension.width/2-250,dimension.height-650,300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingArithmetics calculator = new SwingArithmetics();
    }
}
