package singletonPattern;
public class Singleton{

    private static Singleton singleObject = new Singleton();
    public int i;
    private Singleton(){
        System.out.println("Successfully created...");
    }
    public static Singleton getInstance(){
        return singleObject;
    }
    public int getI(){
        return i;
    }

    public static void setSingleObject(Singleton singleObject){
        Singleton.singleObject = singleObject;
    }

    public void setI(int i){
        this.i = i;
    }
}
