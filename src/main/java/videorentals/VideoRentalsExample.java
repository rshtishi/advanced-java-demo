package videorentals;

public class VideoRentalsExample {

    public static void main(String[] args){
        Customer customer = new Customer("Rando");
        customer.rentMovie(new RegularMovie("Intestellar",5.5),3);
        customer.rentMovie(new ChildrenMovie("Spiderman",5.2),5);
        customer.rentMovie(new NewReleaseMovie("House of Gucci",3.6),5);

        customer.printReport();

    }
}
