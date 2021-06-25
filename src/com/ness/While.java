package com.ness;

public class While {

    public static void main(String[] args) {
        int count = 6;
//        while (count != 5) {
//            System.out.println("Count is: " + count);
//            count++;
//        }

//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count is " + count);
//            count++;
//        }

//
        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {
          number++;
          if (!isEvenNumber(number)) {
              continue;
          }
            System.out.println("Even number " + number);
        }


    }

    public static boolean isEvenNumber(int number){
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
