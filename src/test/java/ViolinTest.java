import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin stradivarius1;

    @Before
    public void before(){
        stradivarius1 = new Violin(ItemType.STRINGS, "Wood", 3, "Stradivarius 1");
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

    @Test
    public void canGetType(){
        assertEquals(ItemType.STRINGS, stradivarius1.getType());
    }

    @Test
    public void canGetPrimaryMaterial(){
        assertEquals("Wood", stradivarius1.getPrimaryMaterial());
    }

    @Test
    public void canSetType(){
        stradivarius1.setType(ItemType.PERCUSSION);
        assertEquals(ItemType.PERCUSSION, stradivarius1.getType());
    }

    @Test
    public void canSetPrimaryMaterial(){
        stradivarius1.setPrimaryMaterial("Plastic");
        assertEquals("Plastic", stradivarius1.getPrimaryMaterial());
    }

    @Test
    public void canGetName(){
        assertEquals("Stradivarius 1", stradivarius1.getName());
    }

    @Test
    public void canPlay(){
        assertEquals("Now playing Stradivarius 1", stradivarius1.play());
    }



}
