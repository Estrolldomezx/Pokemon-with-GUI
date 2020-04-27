import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;

public class GUIstatus extends JFrame{
    private AllPokemons getPokemons = new AllPokemons();
    private Mons1 BBS = getPokemons.getBBS();
    private Mons1 CMD = getPokemons.getCMD();
    private Mons1  SQT = getPokemons.getSQT();
    private Mons1  PKC = getPokemons.getPKC();
    private int mana = 0;
    private int exp = 0;
    private int hp = 0;

    private Base  BS = new Base(BBS.getJName(), BBS.getJSkill(),12,100,0,0,0,0,0,0);
    private Base  MD = new Base(CMD.getJName(), CMD.getJSkill(),14,100,0,0,0,0,0,0);
    private Base  QT = new Base(SQT.getJName(), SQT.getJSkill(),11,100,0,0,0,0,0,0);
    private Base  KC = new Base(PKC.getJName(), PKC.getJSkill(),13,100,0,0,0,0,0,0);
    
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
        ImageIcon md = new ImageIcon("img/222.GIF");
        ImageIcon qt = new ImageIcon("img/333.GIF"); 
        ImageIcon kc = new ImageIcon("img/444.GIF");
        ImageIcon border = new ImageIcon("img/border.PNG");
        
        JLabel Border = new JLabel("", border, JLabel.CENTER);
        c.add(Border, BorderLayout.CENTER);
        JLabel pic;
        pic = new JLabel("", bs,JLabel.CENTER);
        c.add(pic,BorderLayout.WEST);
        pic.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
        
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
        JButton back = new JButton(" Back ");
        back.setFont(new Font("Pokemon Gb", Font.BOLD, 20));
        c1.add(status);
        c1.add(value);
        c1.add(value1);
        c1.add(value2);
        c1.add(value3);
        c1.add(back);
    
        c.add(c1,BorderLayout.EAST);
      //  JPanel c2 = new JPanel();

       // JButton back = new JButton(" Back ");
      //  back.setFont(new Font("Pokemon Gb", Font.BOLD, 12));
        
       // c.add(back,BorderLayout.SOUTH);

        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ekc){
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
        setSize(700,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  
    }
}