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
public class Allitems{
    private ArrayList<Item> AllItem1; // edit push final
    public Healing item1 = new Healing("Berry", 30, 10);
    public Healing item2 = new Healing("Potion", 40, 12);
    public Healing item3 = new Healing("Super Potion", 50, 15);
    public Stone item4 = new Stone("Upgrade", 10);
    public Stone item5 = new Stone("Dragon Scale", 20);
    public Stone item6 = new Stone("King Rock", 30);
    public Stone item7 = new Stone("Metal Coat",40);
    public Stone item8 = new Stone("Sinnoh Stone",50);
    public Stone item9 = new Stone("Sun Stone",50);
    public Stone item10 = new Stone("Unova Stone",60); 

    public Pokeball item11 = new Pokeball("Pokeball", 150);

    Random rand = new Random();

    public Allitems() {
        this.AllItem1 = new ArrayList<Item>();
        AllItem1.add(item1);
        AllItem1.add(item2);
        AllItem1.add(item3);
        AllItem1.add(item4);
    }

    public Item dropItem(){
        int i = (int)Math.random()*11;
        return AllItem1.get(i);
        }

    public Item getItem(int i){
        return AllItem1.get(i);
    }
    
}
