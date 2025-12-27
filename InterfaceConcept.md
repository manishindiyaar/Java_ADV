
🧨 THE PROBLEM (Why interface exists)

Imagine this:

You are building a system with:
	•	Phone
	•	Laptop
	•	SmartWatch

All of them must be chargeable.

But…
	•	They are NOT related by inheritance.
	•	Java does NOT support multiple inheritance with classes.

So this fails:

class Phone extends Device, Charger { ❌ }

Java blocks it.

So how do we force unrelated classes to follow the same rules?

👉 Interface.

⸻

⭐ What is an Interface? (Plain English)

An interface is a 100% contract.

It says:

“Any class that implements me MUST implement my methods.”

No confusion.
No partial behavior.

⸻

✅ Interface Syntax (Simple)

interface Animal {
    void sound();   // abstract by default
}

Notice:
	•	No abstract keyword needed
	•	No method body

⸻

✅ Implementing an Interface

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}


⸻

🔥 Key Difference from Abstract Class (Feel it)

Abstract Class	Interface
Can have normal methods	❌ Only abstract methods (by default)
Can have variables	Only public static final
Uses extends	Uses implements
Can have constructors	❌ No constructors
Single inheritance only	✔ Multiple inheritance supported


⸻

⭐ Full Simple Example (ONE FILE)

📄 InterfaceDemo.java

interface Shape {
    void draw();   // abstract method
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Shape s = new Circle();   // interface reference
        s.draw();
    }
}

Output

Drawing Circle


⸻

🧠 Important Rules (Exam Gold)
	•	Interface methods are public & abstract by default
	•	Interface variables are public static final
	•	A class can implement multiple interfaces
	•	Interface cannot have object
	•	Interface supports 100% abstraction

⸻

📝 Exam One-Liner

An interface is a blueprint that contains only abstract methods and is used to achieve multiple inheritance in Java.

⸻

🧠 When to use what?
	•	Use abstract class when classes are closely related
	•	Use interface when classes are unrelated but must follow same rules

⸻
