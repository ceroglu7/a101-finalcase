import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ScenarioTest {
    Search search=new Search();
    Products products=new Products();
    Basket basket=new Basket();
    @Before
    public void setUp(){
    }

    @Test
    public void scenario() {
        search.searchTextBoxTexting();
        products.clickAndAddTheBasket();
        basket.validate();
    }
    @After
    public void finish(){
    }
}


