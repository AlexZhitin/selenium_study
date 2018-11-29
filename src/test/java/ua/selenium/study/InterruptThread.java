package ua.selenium.study;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterruptThread {

  WebDriver driver = new ChromeDriver();//create Object "ChromeDriver" called "driver"

  @Before

  public void OpenPage() {

    driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");//Open web page
    System.out.println("Start of test");
  }

  @Test

  public void Wait(){//class makes the page wait before closing 5 seconds
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

  @After
  public void Quit(){//Page is closed
    driver.quit();
    System.out.println("Thread interrupted for 5 sec.");
  }

}