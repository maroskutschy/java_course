public class Main {

    public static void main(String[] args) {

        int firstNumber = 25;
        int secondNumber;

        System.out.println(firstNumber);
        // this will not compile, because varibel is not initialized
        //System.out.println(secondNumber);

        secondNumber = 5;
        System.out.println(secondNumber);

        short day = 1, month = 2, year = 2022;

        // we cannot mix data types
        //short day1 = 1, month1 = 2, int year1 = 2022;
        // but if you replace , with ; then it is ok
        short day2 = 1, month2 = 2; int year2 = 2022;

        char firstNameInitial = 'A';
        System.out.println(firstNameInitial);

        boolean isItTrue = true;
        System.out.println(isItTrue);

        // we cannot use java keywords for variable names
        //int for = 0;
        // we cannot have number as start of variable
        //int 1number = 6;

        // precision an be lost - not compiled
        //float floatNumber = 1.1;
        // therefore we need to add suffix:
        float floatNumber1 = 1.1F;







    }
}
