package nested;

public class Company {

    private String name;

    public Company(String name){
        this.name = name;
    }

    public class Receipt {

        private double total;

        public Receipt(double total){
            this.total= total;
        }

        public void print(){
            System.out.println("Company name: "+name);
            System.out.println("Total amount to pay: "+ total);
        }
    }


}
