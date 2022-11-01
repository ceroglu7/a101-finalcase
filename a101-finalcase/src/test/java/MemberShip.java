import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
public class MemberShip {
    String logInButtonXpath="/html/body/div[1]/div/div/div[3]/div[5]/div/div/div/div/div[2]/div[3]/div[2]/span/span[1]";
    String signUpButtonXpath="/html/body/div[1]/div/div/div[3]/div[5]/div/div/div/div/div[2]/div[3]/div[2]/div/div/ul/li[2]/a";
    String signUpPageButtonXpath="/html/body/div[1]/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div[2]/div";
    Actions actions;
    WebDriver driver;
    public MemberShip(){
        driver=utils.getDriver();
        actions = new Actions(driver);
    }
    public void logInButtonHover(){
        driver=utils.getDriver();
        driver.get("https://www.hepsiburada.com");
        actions.moveToElement(driver.findElement(By.xpath(logInButtonXpath))).perform();
    }
    public void signUpButtonClick(){
        driver.findElement(By.xpath(signUpButtonXpath)).click();
    }
    public void signUpPageButtonClick(){
        driver.findElement(By.xpath(signUpPageButtonXpath)).click();
    }
}
