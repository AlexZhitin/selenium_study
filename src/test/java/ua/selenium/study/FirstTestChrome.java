package ua.selenium.study;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class FirstTestChrome {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver", "/Users/Sasha/Documents/Selenium projects/selenium_study/src/main/resources/chromedriver");
    driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
  }
}