import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinStringTest {
    ViolinString string1;

    @Before
    public void before(){
        string1 = new ViolinString(ItemType.ACCESSORIES, 10.00, 15.00, "Best Cat Gut Ever");
    }

    @Test
    public void canGetType(){
        assertEquals(ItemType.ACCESSORIES, string1.getItemType());
    }

    @Test
    public void canSetType(){
        string1.setType(ItemType.PERCUSSION);
        assertEquals(ItemType.PERCUSSION, string1.getItemType());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(10.00, string1.getBuyPrice(), 0.001);
    }

    @Test
    public void canSetBuyPrice(){
        string1.setBuyPrice(20.00);
        assertEquals(20.00, string1.getBuyPrice(), 0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(15.00, string1.getSellPrice(), 0.001);
    }

    @Test
    public void canSetSellPrice(){
        string1.setSellPrice(30.00);
        assertEquals(30.00, string1.getSellPrice(), 0.001);
    }

    @Test
    public void canName(){
        assertEquals("Best Cat Gut Ever", string1.getName());
    }

    @Test
    public void cangetName(){
        string1.setName("Cruelty Free String");
        assertEquals("Cruelty Free String", string1.getName());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(66.67, string1.calculateMarkUp(), 0.001);
    }
}
