

import models.SharedLink;
import models.Member;
import org.junit.Test;
import play.test.UnitTest;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;
import static org.junit.Assert.*;

/**
 *
 * @author Sryl <cyril.lacote@gmail.com>
 */
public class PodamTest extends UnitTest {
    
    private PodamFactory factory = new PodamFactoryImpl();
    
    @Test
    public void test() {
        Member pojo = factory.manufacturePojo(Member.class);
        assertNotNull(pojo);
        assertNotNull(pojo.sharedLinks);
        for (SharedLink link : pojo.sharedLinks) {
            assertNotNull(link.name);
            assertNotNull(link.URL);
        }
    }
}
