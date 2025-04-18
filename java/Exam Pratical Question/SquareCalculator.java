// 18. Create a Swing application that calculates a square of a number.
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareCalculator extends JFrame {
    public SquareCalculator() {
        JTextField numberField = new JTextField();
        numberField.setBounds(50, 50, 200, 30);

        JButton calculateButton = new JButton("Calculate Square");
        calculateButton.setBounds(50, 100, 200, 30);

        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(50, 150, 200, 30);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(numberField.getText());
                resultLabel.setText("Result: " + (number * number));
            }
        });

        add(numberField);
        add(calculateButton);
        add(resultLabel);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SquareCalculator();
    }
} 