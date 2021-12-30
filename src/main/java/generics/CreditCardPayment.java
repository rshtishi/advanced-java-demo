package generics;

public class CreditCardPayment extends BankPayment {

    @Override
    public void pay() {
        System.out.println("Paid with credit card.");
    }
}
