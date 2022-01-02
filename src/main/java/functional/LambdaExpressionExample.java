package functional;

public class LambdaExpressionExample {

    public static void main(String[] args){
        //concrete class
        createInvoice(10,new WinterPriceCalculator(100));
        //anonymous class
        createInvoice(10, new PriceCalculator() {
            @Override
            public double compute(double area) {
                double price = 80;
                if(area>500){
                    price*=0.3;
                } else if(area>200){
                    price*=0.2;
                }
                return area*price;
            }
        });
        //lambda expression
        createInvoice(10, (area)->area*100);
    }

    public static void createInvoice(double area,PriceCalculator priceCalculator){
        double total = priceCalculator.compute(area);
        System.out.println("Invoice.............");
        System.out.println("Total: "+total);
    }
}
