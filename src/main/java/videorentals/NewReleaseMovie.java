package videorentals;

public class NewReleaseMovie extends Movie {

    private static final int MAX_DURATION_FOR_DISCOUNT = 2;
    private static final double DISCOUNT_PERCENT = 0.85;

    public NewReleaseMovie(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice(int duration) {
        if(duration<=MAX_DURATION_FOR_DISCOUNT){
            return super.price*duration*DISCOUNT_PERCENT;
        }
        return price*duration;
    }

    @Override
    public int calculatePoints(int duration) {
        if(duration>=2){
            return 2;
        }
        return 1;
    }
}
