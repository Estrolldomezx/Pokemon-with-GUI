/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
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
    private Monster mB = allMon.ShowMon();
    private Monster mC = allMon.ShowMon();
    
    private Allitems allitem = new Allitems();

    private Item iA = allitem.dropItem();
    private Item iB = allitem.dropItem();
    private Item iC = allitem.dropItem();

    
    private UseSkills allskill = new UseSkills();
    private Skills skills;
    private Base BBS;
    private Base CMD;
    private Base SQT;
    private Base  PKC;
    private JLabel pxnv;
    private JLabel pA;
    private JLabel pB;
    private JLabel pC;
    private JLabel itA;
    private JLabel itB;
    private JLabel itC;
    private  int myHP;
    private int myDEF;
    private int myEXP;
    private int myLevel;
    private int myMana = 0;
    private int myPokeball;
    private int countMon;           //
    private int mahp;                 //
    private int mbhp;
    private int mchp;  //edit float to int
    private int dca = 0;             //
    private int dcb = 0;
    private int dcc = 0;
    
    public GUIstage2(Base Pokemons, Bag bag){
        super("Battle Stage");
        this.myHP = Pokemons.getHP();
        this.myDEF = Pokemons.getDEF();
        this.myEXP = Pokemons.getEXP();
        this.myLevel = Pokemons.getLevel();
        this.myMana = Pokemons.getMana();
        this.myPokeball = Pokemons.getPokeball();
        this.countMon = Pokemons.getKillmon();
        this.mahp = mA.CharHP;
        //this.mbhp = mB.CharHP;
        //this.mahp = mA.CharHP;
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
        p.setBackground(Color.BLACK);
        add(p);
        //icon menu
        ImageIcon iconpk = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconJB.PNG");
        ImageIcon iconlv = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconLV.PNG");
        ImageIcon iconexp = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconEXP.PNG");
        ImageIcon iconfight = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconFIGHT.PNG");
        ImageIcon iconpokeball = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconPOKEBALL.PNG");
        ImageIcon iconbag = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconBAG2.PNG");
        ImageIcon iconshop = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconSHOP2.PNG");
        ImageIcon iconnext = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconNEXT3.PNG");
        
        //icon pokemon
        ImageIcon iconbbs = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconBBS.GIF");
        ImageIcon newbbs = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\stageBBS2.GIF");
        ImageIcon iconcmd = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconCMD.GIF");
        ImageIcon newcmd = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\test.GIF");
        ImageIcon iconsqt = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconSQT1.GIF");
        ImageIcon newsqt = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\stageSQT.GIF");
        ImageIcon iconpkc = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconPKC.GIF");
        ImageIcon newpkc = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\stagePKC.GIF");
        
        //iconEnemy
        ImageIcon iconsnorlax = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\iconNORLAX.GIF");
        ImageIcon iconlapras = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\iconLAPRAS.GIF");
        ImageIcon iconlugia = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\iconLUGIA.GIF");
        ImageIcon icongyarados = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\iconGYARADOS.GIF");
        ImageIcon icondarkrai = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\iconDARKRAI.GIF");
        ImageIcon icongiratina = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\iconGIRATINA.GIF");
        ImageIcon iconkyogre = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\iconKYOGRE.GIF");
        ImageIcon icondialga = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\iconDIALGA.GIF");
        //items
        ImageIcon iconberry = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\berry.PNG"); //ion
        ImageIcon potion = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\potion.PNG"); //imt
        ImageIcon superpotion = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\superpotion.PNG"); //ipt
        ImageIcon item4 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\Upgrade.PNG");
        ImageIcon item5 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\DragonScale.PNG");
        ImageIcon item6 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\KingRock.PNG");
        ImageIcon item7 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\MetalCoat.PNG");
        ImageIcon item8 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\SinnohStone.PNG");
        ImageIcon item9 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\SunStone.PNG");
        ImageIcon item10 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\UnovaStone.PNG");
        ImageIcon sk = new ImageIcon("test.gif");
        ImageIcon coe = new ImageIcon("test.gif");

        ImageIcon stage = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\stage.PNG");
        

        //JLabel Background;
        //Background = new JLabel("", stage, JLabel.CENTER);
                //top
                JPanel p1 = new JPanel();
                p1.setLayout(new GridLayout(1,6));
                //  p1.setBackground(Color.darkGray);
                
                JLabel imgPK = new JLabel("Name : " + Pokemons.getName(), iconpk, JLabel.LEFT); //+s
                imgPK.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));
                JLabel imgEXP = new JLabel("EXP : " + myEXP, iconexp, JLabel.LEFT);
                imgEXP.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));
               // JLabel imgEXP = new JLabel("EXP : " + myEXP, iconexp, JLabel.LEFT);
               // imgEXP.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));
                JLabel imgLEVEL = new JLabel("Level : " + myLevel, iconlv, JLabel.LEFT);
                imgLEVEL.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));
                JLabel imgFight = new JLabel("Win : " + countMon, iconfight, JLabel.LEFT);
                imgFight.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));
                JLabel imgPokeball = new JLabel("Pokeball : " + myPokeball, iconpokeball, JLabel.LEFT);
                imgPokeball.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));
                
                p1.add(imgPK);
                p1.add(imgEXP);
                p1.add(imgLEVEL);
                p1.add(imgFight);
                p1.add(imgPokeball);
                
                p.add(p1,BorderLayout.NORTH);
                
                //CENTER
                JPanel p3 = new JPanel();
                //p3.setBackground(Color.BLACK);
                //p3.setBackground(stage);
                JLabel efk = new JLabel("", sk, JLabel.CENTER);
                JLabel KF = new JLabel("", coe, JLabel.CENTER);
                //item
                if(Pokemons.getName().equals("Bulbasaur")){   //all +s
                    pxnv = new JLabel("", newbbs, JLabel.CENTER);
                }
                else if(Pokemons.getName().equals("Charmander")){
                    pxnv = new JLabel("", newcmd, JLabel.CENTER);
                }       
                else if(Pokemons.getName().equals("Squirtle")){
                    pxnv = new JLabel("", newsqt, JLabel.CENTER);
                }         
                else if(Pokemons.getName().equals("Pikachu")){
                    pxnv = new JLabel("", newpkc, JLabel.CENTER);
                } 

                JButton skb = new JButton("Skill : " + skills.getName());
                skb.setEnabled(false);
                JLabel namehp = new JLabel("HP : " + myHP + "/" + Pokemons.getHP(), JLabel.LEFT);
                JLabel def = new JLabel("Def : " + myDEF + "/100", JLabel.LEFT);
                JLabel mana = new JLabel("Mana : " + myMana + "/100", JLabel.LEFT);

                p3.setLayout(new GridLayout(3 ,2));
         //Position A
         JButton bA = new JButton("Attack");
         if(this.iA.getName().equals("Berry")){
             itA = new JLabel(iA.getName(), iconberry, JLabel.LEFT );
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
             pA = new JLabel(mA.getName() + "/ HP: " + myHP, iconsnorlax, JLabel.LEFT);
         }
         else if(mA.getName().equals("Lapras")){
             pA = new JLabel(mA.getName()+"/ HP: " + myHP, iconlapras, JLabel.LEFT);
         }       
         else if(mA.getName().equals("Darkrai")){
             pA = new JLabel(mA.getName()+"/ HP: " + myHP, icondarkrai, JLabel.LEFT);
         }
         else if(mA.getName().equals("Gyarados")){
             pA = new JLabel(mA.getName()+"/ HP: " + myHP, icongyarados, JLabel.LEFT);
         }
         else if(mA.getName().equals("Lugia")){
             pA = new JLabel(mA.getName()+"/ HP: " + myHP, iconlugia, JLabel.LEFT);
         }
         else if(mA.getName().equals("Giratina")){
             pA = new JLabel(mA.getName()+"/ HP: " + myHP, icongiratina, JLabel.LEFT);
         }
         else if(mA.getName().equals("Dialga")){
             pA = new JLabel(mA.getName()+"/ HP: " + myHP, icondialga, JLabel.LEFT);
         }
         else if(mA.getName().equals("Kyogre")){
             pA = new JLabel(mA.getName()+"/ HP: " + myHP, iconkyogre, JLabel.LEFT);
         }
         
         JButton itAb = new JButton("Select ?");
         itA.setVisible(false);
         itAb.setVisible(false);

         p3.add(pxnv); //pikachu icon
         //pxnv.setBounds(300, 20, 200, 200);
         p3.add(efk);  

         p3.add(pA); //enemy icon
         //pA.setBounds(300, 400, 200, 200);


         p3.add(bA); //button attack
         //bA.setBounds(200, 40, 40, 20);
         p3.add(itA);
         p3.add(itAb);
         //itA.setBounds(200, 40, 40, 20);
         p3.add(skb); //hp
         //skb.setBounds(200, 40, 40, 20);
        // p3.add(pxnv);//null
         //p3.add(namehp);


         //p3.add(skb); //skill thunder bolt
         //p3.add(mana);

