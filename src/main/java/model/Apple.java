package model;
import model.constants.*;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    public double getDiscount() {
        if (this.colour.equals(Colour.APPLE_RED)) {
            return Discount.APPLE_DISCOUNT;
        }
        return 0;
    }
}
