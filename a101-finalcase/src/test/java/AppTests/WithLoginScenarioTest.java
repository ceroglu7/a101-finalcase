package AppTests;
import Steps.BasketPageStep;
import Steps.LoginPageStep;
import Steps.ProductsPageStep;
import Steps.MainPageStep;
import org.junit.Test;
public class WithLoginScenarioTest {

    MainPageStep mainPageStep =new MainPageStep();
    ProductsPageStep productsPageStep =new ProductsPageStep();
    BasketPageStep basketPageStep =new BasketPageStep();
    LoginPageStep loginPageStep=new LoginPageStep();
    @Test
    public void scenarioWithLogIn() {
        loginPageStep.homePageUrl();
        loginPageStep.loggingIn();
        loginPageStep.validate();
        mainPageStep.searchTextBoxTexting();
        productsPageStep.clickAndAddTheBasket();
        basketPageStep.validate();
    }
}
