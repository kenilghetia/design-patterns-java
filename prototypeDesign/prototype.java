package prototypeDesign;
import java.util.List;

public class prototype {

    public static void main(String[] args) throws CloneNotSupportedException{
        listVehicle carList = new listVehicle();
        carList.insertItems();

        listVehicle finalList = (listVehicle) carList.clone();
        List <String> list = finalList.getVehicleList();
        System.out.println("Initial list: "+list);
        list.add("Audi - E-tron RS");
        System.out.println("Updated list(item added) : "+ finalList.getVehicleList());

        finalList.getVehicleList().remove("Tata Nexon-EV");
        System.out.println("Updated list(item removed) : "+list);
        System.out.println("Car list : "+ carList.getVehicleList());
        finalList.modify();
    }
}
