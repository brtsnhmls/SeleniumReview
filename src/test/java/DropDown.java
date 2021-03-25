import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown {

    WebDriver driver;

    @Before
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void test() {


        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        System.out.println(select.getFirstSelectedOption());

        String firstoption=select.getFirstSelectedOption().getText();
        System.out.println(firstoption);

        select.selectByIndex(1);

        select.selectByIndex(2);

        select.selectByVisibleText("Option 1");

        List<WebElement>list=select.getOptions();
        for (WebElement w:list
             ) {
            System.out.println(w.getText());
        }
  }
}