package compositePattern;

public class CompositeTest {
    public static void main(String[] args)
    {
        Component hd = new Leaf("Hard drive", 4000);
        Component mouse = new Leaf("Mouse", 500);
        Component monitor = new Leaf("Monitor", 8000);
        Component ram = new Leaf("ram", 3000);
        Component cpu = new Leaf("CPU" , 9000);

        Composite ph = new Composite("Peri");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("Motherboard");
        Composite computer = new Composite("Computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);

        cabinet.addComponent(hd);
        cabinet.addComponent(mb);

        computer.addComponent(cabinet);
        computer.addComponent(ph);

        computer.showPrice();
        ram.showPrice();
        ph.showPrice();
    }
}
