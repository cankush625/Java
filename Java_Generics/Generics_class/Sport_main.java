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

        Team_by_providing_type<CricketPlayer> SuperCric = new Team_by_providing_type<>("Super Cric");
        SuperCric.addPlayer(sachin);
//        SuperCric.addPlayer(lionel); //Throws an error because type is specified to add Cricket Players only
//        SuperCric.addPlayer(roger);

        System.out.println(SuperCric.numPlayers());

        Team_by_providing_type<FootballPlayer> Barca = new Team_by_providing_type<>("BarcaMagica");
        Barca.addPlayer(lionel);
        FootballPlayer suarez = new FootballPlayer("Suarez");
        FootballPlayer rooney = new FootballPlayer("Rooney");
        Barca.addPlayer(suarez);
        Barca.addPlayer(rooney);

        Team_by_providing_type<FootballPlayer> Madrid = new Team_by_providing_type<>("RealMadrid");
        FootballPlayer ronaldo = new FootballPlayer("Ronaldo");
        FootballPlayer bale = new FootballPlayer("Bale");
        FootballPlayer ramos = new FootballPlayer("Ramos");
        Madrid.addPlayer(ronaldo);
        Madrid.addPlayer(bale);
        Madrid.addPlayer(ramos);

        Team_by_providing_type<TenisPlayer> Aussie = new Team_by_providing_type<>("GrandAussie");
        Aussie.addPlayer(roger);
        System.out.println(Aussie.numPlayers());

        Barca.matchResult(Madrid, 3, 2);
        Barca.matchResult(Aussie, 5, 3);

        Madrid.matchResult(Aussie, 3, 3);

        System.out.println("Ranking : ");
        System.out.println(Barca.getName() + " : " + Barca.ranking());
        System.out.println(Madrid.getName() + " : " + Madrid.ranking());
        System.out.println(Aussie.getName() + " : " + Aussie.ranking());

        System.out.println(Barca.compareTo(Madrid));
        System.out.println(Madrid.compareTo(Barca));
    }
}

//by Ankush Chavan