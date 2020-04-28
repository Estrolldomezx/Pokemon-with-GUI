/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Monster extends BasePokemon{
    private int monDamage;
    
    public Monster(String monname, int monhp, int damage){
        super(monDamage);
        this.CharHP = monhp;
        this.monDamage = damage;
    }
    
    public int getMonsterDamage(){
        return monDamage;
    }
}