/*
         //p3.add(KF);
         p3.add(namehp); //hp150/150
        // p3.add(def); //def 0/100
         
         p3.add(itAb);
         p3.add(mana);
         p3.add(itA);
         p3.add(bA);
         //p3.add(efk);
         //p3.add(pA);
*/
         p.add(p3,BorderLayout.CENTER);
//bottom
        
JPanel p2 = new JPanel();
//*JPanel empty = new JPanel();
p2.setLayout(new GridLayout(1,3));

JButton toBag = new JButton("Bag", iconbag);
JButton toShop = new JButton("Shop", iconshop);
JButton toCharacter = new JButton("Next", iconnext);
toCharacter.setEnabled(false);


p2.add(toBag);
p2.add(toShop);
p2.add(toCharacter);

p.add(p2, BorderLayout.SOUTH);

//bottom


//event & handler
bA.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent eata){
        if(mahp == 0)
            toCharacter.setEnabled(true);
        
        efk.setVisible(false);
        
        mahp -= Pokemons.getDamage();
        myEXP += 10;
        myMana += 10;
        
        if(myDEF > 0){
            myDEF -= mA.getMonsterDamage();
            myMana += Pokemons.getMana();
        }
        else if(myDEF <= 0){
            myHP -= mA.getMonsterDamage();
            myMana += Pokemons.getMana();                        
        }
        
        //check
        if(myHP <= 0){
            myHP  = 0;
        }
        else if(myHP >= Pokemons.getHP()){
            myHP += Pokemons.getMana();
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
        if(myMana >= skills.getMana()){
            skb.setEnabled(true);
        }
     
        namehp.setText("HP: " + myHP + "/" + Pokemons.getHP());
        def.setText("Def: " + myDEF + "/" + Pokemons.getDEF());
        mana.setText("Mana: " + myMana + "/100");
        imgEXP.setText("EXP: " + myEXP);
        imgLEVEL.setText("Level: " + myLevel);
        imgFight.setText("Win: " + countMon);
        pA.setText(mA.getName()+"/ HP: "+mahp);
//                pB.setText(mB.getName()+"/ HP: "+mbhp);
//                pC.setText(mC.getName()+"/ HP: "+mchp);
        
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
        new GUIbag(BBS, bag);
                        
    }
});

