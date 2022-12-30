package builderDesign;

public class carBuilder {
    public String company;
    public int price;
    public String colour;
    public int seatingCap;
    public String engine;
    public carBuilder setCompany(String company) {
        this.company = company;
        return this;
    }
    public carBuilder setPrice(int price) {
        this.price = price;
        return this;
    }
    public carBuilder setColour(String colour) {
        this.colour = colour;
        return this;
    }
    public carBuilder setSeatingCap(int seatingCap) {
        this.seatingCap = seatingCap;
        return this;
    }
    public carBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public Car getCar(){
        return new Car(company, price,colour,seatingCap,engine);
    }
}
