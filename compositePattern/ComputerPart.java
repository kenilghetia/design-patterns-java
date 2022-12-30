package compositePattern;

import java.util.ArrayList;
import java.util.List;

interface Component{
    void showPrice();
    int getPrice();
}

class Leaf implements Component {
    int price;
    String name;
    Leaf(String name, int price)
    {
        super();
        this.name = name;
        this.price = price;
    }
    @Override
    public void showPrice()
    {
        System.out.println("Leaf"  + "-> " +name+ " : " +price);
    }
    public int getPrice()
    {
        return price;
    }
}

class Composite implements Component{
    String name;
    List<Component> components = new ArrayList<>();

    public Composite (String name)
    {
        super();
        this.name = name;
    }
    public void addComponent(Component com)
    {
        components.add(com);
    }
    @Override
    public int getPrice()
    {
        int p = 0;
        for(Component c : components)
        {
            p += c.getPrice();
        }
        return p;
    }
    @Override
    public void showPrice()
    {
        System.out.println("Composite -> " +name+ " : Price " +getPrice());
        System.out.println("Leaf of " +name);
        for(Component c : components)
        {
            c.showPrice();
        }
    }
}
public class ComputerPart {
}