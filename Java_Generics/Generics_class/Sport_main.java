package com.Java_Generics.Generics_class;

public class Sport_main {
    public static void main(String[] args) {
        CricketPlayer sachin = new CricketPlayer("Sachin");
        FootballPlayer lionel = new FootballPlayer("Lionel");
        TenisPlayer roger = new TenisPlayer("Roger");

        Team bestInWorld = new Team("Best In World");
        bestInWorld.addPlayer(sachin);
        bestInWorld.addPlayer(lionel);
        bestInWorld.addPlayer(roger);

        System.out.println(bestInWorld.numPlayers());
    }
}
