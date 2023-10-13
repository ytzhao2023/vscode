package mainclass;
import mainclass.model.Ballon;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) throws Exception{
        int a = 5;
        int b = a;

        a = 10;
        int c = b;
        System.out.println("a" + a);
        System.out.println("b" + b);
        System.out.println("c" + c);

        
        // Ballon redBallon = new Ballon("red");
        // Ballon greenBallon = redBallon;
        // greenBallon.setColor("Green");

        // redBallon.setColor("Dark Red");

        // Ballon blueBallon = greenBallon;
        // blueBallon.setColor("Blue");

        // redBallon.printColor();
        // greenBallon.printColor();
        // blueBallon.printColor();

        ArrayList<Ballon> aLotOfBallons = new ArrayList<Ballon>();
        Ballon brown = new Ballon("Brown");
        aLotOfBallons.add(brown);
        brown = new Ballon("Gray");
        aLotOfBallons.add(brown);
        
        for (Ballon ballon: aLotOfBallons){
            ballon.printColor();
        }
    }   
}
