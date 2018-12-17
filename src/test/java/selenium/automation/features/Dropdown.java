package selenium.automation.features;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dropdown {

  ChromeDriver driver = new ChromeDriver();

  @Test

  public void SelectDropdown() {

    driver.get("https://www.rediff.com/");
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//a[contains(text(),'Create a Rediffmail account')]")).click();

    WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
    List<WebElement> option = dropdown.findElements(By.tagName("option"));
    System.out.println(option.size());
  }
}
