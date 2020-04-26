import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout.Constraints;

public class Pokename extends JFrame{
    JTextField nametext;
    String name;
    
    public Pokename(){
        super("Become a Pokemon trainer");
        Container container = getContentPane();
        container.setLayout(new GridLayout(2, 1));

        //p1
        JPanel p1 =new JPanel();
        ImageIcon iconlogo =new ImageIcon("Logo.png");
        JLabel logo = new JLabel(iconlogo);

        p1.add(logo);
        p1.setLayout(new FlowLayout());
        container.add(p1);

        //p2
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        JLabel nameLabel = new JLabel("Enter Your Name");
        p2.add(nameLabel);
        JTextField nametext = new JTextField(25);
        p2.add(nametext);
        JButton setNameButton = new JButton("Submit your buddy name");
        p2.add(setNameButton);

        container.add(p1);
        container.add(p2);

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}