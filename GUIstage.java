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
public class GUIstage extends JFrame{

    private SendMons allMon = new SendMons();
    private Monster mA = allMon.ShowMon();
    private Monster mB = allMon.ShowMon();
    private Monster mC = allMon.ShowMon();
    
    private Allitems allitem = new Allitems();
    private Item iA = allitem.dropItem();
    private Item iB = allitem.dropItem();
    private Item iC = allitem.dropItem();
    
    //private Wallet Balance = new Wallet();
    
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
    ///private boolean kA;
    //private boolean kB;
    //private boolean kC;
    private int mahp;                 //
    private int mbhp;
    private int mchp;  //edit float to int
    private int dca = 0;             //
    private int dcb = 0;
    private int dcc = 0;
    
    public GUIstage(Base Pokemons, Bag bag){
        super("Battle Stage");
        this.myHP = Pokemons.getHP();
        this.myDEF = Pokemons.getDEF();
        this.myEXP = Pokemons.getEXP();
        this.myLevel = Pokemons.getLevel();
        this.myMana = Pokemons.getMana();
        this.myPokeball = Pokemons.getPokeball();
        this.countMon = Pokemons.getKillmon();


        /*this.mahp = mA.getHP();
        this.mbhp = mB.getHP();
        this.mchp = mC.getHP();*/
        this.mchp = mC.CharHP();
        this.mbhp = mB.CharHP();
        this.mahp = mA.CharHP();
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
        //p.setBackground(Color.black);
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
        ImageIcon newbbs = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\stageBBS.GIF");
        //*ImageIcon iconbbs2 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconBBS2.GIF");
        //*ImageIcon iconbbs3 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconBBS3.GIF");
        ImageIcon iconcmd = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconCMD.GIF");
        ImageIcon newcmd = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\test.GIF");
        //*ImageIcon iconcmd2 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconCMD2.GIF");
        //*ImageIcon iconcmd3 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconCMD3.GIF");
        ImageIcon iconsqt = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconSQT1.GIF");
        ImageIcon newsqt = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\stageSQT.GIF");
        //*ImageIcon iconsqt2 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconSQT2.GIF");
        //*ImageIcon iconsqt3 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconSQT3.GIF");
        ImageIcon iconpkc = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconPKC.GIF");
        ImageIcon newpkc = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\stagePKC.GIF");
        //*ImageIcon iconpkc2 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconPKC2.GIF");
        //iconEnemy
        ImageIcon iconsnorlax = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\new\\iconNORLAX.GIF");
        ImageIcon iconlapras = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\enew\\iconLAPRAS.GIF");
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
        //ImageIcon iconnext = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconNEXT2.PNG"); //idg
        //ImageIcon isw = new ImageIcon("isw.png");
        //ImageIcon iar = new ImageIcon("iar.png");
        //ImageIcon iwn = new ImageIcon("iwn.png");
        //ImageIcon ikn = new ImageIcon("ikn.png");
        //ImageIcon igd = new ImageIcon("igd.png");
        //ImageIcon ict = new ImageIcon("ict.png");
        ImageIcon sk = new ImageIcon("test.gif");
        ImageIcon coe = new ImageIcon("test.gif");
        
        
        //top
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1,5));
        //  p1.setBackground(Color.darkGray);
        
        JLabel imgPK = new JLabel("Name : " + Pokemons.getName(), iconpk, JLabel.LEFT); //+s
        imgPK.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));
        JLabel imgEXP = new JLabel("EXP : " + myEXP, iconexp, JLabel.LEFT);
        imgEXP.setFont(new Font("Eras Demi ITC", Font.BOLD, 13));
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
        //p3.setLayout(null);
       // p3.setBackground(Color.BLACK);
       
       
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
        
        pxnv.setBounds(61, 150, 100, 100);
        efk.setBounds(450, 15, 520, 500);
        KF.setBounds(140, 190, 153, 73);
        JButton skb = new JButton("Skill : " + skills.getName());
        skb.setBounds(40, 260, 150, 25);
        skb.setEnabled(false);
        
        JLabel namehp = new JLabel("HP : " + myHP + "/" + Pokemons.getHP(), JLabel.LEFT);
        namehp.setBounds(75, 69, 100, 100);
        JLabel def = new JLabel("Def : " + myDEF + "/100", JLabel.LEFT);
        def.setBounds(75, 79, 100, 100);
        JLabel mana = new JLabel("Mana : " + myMana + "/100", JLabel.LEFT);
        mana.setBounds(75, 90, 100, 100);
        //novice
        /*if(pweapon.equals("CoE"))
            KF.setVisible(true);
        else
            KF.setVisible(false);
            
         */
        
        //Monster
        
        //Position 
        JButton bA = new JButton("Attack");
        
        if(iA.getName().equals("Berry")){
            itA = new JLabel(iA.getName(), iconberry, JLabel.LEFT );
        }
        else if(iA.getName().equals("Potion")){
            itA = new JLabel(iA.getName(), potion, JLabel.LEFT );
        }
        //else if(iA.getName().equals("Super Potion"))
        else {
        itA = new JLabel(iA.getName(), superpotion, JLabel.LEFT );
        }
        /*else if(iA.getName().equals("Super Potion")){                                  //idg
            itA = new JLabel(iA.getName(), superpotion, JLabel.LEFT );
        }    */   
        /*else if(iA.getName().equals("Sword")){
            itA = new JLabel(iA.getName(),isw,JLabel.LEFT);
        }
        else if(iA.getName().equals("Arrow")){
            itA = new JLabel(iA.getName(),iar,JLabel.LEFT);
        }
        else if(iA.getName().equals("Wand")){
            itA = new JLabel(iA.getName(),iwn,JLabel.LEFT);
        }
        else if(iA.getName().equals("Knife")){
            itA = new JLabel(iA.getName(),ikn,JLabel.LEFT);
        }
        else if(iA.getName().equals("Gold")){
            itA = new JLabel(iA.getName(),igd,JLabel.LEFT);
        }
        else{
            itA = new JLabel(iA.getName(),ict,JLabel.LEFT);
        }  */
        
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
        
        pA.setBounds(720, 55, 500, 160);
        itA.setBounds(720, 80, 127, 127);
        itA.setVisible(false);
        itAb.setVisible(false);

        bA.setBounds(720, 175, 100, 28);
        itAb.setBounds(720, 175, 100, 28);
        
        //Position B
        
        JButton bB = new JButton("Bttack");
        
        if(iB.getName().equals("Berry")){
            JLabel itB = new JLabel(iB.getName(), iconberry, JLabel.LEFT );
        }
        else if(iB.getName().equals("Potion")){
            JLabel itB = new JLabel(iB.getName(), potion, JLabel.LEFT );
        }
        //else if(iB.getName().equals("Super Potion"))
        else{
            JLabel itB = new JLabel(iB.getName(), superpotion, JLabel.LEFT );
        }
        /*else if(iB.getName().equals("Pokeball")){                                  //idg
            itA = new JLabel(iA.getName(), superpotion, JLabel.LEFT );
        }    */   
        /*else if(iA.getName().equals("Sword")){
            itA = new JLabel(iA.getName(),isw,JLabel.LEFT);
        }
        else if(iA.getName().equals("Arrow")){
            itA = new JLabel(iA.getName(),iar,JLabel.LEFT);
        }
        else if(iA.getName().equals("Wand")){
            itA = new JLabel(iA.getName(),iwn,JLabel.LEFT);
        }
        else if(iA.getName().equals("Knife")){
            itA = new JLabel(iA.getName(),ikn,JLabel.LEFT);
        }
        else if(iA.getName().equals("Gold")){
            itA = new JLabel(iA.getName(),igd,JLabel.LEFT);
        }
        else{
            itA = new JLabel(iA.getName(),ict,JLabel.LEFT);
        }  */
        
        if(mB.getName().equals("Snorlax")){
            pB = new JLabel(mB.getName() + "/ HP: " + myHP, iconsnorlax, JLabel.LEFT);
        }
        else if(mB.getName().equals("Lapras")){
            pB = new JLabel(mB.getName()+"/ HP: " + myHP, iconlapras, JLabel.LEFT);
        }       
        else if(mB.getName().equals("Darkrai")){
            pB = new JLabel(mB.getName()+"/ HP: " + myHP, icondarkrai, JLabel.LEFT);
        }
        else if(mB.getName().equals("Gyarados")){
            pB = new JLabel(mB.getName()+"/ HP: " + myHP, icongyarados, JLabel.LEFT);
        }
        else if(mB.getName().equals("Lugia")){
            pB = new JLabel(mB.getName()+"/ HP: " + myHP, iconlugia, JLabel.LEFT);
        }
        else if(mB.getName().equals("Giratina")){
            pB = new JLabel(mB.getName()+"/ HP: " + myHP, icongiratina, JLabel.LEFT);
        }
        else if(mB.getName().equals("Dialga")){
            pB = new JLabel(mB.getName()+"/ HP: " + myHP, icondialga, JLabel.LEFT);
        }
        else if(mB.getName().equals("Kyogre")){
            pB = new JLabel(mB.getName()+"/ HP: " + myHP, iconkyogre, JLabel.LEFT);
        }
        
        JButton itBb = new JButton("Select ?");
        pB.setBounds(620, 287, 500, 160);
        bB.setBounds(620, 437, 100, 28);
        itBb.setBounds(620, 437, 100, 60);
        itB.setBounds(620, 340, 127, 127);
        itB.setVisible(false);
        itBb.setVisible(false);
        
        //Posintion C
        JButton bC = new JButton("Cttack");
        
        if(iC.getName().equals("Berry")){
            itC = new JLabel(iC.getName(), iconberry, JLabel.LEFT );
        }
        else if(iC.getName().equals("Potion")){
            itC = new JLabel(iC.getName(), potion, JLabel.LEFT );
        }
        //else if(iC.getName().equals("Super Potion"))
        else {
            itC = new JLabel(iC.getName(), superpotion, JLabel.LEFT );
        }
        /*else if(iA.getName().equals("Super Potion")){                                  //idg
            itA = new JLabel(iA.getName(), superpotion, JLabel.LEFT );
        }    */   
        /*else if(iA.getName().equals("Sword")){
            itA = new JLabel(iA.getName(),isw,JLabel.LEFT);
        }
        else if(iA.getName().equals("Arrow")){
            itA = new JLabel(iA.getName(),iar,JLabel.LEFT);
        }
        else if(iA.getName().equals("Wand")){
            itA = new JLabel(iA.getName(),iwn,JLabel.LEFT);
        }
        else if(iA.getName().equals("Knife")){
            itA = new JLabel(iA.getName(),ikn,JLabel.LEFT);
        }
        else if(iA.getName().equals("Gold")){
            itA = new JLabel(iA.getName(),igd,JLabel.LEFT);
        }
        else{
            itA = new JLabel(iA.getName(),ict,JLabel.LEFT);
        }  */
        
        if(mC.getName().equals("Snorlax")){
            pC = new JLabel(mC.getName() + "/ HP: " + myHP, iconsnorlax, JLabel.LEFT);
        }
        else if(mC.getName().equals("Lapras")){
            pC = new JLabel(mC.getName()+"/ HP: " + myHP, iconlapras, JLabel.LEFT);
        }       
        else if(mC.getName().equals("Darkrai")){
            pC = new JLabel(mC.getName()+"/ HP: " + myHP, icondarkrai, JLabel.LEFT);
        }
        else if(mC.getName().equals("Gyarados")){
            pC = new JLabel(mC.getName()+"/ HP: " + myHP, icongyarados, JLabel.LEFT);
        }
        else if(mC.getName().equals("Lugia")){
            pC = new JLabel(mC.getName()+"/ HP: " + myHP, iconlugia, JLabel.LEFT);
        }
        else if(mC.getName().equals("Giratina")){
            pC = new JLabel(mC.getName()+"/ HP: " + myHP, icongiratina, JLabel.LEFT);
        }
        else if(mC.getName().equals("Dialga")){
            pC = new JLabel(mC.getName()+"/ HP: " + myHP, icondialga, JLabel.LEFT);
        }
        else if(mC.getName().equals("Kyogre")){
            pC = new JLabel(mC.getName()+"/ HP: " + myHP, iconkyogre, JLabel.LEFT);
        }
        
        JButton itCb = new JButton("Select ?");
        pC.setBounds(500, 170, 500, 160);
        bC.setBounds(500, 320, 100, 28);
        itCb.setBounds(500, 320, 100, 28);
        itC.setBounds(525, 220, 127, 127);
        itC.setVisible(false);
        //itCb.setVisible(false);

        //Monster
        p3.add(def);
        p3.add(mana);
        p3.add(itAb);
        p3.add(itBb);
        p3.add(itCb);
        p3.add(itA);
        p3.add(itB);
        p3.add(itC);
        
        p3.add(bA);
        p3.add(bB);
        p3.add(bC);
        p3.add(efk);
        p3.add(pA);
        p3.add(pB);
        p3.add(pC);        
        
        p3.add(pxnv);
        p3.add(namehp);
        p3.add(skb);
        p3.add(KF);
        
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
                if(mahp == 0 && mbhp == 0 && mchp ==0)
                    toCharacter.setEnabled(true);
                
                efk.setVisible(false);
                //p3.setBackground(null);
                
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
                
 /*               if(mahp <= 0){
                    if(dca == 0){
                        countMon++;
                        dca++;
                    }
                    
                    pA.setEnabled(false);
                    bA.setEnabled(false);
                    itAb.setVisible(true);
                    itA.setVisible(true);
                    
                    mahp = 0;
                }
                else if(mahp >= mA.getHP()){
                    mahp = mA.getHP(); 
                }
 */               
                namehp.setText("HP: " + myHP + "/" + Pokemons.getHP());
                def.setText("Def: " + myDEF + "/" + Pokemons.getDEF());
                mana.setText("Mana: " + myMana + "/100");
                imgEXP.setText("EXP: " + myEXP);
                imgLEVEL.setText("Level: " + myLevel);
                imgFight.setText("Win: " + countMon);
                pA.setText(mA.getName()+"/ HP: "+mahp);
                pB.setText(mB.getName()+"/ HP: "+mbhp);
                pC.setText(mC.getName()+"/ HP: "+mchp);
                
               if(myHP<=0){
                    JOptionPane.showMessageDialog(null," GAME OVER! ");
                    setVisible(false);
                    
                    new GUIstart();
                }        
            }
        
        });
        
        bB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                if(mahp == 0 && mbhp == 0 && mchp ==0)
                    toCharacter.setEnabled(true);
                
                efk.setVisible(false);
               // p3.setBackground(null);
                
                mahp -= Pokemons.getDamage();
                myEXP += 10;
                myMana += 10;
                
                if(myDEF > 0){
                    myDEF -= mB.getMonsterDamage();
                    myMana += Pokemons.getMana();
                }
                else if(myDEF <= 0){
                    myHP -= mB.getMonsterDamage();
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
                
 /*               if(mbhp <= 0){
                        itBb.setVisible(true);
                        itB.setVisible(true);
                        
                        if(dcb == 0){
                           countMon++;
                           dcb++;
                        }
                        pB.setEnabled(false);
                        bB.setEnabled(false); 
                        
                        
                        mbhp = 0;
                }
                    else if(mbhp >= mB.getHP())
                        mbhp = mB.getHP(); 
 */               
                
                namehp.setText("HP: " + myHP + "/" + Pokemons.getHP());
                def.setText("Def: " + myDEF + "/" + Pokemons.getDEF());
                mana.setText("Mana: " + myMana + "/100");
                imgEXP.setText("EXP: " + myEXP);
                imgLEVEL.setText("Level: " + myLevel);
                imgFight.setText("Win: " + countMon);
                pA.setText(mA.getName()+"/ HP: "+mahp);
                pB.setText(mB.getName()+"/ HP: "+mbhp);
                pC.setText(mC.getName()+"/ HP: "+mchp);
                
               if(myHP<=0){
                    JOptionPane.showMessageDialog(null," GAME OVER! ");
                    setVisible(false);
                    
                    new GUIstart();
                }        
            }
        
        });
        
         bC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                if(mahp == 0 && mbhp == 0 && mchp ==0)
                    toCharacter.setEnabled(true);
                
                efk.setVisible(false);
                p3.setBackground(null);
                
                mahp -= Pokemons.getDamage();
                myEXP += 10;
                myMana += 10;
                
                if(myDEF > 0){
                    myDEF -= mC.getMonsterDamage();
                    myMana += Pokemons.getMana();
                }
                else if(myDEF <= 0){
                    myHP -= mC.getMonsterDamage();
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
                
  /*              if(mchp <= 0){
                        itCb.setVisible(true);
                        itC.setVisible(true);
                        
                        if(dcc == 0){
                           countMon++;
                           dcc++;
                        }
                        pC.setEnabled(false);
                        bC.setEnabled(false); 
                        
                        
                        mchp = 0;
                }
                    else if(mchp >= mC.getHP())
                        mchp = mC.getHP(); 
  */              
                
                namehp.setText("HP: " + myHP + "/" + Pokemons.getHP());
                def.setText("Def: " + myDEF + "/" + Pokemons.getDEF());
                mana.setText("Mana: " + myMana + "/100");
                imgEXP.setText("EXP: " + myEXP);
                imgLEVEL.setText("Level: " + myLevel);
                imgFight.setText("Win: " + countMon);
                pA.setText(mA.getName()+"/ HP: "+mahp);
                pB.setText(mB.getName()+"/ HP: "+mbhp);
                pC.setText(mC.getName()+"/ HP: "+mchp);
                
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
                new GUIstage(BBS, bag);
                                
            }
        });
        
        toBag.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eatc){
                setVisible(false);
                BBS = new Base(Pokemons.getName(), Pokemons.getBaseSkill(), Pokemons.getDamage(), myHP, myEXP, myPokeball, myMana, myDEF, myLevel, countMon);
                new GUIstage(BBS, bag);
                                
            }
        });
        
        toShop.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eatc){
                setVisible(false);
                BBS = new Base(Pokemons.getName(), Pokemons.getBaseSkill(), Pokemons.getDamage(), myHP, myEXP, myPokeball, myMana, myDEF, myLevel, countMon);
                new GUIstage(BBS, bag);
                                
            }
        });
        
        itAb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eatc){
                 if(mahp==0 && mbhp==0 && mchp==0)
                   toCharacter.setEnabled(true);
                int n = JOptionPane.showConfirmDialog(null,"Select "+iA.getName()+" ?","selected",JOptionPane.YES_NO_OPTION);
                
               if(n == JOptionPane.YES_OPTION){
                   bag.AddItem(iA);
                   itA.setVisible(false);
                   itAb.setVisible(false);  
               }                   
            }
        });
        
        itBb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eatc){
                 if(mahp==0 && mbhp==0 && mchp==0)
                   toCharacter.setEnabled(true);
                int m = JOptionPane.showConfirmDialog(null,"Select " + iB.getName() + " ?","selected",JOptionPane.YES_NO_OPTION);
                
                if(m == JOptionPane.YES_OPTION){
                   bag.AddItem(iB);
                   itB.setVisible(false);
                   itBb.setVisible(false); 
               }                    
            }
        });
        
        itCb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eatc){
                 if(mahp==0 && mbhp==0 && mchp==0)
                   toCharacter.setEnabled(true);
                int o = JOptionPane.showConfirmDialog(null,"Select "+iC.getName()+" ?","Selected",JOptionPane.YES_NO_OPTION);
                if(o == JOptionPane.YES_OPTION){
                   bag.AddItem(iC);
                   itC.setVisible(false);
                   itCb.setVisible(false);   
               }                   
            }
        });
        
        skb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eatc){
                  skb.setEnabled(false);
                  JOptionPane.showMessageDialog(null,"Skill: "+skills.getName()+" (Heal: "+skills.getheal()+" Damage: "+skills.getDamage()+")");
                  p3.setBackground(Color.black);
                  
                    if(mahp==0 && mbhp==0 && mchp==0)
                        toCharacter.setEnabled(true);
            
                if(Pokemons.getName().equals("Bulbasaur")){
                    efk.setIcon(new ImageIcon("swk.gif"));

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
                        
                        pA.setEnabled(false);
                        bA.setEnabled(false); 
                        if(dca==0){
                           itAb.setVisible(true);
                           itA.setVisible(true);
                           countMon++;
                           dca++;
                        }
                         
                        mahp = 0;}
                    else if(mahp >= mA.getHP())
                        mahp = mA.getHP();
                
                if(mbhp <= 0){
                        
                        pB.setEnabled(false);
                        bB.setEnabled(false); 
                        if(dcb==0){
                           itBb.setVisible(true);
                           itB.setVisible(true);
                           countMon++;
                           dcb++;
                        }
                        mbhp = 0;}
                    else if(mbhp >= mB.getHP())
                        mbhp = mB.getHP();
                
                if(mchp <= 0){
                        
                        pC.setEnabled(false);
                        bC.setEnabled(false); 
                        if(dcc==0){
                           itCb.setVisible(true);
                           itC.setVisible(true);
                           countMon++;
                           dcc++;
                        }
                        mchp = 0;}
                    else if(mchp >= mC.getHP())
                        mchp = mC.getHP();
                
                //update
                
                namehp.setText("HP: " + myHP + "/" + Pokemons.getHP());
                def.setText("DEF: " + myDEF + "/100");
                mana.setText("Mana: " + myMana + "/100");
                imgEXP.setText("EXP: " + myEXP);
                imgLEVEL.setText("Level: "+myLevel);
                imgFight.setText("Win: "+countMon);
                pA.setText(mA.getName()+"/ HP: "+mahp);
                pB.setText(mB.getName()+"/ HP: "+mbhp);
                pC.setText(mC.getName()+"/ HP: "+mchp);    
            }
        });    
                
                
           
        setSize(1020,676);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
    
}    

