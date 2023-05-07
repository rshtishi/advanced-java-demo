package enums;

public enum ConversionType {

    METER_TO_YARDS{
        @Override
        public double convert(double value){
            return value*1.0936;
        }
    };

    public abstract double convert(double value);
}
