package videorentals;

public class RegularMovie extends Movie {

    private static final int MAX_DURATION_FOR_DISCOUNT = 5;
    private static final double DISCOUNT_PERCENT = 0.8;

    public RegularMovie(String title, double price) {
        super(title, price);
    }


    @Override
    public double calculatePrice(int duration) {
        if(duration<=MAX_DURATION_FOR_DISCOUNT){
            return (super.price*duration)*DISCOUNT_PERCENT;
        }
        return super.price*duration;
    }

    @Override
    public int calculatePoints(int duration) {
        return 1;
    }
}
