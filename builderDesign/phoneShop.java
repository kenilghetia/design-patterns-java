package builderDesign;

public class phoneShop {
    public static void main(String[] args) {
        phoneBuilder phone1 = new phoneBuilder();
        phone1.setModel("OnePlus");
        phone1.setProcessor("Sd 888");
        phone1.setRam(12);
        phone1.setstorage(256);
        phone1.setOS("OxygenOS");
        phone1.setbatteryCap(4500);

        Phone phone= phone1.getPhone();
        System.out.println(phone);
    }
}
