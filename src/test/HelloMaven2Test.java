import static org.junit.Assert.*;

/**
 * Created by tafaz on 8/8/2017.
 */
public class HelloMaven2Test {
    @org.junit.Test
    public void getName1() throws Exception {
        HelloMaven2 hm = new HelloMaven("HeloMaven");
	HelloMaven2 hm2 = new HelloMaven("Helo");
        assertEquals("HelloMaven", hm.getName());
	assertEquals("Hello", hm2.getName());

    }

}
