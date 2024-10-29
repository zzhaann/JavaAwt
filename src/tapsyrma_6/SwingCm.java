package  tapsyrma_6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCm extends JFrame{

    public SwingCm(){
        setTitle("Cm to inch");
        JPanel jPanel=new JPanel();
        jPanel.setLayout(new GridLayout(2,2,10,10));

        JTextField number=new JTextField("   ");
        JLabel result=new JLabel("  ");
        JButton convert=new JButton("convert");

        Font buttonFont = new Font("Arial", Font.BOLD, 15);
        Font textFieldFont = new Font("Arial", Font.PLAIN, 15);
        result.setFont(textFieldFont);
        number.setFont(textFieldFont);
        convert.setFont(buttonFont);

    convert.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           double cm=Double.parseDouble(number.getText());
           double inch=cm*0.393701;
           result.setText(String.valueOf(inch));
        }
    });
        jPanel.add(number);
        jPanel.add(result);
        jPanel.add(convert);
        add(jPanel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        setBounds(dimension.width / 2 - 250, dimension.height - 650, 500, 150);
        setVisible(true);

        jPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));
        result.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    public static void main(String[] args) {
        SwingCm converter=new SwingCm();
    }
}
