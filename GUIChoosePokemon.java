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
import javax.swing.border.EtchedBorder;
import java.awt.image.BufferedImage;


public class GUIChoosePokemon extends JFrame{
    private AllPokemons getPokemons = new AllPokemons();
    private Bag bag = new Bag();
    private Mons1  BBS = getPokemons.getBBS();
    private Mons1  CMD = getPokemons.getCMD();
    private Mons1  SQT = getPokemons.getSQT();
    private Mons1  PKC = getPokemons.getPKC();
    
    private Base /*novice*/ BS = new Base(BBS.getJName(), BBS.getJSkill(),14,130,0,0,0,0,0,0);
    private Base /*novice*/ MD = new Base(CMD.getJName(), CMD.getJSkill(),15,145,0,0,0,0,0,0);
    private Base /*novice*/ QT = new Base(SQT.getJName(), SQT.getJSkill(),10,140,0,0,0,0,0,0);
    private Base /*novice*/ KC = new Base(PKC.getJName(), PKC.getJSkill(),13,150,0,0,0,0,0,0);
    
    private int checkPokemon = 0;
    
    public GUIChoosePokemon(){
        super("Choose your buddy");
        JPanel c = new JPanel();
        c.setLayout(new BorderLayout());
        add(c);
        
        ImageIcon bs = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\111.GIF");
        ImageIcon md = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\222.GIF");
        ImageIcon qt = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\333.GIF");
        ImageIcon kc = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\444.GIF");
        ImageIcon pogo = new ImageIcon("img/icon2.png");
        
        JLabel title = new JLabel("CHOOSE YOUR BUDDY",JLabel.CENTER);
        title.setFont(new Font("karma future", Font.TRUETYPE_FONT, 38));
        title.setForeground(Color.RED);
        //title.setBackground(Color.ORANGE);
        c.add(title, BorderLayout.NORTH);

        JLabel pic;
        pic = new JLabel("", bs,JLabel.CENTER);
        c.add(pic,BorderLayout.WEST);
        
        
        JPanel c1 = new JPanel();
        c1.setLayout(new GridLayout(8,1));
        
        
        JLabel value = new JLabel("Pokemon : " + BS.getName(), JLabel.LEFT);
        value.setFont(new Font("Karma suture", Font.BOLD, 24));
        JLabel value1 = new JLabel("HP :  "+ BS.getHP(), JLabel.LEFT); //Cambria Math
        value1.setFont(new Font("Karma suture", Font.BOLD, 24));
        JLabel value2 = new JLabel("Skill : " + BS.getBaseSkill(), JLabel.LEFT);
        value2.setFont(new Font("Karma suture", Font.BOLD, 24));
        JLabel value3 = new JLabel("Damage : " + BS.getDamage(), JLabel.LEFT);
        value3.setFont(new Font("Karma suture", Font.BOLD, 24));
        //JLabel inf4 = new JLabel("Weapon: "+Base.getWeapon(),JLabel.LEFT);
        //inf4.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));

        c1.add(value);
        c1.add(value1);
        c1.add(value2);
        c1.add(value3);
        //c1.add(value4);
        
        c.add(c1,BorderLayout.EAST);
        JPanel c2 = new JPanel();
        //c2.setBackground(Color.BLACK);
        
        c2.setLayout(new GridLayout(1,5));
        JButton buttonBBS = new JButton("Bulbasaur");
        buttonBBS.setFont(new Font("Pokemon Gb", Font.BOLD, 12));
        JButton buttonCMD = new JButton("Charmander");
        buttonCMD.setFont(new Font("Pokemon Gb", Font.BOLD, 12));
        JButton buttonSQT = new JButton("Squirtle");
        buttonSQT.setFont(new Font("Pokemon Gb", Font.BOLD, 12));
        JButton buttonPKC = new JButton("Pikachu");
        buttonPKC.setFont(new Font("Pokemon Gb", Font.BOLD, 12));
        JButton play = new JButton("READY !",pogo);
        play.setFont(new Font("Pokemon Gb", Font.BOLD, 14));
        c.add(play,BorderLayout.SOUTH);
        /*JButton bttf = new JButton("THEIF");
        bttf.setFont(new Font("Cambria Math", Font.BOLD, 18));*/
        c2.add(buttonBBS);
        c2.add(buttonCMD);
        c2.add(buttonSQT);
        c2.add(buttonPKC);
        c2.add(play);
        
        //set bg & fg button
        buttonBBS.setBackground(Color.GREEN);
        buttonBBS.setForeground ( Color.BLACK);
        buttonCMD.setBackground(Color.RED);
        buttonCMD.setForeground ( Color.BLACK);
        buttonSQT.setBackground(Color.CYAN);
        buttonSQT.setForeground ( Color.BLACK);
        buttonPKC.setBackground(Color.YELLOW);
        buttonPKC.setForeground ( Color.BLACK);
        play.setForeground(Color.WHITE);
        play.setBackground(Color.BLACK);
        
        c.add(c2,BorderLayout.SOUTH);
        
        buttonBBS.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent env){
                value.setText("Name : " + BS.getName());
                value1.setText("HP : " + BS.getHP());
                value2.setText("Skill : " + BS.getBaseSkill());
                //inf3.setText("Weapon  "+NV.getWeapon());
                value3.setText("Damage : " + BS.getDamage());
                //pic.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconBBS.GIF"));
                pic.setIcon(bs);
                //c.add(title, BorderLayout.NORTH);
                //pic.locate(400, 400);
                checkPokemon = 0;
                
 
            }
        });
        
        buttonCMD.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent env){
                value.setText("Name : " + MD.getName());
                value1.setText("HP : " + MD.getHP());
                value2.setText("Skill : " + MD.getBaseSkill());
                //inf3.setText("Weapon  "+NV.getWeapon());
                value3.setText("Damage : " + MD.getDamage());
                //pic.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconCMD.GIF"));
                pic.setIcon(md);
                checkPokemon = 1;
                
 
            }
        });
        
        buttonSQT.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent env){
                value.setText("Name : " + QT.getName());
                value1.setText("HP : " + QT.getHP());
                value2.setText("Skill : " + QT.getBaseSkill());
                //inf3.setText("Weapon  "+NV.getWeapon());
                value3.setText("Damage : " + QT.getDamage());
                pic.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconSQT1.GIF")); 
                pic.setIcon(qt);
                checkPokemon = 2;
                
 
            }
        });
        
        buttonPKC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent env){
                value.setText("Name : " + KC.getName());
                value1.setText("HP : " + KC.getHP());
                value2.setText("Skill : " + KC.getBaseSkill());
                //inf3.setText("Weapon  "+NV.getWeapon());
                value3.setText("Damage : " + KC.getDamage());
                pic.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconPKC.GIF"));
                pic.setIcon(kc);
                checkPokemon = 3;
                
 
            }
        });
        
        play.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent epy){
                if(checkPokemon == 0){
                    setVisible(false);
                    new GUIstage(BS, bag);
                    
                }
                else if(checkPokemon ==1){
                    setVisible(false);
                    new GUIstage(MD, bag);
                    
                }
                
                else if(checkPokemon ==2){
                    setVisible(false);
                    new GUIstage(QT, bag);
                    
                }
                
                else if(checkPokemon ==3){
                    setVisible(false);
                    new GUIstage(KC, bag);
                    
                }
                
            }
        });
        
        setSize(800,600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  
    }    
    }  

