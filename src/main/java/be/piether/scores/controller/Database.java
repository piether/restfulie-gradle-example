package be.piether.scores.controller;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<Item> items;

    public Database(){
       items = new ArrayList<Item>();
       items.add(createItem(1,"restfulie-book", 25.00));
       items.add(createItem(2,"restf in practice", 35.00));
   }

   public List<Item> getItems(){
     return items; 
   }

   public Item getItem(Integer id){
    return items.get(id - 1);
   }

   private Item createItem(Integer id, String name, Double price){
    return new Item(id,name,price);
   }
 }