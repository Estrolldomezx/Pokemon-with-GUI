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
    private AllPokemons allpokemons = new AllPokemons();
    private Bag bag = new Bag();
    private Mons1  BBS = getPokemons.Bulbasaur();
    private Mons1  CMD = getPokemons.Charmander();
    private Mons1  SQT = getPokemons.Squirtle();
    private Mons1  PKC = getPokemons.Pikachu();
    
    private Base /*novice*/ BS = new Base(BBS.getJName(), BBS.getSkill(),14,130,0,0,0,0,0,0);
    private Base /*novice*/ MD = new Base(CMD.getJName(), CMD.getSkill(),15,145,0,0,0,0,0,0);
    private Base /*novice*/ QT = new Base(SQT.getJName(), SQT.getSkill(),10,140,0,0,0,0,0,0);
    private Base /*novice*/ KC = new Base(PKC.getJName(), PKC.getSkill(),13,150,0,0,0,0,0,0);
    
    private int checkPokemon = 0;
    
    public GUIChoosePokemon(){
        super("Choose your buddy");
        JPanel c = new JPanel();
        c.setLayout(new BorderLayout());
        add(c);
        
        ImageIcon BS = new ImageIcon("bbs.png");
        ImageIcon MD = new ImageIcon("cmd.png");
        ImageIcon QT = new ImageIcon("sqt.png");
        ImageIcon KC = new ImageIcon("pkc.png");
        ImageIcon pogo = new ImageIcon("icon2.png");
        
        JLabel title = new JLabel("CHOOSE YOUR BUDDY",JLabel.CENTER);
        title.setFont(new Font("Algerian", Font.BOLD, 22));
        c.add(title, BorderLayout.NORTH);
        
        JButton play = new JButton("READY !",pogo);
        play.setFont(new Font("Angsana New", Font.BOLD, 20));
        c.add(play,BorderLayout.SOUTH);
        
        JLabel pic;
        pic = new JLabel("",Base,JLabel.CENTER);
        c.add(pic,BorderLayout.WEST);
        JPanel c1 = new JPanel();
        c1.setLayout(new GridLayout(4,1));
        
        JLabel value = new JLabel("Pokemon : " + Base.getName(),JLabel.LEFT);
        value.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        JLabel value1 = new JLabel("HP :  + Base.getHP(),JLabel.LEFT); //Cambria Math
        value1.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        JLabel value2 = new JLabel("Skill : " + .getBasicSkill(),JLabel.LEFT);
        value2.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        JLabel value3 = new JLabel("Damage: " + Base.getDamage(),JLabel.LEFT);
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
        
        c.add(c2,BorderLayout.EAST);
        
        buttonBBS.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent env){
                value.setText("Name : " + Base.getName());
                value1.setText("HP : " + Base.getHP());
                value2.setText("Skill : " + Base.getBasicSkill());
                //inf3.setText("Weapon  "+NV.getWeapon());
                value3.setText("Damage : " + Base.getDamage());
                pic.setIcon(new ImageIcon("bbs.png"));
                checkPokemon = 0;
                
 
            }
        });
        
        buttonCMD.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent env){
                value.setText("Name : " + Base.getName());
                value1.setText("HP : " + Base.getHP());
                value2.setText("Skill : " + Base.getBasicSkill());
                //inf3.setText("Weapon  "+NV.getWeapon());
                value3.setText("Damage : " + Base.getDamage());
                pic.setIcon(new ImageIcon("cmd.png"));
                checkPokemon = 1;
                
 
            }
        });
        
        buttonSQT.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent env){
                value.setText("Name : " + Base.getName());
                value1.setText("HP : " + Base.getHP());
                value2.setText("Skill : " + Base.getBasicSkill());
                //inf3.setText("Weapon  "+NV.getWeapon());
                value3.setText("Damage : " + Base.getDamage());
                pic.setIcon(new ImageIcon("sqt.png"));
                checkPokemon = 2;
                
 
            }
        });
        
        buttonPKC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent env){
                value.setText("Name : " + Base.getName());
                value1.setText("HP : " + Base.getHP());
                value2.setText("Skill : " + Base.getBasicSkill());
                //inf3.setText("Weapon  "+NV.getWeapon());
                value3.setText("Damage : " + Base.getDamage());
                pic.setIcon(new ImageIcon("pkc.png"));
                checkPokemon = 3;
                
 
            }
        });
        
        play.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent epy){
                if(checkPokemon == 0){
                    setVisible(false);
                    new GUIBattleground(BS, bag);
                    
                }
                else if(checkPokemon ==1){
                    setVisible(false);
                    new GUIBattleground(MD, bag);
                    
                }
                
                else if(checkPokemon ==2){
                    setVisible(false);
                    new GUIBattleground(QT, bag);
                    
                }
                
                else if(checkPokemon ==3){
                    setVisible(false);
                    new GUIBattleground(KC, bag);
                    
                }
                
            }
        });
        
        setSize(800,600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
        
        
    }

        
        
    }

    
}
