package example.codeclan.com.rockpaperscissors;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 19/04/2017.
 */

public class GameLogicTest {

    @Test
    public void testingGameLogicRock(){
        assertEquals( "Draw",GameLogic.WinChecker("Rock","Rock") );
        assertEquals( "Computer Wins!",GameLogic.WinChecker("Rock","Paper") );
        assertEquals( "Player Wins!",GameLogic.WinChecker("Rock","Scissors") );
        assertEquals( "Player Wins!",GameLogic.WinChecker("Paper","Rock") );
        assertEquals( "Computer Wins!",GameLogic.WinChecker("Scissors","Rock") );
    }

    
}
