package selenium.automation.features;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ua.selenium.study.FindElemenBy;
import ua.selenium.study.FindElementXpath;

import java.util.concurrent.TimeUnit;

public class Wait {


  ChromeDriver driver = new ChromeDriver();

  /*Explicit Wait. WebDriverWait in combination with ExpectedCondition is better. Waits till the exact element is found else throws no Element found*/

  WebDriverWait wait = new WebDriverWait(driver, 20);

  @Test
  public void WaitMethods() {

    driver.navigate().to("https://www.rediff.com/");
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"signin_info\"]/a[.='Sign in']"))).click();

  }
}


   /*Implicit wait. Waits for the element to become visible (element next by the thread)


    ChromeDriver driver = new ChromeDriver();

    @Test
    public void WaitMethods() {

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[.='Sign in']")).click();
    }
}*/