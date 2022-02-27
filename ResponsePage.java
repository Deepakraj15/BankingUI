import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ResponsePage {

    static int balanceAmt = 0;

    void PassErrorText() {

        JOptionPane.showMessageDialog(new JFrame(), "Invalid password", "ALERT", JOptionPane.ERROR_MESSAGE);
    }

    void balanceCheck() { // to check balance
        // setting frame

        JOptionPane.showMessageDialog(new JFrame(),
                "Process sucessful!!\nBalance Amount: " + String.valueOf(balanceAmt), "BALANCE",
                JOptionPane.PLAIN_MESSAGE);

    }

    void cashDeposit() { // cash deposit
        // settinng frame
        JFrame frame = new JFrame("REPORT");

        frame.setVisible(true);
        frame.setSize(500, 500);
        GridBagLayout grid = new GridBagLayout();
        frame.setLayout(grid);

        JTextField txt = new JTextField();
        JLabel amount = new JLabel("Enter amount: ");
        JButton btn7 = new JButton("Proceed");
        // grid layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.ipadx = 120;
        gbc.ipady = 12;
        frame.add(txt, gbc);
        GridBagConstraints gbca = new GridBagConstraints();
        gbca.gridx = 0;
        gbca.gridy = 0;
        gbca.ipadx = 120;
        gbca.ipady = 12;
        frame.add(amount, gbca);

        GridBagConstraints gbcb = new GridBagConstraints();
        gbcb.fill = GridBagConstraints.HORIZONTAL;
        gbcb.gridx = 1;
        gbcb.gridy = 1;
        gbcb.ipadx = 120;
        gbcb.ipady = 12;
        frame.add(btn7, gbcb);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String s = new String(txt.getText());
                int i = Integer.parseInt(s);
                balanceAmt += i;
                JOptionPane.showMessageDialog(new JFrame(),
                        "Process sucessful!!\nBalance Amount: " + String.valueOf(balanceAmt), "DEPOSIT",
                        JOptionPane.PLAIN_MESSAGE);

            }
        });
    }

    void withdrawal() { // to withdraw cash
        JFrame frame = new JFrame("REPORT");

        frame.setVisible(true);
        frame.setSize(500, 500);
        GridBagLayout grid = new GridBagLayout();
        frame.setLayout(grid);

        JTextField txt = new JTextField();
        JLabel amount = new JLabel("Enter amount: ");

        GridBagConstraints gbc1 = new GridBagConstraints();

        gbc1.gridx = 1;
        gbc1.gridy = 0;
        gbc1.ipadx = 120;
        gbc1.ipady = 12;
        frame.add(txt, gbc1);
        GridBagConstraints gbc1a = new GridBagConstraints();
        gbc1a.gridx = 0;
        gbc1a.gridy = 0;
        gbc1a.ipadx = 120;
        gbc1a.ipady = 12;
        frame.add(amount, gbc1a);
        GridBagConstraints gbc1b = new GridBagConstraints();
        gbc1b.fill = GridBagConstraints.HORIZONTAL;
        gbc1b.gridx = 0;
        gbc1b.gridy = 1;
        gbc1b.ipadx = 120;
        gbc1b.ipady = 12;
        JButton btn6 = new JButton("Proceed");
        frame.add(btn6, gbc1b);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                String s = new String(txt.getText());
                int i = Integer.parseInt(s);
                balanceAmt -= i;
                JOptionPane.showMessageDialog(new JFrame(),
                        "Process sucessful!!\nBalance Amount: " + String.valueOf(balanceAmt), "WITHDRAW",
                        JOptionPane.PLAIN_MESSAGE);

            }
        });
    }

    void feeback() { // to fill a complient
        JFrame frame = new JFrame("REPORT");

        frame.setVisible(true);
        frame.setSize(500, 500);
        GridBagLayout grid = new GridBagLayout();
        frame.setLayout(grid);

        JTextArea area = new JTextArea();
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.fill = GridBagConstraints.VERTICAL;
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gbc2.ipadx = 120;
        gbc2.ipady = 120;
        frame.add(area, gbc2);
        GridBagConstraints gbc2a = new GridBagConstraints();

        gbc2a.fill = GridBagConstraints.HORIZONTAL;
        gbc2a.gridx = 0;
        gbc2a.gridy = 1;
        gbc2a.ipadx = 50;
        gbc2a.ipady = 12;
        JButton btn5 = new JButton("Submit");
        frame.add(btn5, gbc2a);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JOptionPane.showMessageDialog(new JFrame(), "Your compliant has been noted!!", "Response",
                        JOptionPane.PLAIN_MESSAGE);

            }
        });
    }

    void addUserDetails() {
        JLabel details = new JLabel("Enter Username: ");
        JTextField detailsUserAdd = new JTextField();
        // details.set
        // detailsUserAdd.setBounds(100,200,20,30);

    }
}