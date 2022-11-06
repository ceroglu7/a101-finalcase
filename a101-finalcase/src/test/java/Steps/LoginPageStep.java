package Steps;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class LoginPageStep  {
    final static Logger logger = Logger.getLogger(LoginPageStep.class);
    WebDriver driver;
    Actions actions;
    String acceptCookiesButton="/html/body/div[3]/div[2]/div/div[1]/div/div[2]/div/button[2]";
    String logInHoverButtonXpath="/html/body/div[1]/div/div/div[3]/div[5]/div/div/div/div/div[2]/div[3]/div[2]/span/span[1]";
    String logInButtonXpath="//a[@id='login']";
    String facebookXpath="/html/body/div[1]/div/div/div[1]/div[3]/div[3]/button[3]";
    String myMailAdress="05491070034";
    String myPassword="hE74pK9PZBe6Acf";
    String facebookEmailTextBoxXpath="/html/body/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/form/div/div[1]/input";
    String facebookContinouButtonXpath="/html/body/div/div/div/div/div/div/div/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div/div/div[1]/div/span/span";
    String validateNameXpath="/html/body/div/div/div/div[3]/div[5]/div/div/div/div/div[2]/div[3]/div[2]/span/a/span[2]";
    String myName="Cihan Eroğlu";
    String startUpUrl="http://hepsiburada.com";
    public LoginPageStep() {
        driver = Utils.getDriver();
        actions = new Actions(driver);
    }
    public void homePageUrl(){
        logger.info("Test başlatıldı.");
        driver.navigate().to(startUpUrl);
        logger.info("Test Edilecek Sayfa : " + driver.getTitle());
    }
    public void loggingIn() {
        driver.findElement(By.xpath(acceptCookiesButton)).click();
        logger.info("Çerezler kabul edildi.");
        actions.moveToElement(driver.findElement(By.xpath(logInHoverButtonXpath))).perform();
        driver.findElement(By.xpath(logInButtonXpath)).click();
        logger.info("Anasayfada Giriş Yap'a Tıklandı.");
        driver.findElement(By.xpath(facebookXpath)).click();
        logger.info("Facebook ile Giriş Yap'a Tıklandı.");
        driver.findElement(By.xpath(facebookEmailTextBoxXpath)).sendKeys(myMailAdress);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(myPassword).perform();
        actions.sendKeys(Keys.ENTER).perform();
        logger.info("Mail adresi ve şifre girildi.");
        driver.findElement(By.xpath(facebookContinouButtonXpath)).click();
    }
    public void validate(){
        assertEquals(myName, driver.findElement(By.xpath(validateNameXpath)).getText());
        logger.info("Giriş yapılan kullanıcı doğrulandı.");
    }
}
