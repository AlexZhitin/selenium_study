package ua.selenium.study;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementXpath {

  ChromeDriver driver = new ChromeDriver();

  @Test

  public void findElement(){

    driver.get("https://www.rediff.com/");
    driver.findElement(By.xpath("//*[@id=\"hm_top_navlink_div\"]/a[3]/div")).click();
  }
}
