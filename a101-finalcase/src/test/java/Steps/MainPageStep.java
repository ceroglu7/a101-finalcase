package Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
public class MainPageStep {
    String acceptCookiesButton="/html/body/div[3]/div[2]/div/div[1]/div/div[2]/div/button[2]";
    String searchTextBoxXpath="/html/body/div[1]/div/div/div[3]/div[5]/div/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[2]/input";
    String searchProductText="apple iphone 13 pro max";
    String startUpUrl="http://hepsiburada.com";
    Actions actions;
    WebDriver driver;
    public MainPageStep(){
        driver= Utils.getDriver();
        actions = new Actions(driver);
    }
    public void homePageUrl(){
        driver.navigate().to(startUpUrl);
    }
    public void acceptCookies(){
        driver.findElement(By.xpath(acceptCookiesButton)).click();
    }
    public void searchTextBoxTexting(){
        driver.findElement(By.xpath(searchTextBoxXpath)).sendKeys(searchProductText);
        actions.sendKeys(Keys.ENTER).perform();
    }
}
