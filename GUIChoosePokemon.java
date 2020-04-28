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
import java.util.EventListener;


public class GUIChoosePokemon extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private AllPokemons getPokemons = new AllPokemons();
    private Bag bag = new Bag();
    private Mons1  BBS = getPokemons.getBBS();
    private Mons1  CMD = getPokemons.getCMD();
    private Mons1  SQT = getPokemons.getSQT();
    private Mons1  PKC = getPokemons.getPKC();
    
    private Base  BS = new Base(BBS.getJName(), BBS.getJSkill(),12,100,0,0,0,0,0,0);
    private Base  MD = new Base(CMD.getJName(), CMD.getJSkill(),14,100,0,0,0,0,0,0);
    private Base  QT = new Base(SQT.getJName(), SQT.getJSkill(),11,100,0,0,0,0,0,0);
    private Base  KC = new Base(PKC.getJName(), PKC.getJSkill(),13,100,0,0,0,0,0,0);
    
    private int checkPokemon = 0;
    
    public GUIChoosePokemon(String namePokemon){
        super("Choose your buddy");
        JPanel c = new JPanel();
        c.setLayout(new BorderLayout());
        
        add(c);

        ImageIcon bs = new ImageIcon("img/111.GIF");
        ImageIcon md = new ImageIcon("img/222.GIF");
        ImageIcon qt = new ImageIcon("img/333.GIF"); 
        ImageIcon kc = new ImageIcon("img/444.GIF");
        ImageIcon border = new ImageIcon("img/border.PNG");
        ImageIcon pogo = new ImageIcon("img/iconFIGHT2.PNG");
        
        JLabel title = new JLabel("CHOOSE YOUR BUDDY",JLabel.CENTER);
        title.setFont(new Font("karma future", Font.TRUETYPE_FONT, 38));
        title.setForeground(Color.RED);
        c.add(title, BorderLayout.NORTH);
        
   
        JLabel Border = new JLabel("", border,JLabel.CENTER);
        c.add(Border, BorderLayout.CENTER);
        JLabel pic;
        pic = new JLabel("", bs,JLabel.CENTER);
        c.add(pic,BorderLayout.WEST);
        pic.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
        
        
        JPanel c1 = new JPanel();
        c1.setLayout(new GridLayout(8,1));
        c1.setBorder(BorderFactory.createEmptyBorder(60, 0, 0, 60));
        //c1.setBounds(300, 400, 200, 200);
        //getContentPane().add(c1);
    
        
        JLabel value = new JLabel("Pokemon : " + BS.getName(), JLabel.LEFT);
        value.setFont(new Font("Karma suture", Font.BOLD, 24));
        JLabel value1 = new JLabel("HP :  "+ BS.getHP(), JLabel.LEFT); //Cambria Math
        value1.setFont(new Font("Karma suture", Font.BOLD, 24));
        JLabel value2 = new JLabel("Skill : " + BS.getBaseSkill(), JLabel.LEFT);
        value2.setFont(new Font("Karma suture", Font.BOLD, 24));
        JLabel value3 = new JLabel("Damage : " + BS.getDamage(), JLabel.LEFT);
        value3.setFont(new Font("Karma suture", Font.BOLD, 24));
        JLabel value4 = new JLabel("      ", JLabel.LEFT);
        value3.setFont(new Font("Karma suture", Font.BOLD, 24));

        c1.add(value);
        c1.add(value1);
        c1.add(value2);
        c1.add(value3);

        
        c.add(c1,BorderLayout.EAST);
        JPanel c2 = new JPanel();
        
        c2.setLayout(new GridLayout(1,5));
        JButton buttonBBS = new JButton("Bulbasaur");
        buttonBBS.setFont(new Font("Pokemon Gb", Font.BOLD, 12));
        JButton buttonCMD = new JButton("Charmander");
        buttonCMD.setFont(new Font("Pokemon Gb", Font.BOLD, 12));
        JButton buttonSQT = new JButton("Squirtle");
        buttonSQT.setFont(new Font("Pokemon Gb", Font.BOLD, 12));
        JButton buttonPKC = new JButton("Pikachu");
        buttonPKC.setFont(new Font("Pokemon Gb", Font.BOLD, 12));
        JButton play = new JButton("",pogo);
        play.setFont(new Font("Pokemon Gb", Font.BOLD, 12));
        c.add(play,BorderLayout.SOUTH);
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
            public void actionPerformed(ActionEvent ebs){
                value.setText("Name : " + BS.getName());
                value1.setText("HP : " + BS.getHP());
                value2.setText("Skill : " + BS.getBaseSkill());
                value3.setText("Damage : " + BS.getDamage());
                pic.setIcon(bs);

                checkPokemon = 0;
                
 
            }
        });
        
        buttonCMD.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent emd){
                value.setText("Name : " + MD.getName());
                value1.setText("HP : " + MD.getHP());
                value2.setText("Skill : " + MD.getBaseSkill());
                value3.setText("Damage : " + MD.getDamage());
                pic.setIcon(md);
                checkPokemon = 1;
                
 
            }
        });
        
        buttonSQT.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eqt){
                value.setText("Name : " + QT.getName());
                value1.setText("HP : " + QT.getHP());
                value2.setText("Skill : " + QT.getBaseSkill());
                value3.setText("Damage : " + QT.getDamage());
                pic.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconSQT1.GIF")); 
                pic.setIcon(qt);
                checkPokemon = 2;
                
 
            }
        });
        
        buttonPKC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ekc){
                value.setText("Name : " + KC.getName());
                value1.setText("HP : " + KC.getHP());
                value2.setText("Skill : " + KC.getBaseSkill());
                value3.setText("Damage : " + KC.getDamage());
                pic.setIcon(kc);
                checkPokemon = 3;
                
 
            }
        });
        
        play.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent epy){
                if(checkPokemon == 0){
                    setVisible(false);
                    new GUIstage2(BS, bag, namePokemon);
                    
                }
                else if(checkPokemon ==1){
                    setVisible(false);
                    new GUIstage2(MD, bag, namePokemon);
                    
                }
                
                else if(checkPokemon ==2){
                    setVisible(false);
                    new GUIstage2(QT, bag, namePokemon);
                    
                }
                
                else if(checkPokemon ==3){
                    setVisible(false);
                    new GUIstage2(KC, bag, namePokemon);
                    
                }
                
            }
        });
        
        setSize(800,600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  
      }    
    }  

