package AppTests;
import Steps.BasketPageStep;
import Steps.ProductsPageStep;
import Steps.MainPageStep;
import org.junit.Test;

public class WithoutLoginScenarioTest {
    MainPageStep mainPageStep =new MainPageStep();
    ProductsPageStep productsPageStep =new ProductsPageStep();
    BasketPageStep basketPageStep =new BasketPageStep();
    @Test
    public void scenario() {
        mainPageStep.homePageUrl();
        mainPageStep.acceptCookies();
        mainPageStep.searchTextBoxTexting();
        productsPageStep.clickAndAddTheBasket();
        basketPageStep.validate();
    }
}
