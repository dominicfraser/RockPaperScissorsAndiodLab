package example.codeclan.com.rockpaperscissors;

/**
 * Created by user on 19/04/2017.
 */

public class GameResult {

    private String playerChoice;
    private String computerChoice;
    private String result;

    public GameResult(String playerChoice, String computerChoice, String result){
        this.playerChoice = playerChoice;
        this.computerChoice = computerChoice;
        this.result = result;
    }

    public String getPlayerChoice(){
        return this.playerChoice;
    }

    public String getComputerChoice(){
        return this.computerChoice;
    }

    public String getResult(){
        return this.result;
    }


}
