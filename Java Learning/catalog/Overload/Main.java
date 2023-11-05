package catalog.Overload;

public class Main {
    public static void main(String[] args){
        Hello helloObject = new Hello();

        helloObject.hello();
        helloObject.hello("Alice");
        helloObject.hello("Alsa", 23);
        helloObject.hello("Bill", 15);

    }
}
