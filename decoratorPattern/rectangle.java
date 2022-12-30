package decoratorPattern;

public class rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("The Shape is: Rectangle");
    }
}
