import javax.swing.*;
//import sun.jvm.hotspot.types.JByteField;
import java.awt.*;
import java.awt.event.*;


public class GUIbag extends JFrame{
    private Allitems allitems = new Allitems();
    private int berry = 0; 
    private int potion = 0;  
    private int superpotion = 0;  
    private int item4;
    private int item5;
    private int item6;
    private int item7;
    private int item8;
    private int item9;
    private int item10;

    private int php;
    private int pmaxhp;
    private int parmor;
    private int pexp;
    private int plevel;
    private int pmana;
    private int ppokeball = 50;  
    private int countMon;

    private Base fb;

    public GUIbag(Base base, Bag bag, String namePokemon){
        super("Bag");
        this.berry = bag.countItem("Berry"); //on
        this.potion = bag.countItem("Potion"); //mt
        this.superpotion = bag.countItem("Superpotion"); //pt
        this.item4 = bag.countItem("Upgrade");
        this.item5 = bag.countItem("Dragon Scale");
        this.item6 = bag.countItem("King Rock");
        this.item7 = bag.countItem("Metal Coat");
        this.item8 = bag.countItem("Sinnoh Stone");
        this.item9 = bag.countItem("Sun Stone");
        this.item10 = bag.countItem("Unova Stone");

        this.php = base.getHP()-40; //getHP
        this.pmaxhp = base.MaxCharHP();
        this.parmor = base.getDEF();
        this.pexp = base.getEXP();
        this.plevel = base.getLevel();
        this.pmana = base.getMana();
        this.countMon = base.getKillmon();
        this.ppokeball = base.getPokeball();

        ImageIcon imgPotion = new ImageIcon("img\\new\\potion.PNG");
        ImageIcon imgBerry = new ImageIcon("img\\new\\berry.PNG");
        ImageIcon imgsuperpotion = new ImageIcon("img\\new\\superpotion.PNG");
        ImageIcon imgHP = new ImageIcon("img\\iconHP.PNG");
        ImageIcon imgPokeball = new ImageIcon("img\\new\\iconPokeballBag.PNG");
        ImageIcon imgitem4 = new ImageIcon("img\\new\\Upgrade.PNG");
        ImageIcon imgitem5 = new ImageIcon("img\\new\\DragonScale.PNG");
        ImageIcon imgitem6 = new ImageIcon("img\\new\\KingRock.PNG");
        ImageIcon imgitem7 = new ImageIcon("img\\new\\MetalCoat.PNG");
        ImageIcon imgitem8 = new ImageIcon("img\\new\\SinnohStone.PNG");
        ImageIcon imgitem9 = new ImageIcon("img\\new\\SunStone.PNG");
        ImageIcon imgitem10 = new ImageIcon("img\\new\\UnovaStone.PNG");
        ImageIcon imgbtfIcon = new ImageIcon("img\\iconFIGHT.PNG");
        ImageIcon imgiemt = new ImageIcon("img\\new\\imgiemt.PNG");
        ImageIcon imgMana = new ImageIcon("img\\new\\iconMANA.PNG");
        
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
       
        int i; //n
        i = berry + potion + superpotion + item4 + item5 + item6 + item7 + item8 + item9 + item10;
        JPanel pn = new JPanel();


        JLabel ds = new JLabel("All items : " + i, imgiemt, JLabel.CENTER);
        ds.setFont(new Font("Eras Demi ITC", Font.BOLD, 15));

        pn.add(ds);
        
        p.add(pn, BorderLayout.NORTH);

        // end of pn
   
        //p3
        JPanel p3 = new JPanel();
        p3.setLayout(new BorderLayout());

        JButton back = new JButton("Back");
        back.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));

        JPanel p3i = new JPanel();
        p3i.setLayout(new GridLayout(3,1));

        JLabel mn = new JLabel("Pokecoins : " + ppokeball, imgPokeball, JLabel.CENTER);
        mn.setFont(new Font("Cambria Math", Font.BOLD, 12));
        mn.setOpaque(true);

        JLabel hp = new JLabel("HP: " + php + " / " + pmaxhp , imgHP, JLabel.CENTER); //php
        hp.setFont(new Font("Cambria Math", Font.BOLD, 12));
        hp.setOpaque(true);
        
        JLabel mana = new JLabel("Mana: " + pmana + "/ 100", imgMana, JLabel.CENTER);
        mana.setFont(new Font("Cambria Math", Font.BOLD, 12));
        hp.setOpaque(true);
        
        p3i.add(mn);
        p3i.add(hp);
        p3i.add(mana);

        p3.add(back, BorderLayout.SOUTH);
        p3.add(p3i, BorderLayout.CENTER);

        //end of p3

        //p1
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(6,1));

        JLabel use = new JLabel("REDEEM", JLabel.CENTER);
        use.setFont(new Font("Eras Demi ITC", Font.BOLD, 18));
        JButton berryButton = new JButton(allitems.item1.getName()+" (" + berry + ")",imgBerry);
        JButton potionButton = new JButton(allitems.item2.getName()+" (" + potion + ")",imgPotion);
        JButton superpotionButton = new JButton(allitems.item3.getName()+" (" + superpotion + ")",imgsuperpotion);
        JButton item4Button = new JButton(allitems.item4.getName()+" (" + item4 + ")",imgitem4);
        JButton item5Button = new JButton(allitems.item5.getName()+" ("+item5+")", imgitem5);

        p1.add(use);
        p1.add(berryButton);
        p1.add(potionButton);
        p1.add(superpotionButton);
        p1.add(item4Button);
        p1.add(item5Button);
        //end of p1

        //p2
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(6,1));
        JLabel sell = new JLabel("SELL & TRADE", JLabel.CENTER);
        sell.setFont(new Font("Eras Demi ITC", Font.BOLD, 18)); 
        //add stones
        JButton item6Button = new JButton(allitems.item6.getName()+" ("+item6+")", imgitem6);
        JButton item7Button = new JButton(allitems.item7.getName()+" ("+item7+")", imgitem7);
        JButton item8Button = new JButton(allitems.item8.getName()+" ("+item8+")", imgitem8);
        JButton item9Button = new JButton(allitems.item9.getName()+" ("+item9+")", imgitem9);
        JButton item10Button = new JButton(allitems.item10.getName()+" ("+item10+")", imgitem10);



        //
            if(berry <= 0){
                berryButton.setEnabled(false);
            }
            if(potion <=0){
                potionButton.setEnabled(false);
            }
            if(superpotion <=0){
                superpotionButton.setEnabled(false);
            }
            if(item4 <=0){
                item4Button.setEnabled(false);
            }
            if(item5 <=0){
                item5Button.setEnabled(false);
            }
            if(item6 <=0){
                item6Button.setEnabled(false);
            }
            if(item7 <=0){
                item7Button.setEnabled(false);
            }
            if(item8 <=0){
                item8Button.setEnabled(false);
            }
            if(item9 <=0){
                item9Button.setEnabled(false);
            }
            if(item10 <=0){
                item10Button.setEnabled(false);
            }

        p2.add(sell);
        p2.add(item6Button);
        p2.add(item7Button);
        p2.add(item8Button);
        p2.add(item9Button);
        p2.add(item10Button);

        p.add(p1, BorderLayout.WEST);
        p.add(p2, BorderLayout.EAST);
        p.add(p3, BorderLayout.CENTER);
        add(p);
        //event & handle
        berryButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                
                ds.setText("Have used the item: "+allitems.item1.getName()+"    Health : +"+allitems.item1.getHeal()+"    Mana: +"+allitems.item1.getMana());
                ds.setIcon(imgBerry);
                    php += allitems.item1.getHeal();
                    
                    pmana += allitems.item1.getMana();
                    
                    if(php >= base.MaxCharHP){
                        php = base.MaxCharHP;
                    }
               
                    
                    if(pmana >= 100){
                        pmana = 100;
                    }

                int i = bag.findItem("Berry");
               
                bag.removeItem(i); 
                berry = bag.countItem("Berry");
                
                if(berry <=0)
                    berryButton.setEnabled(false);

                berryButton.setText(allitems.item1.getName()+" ("+ berry +")");
                hp.setText("HP: " + php + " / "+base.MaxCharHP);
                mana.setText("Mana: " + pmana + " / 100");
        
            }
        }); 
        potionButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have used the item: "+allitems.item2.getName()+"    Heal: +"+allitems.item2.getHeal()+"    Mana: +"+allitems.item2.getMana());
                ds.setIcon(imgPotion);
                    php += allitems.item2.getHeal();
                    
                    pmana += allitems.item2.getMana();
                    
                    if(php >= base.MaxCharHP){
                        php = base.MaxCharHP;
                    }
               
                    
                    if(pmana >= 100){
                        pmana = 100;
                    }

                int i = bag.findItem("Potion");
              
                bag.removeItem(i); 
                potion = bag.countItem("Potion");
                
                if(potion <=0)
                    potionButton.setEnabled(false);

                potionButton.setText(allitems.item2.getName()+" ("+potion+")");
                hp.setText("HP: "+php+" / " + base.MaxCharHP);
                mana.setText("Mana: "+pmana+" / 100");

           
            }
        }); 
        superpotionButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have used the item: "+allitems.item3.getName()+"    Heal: +"+allitems.item3.getHeal()+"    Mana: +"+allitems.item3.getMana());
                ds.setIcon(imgsuperpotion);
                    php += allitems.item3.getHeal();
                    
                    pmana += allitems.item3.getMana();
                    
                    if(php >= base.MaxCharHP){
                        php = base.MaxCharHP;
                    }
               
                    
                    if(pmana >= 100){
                        pmana = 100;
                    }

                int i = bag.findItem("Super potion");
              
                bag.removeItem(i); 
                superpotion = bag.countItem("Super potion");
                
                if(superpotion <=0)
                    superpotionButton.setEnabled(false);

                superpotionButton.setText(allitems.item3.getName()+" (" + superpotion + ")");
                hp.setText("HP: " + php + " / " + base.MaxCharHP);
                mana.setText("Mana: "+ pmana +" / 100");

           
            }
        });     
        item4Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have sold the item: "+allitems.item4.getName()+"    Pokeball : +10  ");
                ds.setIcon(imgitem4);
                    ppokeball += 10;

                int i = bag.findItem("Dragon Scale");
              
                bag.removeItem(i); 
                item4 = bag.countItem("Dragon Scale");
                
                if(item4 <=0)
                    item5Button.setEnabled(false);

                item4Button.setText(allitems.item4.getName()+" ("+ item4 +")");
                mn.setText("Pokeball : "+ppokeball);
           
            }
        }); 
        item5Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have sold the item: "+allitems.item5.getName()+"    Pokeball : +20  ");
                ds.setIcon(imgitem5);
                    ppokeball += 20;

                int i = bag.findItem("Dragon Scale");
              
                bag.removeItem(i); 
                item5 = bag.countItem("Dragon Scale");
                
                if(item5 <=0)
                    item5Button.setEnabled(false);

                item5Button.setText(allitems.item5.getName()+" ("+ item5 +")");
                mn.setText("Pokeball : "+ppokeball);
           
            }
        });

        item6Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have sold the item: "+allitems.item6.getName()+"    Pokeball : +30  ");
                ds.setIcon(imgitem6);
                    ppokeball += 30;

                int i = bag.findItem("King Rock");
              
                bag.removeItem(i); 
                item6 = bag.countItem("King Rock");
                
                if(item6 <=0)
                    item6Button.setEnabled(false);

                item6Button.setText(allitems.item6.getName()+" ("+ item6 +")");
                mn.setText("Pokeball : "+ppokeball);
           
            }
        });

        item7Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have sold the item: "+allitems.item7.getName()+"    Pokeball : +40  ");
                ds.setIcon(imgitem7);
                    ppokeball += 40;

                int i = bag.findItem("Metal Coat");
              
                bag.removeItem(i); 
                item7 = bag.countItem("Metal Coat");
                
                if(item7 <=0)
                    item6Button.setEnabled(false);

                item7Button.setText(allitems.item7.getName()+" ("+ item7 +")");
                mn.setText("Pokeball : "+ppokeball);
           
            }
        });
        item8Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have sold the item: "+allitems.item8.getName()+"    Pokeball : +50  ");
                ds.setIcon(imgitem8);
                    ppokeball += 50;

                int i = bag.findItem("Sinnoh Stone");
              
                bag.removeItem(i); 
                item8 = bag.countItem("Sinnoh Stone");
                
                if(item8 <=0)
                    item8Button.setEnabled(false);

                item8Button.setText(allitems.item8.getName()+" ("+ item8 +")");
                mn.setText("Pokeball : "+ppokeball);
           
            }
        });
        item9Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have sold the item: "+allitems.item9.getName()+"    Pokeball : +60  ");
                ds.setIcon(imgitem9);
                    ppokeball += 60;

                int i = bag.findItem("Sun Stone");
              
                bag.removeItem(i); 
                item9 = bag.countItem("Sun Stone");
                
                if(item9 <=0)
                    item9Button.setEnabled(false);

                item9Button.setText(allitems.item9.getName()+" ("+ item9 +")");
                mn.setText("Pokeball : "+ppokeball);
           
            }
        });
        item10Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                ds.setText("Have sold the item: "+allitems.item10.getName()+"    Pokeball : +70  ");
                ds.setIcon(imgitem9);
                    ppokeball += 70;

                int i = bag.findItem("Unova Stone");
              
                bag.removeItem(i); 
                item10 = bag.countItem("Unova Stone");
                
                if(item10 <=0)
                    item10Button.setEnabled(false);

                item10Button.setText(allitems.item10.getName()+" ("+ item10 +")");
                mn.setText("Pokeball : "+ppokeball);
           
            }
        });


        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eata){
                setVisible(false);
                fb = new Base(base.getName(), base.getBaseSkill(), base.getDamage(), php, pexp, ppokeball, pmana, parmor,plevel,countMon);
                new GUIstage2(fb , bag, namePokemon);

           
            }
        });        

        //setSize(1280,700);
        setSize(563,605);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    



}
