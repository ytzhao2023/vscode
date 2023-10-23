package runoob;
public class Puppy{
    int puppyAge;
    // this is a constructor and it only has one parameter.
    public Puppy(String name){
        System.out.println("The dog name is: " + name);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("The dog age is: " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args){
        // below code will constructor an object of Puppy.
        Puppy myPuppy = new Puppy("Tommy");
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println(myPuppy.puppyAge);

    }
}