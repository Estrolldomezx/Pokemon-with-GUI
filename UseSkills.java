/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class UseSkills {
    private Skills skill1;
    private Skills skill2;
    private Skills skill3;
    private Skills skill4;
    
    public UseSkills(){
        this.skill1 = new Skills("Solar beam", 40, 10, 80);
        this.skill2 = new Skills("Fire blast", 70, 10, 90);
        this.skill3 = new Skills("Hydro pump", 30, 10 , 50);
        this.skill4 = new Skills("Thunder bolt", 60, 10, 50);
    }
    public Skills getBBSSkill(){
        return skill1;
    }
    public Skills getCMDSkill(){
        return skill2;
    }
    public Skills getSQTSkill(){
        return skill3;
    }
    public Skills getPKCSkill(){
        return skill4;
    }
}
