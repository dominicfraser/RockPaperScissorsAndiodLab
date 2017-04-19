package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class GameResultsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.games_results_list);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
//        GamesList gamesList = extras.getParcelableArrayList("gamesList");




    }
}
