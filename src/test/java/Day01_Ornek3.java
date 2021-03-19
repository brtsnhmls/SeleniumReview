import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day01_Ornek3 {
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         driver.get("http://www.mynet.com");

        WebElement aramakutusu= driver.findElement(By.name("q"));
        aramakutusu.sendKeys("Books", Keys.ENTER);

        WebElement aramasonuc= driver.findElement(By.xpath("//div[@class='g'][1]"));
        aramasonuc.click();
    }
}
