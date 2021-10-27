package com.ness;

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
    
}


