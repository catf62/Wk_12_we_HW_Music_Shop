import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin stradivarius1;

    @Before
    public void before(){
        stradivarius1 = new Violin(3);
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(3, stradivarius1.getNumberOfStrings().intValue());
    }

    @Test
    public void canSetNumberOfStrings(){
        stradivarius1.setNumberOfStrings(4);
        assertEquals(4, stradivarius1.getNumberOfStrings().intValue());
    }

}
