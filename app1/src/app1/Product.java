/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author Student
 */
public abstract class Product {
    
    String name;
    
    int price;
    
    public abstract int getPrice(int quantity);
}
