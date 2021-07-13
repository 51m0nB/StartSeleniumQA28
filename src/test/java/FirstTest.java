import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver wd;

    @BeforeMethod
    public void precondition(){
    wd = new ChromeDriver();
    }
    @Test(enabled = false)
    public void startGoogle(){
    wd.get("https://www.google.com/");
    }
    @Test
    public void loginTest(){

    }
    @AfterMethod
    public void postCondition(){
    wd.quit();
    }
}
