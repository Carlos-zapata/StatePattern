package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 17/11/2016.
 */
public class DeliveringCashTest {

    DeliveringCash deliveringCash;
    Context ATM;

    @Before
    public void setUp(){
        deliveringCash = new DeliveringCash();
        ATM = new Context();
    }

    @Test
    public void doActionTest(){
        assertEquals("ATM is delivering $1,000 USD...", deliveringCash.doAction(ATM));
    }

    @Test
    public void toStringTest(){
        assertEquals("Delivering cash state", deliveringCash.toString());
    }
}
