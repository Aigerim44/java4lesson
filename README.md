Java Programmin 4th homework, definition:
Please declare the class Car and define the following fields of this class (with the access modifier private): model, brand, 
year, price, color, quantity.
 Please create a constructor of this class consisting of the previously mentioned fields.
 We also create methods to return each of the fields (we use return) e.g.: getMOdel () and methods to set value each of the 
fields (methods taking a new value in their parameters fields) e.g.: setModel (Sting model).
 Additionally, we create a delivery() method (simulating car delivery) and sell() (simulating car sales) which change the value 
of the quantity field.
 The last method we create is the toString() method that returns an object of type String and prints it names of all fields of a 
given object and their state or value.
 We also create another class with the main() method in which:
 • we createobject of the Car class by using the constructor,
 • we call and print what the toString() method passes,
 • we call the sell() method
 • weprint all fields (using the previously declared „get” methods of the object field,
 • using the „set” methods we change some fields of the object,
 • we call and print again toString() method to notice the changes.

 ## Project Overview
This project demonstrates basic Object-Oriented Programming OOP principles in Java.  
It defines a `Car` class with attributes such as model, brand, year, price, color, and quantity.  
The program allows the user to view, modify, sell, and deliver cars using methods that interact with these fields.

## Purpose
The main goal of this project is to:
- Practice using **classes**, **constructors**, **getters/setters**, and **methods** in Java.  
- Show how to override the `toString()` method to display object information in a readable way.  
- Simulate a simple **inventory system** for managing car stock.

## Key Features
- **Encapsulation** — all fields are private and accessible only through getters and setters.  
- **Methods:** 
  - `sell()` — simulates selling cars (reduces quantity).  
  - `delivery()` — simulates receiving new cars (increases quantity).  
  - `toString()` — displays all field values in a single formatted string.  
- Main class — creates an object, modifies its values, and prints results.


