package com.Expression_Statement_CodeBLock_and_Methods;

public class method_challenge {
    public static void main(String[] args){
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Ankush", position);

        position = calculateHighScorePosition(501);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(750);
        displayHighScorePosition("Mark", position);

        position = calculateHighScorePosition(350);
        displayHighScorePosition("Denis", position);

        position = calculateHighScorePosition(80);
        displayHighScorePosition("James", position);
    }

    public static void displayHighScorePosition(String player_name, int position){
        System.out.println(player_name + " manage to get into position "+position+ " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        }else if(playerScore >= 500 && playerScore < 1000){
            return 2;
        }else if(playerScore >= 100 && playerScore < 500){
            return 3;
        }else{
            return 4;
        }
    }
}
