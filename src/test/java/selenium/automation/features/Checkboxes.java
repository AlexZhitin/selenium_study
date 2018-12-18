package selenium.automation.features;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Checkboxes {

  ChromeDriver driver = new ChromeDriver();

  @Test

  public void CheckboxesSelection() {

    driver.get("https://www.w3.org/TR/wai-aria-practices/examples/checkbox/checkbox-2/checkbox-2.html");
    List<WebElement> checkbox = driver.findElements(By.xpath("//ul[@class='checkboxes']//li/label/input[@type='checkbox']"));

    for (WebElement i : checkbox) {
      if (i.getAttribute("id").equals("cond1") ||
              i.getAttribute("id").equals("cond3")) {
        i.click();
      }
    }
  }
}