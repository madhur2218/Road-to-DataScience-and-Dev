
Why is java not purely OOP?

In layman's terms, Java is often considered not a pure object-oriented language because it supports primitive data types like int, double, boolean, etc., which are not objects. In a pure object-oriented language, everything would be an object, including basic data types.

Here's a simple analogy:

Imagine a toolbox where everything is neatly organized into containers. In a pure object-oriented language, every tool, even the smallest screw, would have its own container. However, in Java, some tools, like nails and screws, are not in containers but loose in the toolbox. These loose tools are similar to primitive data types in Java.

So, while Java emphasizes object-oriented programming and uses objects for many things, it also has these "loose tools" (primitive data types) that don't quite fit the pure object-oriented model. However, Java still allows you to work with these primitives efficiently, which is why it's widely used despite not being strictly pure object-oriented.

......................................................................

The static keyword:  When we declares a class as static then it can be used without the use of an object in Java. If we are using static function or static variable then we can’t call that function or variable by using dot(.) or class object defying object oriented feature.

Static keyword is a common variable used by all objects.



............................................................................

Stack and Heap Memory in Java

Dog d = new Dog();
The new Dog() expression in Java results in the creation of a new Dog object, and this object is indeed stored in the heap memory. When you use the new keyword to create an object, Java allocates memory for that object on the heap.

In Java, the heap memory is used for dynamically allocated objects, which means objects whose memory allocation and deallocation are managed at runtime. The heap memory is managed by the Java Virtual Machine (JVM) and is available to the entire application. Objects created with new are stored in the heap until they are no longer referenced, at which point they become eligible for garbage collection.

So, in summary, new Dog() creates a new Dog object on the heap, and the variable d holds a reference to that object.

Local variables are part of stack and instance variables are part of heap memory
Instance variables are public by default.


................................................................................

Static Variables, Methods 

Static variables in Java are class-level variables, meaning they belong to the class rather than to instances (objects) of the class. Here are some key points about static variables:

Single Copy: Static variables are shared among all instances of the class. There is only one copy of a static variable regardless of how many objects of the class are created.

Memory Allocation: Static variables are allocated memory when the class is loaded into memory by the JVM. They exist for the entire duration of the program's execution.

Access: Static variables can be accessed directly using the class name, without the need to create an object of the class.

Initialization: Static variables are initialized only once, at the start of the execution, before the initialization of any objects.

Visibility: Static variables can be accessed by any object of the class or by the class itself, as long as they have the appropriate access modifier.

Static variables consume heap memory.

Static variables can directly be called by class name.

Static Class:
Belongs to Class: Static methods are associated with the class itself rather than with any specific instance of the class. This means you can call a static method directly using the class name, without needing to create an object of the class.

No Access to Instance Variables: Since static methods do not belong to any instance, they cannot access instance variables directly. They can only access other static members of the class.

Used for Utility Methods: Static methods are often used for utility methods that perform some common functionality across instances of the class.

