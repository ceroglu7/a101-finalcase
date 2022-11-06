package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.Set;

public class ProductsPageStep {
    Actions actions;
    WebDriver driver;
    public static String product1Text;
    public static String product2Text;
    String clickFirstProductXpath = "/html/body/div[3]/main/div[2]/div/div[6]/div[2]/div[2]/div[4]/div/div/div/div/div/div/ul/li[3]/div/a/div[2]/h3";
    String addCartButtonXpath = "/html/body/div[2]/main/div[3]/section[1]/div[3]/div/div[4]/div[1]/div[7]/form/span/button";
    String productTextXpath = "/html/body/div[2]/main/div[3]/section[1]/div[3]/div/div[4]/div[1]/header/h1";
    String secondMerchandXpath = "/html/body/div[2]/main/div[3]/section[1]/div[3]/div/div[4]/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/td[2]/span";
    String basketButtonXpath="/html/body/div[2]/div[2]/div[1]/div/div/div/div/div[2]/div[3]/a/span[2]";
    public ProductsPageStep() {
        driver = Utils.getDriver();
        actions = new Actions(driver);
    }
    public void clickAndAddTheBasket() {
        driver.findElement(By.xpath(clickFirstProductXpath)).click();
        focusNewTab();
        driver.findElement(By.xpath(addCartButtonXpath)).click();
        product1Text = driver.findElement(By.xpath(productTextXpath)).getText();
        driver.findElement(By.xpath(secondMerchandXpath)).click();
        driver.findElement(By.xpath(addCartButtonXpath)).click();
        product2Text =driver.findElement(By.xpath(productTextXpath)).getText();
        driver.findElement(By.xpath(basketButtonXpath)).click();
    }
    public void focusNewTab() {
        String Parent_id = driver.getWindowHandle();
        Set<String> Child_id = driver.getWindowHandles();
        for (String a : Child_id) {

            if (Parent_id.equals(a)) {
            }
            else {
                driver.switchTo().window(a);
            }
        }
    }
}
