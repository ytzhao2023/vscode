package catalog.ObjectAndConstructor;

public class Student extends Person {
    private int score;

    public Student(){
        
    }

    public Student(String name, int age, int score){
        super(name, age);
        this.score = score;
    }

    public int getScore(){
        return this.score;
    }
    
    public void setScore(int score){
        this.score = score;   
    }

    public String hello(){
        return "Hello" + name;
    }

    public void run(){
        System.out.println("Student.run");
    }
}
