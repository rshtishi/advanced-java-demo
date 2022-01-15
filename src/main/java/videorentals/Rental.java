package videorentals;

public class Rental {

    private Movie movie;
    private int duration;

    public Rental(Movie movie, int duration) {
        this.movie = movie;
        this.duration = duration;
    }

    public double calculatePrice(){
        return this.movie.calculatePrice(duration);
    }

    public int calculatePoints(){
        return this.movie.calculatePoints(duration);
    }

    public String getTitle(){
        return this.movie.getTitle();
    }

    public int getDuration() {
        return this.duration;
    }
}
