package ua.selenium.study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestFirefox {

  public static void main (String[] args) {
    WebDriver driver = new FirefoxDriver();
    System.setProperty("webdriver.gecko.driver", "/Users/Sasha/Documents/Selenium projects/selenium_study/src/main/resources/geckodriver");
    driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
  }
}


