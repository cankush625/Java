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

        Team_by_providing_class<CricketPlayer> SuperCric = new Team_by_providing_class<>("Super Cric");
        SuperCric.addPlayer(sachin);
//        SuperCric.addPlayer(lionel); //Throws an error because type is specified to add Cricket Players only
//        SuperCric.addPlayer(roger);

        System.out.println(SuperCric.numPlayers());

        Team_by_providing_class<FootballPlayer> Barca = new Team_by_providing_class<>("BarcaMagica");
        Barca.addPlayer(lionel);
        FootballPlayer suarez = new FootballPlayer("Suarez");
        FootballPlayer rooney = new FootballPlayer("Rooney");
        Barca.addPlayer(suarez);
        Barca.addPlayer(rooney);

        Team_by_providing_class<FootballPlayer> Madrid = new Team_by_providing_class<>("RealMadrid");
        FootballPlayer ronaldo = new FootballPlayer("Ronaldo");
        FootballPlayer bale = new FootballPlayer("Bale");
        FootballPlayer ramos = new FootballPlayer("Ramos");
        Madrid.addPlayer(ronaldo);
        Madrid.addPlayer(bale);
        Madrid.addPlayer(ramos);

        Team_by_providing_class<TenisPlayer> Aussie = new Team_by_providing_class<>("GrandAussie");
        Aussie.addPlayer(roger);
        System.out.println(Aussie.numPlayers());

        Barca.matchResult(Madrid, 3, 2);
        Barca.matchResult(Aussie, 5, 3);

        Madrid.matchResult(Aussie, 3, 3);
    }
}

//by Ankush Chavan