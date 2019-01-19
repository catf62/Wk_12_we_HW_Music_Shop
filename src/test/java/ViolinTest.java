import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin stradivarius1;

    @Before
    public void before(){
        stradivarius1 = new Violin(ItemType.STRINGS, "Wood",
                3, "Stradivarius 1", 500.00, 750.00);
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

    @Test
    public void canGetBuyPrice(){
        assertEquals(500.00, stradivarius1.getBuyPrice(), 0.001);
    }

    @Test
    public void canSetBuyPrice(){
        stradivarius1.setBuyPrice(20.00);
        assertEquals(20.00, stradivarius1.getBuyPrice(), 0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(750.00, stradivarius1.getSellPrice(), 0.001);
    }

    @Test
    public void canSetSellPrice(){
        stradivarius1.setSellPrice(30.00);
        assertEquals(30.00, stradivarius1.getSellPrice(), 0.001);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(66.67, stradivarius1.calculateMarkUp(), 0.001);
    }


}
