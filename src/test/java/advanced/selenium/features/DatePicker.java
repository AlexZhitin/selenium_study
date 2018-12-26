package advanced.selenium.features;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DatePicker {

  ChromeDriver driver = new ChromeDriver();

  @Test

  public void Calendar(){

    driver.get("https://www.tripadvisor.in/");
    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

    WebElement a = driver.findElement(By.xpath("//*[@id=\"Monikers\"]"));
    driver.switchTo().frame(a);
    driver.findElement(By.xpath("//*[@id=\"c_onboarding-interstitial\"]/div/div[2]"));


    //driver.findElement(By.xpath("//*[@id=\"component_3\"]/div/div/span[4]/div/a"));
  }
}
