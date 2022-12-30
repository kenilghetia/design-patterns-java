package adapterPattern2;

public class School {
    public static void main(String[] args){
    Pen p = new PenAdapter();
    Assignment aw = new Assignment();
    aw.setP(p);
    aw.writeAssignment("I am ready to write an assignment right now.");
    }
}
