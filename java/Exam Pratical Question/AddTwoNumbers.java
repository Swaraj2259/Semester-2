// 20. Create a Swing application that adds two numbers
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTwoNumbers extends JFrame {
    public AddTwoNumbers() {
 
        JTextField numberField1 = new JTextField();
        numberField1.setBounds(50, 50, 100, 30);
 
 
        JTextField numberField2 = new JTextField();
        numberField2.setBounds(160, 50, 100, 30);

 
        JButton addButton = new JButton("Add");
        addButton.setBounds(50, 100, 100, 30);

 
        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(50, 150, 200, 30);

 
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number1 = Integer.parseInt(numberField1.getText());
                int number2 = Integer.parseInt(numberField2.getText());
                int sum = number1 + number2;
                resultLabel.setText("Result: " + sum);
            }
        });

  
        add(numberField1);
        add(numberField2);
        add(addButton);
        add(resultLabel);

 
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AddTwoNumbers();
    }
} 