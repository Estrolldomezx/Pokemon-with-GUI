/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class BasePokemon {
    private String pokename;
    protected int CharHP;
    protected int MaxCharHP;
    
    public BasePokemon(String pname){
        this.pokename = pname;
        CharHP = 0;
        MaxCharHP = 0;
    }
    public String getName(){
        return pokename;
    }
    public int getHP(){
        return CharHP;
    }
    public boolean died(){
        if(CharHP <= 0) return true;
        else return false;
    }
}
