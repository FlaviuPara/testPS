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
public class App1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cart cart = new Cart();
        
        Laptop laptop1 = new Laptop("Le W12", 1200, "i3", 13);
        Laptop laptop2 = new Laptop("Asus X", 3000, "i7", 15);
        Laptop laptop3 = new Laptop("Bangi 1", 400, "i3", 14);
        
        Mobile mobile1 = new Mobile("Samsumg S4", 2300, "android", "32 GB");
        Mobile mobile2 = new Mobile("iPhone 6", 2500, "IOS", "64 GB");
        
        cart.add(laptop1, 2);
        cart.add(laptop2, 10);
        cart.add(laptop3, 1);
        cart.add(mobile1, 5);
        cart.add(mobile2, 3);
        
        System.out.println(cart);
    }
    
}
