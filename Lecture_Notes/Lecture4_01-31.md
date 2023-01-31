# Programming Paradigms - Lecture 4 (01/31/23)

A **static field** is used in situations where a value is independent of objects (shared across all objects)  
* Static methods can be built, which are accessible via classes not objects

**Inheritance** is a mechanism for resusability of code by giving similar objects the same basic functionality
* example: widgets --> textbox, checkbox, etc. (Note: constructors and destructors are not inherited in C++)
* *upcasting*: treating the child object as a parent object (setting it as a parent object or using it in the parent class functions)
* *downcasting*: treating the parent object as a child object (ILLEGAL! -- there is functionality available to the child object not available to the parent [i.e. the child is a parent but not the other way around])
    * passing child directly to parent function -- this is called **object slicing** (information about the child will be discarded so that it can be treated as a parent)
    * can pass pointer to child or pass child by reference to parent function to avoid object slicing (still do not have access to child functionality -- only parent functionality)

The child class can **override** a parent function
* i.e. the parent has a more generic function and the child has a more specific function --> the method used is directly tied to the specific class something is from

**Polymorphism** refers to something that can take many forms
* This is especially useful for defining vectors of a parent object, which can have different child objects (or pointers to those objects) as elements
    * for pointers can use `memory` file in C++ and `unique_ptr<type>`, `make_unique<type>` to handle creation and destruction of pointers (automatic cleanup)







