package catalog.StaticFiedAndStaticMethod;

public class Person {
    public String name;
    public int age;

    public static int number;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void setNumber(int value){
        number = value;
    }
}
