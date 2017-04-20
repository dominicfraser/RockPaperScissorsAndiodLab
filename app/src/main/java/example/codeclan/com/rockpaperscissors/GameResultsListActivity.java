package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class GameResultsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.games_results_list);
        Log.d(getClass().toString(), "onCreate for GameResultsList");

        Intent intent = getIntent();
        Log.d(getClass().toString(), "got Intent");

        Bundle extras = intent.getExtras();
        Log.d(getClass().toString(), "bundled extras");


//        GameResult pGamesResult = extras.getParcelable("SingleGameResultObject");

//          trying to do it for arraylist??
        GamesList gamesList = extras.getParcelable("gamesList");
        Log.d(getClass().toString(), "got Parcelable");


//        ArrayList<GameResult> tempList = new ArrayList<GameResult>();
//        tempList.add(pGamesResult);
//        GamesListAdapter gamesListAdapter = new GamesListAdapter(this, tempList);

        GamesListAdapter gamesListAdapter = new GamesListAdapter(this, gamesList.getList());
        Log.d(getClass().toString(), "made games list adaptor");


        ListView listView = (ListView) findViewById(R.id.games_results_list);
        Log.d(getClass().toString(), "found listview");

        listView.setAdapter(gamesListAdapter);

    }
}

