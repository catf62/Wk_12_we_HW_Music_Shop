import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReedTest {
    Reed reedyReed1;

    @Before
    public void before(){
        reedyReed1 = new Reed(ItemType.ACCESSORIES, 10.00, 15.00, "Reedy Reedo");
    }

    @Test
    public void canGetType(){
        assertEquals(ItemType.ACCESSORIES, reedyReed1.getItemType());
    }

    @Test
    public void canSetType(){
        reedyReed1.setType(ItemType.PERCUSSION);
        assertEquals(ItemType.PERCUSSION, reedyReed1.getItemType());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(10.00, reedyReed1.getBuyPrice(), 0.001);
    }

    @Test
    public void canSetBuyPrice(){
        reedyReed1.setBuyPrice(20.00);
        assertEquals(20.00, reedyReed1.getBuyPrice(), 0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(15.00, reedyReed1.getSellPrice(), 0.001);
    }

    @Test
    public void canSetSellPrice(){
        reedyReed1.setSellPrice(30.00);
        assertEquals(30.00, reedyReed1.getSellPrice(), 0.001);
    }

    @Test
    public void canName(){
        assertEquals("Reedy Reedo", reedyReed1.getName());
    }

    @Test
    public void canGetName(){
        reedyReed1.setName("Boggy Reed");
        assertEquals("Boggy Reed", reedyReed1.getName());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(66.67, reedyReed1.calculateMarkUp(), 0.001);
    }
}
