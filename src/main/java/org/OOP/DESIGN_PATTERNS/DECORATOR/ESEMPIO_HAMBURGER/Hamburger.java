package org.OOP.DESIGN_PATTERNS.DECORATOR.ESEMPIO_HAMBURGER;

public class Hamburger extends Consumation {

    public Hamburger(){
        productName = "Hamburger";
    }

    @Override
    public double getPrice() {
        return 2.00;
    }

}
