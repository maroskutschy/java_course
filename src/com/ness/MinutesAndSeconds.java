package com.ness;

public class MinutesAndSeconds {

    private static final String INVALID_VALUE = "Invalid value";

    public static void main(String[] args) {

        getDurationString(120,30);
        getDurationString(7230);
        getDurationString(65,45);
        getDurationString(3945);
        getDurationString(61,0);

    }

    public static void getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println(INVALID_VALUE);
        } else {
            int totalSeconds = minutes*60 + seconds;
            int hours = totalSeconds / 3600;
            int hoursRemainderInSeconds = totalSeconds % 360;
            int minutesAfterHours = hoursRemainderInSeconds / 60;
            int minutesAfterHoursRemainderInSeconds = hoursRemainderInSeconds % 60;
            if (hours < 10 ) {
                if (minutesAfterHours < 10) {
                    if (minutesAfterHoursRemainderInSeconds < 10) {
                        System.out.println("0" + hours + "h " + "0" + minutesAfterHours + "m " + "0" + minutesAfterHoursRemainderInSeconds + "s");
                    } else {
                        System.out.println("0" + hours + "h " + "0" + minutesAfterHours + "m " + minutesAfterHoursRemainderInSeconds + "s");
                    }
                } else {
                    System.out.println("0" + hours + "h " + minutesAfterHours + "m " + minutesAfterHoursRemainderInSeconds + "s");
                }
            } else {
                System.out.println(hours + "h " + minutesAfterHours + "m " + minutesAfterHoursRemainderInSeconds + "s");
            }
        }
    }

    public static void getDurationString(int seconds) {
        if (seconds <= 0) {
            System.out.println(INVALID_VALUE);
        } else {
            int minutes = seconds/60;
            int secondsAfterMinutesRemainder = seconds % 60;
            getDurationString(minutes, secondsAfterMinutesRemainder);
        }
    }



}
