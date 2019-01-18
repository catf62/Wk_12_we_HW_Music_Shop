import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimpaniTest {

    Timpani boomBoomBooom1;

    @Before
    public void before(){
        boomBoomBooom1 = new Timpani(3);
    }

    @Test
    public void canGetNumberOfDrums(){
        assertEquals(3, boomBoomBooom1.getNumberOfDrums().intValue());
    }

    @Test
    public void canSetNumberOfDrums(){
        boomBoomBooom1.setNumberOfDrums(5);
        assertEquals(5, boomBoomBooom1.getNumberOfDrums().intValue());
    }
}
