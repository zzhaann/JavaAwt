package tapsyrma_5;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCalculator extends JFrame {
    private JTextField result;
    private int firstNumber = 0;
    private String operator = "";

    public SwingCalculator() {
        setTitle("Swing Calculator");
        JPanel jPanel = new JPanel();
        result = new JTextField("0");
        result.setHorizontalAlignment(SwingConstants.RIGHT);
        result.setEditable(false);
        result.setBorder(new LineBorder(Color.BLACK));
        getContentPane().add(result, BorderLayout.NORTH);
        result.setPreferredSize(new Dimension(200, 30)); // Ширина 200 пикселей, высота 30 пикселей

        jPanel.setLayout(new GridLayout(4, 4, 10, 10));
        addButton(jPanel, "7");
        addButton(jPanel, "8");
        addButton(jPanel, "9");
        addButton(jPanel, "+");
        addButton(jPanel, "4");
        addButton(jPanel, "5");
        addButton(jPanel, "6");
        addButton(jPanel, "-");
        addButton(jPanel, "1");
        addButton(jPanel, "2");
        addButton(jPanel, "3");
        addButton(jPanel, "*");
        addButton(jPanel, "C");
        addButton(jPanel, "0");
        addButton(jPanel, "/");
        addButton(jPanel, "=");
        getContentPane().add(jPanel, BorderLayout.CENTER);
    }

    private void addButton(JPanel panel, String label) {
        JButton button = new JButton(label);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onButtonClick(label);
            }
        });
        panel.add(button);
    }

    private void onButtonClick(String label) {
        switch (label) {
            case "C":
                result.setText("0");
                firstNumber = 0;
                operator = "  ";
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                firstNumber = Integer.parseInt(result.getText());
                operator = label;
                result.setText("0");
                break;
            case "=":
                int secondNumber = Integer.parseInt(result.getText());
                int resultValue = 0;
                switch (operator) {
                    case "+":
                        resultValue = firstNumber + secondNumber;
                        break;
                    case "-":
                        resultValue = firstNumber - secondNumber;
                        break;
                    case "*":
                        resultValue = firstNumber * secondNumber;
                        break;
                    case "/":
                        if (secondNumber != 0) {
                            // Приводим результат к double перед делением для сохранения дробной части
                            resultValue = (int) ((double) firstNumber / secondNumber);
                        } else {
                            result.setText("Error");
                            return;
                        }
                        break;
                }
                result.setText(String.valueOf(resultValue));
                operator = "";
                break;
            default:
                if (result.getText().equals("0")) {
                    result.setText(label);
                } else {
                    result.setText(result.getText() + label);
                }
                break;
        }
    }

    public static void main(String[] args) {
        SwingCalculator calculator = new SwingCalculator();
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        calculator.setBounds(dimension.width / 2 - 250, dimension.height - 650, 300, 300);
        calculator.setVisible(true);
    }
}
