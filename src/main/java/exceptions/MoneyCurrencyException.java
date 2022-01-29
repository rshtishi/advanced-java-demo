package exceptions;

public class MoneyCurrencyException extends RuntimeException {

    public MoneyCurrencyException(String message){
        super(message);
    }

    public MoneyCurrencyException(){
    }

}
