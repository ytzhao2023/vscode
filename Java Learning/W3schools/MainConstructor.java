package W3schools;
public class MainConstructor {
    int x = 5;
    public MainConstructor(){
    x = 5;    
    }
    public static void main(String[] args){
        MainConstructor myobj = new MainConstructor();
        System.out.println(myobj.x);
    }
    
}
