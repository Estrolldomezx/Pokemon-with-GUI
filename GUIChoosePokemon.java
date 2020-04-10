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
    }

    
}
