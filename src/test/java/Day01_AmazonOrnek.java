import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day01_AmazonOrnek {
    WebDriver driver;
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.amazon.com");

       WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));
       aramakutusu.sendKeys("baby stroller"+ Keys.ENTER);

       WebElement urun= driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal'])[2]"));
       urun.click();

       WebElement urunfiyat=driver.findElement(By.id("priceblock_ourprice_row"));
        System.out.printf(urunfiyat.getText());

       WebElement urunpuan=driver.findElement(By.xpath("(//td[@class=\"a-size-base\"])[12]"));
       System.out.printf(urunpuan.getText());
    }
    @Test
    public void test2(){
        driver.get("http://www.google.com");
    }
}
