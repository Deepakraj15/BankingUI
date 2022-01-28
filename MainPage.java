import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainPage implements ActionListener {
    // Creating Buttons

    JButton btn1, btn2, btn3, btn4;

    {
        btn1 = new JButton("Check Balance");
        btn2 = new JButton("Deposit");
        btn3 = new JButton("Withdraw");
        btn4 = new JButton("File a Complient");
    }

    void displayMain() {
        JFrame mainFrame = new JFrame("WELCOME");
        JLabel action = new JLabel("Choose An Action ");
        mainFrame.add(action);

        btn1.addActionListener(this);

        btn2.addActionListener(this);

        btn3.addActionListener(this);

        btn4.addActionListener(this);

        // adding button to the main frame
        mainFrame.add(btn1);
        mainFrame.add(btn2);
        mainFrame.add(btn3);
        mainFrame.add(btn4);
        // setting frame properties
        mainFrame.setVisible(true);
        mainFrame.setLayout(new FlowLayout(FlowLayout.LEFT, 100, 30));
        mainFrame.setBounds(300, 100, 500, 500);
        // actionlistener setup
    }

    public void actionPerformed(ActionEvent event) {
        ResponsePage res = new ResponsePage();
        Object ob = event.getSource();
        if (ob == btn1) {

            res.balanceCheck();
        } else if (ob == btn2) {

            res.cashDeposit();
        } else if (ob == btn3) {

            res.withdrawal();
        } else {
            res.feeback();
        }
    }

}
