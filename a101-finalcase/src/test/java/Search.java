import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
public class Search {
    String acceptCookiesButton="/html/body/div[3]/div[2]/div/div[1]/div/div[2]/div/button[2]";
    String searchTextBoxXpath="/html/body/div[1]/div/div/div[3]/div[5]/div/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[2]/input";
    String searchProductText="apple iphone 13 pro max";

    Actions actions;
    WebDriver driver;
    public Search(){
        driver= Utils.getDriver();
        actions = new Actions(driver);
    }
    public void searchTextBoxTexting(){
        driver= Utils.getDriver();
        driver.navigate().to("https://www.hepsiburada.com");
        driver.findElement(By.xpath(acceptCookiesButton)).click();
        driver.findElement(By.xpath(searchTextBoxXpath)).sendKeys(searchProductText);
        actions.sendKeys(Keys.ENTER).perform();
    }

}
