package ua.selenium.study;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {

  ChromeDriver driver = new ChromeDriver();

  @Test

public void advancedXpath(){

    driver.get("https://www.w3schools.com/");
    //driver.findElement(By.xpath("//*[@id=\"mySidenav\"]/div/a[text()='Learn Colors']")).click();

    //driver.findElementByXPath("//*[starts-with(@id,'gs')]");
    //starts-with method for searching any property starting with a certain text

    //driver.findElementByXPath("//*[contains(@id, 'btn_references')]").click();//property/attribute contains "...btn_references"
   driver.findElement(By.xpath("(//*[@id=\"nav_references\"]/div/div[2]/a)[last()]")).click();

  }
}

