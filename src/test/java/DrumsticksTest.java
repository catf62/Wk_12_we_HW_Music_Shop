import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    Drumsticks taikoSticks;

    @Before
    public void before(){
        taikoSticks = new Drumsticks(ItemType.ACCESSORIES, 10.00, 15.00, "Taiko Drumming Sticks");
    }

    @Test
    public void canGetType(){
        assertEquals(ItemType.ACCESSORIES, taikoSticks.getItemType());
    }

    @Test
    public void canSetType(){
        taikoSticks.setType(ItemType.PERCUSSION);
        assertEquals(ItemType.PERCUSSION, taikoSticks.getItemType());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(10.00, taikoSticks.getBuyPrice(), 0.001);
    }

    @Test
    public void canSetBuyPrice(){
        taikoSticks.setBuyPrice(20.00);
        assertEquals(20.00, taikoSticks.getBuyPrice(), 0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(15.00, taikoSticks.getSellPrice(), 0.001);
    }

    @Test
    public void canSetSellPrice(){
        taikoSticks.setSellPrice(30.00);
        assertEquals(30.00, taikoSticks.getSellPrice(), 0.001);
    }

    @Test
    public void canName(){
        assertEquals("Taiko Drumming Sticks", taikoSticks.getName());
    }

    @Test
    public void canGetName(){
        taikoSticks.setName("Super Fat Sticks");
        assertEquals("Super Fat Sticks", taikoSticks.getName());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(66.67, taikoSticks.calculateMarkUp(), 0.001);
    }
}
