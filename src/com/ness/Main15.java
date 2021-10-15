package com.ness;

import com.sun.xml.internal.ws.message.stream.StreamHeader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main15 {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Test", 20, 20);
        // reference is to same object
//        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//        printList(seatCopy);

        //seatCopy.get(1).reserve();
        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay  D12");
        } else {
            System.out.println("reserved");
        }

        if (theatre.reserveSeat("B13")) {
            System.out.println("Please pay  B13");
        } else {
            System.out.println("reserved");
        }

        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay  D12");
        } else {
            System.out.println("reserved");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats);
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

//        Collections.reverse(seatCopy);
//        Collections.shuffle(seatCopy);
//        System.out.println("printing seatcopy");
//        printList(seatCopy);
//        System.out.println("printing theatre.seats");
//        printList(theatre.seats);
//
//        Theatre.Seat minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("min " + minSeat.getSeatNumber());
//        System.out.println("max " + maxSeat.getSeatNumber());
//
//        sortList(seatCopy);
//        System.out.println("priting");
//        printList(seatCopy);

    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("----------------------");



    }

//    public static void sortList(List<? extends Theatre.Seat> list) {
//        for (int i=0; i<list.size(); i++) {
//            for (int j=i+1; j<list.size();  j++) {
//                if(list.get(i).compareTo(list.get(j)) > 0) {
//                    Collections.swap(list, i,j);
//                }
//            }
//        }
//
//    }


}
