/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Pokeball extends Item{
    private float Prize;
    
    public Pokeball(String name, float prize){
        super(name);
        this.Prize = prize;
    }
    public float getPrize(){
        return Prize;
    }
}
