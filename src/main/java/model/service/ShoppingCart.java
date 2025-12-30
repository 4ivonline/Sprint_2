package model.service;
import model.Food;

public class ShoppingCart {
    private Food[] massiveFood;

    public ShoppingCart(Food[] massiveFood) {
        this.massiveFood = massiveFood;
    }

    // Сумма без скидки
    public double sumNoDiscount() {
        double sum = 0.0;
        for (int i = 0; i < massiveFood.length; i++) {
            sum = sum + massiveFood[i].getPrice() * massiveFood[i].getAmount();
        }
        return sum;
    }

    // Сумма со скидой
    public double sumDiscount() {
        double sum = 0.0;
        for (int i = 0; i < massiveFood.length; i++) {
            double price = massiveFood[i].getPrice() * massiveFood[i].getAmount();
            double discount = massiveFood[i].getDiscount();
            price = price - ((price * discount)/100);
            sum = sum + price;
        }
        return sum;
    }

    // Сумма вегетарианских продуктов без скидки
    public double sumVegetarian() {
        double sum = 0.0;
        for (int i = 0; i < massiveFood.length; i++) {
            if(massiveFood[i].isVegetarian()) {
            sum = sum + massiveFood[i].getPrice() * massiveFood[i].getAmount();
            }
        }
        return sum;
    }
}



