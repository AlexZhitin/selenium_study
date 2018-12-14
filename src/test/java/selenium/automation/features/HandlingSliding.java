package selenium.automation.features;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingSliding {

  ChromeDriver driver = new ChromeDriver();

  @Test

  public void Sliding(){

    driver.get("https://api.jqueryui.com/slider/#entry-examples");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    //just to figure out how many frames are on the page
    List<WebElement> list = driver.findElements(By.tagName("iframe"));
    System.out.println(list.size());

    //WebElement f = driver.findElement(By.tagName("iframe"));
    driver.switchTo().frame(0);

    WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));

    Actions action = new Actions(driver);
    action.moveToElement(slider).dragAndDropBy(slider, 500, 0).build().perform();

  }
}
