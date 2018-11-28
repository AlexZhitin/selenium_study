package ua.selenium.study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstTestSafari {

  public static void main (String[] args) {
    WebDriver driver = new SafariDriver();
    driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
  }
}
