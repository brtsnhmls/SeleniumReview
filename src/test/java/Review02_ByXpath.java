import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Review02_ByXpath {
    static WebDriver driver;
@BeforeClass
public static void setup(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}


@Test
    public void test1(){

        //http://a.testaddressbook.com
        driver.get("http://a.testaddressbook.com");

    WebElement giris=driver.findElement(By.xpath("//a[@id='sign-in']"));
    giris.click();

    List<WebElement>tumlinkler=driver.findElements(By.tagName("a"));
    for (WebElement w:tumlinkler ) {
        System.out.println(w.getText());

    }

    WebElement email=driver.findElement(By.cssSelector(".form-control"));
    email.sendKeys("testtechproed@gmail.com");

    WebElement pass=driver.findElement(By.cssSelector("#session_password"));
    pass.sendKeys("Test1234!");

    WebElement girisbutton=driver.findElement(By.cssSelector(".btn.btn-primary"));
    girisbutton.click();
}


@AfterClass
    public static void cikis(){

    driver.quit();
}




}
