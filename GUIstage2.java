/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Admin
 */
public class GUIstage2 extends JFrame{

    private SendMons allMon = new SendMons();
    private Monster mA = allMon.ShowMon();
    private Allitems allitem = new Allitems();
    private Item iA = allitem.dropItem();
    
    private UseSkills allskill = new UseSkills();
    private Skills skills;
    private Base BBS;
    private Base BBS2;
    private Base BBS3;
    private Base CMD;
    private Base CMD2;
    private Base CMD3;
    private Base SQT;
    private Base SQT2;
    private Base SQT3;
    private Base  PKC;
    private Base  PKC2;

    private JLabel pxnv;
    private JLabel pA;
    private JLabel itA;

    private  int myHP; 
    private int myDEF;
    private int myEXP;
    private int myLevel;
    private int myMana = 0;
    private int myPokeball;
    private int countMon;           
    private int mahp = 100;                 
    private int dca = 0;             
    
    public GUIstage2(Base Pokemons, Bag bag, String namePokemon){
        super("Battle Stage");
        this.myHP = Pokemons.getHP();
        this.myDEF = Pokemons.getDEF();
        this.myEXP = Pokemons.getEXP();
        this.myLevel = Pokemons.getLevel();
        this.myMana = Pokemons.getMana();
        this.myPokeball = Pokemons.getPokeball();
        this.countMon = Pokemons.getKillmon();
        this.mahp = 100;
        //skill
        if(Pokemons.getBaseSkill().equals("Solar beam"))
            skills = allskill.getBBSSkill();
        else if(Pokemons.getBaseSkill().equals("Fire blast"))
            skills = allskill.getCMDSkill();
        else if(Pokemons.getBaseSkill().equals("Hydro pump"))
            skills = allskill.getSQTSkill();
        else
            skills = allskill.getPKCSkill();
        
        //about skill
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        
        add(p);
        //icon menu
        ImageIcon iconpk = new ImageIcon("img\\iconJB.PNG");
        ImageIcon iconlv = new ImageIcon("img\\iconLV.PNG");
        ImageIcon iconexp = new ImageIcon("img\\iconEXP.PNG");
        ImageIcon iconHP = new ImageIcon("img\\iconHP.PNG");
        ImageIcon iconfight = new ImageIcon("img\\iconFIGHT.PNG");
        ImageIcon iconbag = new ImageIcon("img\\iconBAG2.PNG");
        ImageIcon iconshop = new ImageIcon("img\\iconSHOP2.PNG");
        ImageIcon iconnext = new ImageIcon("img\\iconNEXT3.PNG");
        
        //icon pokemon
        ImageIcon iconbbs = new ImageIcon("img\\iconBBS.GIF");
        ImageIcon newbbs = new ImageIcon("img\\stageBBS2.GIF");
        //stage
        ImageIcon iconBBS2 = new ImageIcon("img\\new\\iconBBS2.GIF");
        //upgrade2
        ImageIcon newbbs2 = new ImageIcon("img\\stageBBS3.GIF");
        //upgrade3
        ImageIcon newbbs3 = new ImageIcon("img\\stageBBS4.GIF"); //************** */

        ImageIcon iconcmd = new ImageIcon("img\\iconCMD.GIF");
        ImageIcon newcmd = new ImageIcon("img\\test.GIF");
        //upgrade2
        ImageIcon newcmd2 = new ImageIcon("img\\stageCMD2.GIF");
        //upgrade3
        ImageIcon newcmd3 = new ImageIcon("img\\stageCMD3.GIF"); //************* */

        ImageIcon iconsqt = new ImageIcon("img\\iconSQT1.GIF");
        ImageIcon newsqt = new ImageIcon("img\\stageSQT.GIF");
        //upgrade2
        ImageIcon newsqt2 = new ImageIcon("img\\stageSQT2.GIF");
        //upgrade4
        ImageIcon newsqt3 = new ImageIcon("img\\stageSQT3.GIF"); //************ */

        ImageIcon iconpkc = new ImageIcon("img\\iconPKC.GIF");
        ImageIcon newpkc = new ImageIcon("img\\stagePKC.GIF");
        //upgrade2
        ImageIcon newpkc2 = new ImageIcon("img\\stagePKC2.GIF");
        
        //iconEnemy
        ImageIcon iconsnorlax = new ImageIcon("img\\iconNORLAX.GIF");
        ImageIcon iconlapras = new ImageIcon("img\\iconLAPRAS.GIF");
        ImageIcon iconlugia = new ImageIcon("img\\iconLUGIA.GIF");
        ImageIcon icongyarados = new ImageIcon("img\\iconGYARADOS.GIF");
        ImageIcon icondarkrai = new ImageIcon("img\\iconDARKRAI2.GIF");
        ImageIcon icongiratina = new ImageIcon("img\\iconGIRATINA.GIF");
        ImageIcon iconkyogre = new ImageIcon("img\\iconKYOGRE.GIF");
        ImageIcon icondialga = new ImageIcon("img\\iconDIALGA.GIF");
        //items
        ImageIcon iconberry = new ImageIcon("img\\new\\berry.PNG"); //ion
        ImageIcon potion = new ImageIcon("img\\new\\potion.PNG"); //imt
        ImageIcon superpotion = new ImageIcon("img\\new\\superpotion.PNG"); //ipt
        ImageIcon item4 = new ImageIcon("img\\new\\Upgrade.PNG");
        ImageIcon item5 = new ImageIcon("img\\new\\DragonScale.PNG");
        ImageIcon item6 = new ImageIcon("img\\new\\KingRock.PNG");
        ImageIcon item7 = new ImageIcon("img\\new\\MetalCoat.PNG");
        ImageIcon item8 = new ImageIcon("img\\new\\SinnohStone.PNG");
        ImageIcon item9 = new ImageIcon("img\\new\\SunStone.PNG");
        ImageIcon item10 = new ImageIcon("img\\new\\UnovaStone.PNG");

        ImageIcon stage = new ImageIcon("img\\stage.PNG");
        
                //top
                JPanel p1 = new JPanel();
                p1.setLayout(new GridLayout(1,5));
                
                JLabel imgPK = new JLabel("Name : " + namePokemon, iconpk, JLabel.CENTER); //Pokemons.getName()
                imgPK.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));
                JLabel imgEXP = new JLabel("EXP : " + myEXP, iconexp, JLabel.CENTER);
                imgEXP.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));
                JLabel imgHP = new JLabel("HP : " + myHP + "/100", iconHP, JLabel.CENTER);
                imgHP.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));
                JLabel imgLEVEL = new JLabel("Level : " + myLevel, iconlv, JLabel.CENTER);
                imgLEVEL.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));
                JLabel imgFight = new JLabel("Win : " + countMon, iconfight, JLabel.CENTER);
                imgFight.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));

                
                p1.add(imgPK);
                p1.add(imgEXP);
                p1.add(imgHP);
                p1.add(imgLEVEL);
                p1.add(imgFight);
                //p1.add(imgPokeball);
                
                p.add(p1,BorderLayout.NORTH);
                
                //CENTER
                JPanel p3 = new JPanel();
                p3.setLayout(new GridLayout(1,2));

                //item
                if(Pokemons.getName().equals("Bulbasaur")){   //all +s
                    pxnv = new JLabel("", newbbs, JLabel.CENTER);
                }
                else if(Pokemons.getName().equals("Bulbasaur2")){
                    pxnv = new JLabel("", newbbs2, JLabel.CENTER);
                } 
                else if(Pokemons.getName().equals("Bulbasaur3")){
                    pxnv = new JLabel("", newbbs3, JLabel.CENTER);
                }
                else if(Pokemons.getName().equals("Charmander")){
                    pxnv = new JLabel("", newcmd, JLabel.CENTER);
                }       
                else if(Pokemons.getName().equals("Charmander2")){
                    pxnv = new JLabel("", newcmd2, JLabel.CENTER);
                } 
                else if(Pokemons.getName().equals("Charmander3")){
                    pxnv = new JLabel("", newcmd3, JLabel.CENTER);
                }
                else if(Pokemons.getName().equals("Squirtle")){
                    pxnv = new JLabel("", newsqt, JLabel.CENTER);
                } 
                else if(Pokemons.getName().equals("Squirtle2")){
                    pxnv = new JLabel("", newsqt2, JLabel.CENTER);
                }  
                else if(Pokemons.getName().equals("Squirtle3")){
                    pxnv = new JLabel("", newsqt3, JLabel.CENTER);
                }            
                else if(Pokemons.getName().equals("Pikachu")){
                    pxnv = new JLabel("", newpkc, JLabel.CENTER);
                } 
                else if(Pokemons.getName().equals("Pikachu2")){
                    pxnv = new JLabel("", newpkc2, JLabel.CENTER);
                } 
                JButton skb = new JButton("Skill : " + skills.getName());
                skb.setFont(new Font("Eras Demi ITC", Font.BOLD, 23));
                skb.setEnabled(false);


                JLabel namehp = new JLabel("HP : " + myHP + "/" + Pokemons.getHP(), JLabel.LEFT);
                JLabel def = new JLabel("Def : " + myDEF + "/100", JLabel.LEFT);
                JLabel mana = new JLabel("Mana : " + myMana + "/100", JLabel.LEFT);

                JLabel statusLabel = new JLabel();
                statusLabel.setText("Now!  you fighting the " + mA.getName() + " HP: "+ mahp + "/100");
                statusLabel.setFont(new Font("Eras Demi ITC", Font.BOLD, 23));
                statusLabel.setForeground(Color.WHITE);
         //Position A
         JButton bA = new JButton("Attack");
         bA.setFont(new Font("Eras Demi ITC", Font.BOLD, 23));

         if(this.iA.getName().equals("Berry")){
             itA = new JLabel(iA.getName(), iconberry, JLabel.CENTER );
         }
         else if(this.iA.getName().equals("Potion")){
             itA = new JLabel(iA.getName(), potion, JLabel.LEFT );
         }
         else if(this.iA.getName().equals("Super potion")){
            itA = new JLabel(iA.getName(), superpotion, JLabel.LEFT );
        }
        else if(this.iA.getName().equals("Upgrade")){
            itA = new JLabel(iA.getName(), item4, JLabel.LEFT );
        }
         else if(iA.getName().equals("Dragon Scale")){
            itA = new JLabel(iA.getName(), item5, JLabel.LEFT );
         }
         else if(iA.getName().equals("King Rock")){
            itA = new JLabel(iA.getName(), item6, JLabel.LEFT );
         }
         else if(iA.getName().equals("Metal Coat")){
            itA = new JLabel(iA.getName(), item7, JLabel.LEFT );
         }
         else if(iA.getName().equals("Sinnoh Stone")){
            itA = new JLabel(iA.getName(), item8, JLabel.LEFT );
         }
         else if(iA.getName().equals("Sun Stone")){
            itA = new JLabel(iA.getName(), item9, JLabel.LEFT );
         }
         else{
            itA = new JLabel(iA.getName(), item10, JLabel.LEFT );
         }

 
         if(mA.getName().equals("Snorlax")){
             pA = new JLabel(iconsnorlax, JLabel.LEFT);
         }
         else if(mA.getName().equals("Lapras")){
             pA = new JLabel(iconlapras, JLabel.LEFT);
         }       
         else if(mA.getName().equals("Darkrai")){
             pA = new JLabel(icondarkrai, JLabel.LEFT);
         }
         else if(mA.getName().equals("Gyarados")){
             pA = new JLabel(icongyarados, JLabel.LEFT);
         }
         else if(mA.getName().equals("Lugia")){
             pA = new JLabel(iconlugia, JLabel.LEFT);
         }
         else if(mA.getName().equals("Giratina")){
             pA = new JLabel(icongiratina, JLabel.LEFT);
         }
         else if(mA.getName().equals("Dialga")){
             pA = new JLabel(icondialga, JLabel.LEFT);
         }
         else if(mA.getName().equals("Kyogre")){
             pA = new JLabel(iconkyogre, JLabel.LEFT);
         }

         
         JButton itAb = new JButton("Select ?");
         itAb.setFont(new Font("Eras Demi ITC", Font.BOLD, 23));

         itAb.setBounds(200, 200, 250, 60);
         itA.setBounds(200, 500, 200, 100);
         itA.setVisible(false);
         itAb.setVisible(false);

         //pBackground
         JPanel Background = new JPanel();
         Background.setBorder(BorderFactory.createEmptyBorder(100, 0, 0, 0));
         Background.setLayout(new BorderLayout());
         Background.setBackground(Color.BLACK);
         JLabel background = new JLabel();
         background = new JLabel("", stage, JLabel.CENTER );
         Background.add(background);
         p.add(statusLabel);
         
         p.add(pxnv);
         p.add(pA);
         p.add(Background, BorderLayout.CENTER);
         statusLabel.setBounds(370, 100, 550, 50);

         //p3
         p3.setBorder(BorderFactory.createEmptyBorder(100, 0, 0, 0));
         pxnv.setBounds(280, 240, 200, 200);
         pA.setBounds(760, 140, 350, 350);
         bA.setBounds(100, 350, 120, 60);
         itA.setBounds(530, 400, 200, 100);

         //p4
         JPanel p4 = new JPanel();
         p4.setLayout(new GridLayout(4, 1));
         p4.add(bA);
         p4.add(skb);
         
         p4.add(itA);
         p4.add(itAb);
         p.add(p4, BorderLayout.WEST);
