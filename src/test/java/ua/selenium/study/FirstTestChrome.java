package ua.selenium.study;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestChrome {


  ChromeDriver driver = new ChromeDriver();

  @Before

          public void setUp (){
    System.setProperty("webdriver.chrome.driver", "/Users/Sasha/Documents/Selenium projects/selenium_study/src/main/resources/chromedriver");
    System.out.println("Before of test");

  }

  @Test
  public void Startoftest1() {

    driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
    System.out.println("Start of test");
  }

  @Test

  public void Startoftest2() {

    driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
    System.out.println("Start of test 2");
  }

  @After

  public void End() {
    driver.quit();
    System.out.println("End of test");
  }
}