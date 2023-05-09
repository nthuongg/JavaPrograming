package sync;

public class MainClass {
    public static void main(String[] args) {
        //Shared resource
        CharObject charObject = new CharObject();

        CharProvider provider = new CharProvider( charObject );
        CharComsumer comsumer = new CharComsumer( charObject );
        provider.start();
        comsumer.start();
    }
}
