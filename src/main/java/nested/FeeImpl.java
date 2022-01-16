package nested;

public class FeeImpl implements Fee {

    private static final double PERCENT=0.5;
    @Override
    public double apply(double amount) {
        return amount*PERCENT;
    }
}
