package catalog.ObjectAndConstructor;

public class Person2 {
    private String name = "Unamed";
    private int age = 10;

    // create a method to initialize instance, when calling this constructor, we must use "new"
    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
