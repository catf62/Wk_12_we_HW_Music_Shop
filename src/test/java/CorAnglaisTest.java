import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CorAnglaisTest {

    CorAnglais corAnglais1;

    @Before
    public void before(){
        corAnglais1 = new CorAnglais(ItemType.WOODWIND, "Wood",
                "Reedy Reed", "Cor Anglais 1", 250.00, 400.00);
    }

    @Test
    public void canGetReedType(){
        assertEquals("Reedy Reed", corAnglais1.getReedType());
    }

    @Test
    public void canSetReedType(){
        corAnglais1.setReedType("Super Awesome Reed");
        assertEquals("Super Awesome Reed", corAnglais1.getReedType());
    }

    @Test
    public void canGetType(){
        assertEquals(ItemType.WOODWIND, corAnglais1.getType());
    }

    @Test
    public void canGetPrimaryMaterial(){
        assertEquals("Wood", corAnglais1.getPrimaryMaterial());
    }

    @Test
    public void canSetType(){
        corAnglais1.setType(ItemType.BRASS);
        assertEquals(ItemType.BRASS, corAnglais1.getType());
    }

    @Test
    public void canSetPrimaryMaterial(){
        corAnglais1.setPrimaryMaterial("Plastic");
        assertEquals("Plastic", corAnglais1.getPrimaryMaterial());
    }

    @Test
    public void canGetName(){
        assertEquals("Cor Anglais 1", corAnglais1.getName());
    }

    @Test
    public void canPlay(){
        assertEquals("Now playing Cor Anglais 1", corAnglais1.play());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(250.00, corAnglais1.getBuyPrice(), 0.001);
    }

    @Test
    public void canSetBuyPrice(){
        corAnglais1.setBuyPrice(20.00);
        assertEquals(20.00, corAnglais1.getBuyPrice(), 0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(400.00, corAnglais1.getSellPrice(), 0.001);
    }

    @Test
    public void canSetSellPrice(){
        corAnglais1.setSellPrice(30.00);
        assertEquals(30.00, corAnglais1.getSellPrice(), 0.001);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(62.50, corAnglais1.calculateMarkUp(), 0.001);
    }

    @Test
    public void canReturnMarkUpAsCash(){
        assertEquals(150.00, corAnglais1.returnMarkUpAsCash(), 0.001);
    }

}
