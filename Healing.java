/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Healing extends Item{
    private int heal2;
    private int mana2;
    
    public Healing(String name, int heal, int mana){
        super(name);
        this.heal2 = heal;
        this.mana2= mana;
    }
    public int getHeal(){
        return heal2;
    }
    public int getMana(){
        return mana2;
    }
}