//bottom
        
JPanel p2 = new JPanel();
p2.setLayout(new GridLayout(1,3));

JButton toBag = new JButton("  Bag", iconbag);
toBag.setFont(new Font("Eras Demi ITC", Font.BOLD, 23));
JButton toStatus = new JButton("  Status", iconshop);
toStatus.setFont(new Font("Eras Demi ITC", Font.BOLD, 23));
JButton toCharacter = new JButton("  Next", iconnext);
toCharacter.setFont(new Font("Eras Demi ITC", Font.BOLD, 23));
toCharacter.setEnabled(false);


p2.add(toBag);
p2.add(toStatus);
p2.add(toCharacter);

p.add(p2, BorderLayout.SOUTH);

//bottom


//event & handler
bA.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent eata){
        if(mahp == 0)
            toCharacter.setEnabled(true);
        
        mahp -= Pokemons.getDamage();
        myEXP += 10;
        myMana += 10;
        myHP -= mA.getMonsterDamage();
        
        if(myDEF > 0){
            myDEF -= mA.getMonsterDamage();
            myMana += Pokemons.getMana();
        }
        else if(myDEF <= 0){
            //myHP -= mA.getMonsterDamage();
            myMana += Pokemons.getMana();                        
        }
        
        //check
        if(myHP <= 0){
            myHP  = 0;
        }
        else if(myHP >= Pokemons.MaxCharHP()){
            myHP += Pokemons.MaxCharHP();
        }
        
        if(myDEF <= 0){
            myDEF = 0;
        }
        else if(myDEF >= 100){
            myDEF -= 100;
        }
        if(myEXP <= 0){
            myEXP = 0;
        }
        else if(myEXP >= 100){
            myEXP -= 100;
            myLevel++;
        }
        if(myMana <= 0){
            myMana = 0;
        }
        else if(myMana >= 100){
            myMana = 100;
        }
        if(myMana >= skills.getMana()-50){
            skb.setEnabled(true);
        }
        if(mahp <= 0){
            countMon++;
            mahp = 0;
            if(dca==0){
                dca++;
             }
             pA.setEnabled(false);
             bA.setEnabled(false); 
             itAb.setVisible(true);
             itA.setVisible(true);
         }
        else if(mahp >= 100){
            mahp = 100;
        }
        imgHP.setText("HP : " + myHP + "/" + Pokemons.MaxCharHP);

        namehp.setText("HP: " + myHP + "/" + Pokemons.MaxCharHP());
        def.setText("Def: " + myDEF + "/" + Pokemons.getDEF());
        mana.setText("Mana: " + myMana + "/100");
        imgEXP.setText("EXP: " + myEXP);
        imgLEVEL.setText("Level: " + myLevel);
        imgFight.setText("Win: " + countMon);
        statusLabel.setText("Now!  you fighting the " + mA.getName() + " HP: "+ mahp + "/100");
        
       if(myHP<=0){
            JOptionPane.showMessageDialog(null," GAME OVER! ");
            setVisible(false);
            
            new GUIstart();
        }        
    }

});
     
