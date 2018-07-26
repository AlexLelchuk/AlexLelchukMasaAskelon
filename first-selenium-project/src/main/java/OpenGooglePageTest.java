import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenGooglePageTest {
GhromeDriver driver;

@BeforeMethod
    public void setUp(){
    driver = new GhromeDriver();
}

@Test
    public void testOpeningGooglePage(){
//driver.get("https://www.google.com/");
driver.navigate().to(url:"https://www.google.com/");

driver.findElement(By.name("q")).sendKeys("Webdriver");
}

@Test
public void test(){
    driver.get("https://trello.com/home");
    driver.findElement(By.xpath("//*[@href=`/login`]")).click();
}

@AfterMethod
    public void tearDown() throws InterruptedException {
    Thread.sleep(2000);
    driver.quit();
}



}
