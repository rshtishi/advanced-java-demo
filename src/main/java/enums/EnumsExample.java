package enums;

public class EnumsExample extends Object {

    public static void main(String[] args) {

        double yards = ConversionType.METER_TO_YARDS.convert(15);
        System.out.println(yards);
        System.out.println(ConversionType.YARDS_TO_METER.convert(30));
        System.out.println(ConversionType.CM_TO_INCHES.convert(30));
        System.out.println(ConversionType.INCHES_TO_CM.convert(11));


        Season winter = Season.WINTER;
        System.out.println(winter == Season.WINTER);
        System.out.println(winter.equals(Season.WINTER));

        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        //creating enums from String
        Season summer = Season.valueOf("SUMMER");
        System.out.println(summer);

        switch (summer) {
            case WINTER:
                System.out.println("Let's play with snow.");
                break;
            case SUMMER:
                System.out.println("Let's go swimming.");
                break;
            default:
                System.out.println("Let's stay at home and watch movies.");
        }

        for (Country country : Country.values()) {
            System.out.println(country.ordinal() + " - " + country.name() + " - " + country.getPopulationDensity());
        }

        BankOpeningHours bankOpeningHours = BankOpeningHours.FRIDAY;
        bankOpeningHours.printOpeningHours();

    }
}
