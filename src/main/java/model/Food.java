package model;

public abstract class Food implements Discountable {
    private int amount;
    private double price;
    private boolean isVegetarian;

    Food(int amountFood, double priceFood, boolean isVegetarian) {
        this.amount = amountFood;
        this.price = priceFood;
        this.isVegetarian = isVegetarian;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getDiscount() {
        return 0;
    }
}
