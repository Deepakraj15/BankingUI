import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserControls implements ActionListener {
    // Creating Buttons
    JButton btn1, btn2, btn3, btn4;

    {
        btn1 = new JButton("Check Balance");
        btn2 = new JButton("Deposit");
        btn3 = new JButton("Withdraw");
        btn4 = new JButton("File a Complient");
    }

    void displayUserFun() {
        JFrame mainFrame = new JFrame("WELCOME USER");
        JLabel action = new JLabel("Choose An Action ");
        JPanel container = new JPanel();
        mainFrame.setBackground(Color.MAGENTA);
        mainFrame.add(action);

        btn1.addActionListener(this);

        btn2.addActionListener(this);

        btn3.addActionListener(this);
        // adding button to the container frame
        container.add(btn1);
        container.add(btn2);
        container.add(btn3);
        container.add(btn4);
        btn4.addActionListener(this);
        mainFrame.add(container);

        container.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));

        // setting frame properties
        mainFrame.setVisible(true);
        mainFrame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 30));
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
