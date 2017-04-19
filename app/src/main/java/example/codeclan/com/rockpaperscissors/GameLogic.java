package example.codeclan.com.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 19/04/2017.
 */

public class GameLogic {


    public static String computerChoiceMaker() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random numbers = new Random();
        int randomIndex = numbers.nextInt(3);


        return choices[randomIndex];


    }

    public static String WinChecker(String userChoice, String computerChoice) {
        switch (userChoice) {
            case "Rock":
                if (!computerChoice.equals("Rock")) {
                    return (computerChoice.equals("Paper") ? "Computer Wins!" : "Player Wins!");
                }
                break;
            case "Paper":
                if (!computerChoice.equals("Paper")) {
                    return (computerChoice.equals("Rock") ? "Player Wins!" : "Computer Wins!");
                }
                break;
            case "Scissors":
                if (!computerChoice.equals("Scissors")) {
                    return (computerChoice.equals("Rock") ? "Computer Wins!" : "Player Wins!");
                }
                break;
        }
        return "Draw";
    }
}
