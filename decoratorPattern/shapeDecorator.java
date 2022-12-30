package decoratorPattern;

public abstract class shapeDecorator implements Shape {
    protected Shape decoratedShape;

    public shapeDecorator(Shape decoratedShape){

        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}