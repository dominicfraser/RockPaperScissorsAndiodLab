package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SelectionActivity extends AppCompatActivity {

    private TextView title_and_result;
    private TextView computerChoice;
    private int computerScore;
    private int playerScore;
    private TextView computer_score;
    private TextView player_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        Log.d(getClass().toString(), "onCreate for Selection");

        title_and_result = (TextView) findViewById(R.id.title_and_result);
        computerChoice = (TextView) findViewById(R.id.computerChoice);
        computer_score = (TextView) findViewById(R.id.computer_score);
        player_score = (TextView) findViewById(R.id.player_score);

        int computerScore = 0;
        int playerScore = 0;

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
    }

    public void onRockClick(View text){
        Log.d(getClass().toString(), "onRockClick clicked");

        String selection = "Rock";
        String computerSelection = GameLogic.computerChoiceMaker();
        String result = GameLogic.WinChecker(selection, computerSelection);

        title_and_result.setText(result);
        computerChoice.setText("Computer chose: " + computerSelection);
        updateScore(result);
    }

    public void onPaperClick(View text){
        Log.d(getClass().toString(), "onPaperClick clicked");

        String selection = "Paper";
        String computerSelection = GameLogic.computerChoiceMaker();
        String result = GameLogic.WinChecker(selection, computerSelection);

        title_and_result.setText(result);
        computerChoice.setText("Computer chose: " + computerSelection);
        updateScore(result);
    }

    public void onScissorsClick(View text){
        Log.d(getClass().toString(), "onScissorsClick clicked");

        String selection = "Scissors";
        String computerSelection = GameLogic.computerChoiceMaker();
        String result = GameLogic.WinChecker(selection, computerSelection);

        title_and_result.setText(result);
        computerChoice.setText("Computer chose: " + computerSelection);
        updateScore(result);
    }

    public void updateScore(String result) {
        if (result.equals("Computer Wins!")) {
            computerScore += 1;
            String newComputerScore = String.valueOf(computerScore);
            computer_score.setText(newComputerScore);
        } else if (result.equals("Player Wins!")) {
            playerScore += 1;
            String newPlayerScore = String.valueOf(playerScore);
            player_score.setText(newPlayerScore);
        }
    }
}