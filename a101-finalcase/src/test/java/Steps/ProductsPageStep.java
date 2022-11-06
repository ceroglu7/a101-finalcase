package Steps;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.Set;

public class ProductsPageStep {
    final static Logger logger = Logger.getLogger(LoginPageStep.class);
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
        logger.info("Bulunan ürüne tıklandı.");
        focusNewTab();
        logger.info("Açılan yeni sekmeye odaklanıldı.");
        driver.findElement(By.xpath(addCartButtonXpath)).click();
        logger.info("Ürün sepete eklendi.");
        product1Text = driver.findElement(By.xpath(productTextXpath)).getText();
        logger.info("Eklenen ilk ürünün adı: "+product1Text);
        driver.findElement(By.xpath(secondMerchandXpath)).click();
        logger.info("İkinci satıcıya tıklandı.");
        driver.findElement(By.xpath(addCartButtonXpath)).click();
        logger.info("Ürün sepete eklendi.");
        product2Text =driver.findElement(By.xpath(productTextXpath)).getText();
        logger.info("Eklenen ikinci ürünün adı: "+product2Text);
        driver.findElement(By.xpath(basketButtonXpath)).click();
        logger.info("Sepetim sayfasına gidildi.");
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
