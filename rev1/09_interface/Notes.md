# 📘 Java Revision – Phase 9: Interface

An interface represents a **pure contract**.

It answers one question:
> “What must a class do — not how it does it.”

Interfaces are heavily used in:
- frameworks
- APIs
- real-world Java systems

---

## 🧠 Why Interface is Needed

Java does **NOT** support multiple inheritance using classes.

This is NOT allowed:
```java
class A extends B, C { ❌ }


```
But Java still needs:
	•	flexibility
	•	common behavior across unrelated classes

Solution:
👉 Interface


An interface is a blueprint that contains only method declarations (by default) and constants.

Key idea:
	•	Interface defines rules
	•	Class agrees to follow them