import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ScenarioTest {
    Search search=new Search();
    Products products=new Products();
    @Before
    public void setUp(){
    }

    @Test
    public void scenario() throws InterruptedException {
        search.searchTextBoxTexting();
        products.clickTheProduct();
    }

    @After
    public void finish(){
    }
}


