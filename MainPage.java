import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainPage implements ActionListener{
    void userMain() {
        JFrame frame = new JFrame(); // outer frame
        JButton addUser, modUser, getCred, accUser; // buttons to operforms seperate functions

        // creating buttons

        addUser = new JButton("Add New User");
        modUser = new JButton("Modify User");
        getCred = new JButton("Get Details");
        accUser = new JButton("Access User");
    }
    
        public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == addUser)
        {

        }
        else if(obj == modUser)
        {

        }
        else if(obj == getCred)
        {

        }
        else
        {
            
        }
        }

    }

}
