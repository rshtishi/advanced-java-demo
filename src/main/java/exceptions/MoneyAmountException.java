package exceptions;

public class MoneyAmountException extends RuntimeException {

    public MoneyAmountException(String message){
        super(message);
    }

    public MoneyAmountException(){

    }
}
