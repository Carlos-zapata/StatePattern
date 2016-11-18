package mx.iteso;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple State.
 */
public class StandByTest {

    StandBy StandByState;
    Context ATM;

    @Before
    public void setUp(){
        StandByState = new StandBy();
        ATM = new Context();
    }

    @Test
    public void doActionTest(){
        assertEquals("ATM is waiting to be used...", StandByState.doAction(ATM));
    }

    @Test
    public void toStringTest(){
        assertEquals("StandBy state", StandByState.toString());
    }
}