package catalog.ObjectAndConstructor;


public class Person {
    protected String name;
    protected int age;
    protected int birth;

    public Person(){
        
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if (age < 0 || age > 100){
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }

    public void setBirth(int birth){
        this.birth = birth;
    }

    public int getCalculatedAge(){
        return calculatedAge(2023);
    }

    private int calculatedAge(int currentYear){
        return currentYear - this.birth;
    }

    public void run(){
        System.out.println("Person.run");
    }
}


