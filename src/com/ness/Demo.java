package com.ness;

import java.util.*;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String > placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");

        printList(placesToVisit);

        addInOrder(placesToVisit,"Alice Springs");
        addInOrder(placesToVisit,"Darwin");

        printList(placesToVisit);
        visit(placesToVisit);

//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");

//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Alice Springs");
//
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);

    }


    private static void printList (List<String > linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("============");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // do not add
                System.out.println(newCity + "is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            //} else if (comparison < 0) {
            } else {
                // move on next city
            }

        }

        stringListIterator.add(newCity);
        return true;

    }

    private static void visit(LinkedList cities) {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holidays");
                    quit = true;
                    break;
                case 1:
//                    if(!goingForward) {
//                        if(listIterator.hasNext()) {
//
//                        }
//                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else  {
                        System.out.println("Reached the end of  the list");
                    }
                    break;
                case 2:
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " +listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                    }
                case 3:
                    printMenu();
                    break;
            }

        }
    }

    private static void printMenu() {
        System.out.println("Available actions");
        System.out.println("0 - to quit\n" +
                "1 go to next city\n" +
                "2 go to previous city\n" +
                "1 print menu options\n");
    }

}
