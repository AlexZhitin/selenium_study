package ua.selenium.study;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementXpath {

  ChromeDriver driver = new ChromeDriver();

  public void findElement() {

    driver.get("https://www.rediff.com/");
    driver.manage().window().maximize();

    driver.findElement(By.xpath("//*[@id=\"hm_top_navlink_div\"]/a[3]/div")).click();
  }
}