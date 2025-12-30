package ru.yandex.praktikum;
import model.*;
import model.constants.*;
import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.APPLE_RED);
        Apple yellowApple = new Apple(8, 60, Colour.APPLE_GREEN);

        Food[] product = new Food[3];
        product[0] = meat;
        product[1] = redApple;
        product[2] = yellowApple;

        ShoppingCart basket = new ShoppingCart(product);

        System.out.println("Общая сумма товаров без скидки: " + basket.sumNoDiscount() + " руб.");
        System.out.println("Общая сумма товаров со скидкой: " + basket.sumDiscount() + " руб.");
        System.out.println("Общая сумма вегетарианских товаров: " + basket.sumVegetarian() + " руб.");
    }
}