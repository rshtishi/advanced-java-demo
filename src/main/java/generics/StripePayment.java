package generics;

public class StripePayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Paid with Stripe");
    }
}
