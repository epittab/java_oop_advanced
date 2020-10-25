package com.OOP_advanced.Exercise;

public class Main {
    
    public static void main(String[] args) {
        //
        String white = "White";
        String beef = "Beef";
        String tomato = "Tomato";
        String lettuce = "Lettuce";
        String cheese = "Cheese";
        String bacon = "Bacon";

        Hamburger hamburger1 = new Hamburger(9.99, white, beef);

        Hamburger hamburger2 = new Hamburger(9.99, "Multigrain", beef);
        hamburger2.additionalItem( new Additional(0.99, lettuce));

        Hamburger hamburger3 = new Hamburger(9.99, white, beef);
        hamburger3.additionalItem( new Additional(1.99, tomato) );
        hamburger3.additionalItem( new Additional(0.99, lettuce) );

        Hamburger hamburger4 = new Hamburger(9.99, white, beef);
        hamburger4.additionalItem( new Additional(1.99, tomato) );
        hamburger4.additionalItem( new Additional(0.99, lettuce) );
        hamburger4.additionalItem( new Additional(1.99, cheese) );
        
        Hamburger hamburger5 = new Hamburger(9.99, white, beef);
        hamburger5.additionalItem( new Additional(1.99, tomato) );
        hamburger5.additionalItem( new Additional(0.99, lettuce) );
        hamburger5.additionalItem( new Additional(1.99, cheese) );
        System.out.println(hamburger5.additionalItem( new Additional(1.99, bacon) ));
        System.out.println(hamburger5.additionalItem( new Additional(1.99, bacon) ));
        
        System.out.println(hamburger1.getItems());
        System.out.println("The total price " + hamburger1.getTotalPrice());
        
        System.out.println(hamburger2.getItems());
        System.out.println("A total price " + hamburger2.getTotalPrice());

        System.out.println(hamburger3.getItems());
        System.out.println("New total price " + hamburger3.getTotalPrice());
        
        System.out.println(hamburger4.getItems());
        System.out.println("Your total price " + hamburger4.getTotalPrice());
       
        System.out.println(hamburger5.getItems());
        System.out.println("Total price " + hamburger5.getTotalPrice());
       
    }
}
