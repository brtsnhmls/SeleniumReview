import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Review01_Amazon {

 @Test
         public void test1(){
  WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  driver.get("http://amazon.com");

  WebElement searchbar=driver.findElement(By.id("twotabsearchtextbox"));
  searchbar.sendKeys("baby stroller", Keys.ENTER);

  WebElement urun=driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal'])[2]"));
  urun.click();

  WebElement frais=driver.findElement(By.id("price_inside_buybox"));
  System.out.println( frais.getText());

 }
@Test
 public void test2(){
  //1. google.com Gidelù
  //2. Kemal Ozden Yazalim
  //3. cikan sonuc sayisini ekrana yazdiralim

 WebDriverManager.chromedriver().setup();
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 driver.get("http://www.google.com");

 WebElement arama=driver.findElement(By.xpath("//input[@name'q']"));
 arama.sendKeys("kemal ozden"+Keys.ENTER);
 System.out.println("Branch 1.satir");
 System.out.println("Branch 2.satir");
 System.out.println("Branch 3.satir");
}

    //1. Amazon com'a gidecez
    //2 Arama kutusuna"baby stroller"
    //3.2.siradaki $r$ne tiklayacaîz
    //4. urun sayfasina gittikten ssonran urunun toplam fiyatini alacaw
    //5. urnun toplam puanini alacaz



}
