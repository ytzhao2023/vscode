package catalog.StaticFiedAndStaticMethod;

public class Main {
    public static void main(String[] args) {
        Person ming = new Person("Xiao Ming", 12);
        Person hong = new Person("Xiao Hong", 15);
        ming.number = 88;
        System.out.println(hong.number);
        hong.number = 99;
        System.out.println(ming.number);

        Person.setNumber(99);
        System.out.println(Person.number);

    }
}
