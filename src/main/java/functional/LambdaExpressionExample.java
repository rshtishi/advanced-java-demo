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

        //labada expression for pay
        pay(50,(format,price) -> {
            System.out.println(format);
            System.out.println(price);
            return price*2;
          }
        );

        print("Square",()->{
            System.out.println("* * *");
            System.out.println("* * *");
            System.out.println("* * *");
        });

    }

    public static void createInvoice(double area,PriceCalculator priceCalculator){
        double total = priceCalculator.compute(area);
        System.out.println("Invoice.............");
        System.out.println("Total: "+total);
    }

    public static void pay(double price,PaymentMethod paymentMethod){
        double total = paymentMethod.execute("Format*************",price);
        System.out.println(total);
    }

    public static void print(String name,Printable printable){
        System.out.println(name);
        printable.print();
    }
}
