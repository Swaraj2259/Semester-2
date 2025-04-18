import javax.swing.*;
import java.awt.event.*;

public class Q20add extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton;

    public Q20add() {
        setTitle("Addition Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(20, 20, 80, 25);
        add(label1);

        num1Field = new JTextField();
        num1Field.setBounds(100, 20, 100, 25);
        add(num1Field);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(20, 50, 80, 25);
        add(label2);

        num2Field = new JTextField();
        num2Field.setBounds(100, 50, 100, 25);
        add(num2Field);

        addButton = new JButton("Add");
        addButton.setBounds(80, 80, 100, 30);
        add(addButton);

        resultField = new JTextField();
        resultField.setBounds(80, 120, 100, 25);
        resultField.setEditable(false);
        add(resultField);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    resultField.setText(String.valueOf(num1 + num2));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Enter valid numbers!");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q20add();
    }
}
