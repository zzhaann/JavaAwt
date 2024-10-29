package tapsyrma_3;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessNumber {
    private static int rand;
    private static final Random random = new Random();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Find random number");
        frame.setSize(430, 120);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField randomField = new JTextField();
        randomField.setEditable(false);
        JTextField guessField = new JTextField();
        JLabel randomLabel = new JLabel("The Number is:");
        JLabel guessLabel = new JLabel("Enter your guess:");
        JButton generateBtn = new JButton("Generate");
        JLabel tryAnother = new JLabel("Find number from 1 to 100");

        frame.add(randomField);
        frame.add(guessField);
        frame.add(randomLabel);
        frame.add(guessLabel);
        frame.add(generateBtn);
        frame.add(tryAnother);

        randomLabel.setBounds(3, 10, 120, 25);
        randomField.setBounds(110, 10, 120, 25);
        guessLabel.setBounds(3, 38, 120, 25);
        guessField.setBounds(110, 38, 120, 25);
        generateBtn.setBounds(250, 10, 120, 25);
        tryAnother.setBounds(250, 38, 250, 25);

        generateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rand = random.nextInt(101);
                if (rand == 100) {
                    randomField.setText(String.valueOf("*"));
                } else if (rand >= 10 && rand <= 99) {
                    randomField.setText(String.valueOf("**"));
                } else if (rand >= 0 && rand <= 9) {
                    randomField.setText(String.valueOf("*"));
                }
            }
        });

        guessField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int guess = Integer.parseInt(guessField.getText());
                    if (guess < rand) {
                        tryAnother.setText("Try higher");
                    } else if (guess > rand) {
                        tryAnother.setText("Try lower");
                    } else {
                        tryAnother.setText("Correct!");
                    }
                } catch (NumberFormatException nfe) {
                    tryAnother.setText("Error");
                }
            }
        });

        frame.setVisible(true);
    }
}