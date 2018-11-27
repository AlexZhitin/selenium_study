package ua.selenium.study;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://cmp.bsb.bkstg.it/artist/live");
  }
}