toBag.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent eatc){
        setVisible(false);
        BBS = new Base(Pokemons.getName(), Pokemons.getBaseSkill(), Pokemons.getDamage(), myHP, myEXP, myPokeball, myMana, myDEF, myLevel, countMon);
        new GUIbag(BBS, bag);
                        
    }
});

toShop.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent eatc){
        setVisible(false);
        BBS = new Base(Pokemons.getName(), Pokemons.getBaseSkill(), Pokemons.getDamage(), myHP, myEXP, myPokeball, myMana, myDEF, myLevel, countMon);
        new GUIbag(BBS, bag);
                        
    }
});

itAb.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent eatc){
         if(mahp==0)
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
          p3.setBackground(Color.black);
          
            if(mahp==0) // && mbhp==0 && mchp==0
                toCharacter.setEnabled(true);
    
        if(Pokemons.getName().equals("Bulbasaur")){
            //efk.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\skbBBS.GIF"));

        }

        else if(Pokemons.getName().equals("Charmander")){
            efk.setIcon(new ImageIcon("ack.gif"));

        }
        
        else if(Pokemons.getName().equals("Squirtle")){
            efk.setIcon(new ImageIcon("ack.gif"));

        }
        else if(Pokemons.getName().equals("Pikachu")){
            efk.setIcon(new ImageIcon("ack.gif"));

        }
        
        efk.setVisible(true);
        
        myHP += skills.getheal();
        myMana -= skills.getMana();
        myEXP += 25;
        
        mahp -= skills.getDamage();
        mbhp -= skills.getDamage();
        mchp -= skills.getDamage();
        
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
                 
                //mahp = 0;
        }
        else if(mahp >= mA.getHP())
            mahp = mA.getHP();
        
 /*       if(mbhp <= 0){
                
                pB.setEnabled(false);
//                        bB.setEnabled(false); 
                if(dcb==0){
//                          itBb.setVisible(true);
                   itB.setVisible(true);
                   countMon++;
                   dcb++;
                }
                mbhp = 0;}
            else if(mbhp >= mB.getHP())
                mbhp = mB.getHP();
        
        if(mchp <= 0){
                
                pC.setEnabled(false);
//                        bC.setEnabled(false); 
                if(dcc==0){
//                           itCb.setVisible(true);
                   itC.setVisible(true);
                   countMon++;
                   dcc++;
                }
                mchp = 0;}
            else if(mchp >= mC.getHP())
                mchp = mC.getHP();
 */       
        //update
        //p.setBackground(Color.BLACK);
        namehp.setText("HP: " + myHP + "/" + Pokemons.getHP());
        def.setText("DEF: " + myDEF + "/100");
        mana.setText("Mana: " + myMana + "/100");
        imgEXP.setText("EXP: " + myEXP);
        imgLEVEL.setText("Level: "+myLevel);
        imgFight.setText("Win: "+countMon);
        pA.setText(mA.getName()+"/ HP: "+mahp);
        //pB.setText(mB.getName()+"/ HP: "+mbhp);
        //pC.setText(mC.getName()+"/ HP: "+mchp);    
    }
});    
        
//p.setBackground(stage);        
   
setSize(1020,676);
setResizable(false);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}



}    
        
