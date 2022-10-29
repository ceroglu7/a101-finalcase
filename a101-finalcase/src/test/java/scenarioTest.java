import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenarioTest {

    protected WebDriver driver;
    private String startupUrl = "https://www.hepsiburada.com/";

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(startupUrl);
    }

    @Test
    public void scenario(){
    }

    @After
    public void finish(){
    }
}


