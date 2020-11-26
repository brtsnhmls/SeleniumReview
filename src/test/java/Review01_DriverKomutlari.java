import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Review01_DriverKomutlari {
   @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        // Tam ekran yapma komutu
        driver.manage().window().maximize();
        // webelementrelrin yuklenmesin 10 saniye geciktirmeyi ogrendik
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Gitmek istedigimiz sayfaya gitmemizi saglar
        driver.get("http://google.com");
        //Bir onceki sqyfqyq geri doner
        driver.navigate().back();
        // herhangi bir websayfasina gider
        driver.navigate().to("http://amazon.com");
        // Sayfayi yenilemek icin kullanilir.
        driver.navigate().refresh();



       WebElement dealstoday =driver.findElement(By.linkText("Today's Deals"));
       dealstoday.click();



    }
}
