package com.ness;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main11 {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> crows = new Team<>("Crows");
        crows.addPlayer(joe);
       // crows.addPlayer(pat);
       // crows.addPlayer(beckham);

        System.out.println(crows.numPlayers());

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");
        baseballPlayerTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("bad");
        brokenTeam.addPlayer(beckham);

        // will not work
        //Team<BaseballPlayer> bulls = new Team<>("Bulls");
        Team<FootballPlayer> bulls = new Team<>("Bulls");
        crows.matchResult(bulls, 1,0);
        crows.matchResult(bulls, 0, 2);

        System.out.println("Rankings");
        System.out.println(crows.getName() + ": " + crows.ranking());
        System.out.println(bulls.getName() + ": " + bulls.ranking());

        System.out.println(crows.compareTo(bulls));

        ArrayList<Team> teams;
        //Collections.sort(teams);

    }

}
