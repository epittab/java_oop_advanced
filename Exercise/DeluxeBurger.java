package com.OOP_advanced.Exercise;

public class DeluxeBurger extends Hamburger {

    private Additional chips;
    private Additional drink;

    public DeluxeBurger(double pricing, String bread, String meat){
        super(pricing, bread, meat);
        this.chips = new Additional(.99, "Chips");
        this.drink = new Additional(.99, "Drink");
    }

    private double getDeluxeComboPricing(){
        return this.chips.getPricing() + this.drink.getPricing();
    }

    @Override
    public double getTotalPrice() {
        switch (this.getItemsAdded()) {
            case 1:
                return this.getPricing() + this.getAddOne().getPricing() + this.getDeluxeComboPricing();
            case 2:
                return this.getPricing() + this.getAddOne().getPricing() + this.getAddTwo().getPricing() + this.getDeluxeComboPricing();
            case 3:
                return this.getPricing() + this.getAddOne().getPricing() + this.getAddTwo().getPricing() + this.getAddThree().getPricing() + this.getDeluxeComboPricing();
            case 4:
                return this.getPricing() + this.getAddOne().getPricing() + this.getAddTwo().getPricing() + this.getAddThree().getPricing() + this.getAddFour().getPricing() + this.getDeluxeComboPricing();
            default:
                return this.getPricing() + this.getDeluxeComboPricing();
        }
    }

    @Override
    public String getItems() {
        String comma = ", ";
        String and = " and ";

        switch (this.getItemsAdded()) {
            case 1:
                return this.getBread() + comma + this.getMeat() + comma + this.chips.getName() + comma + this.drink.getName() + and + this.getAddOne().getName();
            case 2:
                return this.getBread() + comma + this.getMeat() + comma + this.chips.getName() + comma + this.drink.getName() + comma + this.getAddOne().getName() + and + this.getAddTwo().getName();  
            case 3:
                return this.getBread() + comma + this.getMeat() + comma + this.chips.getName() + comma + this.drink.getName() + comma + this.getAddOne().getName() + comma + this.getAddTwo().getName() + and + this.getAddThree().getName();
            case 4:
                return this.getBread() + comma + this.getMeat() + comma + this.chips.getName() + comma + this.drink.getName() + comma + this.getAddOne().getName() + comma + this.getAddTwo().getName() + comma + this.getAddThree().getName() + and + this.getAddFour().getName();
            default:
                return this.getBread() + comma + this.getMeat() + comma + this.chips.getName() + and + this.drink.getName();

        }
    }
}
