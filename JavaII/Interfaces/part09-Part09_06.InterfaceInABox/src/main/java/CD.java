
public class CD implements Packable {

    private String artist;
    private String name;
    private int year;
    private double weight;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
        this.weight = .1;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name+" ("+this.year+")";
    }

    @Override
    public double weight() {
        return this.weight;
    }

}
