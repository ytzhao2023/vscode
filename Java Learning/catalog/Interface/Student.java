package catalog.Interface;

class Student implements Person{
    private String name;

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    
    
}
