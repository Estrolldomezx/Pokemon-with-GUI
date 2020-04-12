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
    private int count = 0;
    public GUIstart(){
        JLabel Background;
        JButton button1 = new JButton("Click to play");
        button1.setFont(new Font("Eras Demi ITC", Font.BOLD, 20));
        ImageIcon img = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\icon12.JPG");
        Background = new JLabel("", img, JLabel.CENTER );
        Background.setLayout(null);
        button1.setBounds(300,475,200,35);
        Background.setBounds(0,0,800,600);
        Background.add(button1);
        add(Background);
        
        button1.addActionListener((ActionEvent e) -> {
            setVisible(false);
            new GUIChoosePokemon();
        });
        
        setSize(800,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
