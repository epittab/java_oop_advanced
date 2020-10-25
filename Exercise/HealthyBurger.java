package com.OOP_advanced.Exercise;

public class HealthyBurger extends Hamburger{

    private Additional addFive;
    private Additional addSix;

    public HealthyBurger(double pricing, String meat){
        super(pricing, "brown rye", meat);
    }

    @Override
    public String additionalItem(Additional addition){
        int itemsAdded = this.getItemsAdded();
        switch(itemsAdded) {
            case 0:
                this.setAddOne(addition);
                break;
            case 1:
                this.setAddTwo(addition);
                break;
            case 2:
                this.setAddThree(addition);
                break;
            case 3:
                this.setAddFour(addition);
                break;
            case 4:
                this.addFive = addition;
                break;
            case 5:
                this.addSix = addition;
                break;
            default:
                return "Cannot add more items.";
        }
        this.setItemsAdded(itemsAdded + 1);
        return addition.getName() + " successfully added to healthy burger.";
    }

    @Override
    public double getTotalPrice() {
        int itemsAdded = this.getItemsAdded();
        switch (itemsAdded) {
            case 1:
                return this.getPricing() + this.getAddOne().getPricing();
            case 2:
                return this.getPricing() + this.getAddOne().getPricing() + this.getAddTwo().getPricing();
            case 3:
                return this.getPricing() + this.getAddOne().getPricing() + this.getAddTwo().getPricing() + this.getAddThree().getPricing();
            case 4:
                return this.getPricing() + this.getAddOne().getPricing() + this.getAddTwo().getPricing() + this.getAddThree().getPricing() + this.getAddFour().getPricing();
            case 5:
                return this.getPricing() + this.getAddOne().getPricing() + this.getAddTwo().getPricing() + this.getAddThree().getPricing() + this.getAddFour().getPricing() + addFive.getPricing();
            case 6:
                return this.getPricing() + this.getAddOne().getPricing() + this.getAddTwo().getPricing() + this.getAddThree().getPricing() + this.getAddFour().getPricing() + addFive.getPricing() + addSix.getPricing();
            default:
                return this.getPricing();
        }
    }

    @Override
    public String getItems() {
        String comma = ", ";
        String and = " and ";
        int itemsAdded = this.getItemsAdded();
        
        switch (itemsAdded) {
            case 1:
                return this.getBread() + comma + this.getMeat() + and + this.getAddOne().getName();
            case 2:
                return this.getBread() + comma + this.getMeat() + comma + this.getAddOne().getName() + and + this.getAddTwo().getName();  
            case 3:
                return this.getBread() + comma + this.getMeat() + comma + this.getAddOne().getName() + comma + this.getAddTwo().getName() + and + this.getAddThree().getName();
            case 4:
                return this.getBread() + comma + this.getMeat() + comma + this.getAddOne().getName() + comma + this.getAddTwo().getName() + comma + this.getAddThree().getName() + and + this.getAddFour().getName();
            case 5:
                return this.getBread() + comma + this.getMeat() + comma + this.getAddOne().getName() + comma + this.getAddTwo().getName() + comma + this.getAddThree().getName() + comma + this.getAddFour().getName() + and + addFive.getName();
            case 6:
                return this.getBread() + comma + this.getMeat() + comma + this.getAddOne().getName() + comma + this.getAddTwo().getName() + comma + this.getAddThree().getName() + comma + this.getAddFour().getName() + comma + addFive.getName() + and + addSix.getName();
            default:
                return this.getBread() + and + this.getMeat();

        }
    }
}
