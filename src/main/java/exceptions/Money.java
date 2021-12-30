package exceptions;

public class Money {

    public Money(int amount, String currency){
        if(amount<0){
            throw new MoneyAmountException();
        }
        if(currency!=null && !currency.isEmpty()){
            throw new MoneyCurrencyException();
        }
    }
}
