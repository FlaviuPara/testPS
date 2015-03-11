/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Student
 */
public class Cart {
    
    private HashMap<Product, Integer> products = new HashMap();
    
    public int getTotalPrice(){
        int totalPrice = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()){
            totalPrice += entry.getKey().getPrice(entry.getValue());
        } 
        return totalPrice;
    }
    
    @Override
    public String toString(){
       String names = "Products:\n";
       for (Map.Entry<Product, Integer> entry : products.entrySet()){
            names = names + entry.getValue().toString() + "x " + entry.getKey().toString() + "\n";
        } 
       names = names + "\nTotal price: " + String.valueOf(getTotalPrice());
       return names;
    }
    
    public void add(Product product, int quantity){
        products.put(product, quantity);
    }
}
