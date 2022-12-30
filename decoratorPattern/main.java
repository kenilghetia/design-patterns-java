package decoratorPattern;

public class main {
    public static void main(String[] args) {

        Shape circle = new circle();

        Shape redCircle = new redShapeDecorator(new circle());

        Shape redRectangle = new redShapeDecorator(new rectangle());
        System.out.println("circle with normal border");
        circle.draw();

        System.out.println("\ncircle of red border");
        redCircle.draw();

        System.out.println("\nrectangle of red border");
        redRectangle.draw();
    }
}