toCharacter.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent eatc){
        setVisible(false);
        BBS = new Base(Pokemons.getName(), Pokemons.getBaseSkill(), Pokemons.getDamage(), myHP, myEXP, myPokeball, myMana, myDEF, myLevel, countMon);
        new GUIstart();
                        
    }
});

toBag.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent eatc){
        setVisible(false);
        BBS = new Base(Pokemons.getName(), Pokemons.getBaseSkill(), Pokemons.getDamage(), myHP, myEXP, myPokeball, myMana, myDEF, myLevel, countMon);
        mahp = 100;
        new GUIbag(BBS, bag, namePokemon);


                        
    }
});

toStatus.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent eatc){
        setVisible(false);

       if(Pokemons.getName().equals("Bulbasaur")){   //all +s

            new GUIstatus(Pokemons, bag, namePokemon, myMana, myEXP, myHP);
        }
        
        else if(Pokemons.getName().equals("Charmander")){

            new GUIstatus(Pokemons, bag, namePokemon, myMana, myEXP, myHP);
        }       
        else if(Pokemons.getName().equals("Squirtle")){

            new GUIstatus(Pokemons, bag, namePokemon, myMana, myEXP, myHP);
        }         
        else if(Pokemons.getName().equals("Pikachu")){

            new GUIstatus(Pokemons, bag, namePokemon, myMana, myEXP, myHP);
        }    
        // 2
        if(Pokemons.getName().equals("Bulbasaur2")){   //all +s

            new GUIstatus(Pokemons, bag, namePokemon, myMana, myEXP, myHP);
        }
        
        else if(Pokemons.getName().equals("Charmander2")){

            new GUIstatus(Pokemons, bag, namePokemon, myMana, myEXP, myHP);
        }       
        else if(Pokemons.getName().equals("Squirtle2")){

            new GUIstatus(Pokemons, bag, namePokemon, myMana, myEXP, myHP);
        }         
        else if(Pokemons.getName().equals("Pikachu2")){

            new GUIstatus(Pokemons, bag, namePokemon, myMana, myEXP, myHP);
        }  
        //3
        if(Pokemons.getName().equals("Bulbasaur3")){   //all +s

            new GUIstatus(Pokemons, bag, namePokemon, myMana, myEXP, myHP);
        }
        
        else if(Pokemons.getName().equals("Charmander3")){

            new GUIstatus(Pokemons, bag, namePokemon, myMana, myEXP, myHP);
        }       
        else if(Pokemons.getName().equals("Squirtle3")){

            new GUIstatus(Pokemons, bag, namePokemon, myMana, myEXP, myHP);
        }         
        else if(Pokemons.getName().equals("Pikachu3")){

            new GUIstatus(Pokemons, bag, namePokemon, myMana, myEXP, myHP);
        }  

    }
});

