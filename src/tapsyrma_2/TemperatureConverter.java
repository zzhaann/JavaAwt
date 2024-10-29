package tapsyrma_2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter extends JFrame {
    private JTextField celsiusField;
    private JTextField fahrenheitField;

    public TemperatureConverter() {
        setTitle("Temperature Converter");
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 2, 5, 5));

        JLabel celsiusLabel = new JLabel("Celsius");
        JLabel fahrenheitLabel = new JLabel("Fahrenheit");

        celsiusField = new JTextField("");
        fahrenheitField = new JTextField("");

        Font textFieldFont = new Font("Arial", Font.PLAIN, 15);

        jPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));
        celsiusLabel.setFont(textFieldFont);
        fahrenheitLabel.setFont(textFieldFont);
        celsiusField.setFont(textFieldFont);
        fahrenheitField.setFont(textFieldFont);

        jPanel.add(celsiusLabel);
        jPanel.add(celsiusField);
        jPanel.add(fahrenheitLabel);
        jPanel.add(fahrenheitField);

        celsiusField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    double temperature = Double.parseDouble(celsiusField.getText());
                    double convertedTemperature = temperature * 9 / 5 + 32;
                    fahrenheitField.setText(String.valueOf(convertedTemperature));

            }
        });


        fahrenheitField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    double temperature = Double.parseDouble(fahrenheitField.getText());
                    double convertedTemperature = (temperature - 32) * 5 / 9;
                    celsiusField.setText(String.valueOf(convertedTemperature));
            }
        });

        add(jPanel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        setBounds(dimension.width / 2 - 250, dimension.height - 650, 500, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
    }
}
