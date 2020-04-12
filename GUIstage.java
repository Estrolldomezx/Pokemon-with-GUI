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
    private SendMons allMon  = new SendMons();
    private Monster mA = allMon.ShowMon();
    private Monster mB = allMon.ShowMon();
    private Monster mC = allMon.ShowMon();
    
    /*private TreasuryItem allitem = new TreasuryItem();
    private Item iA = allitem.ItemDrop();
    private Item iB = allitem.ItemDrop();
    private Item iC = allitem.ItemDrop();
    
    private Wallet Balance = new Wallet();*/
    
    private UseSkills allskill = new UseSkills();
    private Skills skills;
    private Base BBS;
    private JLabel pxnv;
    private JLabel pA;
    private JLabel pB;
    private JLabel pC;
    private JLabel itA;
    private JLabel itB;
    private JLabel itC;
    private int myHP;
    private int myDEF;
    private int myEXP;
    private int myLevel;
    private int myMana;
    private float myPokeball;
    private int countMon;           //
    private boolean kA;
    private boolean kB;
    private boolean kC;
    private int mahp;                 //
    private int mbhp;
    private int mchp;
    private int dca = 0;             //
    private int dcb = 0;
    private int dcc = 0;
    
    public GUIstage(Base Pokemon, Bag bag){
        super("Battle Stage");
        this.myHP = Pokemon.getHP();
        this.myDEF = Pokemon.getDEF();
        this.myEXP = Pokemon.getEXP();
        this.myLevel = Pokemon.getLevel();
        this.myMana = Pokemon.getMana();
        this.myPokeball = Pokemon.getPokeball();
        this.countMon = Pokemon.getKillmon();
        this.mahp = mA.getHP();
        this.mbhp = mB.getHP();
        this.mchp = mC.getHP();
        //skill
        if(Pokemon.getBaseSkill().equals("Solar beam"))
            skills = allskill.getBBSSkill();
        else if(Pokemon.getBaseSkill().equals("Fire blast"))
            skills = allskill.getCMDSkill();
        else if(Pokemon.getBaseSkill().equals("Hydro pump"))
            skills = allskill.getSQTSkill();
        else
            skills = allskill.getPKCSkill();
        
        //about skill
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        //p.setBackground(Color.black);
        add(p);
        //icon menu
        ImageIcon iconjb = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconJB.PNG");
        ImageIcon iconlv = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconLV.PNG");
        ImageIcon iconexp = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconEXP.PNG");
        ImageIcon iconfight = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconFIGHT.PNG");
        ImageIcon iconpokeball = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconPOKEBALL.PNG");
        ImageIcon iconbag = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconBAG.PNG");
        ImageIcon iconshop = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconSHOP.PNG");
        ImageIcon iconnext = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconNEXT2.PNG");
        
        //icon pokemon
        ImageIcon iconbbs = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconBBS.GIF");
        ImageIcon iconbbs2 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconBBS2.GIF");
        ImageIcon iconbbs3 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconBBS3.GIF");
        ImageIcon iconcmd = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconCMD.GIF");
        ImageIcon iconcmd2 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconCMD2.GIF");
        ImageIcon iconcmd3 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconCMD3.GIF");
        ImageIcon iconsqt = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconSQT1.GIF");
        ImageIcon iconsqt2 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconSQT2.GIF");
        ImageIcon iconsqt3 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconSQT3.GIF");
        ImageIcon iconpkc = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconPKC.GIF");
        ImageIcon iconpkc2 = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconPKC2.GIF");
        ImageIcon iconsnorlax = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconNORLAX.GIF");
        ImageIcon iconlapras = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconLAPRAS.GIF");
        ImageIcon iconlugia = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconLUGIA.GIF");
        ImageIcon icongyarados = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconGYARADOS.GIF");
        ImageIcon icondarkrai = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconDARKRAI.GIF");
        ImageIcon icongiratina = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconGIRATNIA.GIF");
        ImageIcon iconkyogre = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconKYOGRE.GIF");
        ImageIcon icondiaga = new ImageIcon("C:\\Users\\Admin\\Desktop\\img\\iconDIALGA.GIF");




    }
}
