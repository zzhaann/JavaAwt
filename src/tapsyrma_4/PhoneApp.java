package tapsyrma_4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;

public class PhoneApp extends JFrame {

    public JLabel result;
    public JButton btnCall;

    public PhoneApp() {
        setTitle("Phone App");
        JPanel jPanel = new JPanel();
        result = new JLabel("    ");
        result.setHorizontalAlignment(SwingConstants.CENTER);
        result.setBorder(new LineBorder(Color.white));
        getContentPane().add(result, BorderLayout.NORTH);

        jPanel.setLayout(new GridLayout(4, 3, 10, 10));
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btnClear = new JButton("Clear");
        JButton btn0 = new JButton("0");
        btnCall = new JButton("Call");

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "3");
            }
        });
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "4");
            }
        });
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "6");
            }
        });
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "8");
            }
        });
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "9");
            }
        });
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "0");
            }
        });
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText("    ");
            }
        });

        btnCall.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (btnCall.getText().equals("Call"))
                {
                    btnCall.setText("Hang up");
                } else {
                    result.setText("    ");
                    btnCall.setText("Call");
                }
            }
        });

        jPanel.add(btn1);
        jPanel.add(btn2);
        jPanel.add(btn3);
        jPanel.add(btn4);
        jPanel.add(btn5);
        jPanel.add(btn6);
        jPanel.add(btn7);
        jPanel.add(btn8);
        jPanel.add(btn9);
        jPanel.add(btnClear);
        jPanel.add(btn0);
        jPanel.add(btnCall);

        getContentPane().add(jPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Dimension dimension =toolkit.getScreenSize();
        setBounds(dimension.width/2-250,dimension.height-650,300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
      PhoneApp phoneApp =new PhoneApp();
    }
}
