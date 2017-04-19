package example.codeclan.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 19/04/2017.
 */

public class GamesListTest {

    private GamesList gamesList;

    @Before
    public void before(){
        gamesList = new GamesList();
    }

    @Test
    public void canAddGamesResult(){
        gamesList.addToList(new GameResult("user choice","computer choice","result"));
        assertEquals(1,gamesList.sizeOfList());
    }

    @Test
    public void canAddMultipleGamesResults(){
        gamesList.addToList(new GameResult("user choice","computer choice","result1"));
        gamesList.addToList(new GameResult("user choice","computer choice","result2"));
        gamesList.addToList(new GameResult("user choice","computer choice","result3"));
        assertEquals(3,gamesList.sizeOfList());
    }

    @Test
    public void canGetUserChoiceFromList(){
        gamesList.addToList(new GameResult("Rock","computer choice","result1"));
        gamesList.addToList(new GameResult("Paper","computer choice","result2"));
        String userChoice =  gamesList.entry(1).getPlayerChoice();
        assertEquals("Paper",userChoice);
    }

}
