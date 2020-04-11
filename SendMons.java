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
    private ArrayList<Pokemon> Allpokemon;
    public Pokemon mon1 = new Pokemon("Snorlax",60,7);
    public Pokemon mon2 = new Pokemon("Lapras",70,8);
    public Pokemon mon3 = new Pokemon("Machamp",80,9);
    public Pokemon mon4 = new Pokemon("Gyarados",90,10);
    public Pokemon mon5 = new Pokemon("Lugia",100,11);
    public Pokemon mon6 = new Pokemon("Moltres",110,12);
    public Pokemon mon7 = new Pokemon("Articuno",120,13);
    public Pokemon mon8 = new Pokemon("Zapdos",130,14);
    
    Random rand1 = new Random();
    
    public SendMons(){
        this.Allpokemon = new ArrayList();
        Allpokemon.add(mon1);
        Allpokemon.add(mon2);
        Allpokemon.add(mon3);
        Allpokemon.add(mon4);
        Allpokemon.add(mon5);
        Allpokemon.add(mon6);
        Allpokemon.add(mon7);
        Allpokemon.add(mon8);
    }
    
    public Pokemon outMon(){
        int i = rand1.nextInt(8);
        return Allpokemon.get(i);
    }
    
}
