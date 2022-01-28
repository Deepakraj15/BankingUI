import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage {
    void userLogin() { // login page
        JFrame logFrame = new JFrame("LOGIN - USER");
        JTextField textUser = new JTextField(); // usernme field
        JPasswordField textPass = new JPasswordField(); // password field
        JButton logButton = new JButton("LOGIN");// login button
        JLabel label1, label2;
        GridBagConstraints gbc1, gbc2, gbc3, gbclabel;
        GridBagLayout layout = new GridBagLayout();
        logFrame.setLayout(layout);

        gbclabel = new GridBagConstraints();

        /** ----------------USERNAME------------------- */
        // username textfield creation and placement
        gbc1 = new GridBagConstraints();
        gbc1.fill = GridBagConstraints.HORIZONTAL;
        gbc1.ipadx = 120;
        gbc1.ipady = 15;
        gbc1.gridx = 1;
        gbc1.gridy = 0;
        logFrame.add(textUser, gbc1); // adding username to the frame
        // label for username
        gbclabel.ipadx = 5;
        gbclabel.ipady = 10;
        gbclabel.gridx = 0;
        gbclabel.gridy = 0;
        label1 = new JLabel("USERNAME");
        logFrame.add(label1, gbclabel);

        /** ----------------PASSWORD------------------- */
        // password field creation and placemnet
        gbc2 = new GridBagConstraints();
        gbc2.fill = GridBagConstraints.HORIZONTAL;
        gbc2.ipadx = 120;
        gbc2.ipady = 15;
        gbc2.gridx = 1;
        gbc2.gridy = 1;
        logFrame.add(textPass, gbc2); // adding password field to the frame
        // label for password
        gbclabel.ipadx = 5;
        gbclabel.ipady = 10;
        gbclabel.gridx = 0;
        gbclabel.gridy = 1;
        label2 = new JLabel("PASSWORD");
        logFrame.add(label2, gbclabel);
        /** ----------------BUTTON------------------- */
        // login button creation and placement
        gbc3 = new GridBagConstraints();
        gbc3.fill = GridBagConstraints.HORIZONTAL;
        gbc3.ipadx = 120;
        gbc3.ipady = 20;
        gbc3.gridx = 1;
        gbc3.gridy = 2;
        logFrame.add(logButton, gbc3); // adding button to the frame

        logButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                ResponsePage res = new ResponsePage();
                MainPage mp = new MainPage();
                String pass = new String(textPass.getPassword());
                if (!pass.equals("password")) {
                    res.PassErrorText();
                } else {
                    logFrame.dispose();
                    mp.displayMain();
                }
            }
        });

        logFrame.setVisible(true);
        logFrame.setSize(700, 700);
        logFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        LoginPage ob;
        ob = new LoginPage();
        ob.userLogin();
    }

}
