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
public class Mobile extends Product{

    private String memory;
    
    private String os;
    
    Mobile(String name, int price, String os, String memory){
        this.name = name;
        this.price = price;
        this.memory = memory;
        this.os = os;
    }
    
    @Override
    public int getPrice(int quantity) {
        if(quantity < 3){
            return quantity * price;
        }else{
            return (quantity-1)*price;
        }
    }

    @Override
    public String toString() {
        return name + "," + os + "," + memory;
    }
    
}
