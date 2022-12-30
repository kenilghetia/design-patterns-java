package singletonPattern;

class testClass {

    public static void main (String[] args) {
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();
        object1.setI(10);
        object2.setI(10);
        System.out.println(object1.getI());
        object2.i = object1.i + object2.i;
        System.out.println(object2.getI());

        print("object 1:", object1);
        print("object 2:", object2);

    }

    static void print(String name, Singleton obj){
        System.out.printf("Object: %s, Hashcode: %d%n", name, obj.hashCode());
    }

}
