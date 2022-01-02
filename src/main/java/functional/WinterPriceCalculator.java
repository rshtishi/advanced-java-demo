package functional;

public class WinterPriceCalculator implements PriceCalculator {

    private double price;

    public WinterPriceCalculator(double price) {
        this.price = price;
    }

    @Override
    public double compute(double area) {
        if (area > 500) {
            price *= 0.2;
        }
        return price * area;
    }
}
