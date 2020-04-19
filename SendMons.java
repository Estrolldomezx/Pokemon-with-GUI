/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Admin
 */
public class SendMons {
    private ArrayList<Monster> Allpokemon; // edit Item -> Monster
    public Monster mon1 = new Monster("Snorlax", 60, 7);
    public Monster mon2 = new Monster("Lapras",70,8);
    public Monster mon3 = new Monster("Darkrai",80,9);
    public Monster mon4 = new Monster("Gyarados",90,10);
    public Monster mon5 = new Monster("Lugia",100,11);
    public Monster mon6 = new Monster("Giratina",110,12);
    public Monster mon7 = new Monster("Dialga",120,13);
    public Monster mon8 = new Monster("Kyogre",130,14);
    
    Random rand = new Random();
    
    public SendMons(){
        this.Allpokemon = new ArrayList(); //edit Item -> Monster
        Allpokemon.add(mon1);
        Allpokemon.add(mon2);
        Allpokemon.add(mon3);
        Allpokemon.add(mon4);
        Allpokemon.add(mon5);
        Allpokemon.add(mon6);
        Allpokemon.add(mon7);
        Allpokemon.add(mon8);
    }
    
    public Monster ShowMon(){
        int i ;
        i = rand.nextInt(8);
        return Allpokemon.get(i);
    }
    
}
