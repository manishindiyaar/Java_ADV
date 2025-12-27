

class Student{
    String name;
    int marks;
    
    void show(){
        System.out.println(name + " " + marks);
    }
}

public class StudentDemo{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Manish";
        s1.marks = 90;

        Student s2 = new Student();
        s2.name = "Ravi";
        s2.marks = 90;

        s1.show();
        s2.show();
    }
}