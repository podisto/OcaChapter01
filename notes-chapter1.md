- A class is a design used to specify the attributes and behaviour of an object.

- A class is a design from which an object can be created.

- Because the variables are used to store the state of an object aka instance, they are called ***instance variables***
instance variables.

- A single copy of a ***class variable*** or ***static variable*** is shared by all the objects of a class.

- **EXAM TIP**: the classes and interfaces can be defined in any order of occurence in a java source code file.

- A java application can define more than one executable class. We choose one and exactly one when the time comes to start its execution by the JVM.

- The main method should comply with the following rules:
	- the method must be marked as a ```public``` method
	- the method must be marked as a ```static``` method
	- the return type of this method must be ```void```
	- the name of the method must be ```main```
	- the method must accept arguments of a ```String``` array or a variable arguments (varargs) of type ```String```.

**NOTE**: to define a variable arguments, the ellipsis (...) must follow the type of the variable and not the variable itself (a mistake made by a lot of new programmers).

**NOTE**: to define an array, the square brackets [] can either follow the variable name or its type.

**NOTE**: the order of the keywords ```public``` and ```static``` can be interchanged.

- If a class define a main method that does not match the signature of the main method required by the JVM, it's referred to as an overloaded method. Overloaded methods are methods with the same name but different signatures (return type and parameters type).