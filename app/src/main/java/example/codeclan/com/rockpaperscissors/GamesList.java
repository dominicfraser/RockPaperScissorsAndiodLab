package example.codeclan.com.rockpaperscissors;

import java.util.ArrayList;

/**
 * Created by user on 19/04/2017.
 */

public class GamesList {

    private ArrayList<GameResult> list;

    public GamesList(){
        list = new ArrayList<GameResult>();
    }

    public ArrayList<GameResult> getList(){
        return new ArrayList<GameResult>(list);
    }

    public void addToList(GameResult gameResult){
        list.add(gameResult);
    }

    public int sizeOfList(){
        return list.size();
    }
}


