package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 17/11/2016.
 */
public class WorkingTest {

    Working workingState;
    Context ATM;

    @Before
    public void setUp(){
        workingState = new Working();
        ATM = new Context();
    }

    @Test
    public void doActionTest(){
        assertEquals("ATM is processing a transaction...", workingState.doAction(ATM));
    }

    @Test
    public void toStringTest(){
        assertEquals("Working state", workingState.toString());
    }
}
