package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BasketPageStep {
    Actions actions;
    WebDriver driver;
    String myFirstProductInBasketXpath="/html/body/div/div/div/div[2]/div/div[2]/section/section/div[3]/div/ul/li/div/div/div[1]/div[2]/div[2]/a";
    String mySecondProductInBasketXpath="/html/body/div[1]/div/div/div[2]/div/div[2]/section/section/div[4]/div/ul/li/div/div/div[1]/div[2]/div[2]/a";
    public BasketPageStep() {
        driver = Utils.getDriver();
        actions = new Actions(driver);
    }
    public void validate(){
        Assert.assertEquals(ProductsPageStep.product1Text, driver.findElement(By.xpath(myFirstProductInBasketXpath)).getText());
        Assert.assertEquals(ProductsPageStep.product2Text, driver.findElement(By.xpath(mySecondProductInBasketXpath)).getText());

    }
}
