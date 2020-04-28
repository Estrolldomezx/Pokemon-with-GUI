import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;

public class GUIstatus extends JFrame{
    private AllPokemons getPokemons = new AllPokemons();
    private Mons1 BBS = getPokemons.getBBS();
    private Mons1 BBS2 = getPokemons.getBBS2();
    private Mons1 BBS3 = getPokemons.getBBS3();
    private Mons1 CMD = getPokemons.getCMD();
    private Mons1 CMD2 = getPokemons.getCMD2();
    private Mons1 CMD3 = getPokemons.getCMD3();
    private Mons1  SQT = getPokemons.getSQT();
    private Mons1  SQT2 = getPokemons.getSQT2();
    private Mons1  SQT3 = getPokemons.getSQT3();
    private Mons1  PKC = getPokemons.getPKC();
    private Mons1  PKC2 = getPokemons.getPKC2();
    private int mana = 0;
    private int exp = 0;
    private int hp = 0;

    private Base  BS = new Base(BBS.getJName(), BBS.getJSkill(),12,100,0,0,0,0,0,0);
    private Base  BS2 = new Base(BBS2.getJName(), BBS2.getJSkill(),17,100,0,0,0,0,0,0);
    private Base  BS3 = new Base(BBS3.getJName(), BBS3.getJSkill(),17,100,0,0,0,0,0,0);
    private Base  MD = new Base(CMD.getJName(), CMD.getJSkill(),14,100,0,0,0,0,0,0);
    private Base  MD2 = new Base(CMD2.getJName(), CMD2.getJSkill(),19,100,0,0,0,0,0,0);
    private Base  MD3 = new Base(CMD3.getJName(), CMD3.getJSkill(),19,100,0,0,0,0,0,0);
    private Base  QT = new Base(SQT.getJName(), SQT.getJSkill(),11,100,0,0,0,0,0,0);
    private Base  QT2 = new Base(SQT2.getJName(), SQT2.getJSkill(),16,100,0,0,0,0,0,0);
    private Base  QT3 = new Base(SQT3.getJName(), SQT3.getJSkill(),16,100,0,0,0,0,0,0);
    private Base  KC = new Base(PKC.getJName(), PKC.getJSkill(),13,100,0,0,0,0,0,0);
    private Base  KC2 = new Base(PKC2.getJName(), PKC2.getJSkill(),18,100,0,0,0,0,0,0);
    
    private int checkPokemon = 0;

