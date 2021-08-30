package com.ness;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
//        Car porsche = new Car();
//        //Car porsche;
//        porsche.model = "CarreraXX";
//
//        //porsche = null;
//        System.out.println("Model is : " + porsche.getModel());
//        porsche.setModel("922");
//        System.out.println("Model is : " + porsche.getModel());

//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

//        BankAccount account = new BankAccount();
//        System.out.println(account.getBalence() + account.getCustomerEmailAddress());
//        BankAccount account2 = new BankAccount("1111", 0.00, "Bob", "email", "000");
//        System.out.println(account2.getBalence() + account2.getCustomerEmailAddress());
//
//        account.withdrawal(100);
//
//        account.deposit(50);
//        account.withdrawal(100);
//
//        account.deposit(51);
//        account.withdrawal(100);

//        BankAccount account10 = new BankAccount("Maros", "email", "123");
//        System.out.println(account10.getNumber() + " name " + account10.getCustomerName());

//        VipPerson person1 = new VipPerson();
//        System.out.println(person1.getName());
//
//        VipPerson person2 = new VipPerson("Maros", 25000.00);
//        System.out.println(person2.getName());
//
//        VipPerson person3 = new VipPerson("Tim", 100.00, "email3");
//        System.out.println(person3.getName());
//        System.out.println(person3.getEmailAddress());

//        Wall wall = new Wall(5,4);
//        wall.hashCode();
//        System.out.println("area= " + wall.getArea());
//        wall.setHeight(-1.5);
//        System.out.println("width= " + wall.getWidth());
//        System.out.println("height= " + wall.getHeight());
//        System.out.println("area= " + wall.getArea());

//        Dimensions dimensions = new Dimensions(20,20,5);
//        Case theCase = new Case("111", "Dell", "240", dimensions);
//        Monitor monitor = new Monitor("27Inch", "Samsung", 27, new Resolution(2540, 1440));
//        Motherboard motherboard = new Motherboard("222", "Asus", 4, 6, "v2");
//        PC thePC = new PC(theCase, monitor, motherboard);
//
//        // accessing monitor method from PC object
//        //thePC.getMonitor().drawPixelAt(1500, 1200, "blue");
//        thePC.powerUp();
//
//        // accessing motherboard method from PC object
//       // thePC.getMotherboard().loadProgramme("windows");
//
//        // accessing case method from PC object
//        //thePC.getTheCase().pressPowerButton();
//
//        Wall2 wallA = new Wall2("W");
//        Wall2 wallB = new Wall2("E");
//        Wall2 wallC = new Wall2("S");
//        Wall2 wallD = new Wall2("N");
//
//        Ceiling ceiling = new Ceiling(12, 55);
//        Bed bed = new Bed("new", 1,2,3,4);
//        Lamp lamp = new Lamp("nice", false, 5);
//
//        Bedroom bedroom = new Bedroom("Maros's", wallA, wallB, wallC, wallD, bed, lamp);
//        bedroom.makeBed();
//
//        // difference ???
//        bedroom.getLamp().turnOn();
//        lamp.turnOn();

        Player player = new Player();
        // problem 2 - renamed in Player class
        //player.name = "Maros";

        // problem 3 - we forgot to initialize health
        //player.health = 20;
//        player.health = 20;
//        player.weapon = "spear";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaing health " + player.healthRemaining());
//
//        damage = 11;
//        // problem 1 - we can modify health outside Player class
//        player.health = 200;
//
//        player.loseHealth(damage);
//        System.out.println("Remaing health " + player.healthRemaining());

//        Printer printer = new Printer(50, true);
//        System.out.println("initial page count" + printer.getPagesPrinted());
//        int pagesPrinted = printer.printPages(4);
//        System.out.println("Pages printed" + pagesPrinted);

//        int[] array = new int[10];
////        array[0]= 1;
//        System.out.println(array[0] );
//        System.out.println(array[1] );
//        for (int i=0; i<array.length; i++) {
//            array[i] = i*10;
//        }
//        for (int i=0; i<array.length; i++) {
//            System.out.println("Element" + i + "value is:" + array[i]);
//        }

//        int myIntValue = 10;
//        int anotherIntValue = myIntValue;
//
//        System.out.println("myIntValue = " +myIntValue );
//        System.out.println("anotherIntValue = " + anotherIntValue);
//
//        anotherIntValue++;
//
//        System.out.println("myIntValue = " +myIntValue );
//        System.out.println("anotherIntValue = " + anotherIntValue);
//
//
//
//
//
//        int[] myIntArray = new int[5];
//        int[] anotherArray = myIntArray;
//
//        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
//        System.out.println("anotherArray = " + Arrays.toString(myIntArray));
//
//
//
//        anotherArray[0] = 1;
//
//        System.out.println("after change: myIntArray = " + Arrays.toString(myIntArray));
//        System.out.println("after change: anotherArray = " + Arrays.toString(myIntArray));
//
//        //!!! last change in next row:
//        // now anotherArray is referencing to different object in memory
//        anotherArray = new int[] {4,5,6,7,8};
//        modifyArray(myIntArray);
//
//        System.out.println("after change 2: myIntArray = " + Arrays.toString(myIntArray));
//        System.out.println("after change 2: anotherArray = " + Arrays.toString(anotherArray));

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();;
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
                }
        }

    }

    private static void modifyArray(int[] array) {
       array[0] = 2;
       // Dereferencing to new array object
       array = new int[] {1,2,3,4,5};
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - print choice options");
        System.out.println("\t 1 - print list");
        System.out.println("\t 2 - add");
        System.out.println("\t 3 - modify");
        System.out.println("\t 4 - remove");
        System.out.println("\t 5 - search");
        System.out.println("\t 6 - quit");
    }

    public static void addItem() {
        System.out.print("Please enter grocery item");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Currnet item name");
        String itemNo = scanner.nextLine();
        System.out.print("Enter new item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.print("Item to search");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)){
            System.out.println("found " + searchItem + " in our list");
        } else {
            System.out.println(searchItem + "is not in list");
        }
    }



}
