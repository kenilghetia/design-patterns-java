package builderPattern;
import java.util.Scanner;

public class OS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which Os would you like?");
        String str= scan.nextLine();

        osFactory osFactory = new osFactory();
        operatingSystem newOS = osFactory.getInstance(str);
        newOS.type();
        newOS.users();
        newOS.version();
        newOS.advantages();
        newOS.premium();

    }
}
