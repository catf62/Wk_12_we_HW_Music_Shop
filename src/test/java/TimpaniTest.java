import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimpaniTest {

    Timpani boomBoomBooom1;

    @Before
    public void before(){
        boomBoomBooom1 = new Timpani(ItemType.PERCUSSION, "Copper",
                3, "Boom Boom Boom 1", 300.00, 500.00);
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

    @Test
    public void canGetType(){
        assertEquals(ItemType.PERCUSSION, boomBoomBooom1.getType());
    }

    @Test
    public void canGetPrimaryMaterial(){
        assertEquals("Copper", boomBoomBooom1.getPrimaryMaterial());
    }

    @Test
    public void canSetType(){
        boomBoomBooom1.setType(ItemType.BRASS);
        assertEquals(ItemType.BRASS, boomBoomBooom1.getType());
    }

    @Test
    public void canSetPrimaryMaterial(){
        boomBoomBooom1.setPrimaryMaterial("Plastic");
        assertEquals("Plastic", boomBoomBooom1.getPrimaryMaterial());
    }

    @Test
    public void canGetName(){
        assertEquals("Boom Boom Boom 1", boomBoomBooom1.getName());
    }

    @Test
    public void canPlay(){
        assertEquals("Now playing Boom Boom Boom 1", boomBoomBooom1.play());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(300.00, boomBoomBooom1.getBuyPrice(), 0.001);
    }

    @Test
    public void canSetBuyPrice(){
        boomBoomBooom1.setBuyPrice(20.00);
        assertEquals(20.00, boomBoomBooom1.getBuyPrice(), 0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(500.00, boomBoomBooom1.getSellPrice(), 0.001);
    }

    @Test
    public void canSetSellPrice(){
        boomBoomBooom1.setSellPrice(30.00);
        assertEquals(30.00, boomBoomBooom1.getSellPrice(), 0.001);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(60.00, boomBoomBooom1.calculateMarkUp(), 0.001);
    }


}
