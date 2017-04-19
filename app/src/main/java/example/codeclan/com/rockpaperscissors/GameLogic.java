package example.codeclan.com.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 19/04/2017.
 */

public class GameLogic {


    public static String computerChoiceMaker(){
        String[] choices = {"Rock","Paper","Scissors"};
        Random numbers = new Random();
        int randomIndex = numbers.nextInt(3);


        return choices[randomIndex];


    }

    public static String WinChecker(String userChoice, String computerChoice){
        if(userChoice.equals("Rock")){
            if(computerChoice.equals("Rock")){
                return "Draw";
            }
            else if(computerChoice.equals("Paper")){
                return "Computer Wins!";
            }
            else if(computerChoice.equals("Scissors") ){
                return "Player Wins!";
            }
        }
        else if(userChoice.equals("Paper")){
            if(computerChoice.equals("Rock") ){
                return "Player Wins!";
            }
            else if(computerChoice.equals("Paper")){
                return "Draw";
            }
            else if(computerChoice.equals("Scissors")){
                return "Computer Wins!";
            }
        }
        else{
            if(computerChoice.equals("Rock") ){
                return "Computer Wins!";
            }
            else if(computerChoice.equals("Paper") ){
                return "Player Wins!";
            }
            else if(computerChoice.equals("Scissors")){
                return "Draw";
            }
        }
        return null;
    }
}
