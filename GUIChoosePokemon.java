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
        
        ImageIcon bs = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\bbs1.GIF");
        ImageIcon md = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\cmd1.GIF");
        ImageIcon qt = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\sqt1.GIF");
        ImageIcon kc = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\pkc1.GIF");
        ImageIcon pogo = new ImageIcon("img/icon2.png");
        
        JLabel title = new JLabel("CHOOSE YOUR BUDDY",JLabel.CENTER);
        title.setFont(new Font("Algerian", Font.BOLD, 22));
        c.add(title, BorderLayout.NORTH);
        
        JButton play = new JButton("READY !",pogo);
        play.setFont(new Font("Angsana New", Font.BOLD, 20));
        c.add(play,BorderLayout.SOUTH);
        
        JLabel pic;
        pic = new JLabel("", bs,JLabel.CENTER);
        c.add(pic,BorderLayout.WEST);
        
        JPanel c1 = new JPanel();
        c1.setLayout(new GridLayout(8,2));
        
        JLabel value = new JLabel("Pokemon : " + BS.getName(), JLabel.LEFT);
        value.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        JLabel value1 = new JLabel("HP :  "+ BS.getHP(), JLabel.LEFT); //Cambria Math
        value1.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        JLabel value2 = new JLabel("Skill : " + BS.getBaseSkill(), JLabel.LEFT);
        value2.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        JLabel value3 = new JLabel("Damage: " + BS.getDamage(), JLabel.LEFT);
        value3.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        //JLabel inf4 = new JLabel("Weapon: "+Base.getWeapon(),JLabel.LEFT);
        //inf4.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        
        c1.add(value);
        c1.add(value1);
        c1.add(value2);
        c1.add(value3);
        //c1.add(value4);
        
        c.add(c1,BorderLayout.CENTER);
        JPanel c2 = new JPanel();
        
        c2.setLayout(new GridLayout(4,1));
        JButton buttonBBS = new JButton("Bulbasaur");
        buttonBBS.setFont(new Font("Cambria Math", Font.BOLD, 18));
        JButton buttonCMD = new JButton("Charmander");
        buttonCMD.setFont(new Font("Cambria Math", Font.BOLD, 18));
        JButton buttonSQT = new JButton("Squirtle");
        buttonSQT.setFont(new Font("Cambria Math", Font.BOLD, 18));
        JButton buttonPKC = new JButton("Pikachu");
        buttonPKC.setFont(new Font("Cambria Math", Font.BOLD, 18));
        /*JButton bttf = new JButton("THEIF");
        bttf.setFont(new Font("Cambria Math", Font.BOLD, 18));*/
        c2.add(buttonBBS);
        c2.add(buttonCMD);
        c2.add(buttonSQT);
        c2.add(buttonPKC);
        
        
        c.add(c2,BorderLayout.EAST);
        
        buttonBBS.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent env){
                value.setText("Name : " + BS.getName());
                value1.setText("HP : " + BS.getHP());
                value2.setText("Skill : " + BS.getBaseSkill());
                //inf3.setText("Weapon  "+NV.getWeapon());
                value3.setText("Damage : " + BS.getDamage());
                pic.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\bbs1.GIF"));
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
                pic.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\cmd1.GIF"));
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
                pic.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\sqt1.GIF"));
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
                pic.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\pkc1.GIF"));
                checkPokemon = 3;
                
 
            }
        });
        
        play.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent epy){
                if(checkPokemon == 0){
                    setVisible(false);
                    //new GUIBattleground(BS, bag);
                    
                }
                else if(checkPokemon ==1){
                    setVisible(false);
                    //new GUIBattleground(MD, bag);
                    
                }
                
                else if(checkPokemon ==2){
                    setVisible(false);
                   // new GUIBattleground(QT, bag);
                    
                }
                
                else if(checkPokemon ==3){
                    setVisible(false);
                  //  new GUIBattleground(KC, bag);
                    
                }
                
            }
        });
        
        setSize(800,600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  
    }    
    }  

