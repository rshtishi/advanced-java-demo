package exceptions;

public class Money {

    private int amount;
    private String currency;

    public Money(int amount, String currency)  {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount illegal exception");
        }
        if (currency == null  || currency.isEmpty()) {
            throw new IllegalArgumentException("Currency illegal exception");
        }
        this.amount = amount;
        this.currency = currency;
    }
}
