package adapterPattern2;

public class PenAdapter implements Pen{
    PilotPen pp = new PilotPen();
    public void write(String str){
        pp.mark(str);
    }
}
