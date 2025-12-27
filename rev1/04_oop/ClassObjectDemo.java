

class Person{
    String name;
    int age;

    void display(){
        System.out.println("Name : " +name);
        System.out.println("Age : "+ age);
    }


}

public class ClassObjectDemo{
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "Manish";
        p1.age = 20;

        p1.display();
    }
}