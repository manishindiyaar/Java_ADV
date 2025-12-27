

class Employee{
    String name;
    int id;


    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    void show(){
        System.out.println(name + " - " + id);
    }
}

public class ThisKeywordDemo{
    public static void main(String[] args){
        Employee e = new Employee("Manish", 101);
        e.show();
    }
}   