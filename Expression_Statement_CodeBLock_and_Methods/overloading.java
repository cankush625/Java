package com.Expression_Statement_CodeBLock_and_Methods;

public class overloading {
    public static void main(String[] args){
        int newScore = calculateScore("Ankush", 798);
        System.out.println("The new score is "+newScore);

        calculateScore(786);
        calculateScore();
    }

    public static int calculateScore(String player_name, int score){
        System.out.println("Player "+player_name+" has score "+score+" points");
        return score * 100;
    }

    public static int calculateScore(int score){
        System.out.println("The unnamed player has score "+score+" points");
        return score * 100;
    }

    public static int calculateScore(){
        System.out.println("No player, No player score");
        return 0;
    }
}
