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
public class Laptop extends Product{
    
    private String procesor;
    
    private int screenSize;
    
    Laptop(String name, int price, String procesor, int screen){
        this.name = name;
        this.price = price;
        this.procesor = procesor;
        this.screenSize = screen;
    }

    @Override
    public int getPrice(int quantity) {
        if(quantity < 5){
            return quantity * price;
        }else{
            return (quantity-3)*price;
        }
    }

    @Override
    public String toString() {
       return name + "," + procesor + "," + String.valueOf(screenSize) + " inches";
    }   
}
