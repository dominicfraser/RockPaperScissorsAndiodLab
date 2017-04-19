package example.codeclan.com.rockpaperscissors;

import android.content.Context;
import android.graphics.Movie;

import java.util.ArrayList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * Created by user on 19/04/2017.
 */

public class GamesListAdaptor extends ArrayAdapter<GameResult> {

    public GamesListAdaptor(Context context, ArrayList<GameResult> results){
        super(context, 0, results);

    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.game_result, parent, false);
        }

        GameResult gameResult = getItem(position);

        TextView result = (TextView) listItemView.findViewById(R.id.result);
        result.setText(gameResult.getResult().toString());


        TextView choices = (TextView) listItemView.findViewById(R.id.choices);
        String playerChoice = gameResult.getPlayerChoice().toString();
        String computerChoice = gameResult.getComputerChoice().toString();

        choices.setText("Player: " + playerChoice + " Computer: " + computerChoice);


        listItemView.setTag(gameResult);

        return listItemView;
    }
}
