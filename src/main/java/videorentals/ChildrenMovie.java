package videorentals;

public class ChildrenMovie extends Movie {

    private static final int MAX_DURATION_FOR_DISCOUNT = 3;
    private static final double DISCOUNT_PERCENT = 0.7;

    public ChildrenMovie(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice(int duration) {
        if(duration<=MAX_DURATION_FOR_DISCOUNT){
            return super.price*duration*DISCOUNT_PERCENT;
        }
        return super.price*duration;
    }

    @Override
    public int calculatePoints(int duration) {
        return 1;
    }
}
