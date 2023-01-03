

public class Eats extends Product {
    private double weight;
    private double volume;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Eats(double weight, double volume){
        this.weight = weight;
        this.volume = volume;
    }

    public Eats(String name, double price, double weight, double volume){
        super(name, price);
        this.weight = weight;
        this.volume = volume;
    }
}
