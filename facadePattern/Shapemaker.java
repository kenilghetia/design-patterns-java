package facadePattern;
public class Shapemaker {
    private Shape Square;
    private Shape Rectangle;
    private Shape Circle;
    private Shape Oval;
    public Shapemaker(){
        Square = new square();
        Rectangle = new rectangle();
        Circle = new circle();
        Oval = new oval();
    }
    public void drawSquare() {
        Square.draw();
    }
    public void drawRectangle(){
        Rectangle.draw();
    }
    public void drawCircle(){
        Circle.draw();
    }
    public void drawOval(){
        Oval.draw();
    }
}