    public GUIstatus(Base Pokemons, Bag bag, String namePokemon, int Mana, int EXP, int HP){
        super("Status");

        this.mana = Mana;
        this.exp = EXP;
        this.hp = HP;

        JPanel c = new JPanel();
        c.setLayout(new BorderLayout());
        add(c);  
        ImageIcon bs = new ImageIcon("img/111.GIF");
        ImageIcon bs2 = new ImageIcon("img/iconBBS2.GIF");
        ImageIcon bs3 = new ImageIcon("img/iconBBS3.GIF");

        ImageIcon md = new ImageIcon("img/222.GIF");
        ImageIcon md2 = new ImageIcon("img/iconCMD2.GIF");
        ImageIcon md3 = new ImageIcon("img/iconCMD3.GIF");
        
        
        ImageIcon qt = new ImageIcon("img/333.GIF"); 
        ImageIcon qt2 = new ImageIcon("img/iconSQT2.GIF"); 
        ImageIcon qt3 = new ImageIcon("img/iconSQT3.GIF"); 

        ImageIcon kc = new ImageIcon("img/444.GIF");
        ImageIcon kc2 = new ImageIcon("img/iconPKC2.GIF");

        ImageIcon border = new ImageIcon("img/border.PNG");
        
        JLabel Border = new JLabel("", border, JLabel.CENTER);
        c.add(Border, BorderLayout.CENTER);
        //JLabel pic;
        if(Pokemons.getName().equals("Bulbasaur")){
            JLabel pic = new JLabel("", bs,JLabel.CENTER);
            c.add(pic, BorderLayout.WEST);
            pic.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
        }
        else if(Pokemons.getName().equals("Bulbasaur2")){
            JLabel pic = new JLabel("", bs2,JLabel.CENTER);
            c.add(pic, BorderLayout.WEST);
            pic.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
        }
        else if(Pokemons.getName().equals("Bulbasaur3")){
            JLabel pic = new JLabel("", bs3,JLabel.CENTER);
            c.add(pic, BorderLayout.WEST);
            pic.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
        }
        else if(Pokemons.getName().equals("Charmander")){
            JLabel pic = new JLabel("", md,JLabel.CENTER);
            c.add(pic, BorderLayout.WEST);
            pic.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
        }
        else if(Pokemons.getName().equals("Charmander2")){
            JLabel pic = new JLabel("", md2,JLabel.CENTER);
            c.add(pic, BorderLayout.WEST);
            pic.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
        }
        else if(Pokemons.getName().equals("Charmander3")){
            JLabel pic = new JLabel("", md3,JLabel.CENTER);
            c.add(pic, BorderLayout.WEST);
            pic.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
        }
        else if(Pokemons.getName().equals("Squirtle")){
            JLabel pic = new JLabel("", qt,JLabel.CENTER);
            c.add(pic, BorderLayout.WEST);
            pic.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
        }
        else if(Pokemons.getName().equals("Squirtle2")){
            JLabel pic = new JLabel("", qt2,JLabel.CENTER);
            c.add(pic, BorderLayout.WEST);
            pic.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
        }
        else if(Pokemons.getName().equals("Squirtle3")){
            JLabel pic = new JLabel("", qt3,JLabel.CENTER);
            c.add(pic, BorderLayout.WEST);
            pic.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
        }
        else if(Pokemons.getName().equals("Pikachu")){
            JLabel pic = new JLabel("", kc,JLabel.CENTER);
            c.add(pic, BorderLayout.WEST);
            pic.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
        }
        else if(Pokemons.getName().equals("Pikachu2")){
            JLabel pic = new JLabel("", kc2,JLabel.CENTER);
            c.add(pic, BorderLayout.WEST);
            pic.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
        }

        //pic = new JLabel("", bs,JLabel.CENTER);
        //c.add(pic, BorderLayout.WEST);
        //pic.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
        
        JPanel c1 = new JPanel();
        c1.setLayout(new GridLayout(8,1));
        c1.setBorder(BorderFactory.createEmptyBorder(60, 0, 0, 60));
        
        JLabel status = new JLabel("Status", JLabel.CENTER);
        status.setFont(new Font("Karma suture", Font.BOLD, 24));
        JLabel value = new JLabel("Pokemon : " + namePokemon, JLabel.LEFT);
        value.setFont(new Font("Karma suture", Font.BOLD, 24));
        JLabel value1 = new JLabel("HP :  "+ hp, JLabel.LEFT); //
        value1.setFont(new Font("Karma suture", Font.BOLD, 24));
        JLabel value2 = new JLabel("Mana : " + mana, JLabel.LEFT); //BS.getBaseSkill()
        value2.setFont(new Font("Karma suture", Font.BOLD, 24));
        JLabel value3 = new JLabel("EXP : " + exp, JLabel.LEFT);
        value3.setFont(new Font("Karma suture", Font.BOLD, 24));
        JLabel value4 = new JLabel("      ", JLabel.LEFT);
        value3.setFont(new Font("Karma suture", Font.BOLD, 24));
        JButton backButton = new JButton(" Back ");
        backButton.setFont(new Font("Pokemon Gb", Font.BOLD, 20));
        
        JButton upgradeButton = new JButton("Upgrade");
        upgradeButton.setFont(new Font("Pokemon Gb", Font.BOLD, 20));
        upgradeButton.setEnabled(false);
        if( exp >= 50){
            upgradeButton.setEnabled(true);
        }
        
        c1.add(status);
        c1.add(value);
        c1.add(value1);
        c1.add(value2);
        c1.add(value3);
        c1.add(backButton);
        c1.add(upgradeButton);
    
        c.add(c1,BorderLayout.EAST);


        backButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent back){
                if(Pokemons.getName().equals("Bulbasaur")){
                    setVisible(false);
                    new GUIstage2(BS, bag, namePokemon);
                    
                }
                else if(Pokemons.getName().equals("Charmander")){
                    setVisible(false);
                    new GUIstage2(MD, bag, namePokemon);
                    
                }
                
                else if(Pokemons.getName().equals("Squirtle")){
                    setVisible(false);
                    new GUIstage2(QT, bag, namePokemon);
                    
                }
                
            // 2 
                else if(Pokemons.getName().equals("Bulbasaur2")){
                    setVisible(false);
                    new GUIstage2(BS2, bag, namePokemon);
                    
                }
                else if(Pokemons.getName().equals("Charmander2")){
                    setVisible(false);
                    new GUIstage2(MD2, bag, namePokemon);
                    
                }
                
                else if(Pokemons.getName().equals("Squirtle2")){
                    setVisible(false);
                    new GUIstage2(QT2, bag, namePokemon);
                    
                }
            //3
                else if(Pokemons.getName().equals("Bulbasaur3")){
                    setVisible(false);
                    new GUIstage2(BS3, bag, namePokemon);
                    
                }
                else if(Pokemons.getName().equals("Charmander3")){
                    setVisible(false);
                    new GUIstage2(MD3, bag, namePokemon);
                    
                }
                
                else if(Pokemons.getName().equals("Squirtle3")){
                    setVisible(false);
                    new GUIstage2(QT3, bag, namePokemon);
                    
                }
                else { //if(Pokemons.getName().equals("Pickachu2"))
                    setVisible(false);
                    new GUIstage2(KC2, bag, namePokemon); 
                }
                

            }
        });

        upgradeButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evo){

            //2
                if(Pokemons.getName().equals("Bulbasaur")){
                    setVisible(false);
                    new GUIstage2(BS2, bag, namePokemon);
                    
                }
                else if(Pokemons.getName().equals("Charmander")){
                    setVisible(false);
                    new GUIstage2(MD2, bag, namePokemon);
                    
                }
                
                else if(Pokemons.getName().equals("Squirtle")){
                    setVisible(false);
                    new GUIstage2(QT2, bag, namePokemon);
                    
                }
                
                else if(Pokemons.getName().equals("Pikachu")){
                    setVisible(false);
                    new GUIstage2(KC2, bag, namePokemon);
                    
                }
            //3
                else if(Pokemons.getName().equals("Bulbasaur2")){
                    setVisible(false);
                    new GUIstage2(BS3, bag, namePokemon);
                    
                }
                else if(Pokemons.getName().equals("Charmander2")){
                    setVisible(false);
                    new GUIstage2(MD3, bag, namePokemon);
                    
                }
                
                else if(Pokemons.getName().equals("Squirtle2")){
                    setVisible(false);
                    new GUIstage2(QT3, bag, namePokemon);
                    
                }
                else if(Pokemons.getName().equals("Pikachu2")){
                    upgradeButton.setEnabled(false);
                }
            }
        });

        setSize(700,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  
    }
}
