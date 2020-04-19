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
    public Pokeball item4 = new Pokeball("Pokeball", 150);
    Random rand = new Random();

    public Allitems() {
        this.AllItem1 = new ArrayList<Item>();
        AllItem1.add(item1);
        AllItem1.add(item2);
        AllItem1.add(item3);
        AllItem1.add(item4);
    }

    public Item dropItem(){
        int i;
        //i = rand.nextInt(3);
        i = Math.random()*3;
        try{
            if(i == 0 || i == 1 || i == 2 || i ==3)
                return Allitem1.get(i);
        }    
        catch(IndexOutOfBoundsException e){
            System.out.printf("Error random");
        }
    }

    public Item getItem(int i){
        return AllItem1.get(i);
    }
    
}
