package ua.selenium.study;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementXpath {

  ChromeDriver driver = new ChromeDriver();

  /*@Test

  public void findElement(){

    driver.get("https://www.rediff.com/");
    driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[@title=\"Already a user? Sign in\"]")).click();//xPath can be either //*[@id="signin_info"]/a[@title="Already a user? Sign in"] or
    //*[@id="signin_info"]/a[1]"].
    driver.quit();
  }*/

  @Test
  public void precedingSibling (){

    driver.get("https://www.w3schools.com/");
    //driver.findElement(By.xpath("//*[@id=\"mySidenav\"]/div/a[3]"));
    //driver.findElement(By.xpath("//*[@id=\"mySidenav\"]/div/a[3]/preceding-sibling::a[1]")).click();
    //driver.findElement(By.xpath("//*[@id=\"mySidenav\"]/div/a[3]/following-sibling::a[5]")).click();
    driver.findElement(By.xpath("//*[@id=\"mySidenav\"]/div/a[4]/parent:: div/div[1]")).click();


  }
}
