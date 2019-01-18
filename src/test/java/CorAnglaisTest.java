import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CorAnglaisTest {

    CorAnglais corAnglais1;

    @Before
    public void before(){
        corAnglais1 = new CorAnglais("Reedy Reed");
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

}
