import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day02_Xpath {
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
    driver.get("http://a.testaddressbook.com/");

        WebElement signin= driver.findElement(By.linkText("Sign in"));
        signin.click();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       List<WebElement>tumlinkler=driver.findElements(By.tagName("a"));

        for (WebElement w:tumlinkler)
              {
            System.out.println(w.getText());
        }
        WebElement kullaniciadi= driver.findElement(By.cssSelector(".form-control"));
        kullaniciadi.sendKeys("testtechproed@gmail.com");

        WebElement sifre= driver.findElement(By.cssSelector("#session_password"));
        sifre.sendKeys("Test1234!");

        WebElement girisyap= driver.findElement(By.xpath("//input[@name='commit']"));
        girisyap.click();


        WebElement adress= driver.findElement(By.linkText("Addresses"));
        adress.click();

        WebElement newadres=driver.findElement(By.linkText("New Address"));
        newadres.click();


        WebElement firsname=driver.findElement(By.id("address_first_name"));


    }




    @AfterClass
    public static void teardown(){
      // driver.quit();
    }
}
