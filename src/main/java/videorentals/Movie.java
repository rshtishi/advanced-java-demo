package videorentals;

public abstract class Movie {

    private String title;
    protected double price;

    public Movie(String title, double price) {
        this.title=title;
        this.price=price;
    }

    public abstract double calculatePrice(int duration);

    public abstract int calculatePoints(int duration);

    public String getTitle() {
        return this.title;
    }
}
