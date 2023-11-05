package catalog.ObjectAndConstructor;
import java.util.Arrays;


public class Main {
    public static void main(String[] args){
        Person ming = new Person();
        ming.setName("Xiao Ming");
        // ming.setAge(12);
        ming.setBirth(1996);

        int n = 15;
        ming.setAge(n);
        System.out.println(ming.getAge());
        n = 20;
        System.out.println(ming.getAge());

        // System.out.println(ming.getName() + " " + ming.getAge());
        System.out.println(ming.getCalculatedAge());

        Group g = new Group();
        // g.setNames(new String[] {"Xiao Ming", "Xiao Hong", "Xiao Juan"});
        // System.out.println(Arrays.toString(g.getNames())); 
        
        String [] fullname = new String[]{"Homer", "Simpson"};
        g.setNames(fullname);
        System.out.println(Arrays.toString(g.getNames()));
        fullname[0] = "Bart";
        System.out.println(Arrays.toString(g.getNames()));

        Person2 p = new Person2("Xiao Cai", 32);
        System.out.println(p.getName() + " " + p.getAge());

        Student s = new Student("Rose", 16, 90);
        System.out.println(s.getName() + " " + s.getAge() + " " + s.getScore());
        
        Person newperson = new Student();
        // this method verify the Polymorphic property of java, which means 
        // calling a method will based on the actucl type of variable rather
        // than the reference variable.
        newperson.run();


    }
    
}
