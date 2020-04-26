import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
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
import javax.swing.plaf.ColorUIResource;


public class Pokename extends JFrame{
    JTextField nametext;
    String name;
    
    public Pokename(){
        super("Become a Pokemon trainer");
        Container container = getContentPane();

        //p1
        JPanel p1 =new JPanel();
        ImageIcon iconlogo =new ImageIcon("img\\bg2.GIF");
        JLabel logo = new JLabel(iconlogo);
        logo.setBounds(50, 0, 250, 250);

        JLabel nameLabel = new JLabel("Enter Your Buddy Name");
        nameLabel.setFont(new Font("Eras Demi ITC", Font.BOLD, 16));
        nameLabel.setForeground(new Color(16, 78, 139));
        JTextField nametext = new JTextField(20);
        nametext.setFont(new Font("Eras Demi ITC", Font.BOLD, 15));
        JButton setNameButton = new JButton(" SUBMIT ");
        setNameButton.setFont(new Font("Eras Demi ITC", Font.BOLD, 14));
        setNameButton.setBackground(new Color(16, 78, 139));
        setNameButton.setForeground(new Color(255, 255, 255));
        p1.add(logo);
        //p1.add(nullLabel);
        p1.add(nameLabel);
        p1.add(nametext);
        p1.add(setNameButton);
        p1.setLayout(new FlowLayout());
        container.add(p1);
        p1.setBackground(new ColorUIResource(30, 144, 255) );

        //p2

        setNameButton.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                name = nametext.getText();

                new GUIChoosePokemon(name);
                dispose();
            }
        });
        nametext.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                name = nametext.getText();
                
                new GUIChoosePokemon(name);
                dispose();
            }
        });
        //pack();
        setSize(350, 400);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