itAb.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent eatc){
         if(mahp <= 0)
           toCharacter.setEnabled(true);
        int n = JOptionPane.showConfirmDialog(null,"Select "+iA.getName()+" ?","selected",JOptionPane.YES_NO_OPTION);
        
       if(n == JOptionPane.YES_OPTION){
           bag.AddItem(iA);
           itA.setVisible(false);
           itAb.setVisible(false);  
       }                   
    }
});
    
skb.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent eatc){
          skb.setEnabled(false);
          JOptionPane.showMessageDialog(null,"Skill: "+skills.getName()+" (Heal: "+skills.getheal()+" Damage: "+skills.getDamage()+")");
        
        
        myHP += skills.getheal();
        myMana -= skills.getMana();
        myEXP += 25;
        mahp -= skills.getDamage();

        //check
        if(myHP <= 0){
            myHP = 0;
        }
        
        else if(myHP >= Pokemons.getHP()){
            myHP = Pokemons.getHP(); 
        }
        
        if(myDEF <= 0){
            myDEF = 0;
        }
        
        else if(myDEF >= 100){
            myDEF -= 100;                    
        }
        
        if(myEXP <= 0){
            myEXP = 0;
        }
        else if(myEXP >= 100){
            myEXP -= 100;
            myLevel++;
        }
        
        if(myMana <= 0){
            myMana = 0;
        }
        
        else if(myMana >= 100){
            myMana = 100;
        }
        
        if(mahp <= 0){
                mahp = 0;
                pA.setEnabled(false);
                bA.setEnabled(false); 
                if(dca==0){
                   itAb.setVisible(true);
                   itA.setVisible(true);
                   countMon++;
                   dca++;
                }
                 
        }
        else if(mahp >= mA.getHP()){
            mahp = mA.getHP();
        }
        //update
        namehp.setText("HP: " + myHP + "/" + Pokemons.getHP());
        def.setText("DEF: " + myDEF + "/100");
        mana.setText("Mana: " + myMana + "/100");
        imgEXP.setText("EXP: " + myEXP);
        imgLEVEL.setText("Level: "+myLevel);
        imgFight.setText("Win: "+countMon);
        statusLabel.setText("Now!  you fighting the " + mA.getName() + " HP: "+ mahp + "/100");  
        }

});    
        
//p.setBackground(stage);        
   
    setSize(1020,676);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    }
}    
        
