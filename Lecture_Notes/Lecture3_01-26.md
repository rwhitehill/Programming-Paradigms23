# Programming Paradigms - 01/26/23

Writing a calculate wage program for a single employee in Java (procedural perspective):
````java
package com.codewithrong;

public class Main {
    
    public static void main(String[] args) {
        int base_salary = 50_000;
        int hourly_rate = 20;
        int extra_hours = 10;

        int wage = calculate_wage(base_salary,hourly_rate,extra_hours);
        System.out.println(wage);
    }

    public static int calculate_wage(int base_salary, int hourly_rate, int extra_hours) {
        return base_salary + extra_hours*hourly_rate;
    }
}
````

Rewriting the procedural code above into an `Employee` class (OOP perspective):

- This is the Employee class:
````java
package com.codewithrong;

public class Employee {
    // fields
    private int base_salary;
    private int hourly_rate;

    public Employee(int base_salary,int hourly_rate) {
        set_base_salary(base_salary);
        set_hourly_rate(hourly_rate);
    }

    public Employee(int base_salary) {
        set_base_salary(base_salary);
        set_hourly_rate(0);
    }

    public int calculate_wage(int extra_hours) {
        return base_salary + extra_hours*hourly_rate;
    }

    public int calculate_wage() {
        return calculate_wage(0);
    }

    private void set_base_salary(int base_salary) {
        if (base_salary <= 0) {
            throw new IllegalArgumentException("base salary cannot be 0 or less.")
        }
        this.baseSalary = baseSalary;
    }

    private void set_hourly_rate(int hourly_rate) {
        if (hourly_rate < 0) {
            throw new IllegalArgumentException("base salary cannot be 0 or less.")
        }
        this.base_salary = base_salary;
    }

    public int get_base_salary() {
        return this.base_salary;
    }

    public int get_hourly_rate() {
        return this.hourly_rate;
    }
}
````
- This is the main java program:
````java
package com.codewithrong;

public Class Main {
    
    public static void main(String[] args) {
        var employee = new Employee(50_000,20);

        int wage = employee.calculate_wage(10);
        System.out.println()
    }
}
````

### Notes on memory for C++ and Java

C++:  
* stack: variables/objects
* heap: new variables/objects (dynamic creation)
    * must delete these to avoid memory overflow

Java:  
* stack: primitive type variables (e.g. int, float, bool, char, ...)
* heap: new objects 
    * garbage collector automatically handles out of scope variables to avoid overflow







