import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import static org.junit.Assert.*;

public class Basket {
    Actions actions;
    WebDriver driver;
    String myFirstProductInBasketXpath="/html/body/div/div/div/div[2]/div/div[2]/section/section/div[3]/div/ul/li/div/div/div[1]/div[2]/div[2]/a";
    String mySecondProductInBasketXpath="/html/body/div[1]/div/div/div[2]/div/div[2]/section/section/div[4]/div/ul/li/div/div/div[1]/div[2]/div[2]/a";
    public Basket() {
        driver = Utils.getDriver();
        actions = new Actions(driver);
    }
    public void validate(){
        assertEquals(Products.product1Text, driver.findElement(By.xpath(myFirstProductInBasketXpath)).getText());
        assertEquals(Products.product2Text, driver.findElement(By.xpath(mySecondProductInBasketXpath)).getText());

    }
}
