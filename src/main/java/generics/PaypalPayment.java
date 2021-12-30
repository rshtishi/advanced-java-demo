package generics;

public class PaypalPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Paid with paypal");
    }
}
