package nested;

public class Salary {

    private double amount;
    private String currency;

    public Salary() {
        this.amount = 320;
        this.currency = "EUR";
    }

    public Salary(double amount) {
        this.amount = amount;
        this.currency = "EUR";
    }

    public double calculateTaxes() {
        class FeeCalculator {
            private double percent =0.3;

            public double calculate(){
                return amount*percent;
            }

        }
        return new FeeCalculator().calculate();
    }
}
