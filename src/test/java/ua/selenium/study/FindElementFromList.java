package ua.selenium.study;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementFromList {

  ChromeDriver driver = new ChromeDriver();

  @Test

  public void findElement() {
    driver.get("https://www.w3schools.com/");
    List<WebElement> list = driver.findElements(By.tagName("a"));

    for(int i=0; i<list.size(); i++){
      System.out.println(list.get(i).getText());
    }

  }
}
