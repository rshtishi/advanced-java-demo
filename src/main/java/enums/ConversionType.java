package enums;

public enum ConversionType {

    METER_TO_YARDS {
        @Override
        public double convert(double value) {
            return value * 1.0936;
        }
    },
    YARDS_TO_METER {
        @Override
        public double convert(double value) {
            return value / 1.0936;
        }
    },
    INCHES_TO_CM {
        @Override
        public double convert(double value) {
            return value * 2.54;
        }
    },
    CM_TO_INCHES {
        @Override
        public double convert(double value) {
            return value / 2.54;
        }
    };


    public abstract double convert(double value);
}
