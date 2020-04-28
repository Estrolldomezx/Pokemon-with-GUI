/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Item {
    protected String itemName;
    
    public Item(String iname){
        this.itemName = iname;
    }
    public  String getName(){
        return itemName;
    }
    public String itemtoString(){
        return itemName;
    }
    
}
