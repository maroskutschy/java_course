package com.ness;

import java.util.*;

public class Main100 {

    public static void main(String[] args) {
      //1 another class:  new Thread(new CodeToRun()).start();
//2 anonymous class:        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from Runnable");
//            }
//        }).start();
        //3 Lambda (1 line) - used for interfaces that have just 1 method and has to be implemented
        // = functional interfaces
     new Thread(()-> System.out.println("Printing from Runnable")).start();
        // 4 Lambda (more lines)
        new Thread(()-> {
            System.out.println("Printing from Runnable1");
            System.out.println("Printing from Runnable2");
        }).start();

        Employee john = new Employee("John D", 30);
        Employee ivan = new Employee("Ivan D", 31);
        Employee maros = new Employee("Maros D", 32);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(ivan);
        employees.add(maros);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

        //1 replace with lambda
//        Collections.sort(employees, (Employee employee1, Employee employee2) ->
//                employee1.getName().compareTo(employee2.getName()));

        //2 remove variables types = they are known according to 'employees'
        Collections.sort(employees, (employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));

        //3 remove parenthesis if there is just exact 1 parameter (NOT WORKING FOR THIS METHOD)=
//        Collections.sort(employees, employee1 ->
//                employee1.getName().compareTo(employee1.getName()));

        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }

//        String sillyString = doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        },
//        employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);

        // 4 new lambda: retunr value is assumed: return s1.toUpperCase() + s2.toUpperCase()
        //UpperConcat uc = (String s1, String s2) -> s1.toUpperCase() + s2.toUpperCase();

        // 5 we can remove parameters types (String)
//        UpperConcat uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
//        String sillyString = doStringStuff(uc,employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);

        // 6 we return value
        UpperConcat uc = (s1, s2) -> {
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };
        String sillyString = doStringStuff(uc,employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString);

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);

    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }



}

class CodeToRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing from Runnable");
    }
}

class Employee {
    private String name;
    private  int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    public String upperAndConcat (String s1, String s2);
}

class AnotherClass {

    public String doSomething() {

        UpperConcat uc = (s1, s2) -> {
            System.out.println("Lambda expression class" + getClass().getSimpleName());
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

        System.out.println("another classes name is:" + getClass().getSimpleName());
        return Main100.doStringStuff(uc, "s1", "s2");

//        System.out.println("Another class name is: " + getClass().getSimpleName());
//        return Main100.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("Anonymous class name is: " + getClass().getSimpleName());
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, "String1", "String2");
    }
}


