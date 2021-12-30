package generics;

public class BoundedGeneric<T extends Payment> {

    T paymentService;

    public BoundedGeneric(T paymentService) {
        this.paymentService = paymentService;
    }

    public void execute() {
        paymentService.pay();
    }
}
