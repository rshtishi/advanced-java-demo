package nested;

public class ParcelValidator implements Validator {
    @Override
    public boolean validate(Parcel parcel) {
        if (parcel.getxLength() < 30 || parcel.getyLength() < 30 || parcel.getzLength() < 30) {
            return false;
        }
        if (Integer.sum(Integer.sum(parcel.getxLength(), parcel.getyLength()), parcel.getzLength()) > 300) {
            return false;
        }
        return true;
    }
}
