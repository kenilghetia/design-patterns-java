package builderPattern;

public class osFactory {
    public operatingSystem getInstance(String str){
        if(str.contains("Samsung") || str.contains("OnePlus") || str.contains("android")){
            return new android();
        }
        else if(str.contains("IOS")  || str.contains("Secured")) {
            return new IOS();
        }
        else{
            return new windows();
        }
    }
}
