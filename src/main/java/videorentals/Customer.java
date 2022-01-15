package videorentals;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public Customer(String name, List<Rental> rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public void rentMovie(Rental rental) {
        this.rentals.add(rental);
    }

    public void rentMovie(Movie movie, int duration) {
        this.rentals.add(new Rental(movie, duration));
    }

    public void printReport() {
        System.out.println("Movie name\tDuration\tRental Price");
        for (Rental rental : rentals) {
            System.out.println(String.format("%s\t\t%d\t\t%.2f",
                    rental.getTitle(),
                    rental.getDuration(),
                    rental.calculatePrice()));
        }
        System.out.println("\nTotal:"+getTotal());
        System.out.println("Total points:"+getTotalPoints());
    }

    private int getTotalPoints() {
        int totalPoints = 0;
        for(Rental rental:rentals){
            totalPoints+=rental.calculatePoints();
        }
        return totalPoints;
    }

    private double getTotal() {
        double total = 0.0;
        for(Rental rental:rentals){
            total+=rental.calculatePrice();
        }
        return total;
    }
}
