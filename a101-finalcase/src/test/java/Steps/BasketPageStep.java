package Steps;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BasketPageStep {
    final static Logger logger = Logger.getLogger(LoginPageStep.class);
    Actions actions;
    WebDriver driver;
    String myProductInBasketXpath="/html/body/div/div/div/div[2]/div/div[2]/section/section/div[3]/div/ul/li/div/div/div[1]/div[2]/div[2]/a";
    public BasketPageStep() {
        driver = Utils.getDriver();
        actions = new Actions(driver);
    }
    public void validate(){
        Assert.assertEquals(ProductsPageStep.product1Text, driver.findElement(By.xpath(myProductInBasketXpath)).getText());
        logger.info("Seçilen ilk ürün adı: "+ProductsPageStep.product1Text+" ve Sepetteki ilk ürün adı: "+driver.findElement(By.xpath(myProductInBasketXpath)).getText());
    }
}
