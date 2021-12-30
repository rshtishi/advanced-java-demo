package generics;

public class MultipleBoundedGeneric<T extends BankPayment & Payment> {

    private T paymentMethod;

    public MultipleBoundedGeneric(T paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void execute() {
        paymentMethod.pay();
    }

}
