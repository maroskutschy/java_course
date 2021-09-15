package com.ness;

public class Main11 {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team crows = new Team("Crows");
        crows.addPlayer(joe);
        crows.addPlayer(pat);
        crows.addPlayer(beckham);

        System.out.println(crows.numPlayers());


    }

}
