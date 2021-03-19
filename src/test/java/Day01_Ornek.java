import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day01_Ornek {

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.google.com");

        WebElement aramakutusu= driver.findElement(By.name("q"));
        aramakutusu.sendKeys("vouloir"+ Keys.ENTER);

        WebElement ilkeleman= driver.findElement(By.linkText("La conjugaison du verbe vouloir - conjuguer vouloir"));
        ilkeleman.click();

    }
}
