package observerPattern;
public class Youtube {
    public static void main(String[] args) {
        Channel Design = new Channel();

        Subscriber s1 = new Subscriber("Virat");
        Subscriber s2 = new Subscriber("Rohit");
        Subscriber s3 = new Subscriber("Dhoni");
        Subscriber s4 = new Subscriber("ABD");
        Subscriber s5 = new Subscriber("Sachin");
        Design.subscribe(s1);
        Design.subscribe(s2);
        Design.subscribe(s3);
        Design.subscribe(s4);
        Design.subscribe(s5);

        Design.unsubscribe(s3);

        s1.subscribeChannel(Design);
        s2.subscribeChannel(Design);
        s3.subscribeChannel(Design);
        s4.subscribeChannel(Design);
        s5.subscribeChannel(Design);

        Design.upload("observer Design Pattern");
    }
}
