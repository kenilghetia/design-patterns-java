package builderDesign;

public class Phone {
    private String model;
    private String processor;
    private int ram;
    private int storage;
    private String OS;
    private int batteryCap;


    public Phone(String model,String processor, int ram, int storage, String OS, int batteryCap) {
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.OS = OS;
        this.batteryCap = batteryCap;

    }


    public String toString(){
        return "Phone[Model: "+model+", Processor: "+processor+", RAM:"+ ram +", Storage: "+storage+" , OS: "+ OS +", Battery: "+ batteryCap +"]";
    }
}
