package example.codeclan.com.rockpaperscissors;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

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

    @Test
    public void testingGameLogicPaper(){
        assertEquals( "Draw",GameLogic.WinChecker("Paper","Paper") );
        assertEquals( "Computer Wins!",GameLogic.WinChecker("Paper","Scissors") );
        assertEquals( "Player Wins!",GameLogic.WinChecker("Paper","Rock") );
        assertEquals( "Player Wins!",GameLogic.WinChecker("Scissors","Paper") );
        assertEquals( "Computer Wins!",GameLogic.WinChecker("Rock","Paper") );
    }

    @Test
    public void testingGameLogicScissor(){
        assertEquals( "Draw",GameLogic.WinChecker("Scissors","Scissors") );
        assertEquals( "Computer Wins!",GameLogic.WinChecker("Scissors","Rock") );
        assertEquals( "Player Wins!",GameLogic.WinChecker("Scissors","Paper") );
        assertEquals( "Player Wins!",GameLogic.WinChecker("Rock","Scissors") );
        assertEquals( "Computer Wins!",GameLogic.WinChecker("Paper","Scissors") );
    }

    @Test
    public void randomReturnsString(){
        assertNotNull(GameLogic.computerChoiceMaker());
    }

}
