package com.ness;

public class Main2 {

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

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("111", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("27Inch", "Samsung", 27, new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard("222", "Asus", 4, 6, "v2");
        PC thePC = new PC(theCase, monitor, motherboard);

        // accessing monitor method from PC object
        thePC.getMonitor().drawPixelAt(1500, 1200, "blue");

        // accessing motherboard method from PC object
        thePC.getMotherboard().loadProgramme("windows");

        // accessing case method from PC object
        thePC.getTheCase().pressPowerButton();
    }

}
