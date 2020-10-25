package com.OOP_advanced.Exercise;

public class Hamburger {
    private double pricing;
    private String bread;
    private String meat;
    private int itemsAdded = 0;
    private Additional addOne;
    private Additional addTwo;
    private Additional addThree;
    private Additional addFour;

    public Hamburger(double pricing, String bread, String meat) {
        this.pricing = pricing;
        this.bread = bread;
        this.meat = meat;
    }

    public double getPricing() {
        return pricing;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public Additional getAddOne() {
        return addOne;
    }
    

    public Additional getAddTwo() {
        return addTwo;
    }

    public Additional getAddThree() {
        return addThree;
    }

    public Additional getAddFour() {
        return addFour;
    }

    public void setAddOne(Additional addOne) {
        this.addOne = addOne;
    }
    public void setAddTwo(Additional addTwo) {
        this.addTwo = addTwo;
    }
    public void setAddThree(Additional addThree) {
        this.addThree = addThree;
    }
    public void setAddFour(Additional addFour) {
        this.addFour = addFour;
    }
    
    public int getItemsAdded() {
        return itemsAdded;
    }

    public void setItemsAdded(int itemsAdded) {
        this.itemsAdded = itemsAdded;
    }

    public String additionalItem(Additional addition){
        switch(itemsAdded){
            case 0:
                this.addOne = addition;
                break;
            case 1:
                this.addTwo = addition;
                break;
            case 2:
                this.addThree = addition;
                break;
            case 3:
                this.addFour = addition;
                break;
            default:
                return "Cannot add more items.";
        }
        this.itemsAdded++;
        return addition.getName() + " successfully added to burger.";
    }

    public double getTotalPrice() {
        switch (itemsAdded) {
            case 1:
                return pricing + addOne.getPricing();
            case 2:
                return pricing + addOne.getPricing() + addTwo.getPricing();
            case 3:
                return pricing + addOne.getPricing() + addTwo.getPricing() + addThree.getPricing();
            case 4:
                return pricing + addOne.getPricing() + addTwo.getPricing() + addThree.getPricing() + addFour.getPricing();
            default:
                return pricing;
        }
    }

    public String getItems() {
        String comma = ", ";
        String and = " and ";

        switch (itemsAdded) {
            case 1:
                return bread + comma + meat + and + addOne.getName();
            case 2:
                return bread + comma + meat + comma + addOne.getName() + and + addTwo.getName();  
            case 3:
                return bread + comma + meat + comma + addOne.getName() + comma + addTwo.getName() + and + addThree.getName();
            case 4:
                return bread + comma + meat + comma + addOne.getName() + comma + addTwo.getName() + comma + addThree.getName() + and + addFour.getName();
            default:
                return bread + and + meat;

        }
    }

}
