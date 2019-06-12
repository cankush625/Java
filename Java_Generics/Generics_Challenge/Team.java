package com.Java_Generics.Generics_Challenge;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> { //we can also extend it by using interfaces
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private ArrayList<T> members = new ArrayList<>();

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            //System.out.println(((Player) player).getName() + " is already in the team"); //casting the type to Player (This is without extending T to the Player)
            System.out.println(player.getName() + " is already in the team"); //We are extending class to the player to getting rid of the casting
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " is picked for the team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {

        String message;

        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}

//by Ankush Chavan