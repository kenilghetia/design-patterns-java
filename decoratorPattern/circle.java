package decoratorPattern;

public class circle implements Shape{
    @Override
    public void draw() {
        System.out.println("The Shape is: Circle");
    }
}
