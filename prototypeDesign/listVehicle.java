package prototypeDesign;

import java.util.ArrayList;
import java.util.List;

public class listVehicle implements Cloneable{
    private List<String> vehicleList;

    public listVehicle(){
        this.vehicleList = new ArrayList<>();
    }
    public listVehicle(List<String> list){
        this.vehicleList = list;
    }

    public void insertItems(){
        vehicleList.add("Hyundai Kona");
        vehicleList.add("Mustang Mach-E");
        vehicleList.add("Mercedes EQS");
        vehicleList.add("Porsche Taycan");
        vehicleList.add("Tata Nexon-EV");
    }

    public void modify(){
        String s  = (String)vehicleList.get(0);
        System.out.println(s +"(Implementation of modify function)");
    }
    public List<String> getVehicleList(){
        return this.vehicleList;
    }

    public Object clone() {

        List<String> intemList = new ArrayList<String>();
        for(String s: vehicleList){
            intemList.add(s);
        }
        return new listVehicle(intemList);
    }
}


