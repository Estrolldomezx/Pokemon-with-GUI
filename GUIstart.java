/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIstart extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L; //push

    // private int count = 0;
    public GUIstart(){
        JLabel Background;
        JButton button1 = new JButton("Become a Pokemon trainer");
        button1.setFont(new Font("Eras Demi ITC", Font.BOLD, 20));
        ImageIcon img = new ImageIcon("img\\menu.JPG");
        Background = new JLabel("", img, JLabel.CENTER );
        Background.setLayout(null);
        button1.setBounds(238,360,326,50);
        button1.setBackground(new Color(255, 215, 0));
        button1.setForeground(new Color(178, 34, 34));
        Background.setBounds(0,0,800,600);
        Background.add(button1);
        add(Background);
        
        button1.addActionListener((ActionEvent e) -> {
            setVisible(false);
            new Pokename();
        });
        
        setSize(800,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
