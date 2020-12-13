package batwordpresstest;

import org.junit.Test;
import batwordpress.BatWordpress;

/**
 *
 * @author jescobarsamurio
 */
public class BatWordpressTest {
    
    BatWordpress b= new BatWordpress();
    
    @Test
	public void testMain() throws Exception {
		b.main();
	}
}
