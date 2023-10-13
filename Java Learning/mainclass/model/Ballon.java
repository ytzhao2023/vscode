package mainclass.model;

public class Ballon {
    String color;
    public Ballon(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }        
    public void setColor(String color){
        this.color = color;
    }
    public void printColor(){
        System.out.print(color);
    }

    

    
}
