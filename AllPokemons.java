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
    private Mons1 p11;
    private Mons1 p2;
    private Mons1 p22;
    private Mons1 p3;
    private Mons1 p33;
    private Mons1 p4;
    private Mons1 p44;
  
    public AllPokemons(){
        this.p1 = new Mons1("Bulbasaur","Solar beam",100);
        this.p11 = new Mons1("Bulbasaur2","Solar beam",100);
        this.p2 = new Mons1("Charmander","Fire blast",100);
        this.p22 = new Mons1("Charmander2","Fire blast",100);
        this.p3 = new Mons1("Squirtle","Hydro pump",100);
        this.p33 = new Mons1("Squirtle2","Hydro pump",100);
        this.p4 = new Mons1("Pikachu","Thunder bolt",100);
        this.p44 = new Mons1("Pikachu2","Thunder bolt",100);
    } 
    public Mons1 getBBS(){
        return p1;
    }
    public Mons1 getBBS2(){
        return p11;
    }
    
    public Mons1 getCMD(){
        return p2;
    }
    public Mons1 getCMD2(){
        return p22;
    }
    public Mons1 getSQT(){
        return p3;
    }
    public Mons1 getSQT2(){
        return p33;
    }
    
    public Mons1 getPKC(){
        return p4;
    }
    public Mons1 getPKC2(){
        return p44;
    }
}
