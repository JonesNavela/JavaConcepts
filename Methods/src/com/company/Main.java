package com.company;

public class Main {

	public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // Create a method called displayHighScorePosition
        // it should have a players name as a parameter, and a 2nd parameter as a position in the high score table
        // you should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table."
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        //it should return an int
        // the return data should be
        // 1 if the score is > 100
        // 2 if the score is > 500 and < 1000
        // 3 if the score is > 100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400, and 50
        // there's actually a logic hole, try finding it in the code

        int scorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Jones", scorePosition);

        scorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Thembi", scorePosition);

        scorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Tim", scorePosition);

        scorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Tom", scorePosition);

    }

    public static void displayHighScorePosition (String playerName, int scorePosition) {
        System.out.println( playerName + " managed to get into position " + scorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition ( int playerScore) {
	    if (playerScore >= 1000){
	        return 1;
        } else if (playerScore >= 500) {
	        return 2;
        } else if (playerScore >= 100) {
	        return 3;
        } else {
	        return 4;
        }
    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {
	    if (gameOver) {
	        int finalScore = score + (levelCompleted * bonus);
	        finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

}
