package builderDesign;

public class carShop {
    public static void main(String[] args) {
        carBuilder newCar =new carBuilder();
        newCar.setCompany("Jeep");
        newCar.setPrice(2100000);
        newCar.setColour("White");
        newCar.setSeatingCap(5);
        newCar.setEngine("Diesel");

        Car car= newCar.getCar();
        System.out.println(car);
    }
}
