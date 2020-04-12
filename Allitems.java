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
public class Allitems {
    private ArrayList<Item> AllItems;
    public Healing item1 = Healing("Berry", 30, 10);
    public Healing item2 = Healing("Potion", 40, 12);
    public Healing item3 = Healing("Super Potion", 50, 15);
    public Pokeball item4 = Pokeball("Pokeball",150);
    
    Random rand = new Random();
    
    public Allitems(){
        this.AllItems = new ArrayList();
        AllItems.add(item1);
        AllItems.add(item2);
        AllItems.add(item3);
        AllItems.add(item4);
    }
    
    public Item dropItem(){
        int i = rand.nextInt(10);
        return AllItems.get(i);
    }
    public Item getItem(int i){
        return AllItems.get(i);
    }
    
}
