package builderDesign;

public class Car {
    public String company;
    public int price;
    public String colour;
    public int seatingCap;
    public String engine;

    public Car(String company, int price, String colour, int seatingCap , String engine) {
        this.company = company;
        this.price = price;
        this.colour = colour;
        this.seatingCap = seatingCap;
        this.engine = engine;
    }

    public String toString(){
        return "Car[Company: "+ company +", price:" + price +", Colour: "+colour+", Seating Capacity: "+seatingCap+" ,Engine: "+ engine +" ]";
    }
}
