import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainPage implements ActionListener {
    JButton addUser, modUser, getCred, accUser; // buttons to operforms seperate functions

    // creating buttons
    {
        addUser = new JButton("Add New User");
        modUser = new JButton("Modify User");
        getCred = new JButton("Get Details");
        accUser = new JButton("Access User");
    }

    void userMain() {
        JFrame frame = new JFrame(); // outer frame
        JPanel con1; // containers to hold components

        con1 = new JPanel();
        // adding buttons to the container - con1

        con1.add(addUser);
        con1.add(addUser);
        con1.add(addUser);
        con1.add(addUser);

        // passing objects
        addUser.addActionListener(this);
        modUser.addActionListener(this);
        getCred.addActionListener(this);
        accUser.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == addUser) {

        } else if (obj == modUser) {

        } else if (obj == getCred) {

        } else {

        }
    }

}
