package builderDesign;

public class phoneBuilder {
    private String model;
    private String processor;
    private int ram;
    private int storage;
    private String OS;
    private int batteryCap;
    public phoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }
    public phoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }
    public phoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }
    public phoneBuilder setstorage(int storage) {
        this.storage = storage;
        return this;
    }
    public phoneBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }
    public phoneBuilder setbatteryCap(int batteryCap) {
        this.batteryCap = batteryCap;
        return this;
    }
    public Phone getPhone(){
        return new Phone(model,processor,ram,storage,OS,batteryCap);
    }
}
