package com.Java_Generics.Generics_class;

import java.util.ArrayList;

public class Team {
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

    private ArrayList<Player> members = new ArrayList<>();

    public boolean addPlayer(Player player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already in the team");
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
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }
        played++;
        if (opponent != null) {
            matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}

//by Ankush Chavan