import javax.swing.*;
import java.awt.event.*;

public class Q18sq extends JFrame 
{
    private JTextField inputField, resultField;
    private JButton calculateButton;

    public Q18sq() 
    {
        setTitle("Square Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("Enter a number:");
        label.setBounds(20, 20, 100, 25);
        add(label);

        inputField = new JTextField();
        inputField.setBounds(130, 20, 100, 25);
        add(inputField);

        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(80, 50, 100, 30);
        add(calculateButton);

        resultField = new JTextField();
        resultField.setBounds(80, 90, 100, 25);
        resultField.setEditable(false);
        add(resultField);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(inputField.getText());
                    resultField.setText(String.valueOf(num * num));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Enter a valid number!");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q18sq();
    }
}
