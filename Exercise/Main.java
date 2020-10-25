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

        System.out.println("x");
        System.out.println(" ");
        System.out.println("x");

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
        System.out.println("Total price " + hamburger5.getTotalPrice() + " but base pricing is " + hamburger5.getPricing());

        System.out.println("x");
        System.out.println(" ");
        System.out.println("x");
        
        HealthyBurger healthy = new HealthyBurger(12.99, "Impossible");
        healthy.additionalItem( new Additional(1.99, tomato) );
        healthy.additionalItem( new Additional(0.99, lettuce) );
        healthy.additionalItem( new Additional(1.99, cheese) );
        System.out.println(healthy.additionalItem( new Additional(2.99, "Avocado") ));
        System.out.println(healthy.additionalItem( new Additional(1.99, "Hummus") ));
        System.out.println(healthy.additionalItem( new Additional(1.99, "Peppers") ));
        System.out.println(healthy.additionalItem( new Additional(1.99, "peppers") ));
        System.out.println(healthy.getItems());
        System.out.println("Total price " + healthy.getTotalPrice());
        
        System.out.println("x");
        System.out.println(" ");
        System.out.println("x");

        DeluxeBurger deluxeBurger1 = new DeluxeBurger(9.99, white, beef);

        DeluxeBurger deluxeBurger2 = new DeluxeBurger(9.99, "Multigrain", beef);
        deluxeBurger2.additionalItem( new Additional(0.99, lettuce));

        DeluxeBurger deluxeBurger3 = new DeluxeBurger(9.99, white, beef);
        deluxeBurger3.additionalItem( new Additional(1.99, tomato) );
        deluxeBurger3.additionalItem( new Additional(0.99, lettuce) );

        DeluxeBurger deluxeBurger4 = new DeluxeBurger(9.99, white, beef);
        deluxeBurger4.additionalItem( new Additional(1.99, tomato) );
        deluxeBurger4.additionalItem( new Additional(0.99, lettuce) );
        deluxeBurger4.additionalItem( new Additional(1.99, cheese) );
        
        DeluxeBurger deluxeBurger5 = new DeluxeBurger(9.99, white, beef);
        deluxeBurger5.additionalItem( new Additional(1.99, tomato) );
        deluxeBurger5.additionalItem( new Additional(0.99, lettuce) );
        deluxeBurger5.additionalItem( new Additional(1.99, cheese) );
        System.out.println(deluxeBurger5.additionalItem( new Additional(1.99, bacon) ));
        System.out.println(deluxeBurger5.additionalItem( new Additional(1.99, bacon) ));
        
        System.out.println(deluxeBurger1.getItems());
        System.out.println("The total price " + deluxeBurger1.getTotalPrice());
        
        System.out.println(deluxeBurger2.getItems());
        System.out.println("A total price " + deluxeBurger2.getTotalPrice());

        System.out.println(deluxeBurger3.getItems());
        System.out.println("New total price " + deluxeBurger3.getTotalPrice());
        
        System.out.println(deluxeBurger4.getItems());
        System.out.println("Your total price " + deluxeBurger4.getTotalPrice());
       
        System.out.println(deluxeBurger5.getItems());
        System.out.println("Total price " + deluxeBurger5.getTotalPrice());

    }
}
