/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Base {
    private int mana;
    private int def; //armor
    private int exp;
    private int level;
    private int damage;
    private int pokeball; // money
    private int fight; //killmonster
    private String skill;
    private int chargeATK; // MaxMana
    private int maxEXP;
    private Bag myBag; //Nbag
    
    public Base(String baseName, String baseSkill, int baseDamage, int baseHP, int baseEXP, int basePokeball, int baseMana, int baseDef, int baseLevel){
        super(baseName);
        this.charHP = baseHP;
        this.mana =baseMana;
        this.def = baseDef;
        this.exp = baseEXP;
        this.pokeball = basePokeball;
        this.level = baseLevel;
        this.damage = baseDamage;
        this.skill = baseSkill;
        this.fight = baseKillmon;
        this.MaxCharHP = 100;
        this.chargeATK = 0;
        this.maxEXP = 0;
        this.myBag = new Bag();
        
        }
        public int getMana(){
            return mana;
        }
        public int getDEF(){
            return def;
        }
        public int getEXP(){
            return exp;
        }
        public int getLevel(){
            return level;
        }
        public int getDamage(){
            return damage;
        }
        public int getKillmon(){
            return fight;
        }
        public int getPokeball(){
            return pokeball;
        }
        public String getBaseSkill(){
            return skill;
        }
        public void getItem(Item item){
            myBag.AddItem(item);
        }
        public boolean getLevel(){
            if(exp == maxEXP){
                level++;
                return true;
            }
            else 
                return false;
        }
        public void getEXP(int newEXP){
            exp += newEXP;
            getLevel();
        }
        
        
}
        
        
        
    
    
