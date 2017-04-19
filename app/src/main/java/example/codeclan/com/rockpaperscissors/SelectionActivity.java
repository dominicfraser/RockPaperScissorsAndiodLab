package example.codeclan.com.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SelectionActivity extends AppCompatActivity {

    private TextView title_and_result;
    private TextView computerChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        Log.d(getClass().toString(), "onCreate for Selection");

        title_and_result = (TextView) findViewById(R.id.title_and_result);
        computerChoice = (TextView) findViewById(R.id.computerChoice);
    }

    public void onRockClick(View text){
        Log.d(getClass().toString(), "onRockClick clicked");

        String selection = "Rock";
        String computerSelection = GameLogic.computerChoiceMaker();
        String result = GameLogic.WinChecker(selection, computerSelection);

        title_and_result.setText(result);
        computerChoice.setText("Computer chose: " + computerSelection);



    }

    public void onPaperClick(View text){
        Log.d(getClass().toString(), "onPaperClick clicked");

        String selection = "Paper";
        String computerSelection = GameLogic.computerChoiceMaker();
        String result = GameLogic.WinChecker(selection, computerSelection);

        title_and_result.setText(result);
        computerChoice.setText("Computer chose: " + computerSelection);
    }

    public void onScissorsClick(View text){
        Log.d(getClass().toString(), "onScissorsClick clicked");

        String selection = "Scissors";
        String computerSelection = GameLogic.computerChoiceMaker();
        String result = GameLogic.WinChecker(selection, computerSelection);

        title_and_result.setText(result);
        computerChoice.setText("Computer chose: " + computerSelection);
    }
}