/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class AllPokemons {
    private Mons1 p1;
    private Mons1 p2;
    private Mons1 p3;
    private Mons1 p4;

    
    public AllPokemons(){
        this.p1 = new Mons1("Bulbasaur","Leaf blade",130);
        this.p2 = new Mons1("Charmander","Fire blaze",145);
        this.p3 = new Mons1("Squirtle","Hydro pump",140);
        this.p4 = new Mons1("Pikachu","Thunder bolt",150);
        
    public Mons1 getBBS(){
        return p1;
    }
    
    public Mons1 getCMD(){
        return p2;
    }
    
    public Mons1 getSQT(){
        return p3;
    }
    
    public Mons1 getPKC(){
        return p4;
    }
    
}
