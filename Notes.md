


# Notes

- A method without Body is said to be an Abstract method.
- In Java, an abstract method is declared by using the keyword abstract.
- Syntax
```
abstract <return-type> <function-name>(parameters);


eg: 
abstract void payment(int x);
abstract void add();
```

- if class consists of even a single an abstract method, then the class becomes abstract.

- A class cannot be both abstract and final.

- eg: 
abstract class A{
    abstract void add(int x);
    void display(){
        System.out.println("Hello World");
    }
}

- One cannot create the object of an abstract class in Java.

ie: Mode p = new Mode();
Hence in order to use the methods declared in Mode, one need to create that would extend Mode.

eg: class UPI extends Mode{
    ...
}

- Now in the child class all the abstract methods of the parent class must be implemented else the child class also becomes an abstract class and no object of the child class can be created.


# Interface
