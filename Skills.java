/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Skills {
    private String skillName;
    private int skillDamage;
    private int skillHeal;
    private int skillwithMana;
    public Skills(String sname, int sdamage, int sheal, int swithmana){
        this.skillDamage = sdamage;
        this.skillHeal = sheal;
        this.skillName = sname;
        this.skillwithMana = swithmana;
    }
    public String getName(){
        return skillName;
    }
    public int getDamage(){
        return skillDamage;
    }
    public int getheal(){
        return skillHeal;
    }
    public int getMana(){
        return skillwithMana;
    }
    
}
