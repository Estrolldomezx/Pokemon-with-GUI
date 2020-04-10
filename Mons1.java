/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Mons1 {
    private String JName;
    private String JSkill;
    private int JHp;
    
    public Mons1(String jname,String jskill,int jhp){
        this.JName = jname;
        this.JSkill = jskill;
        this.JHp = jhp;
    }
    
    public String getJName(){
        return JName;
    }
    
    public String getJSkill(){
        return JSkill;
    }

    public int getJHP(){
        return JHp;
    }
}
