import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CorAnglaisTest {

    CorAnglais corAnglais1;

    @Before
    public void before(){
        corAnglais1 = new CorAnglais(ItemType.WOODWIND, "Wood","Reedy Reed");
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

}
