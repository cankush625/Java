package com.Java_Generics.Generics_Challenge;

public class League_main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> FootballLeague = new League<>("UCL");
        Team<FootballPlayer> Barcelona = new Team<>("FC Barcelona");
        Team<FootballPlayer> Madrid = new Team<>("Real Madrid");
        Team<FootballPlayer> Manchester = new Team<>("Manchester City");
        //Team<CricketPlayer> India = new Team<>("India");

        Barcelona.matchResult(Madrid, 3, 2);
        Barcelona.matchResult(Manchester, 5, 3);

        FootballLeague.add(Barcelona);
        FootballLeague.add(Madrid);
        FootballLeague.add(Manchester);

        //Throws an error because we defined the league type as Team of FootballPlayer
        //FootballLeague.add(India);

        FootballLeague.showtable();
    }
}

//by Ankush Chavan