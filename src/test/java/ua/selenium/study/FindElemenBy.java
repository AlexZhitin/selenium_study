package ua.selenium.study;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElemenBy {

    ChromeDriver driver = new ChromeDriver();

    @Test

    public void findElementBy() {

      driver.get("https://www.w3schools.com/");
      //driver.findElement(By.className("w3-right"));
      //driver.findElement(By.id("___gcse_0"));
      //driver.findElementByLinkText("Learn CSS").click();
      //driver.findElement(By.className("gsc-search-button-v2")).click();
      //driver.findElement(By.xpath("/html/body/div[5]/div/a[1]/i")).click();
      driver.findElement(By.xpath("/html/body/div[5]/div/a[@title='Search W3Schools']/i[1]")).click();
      driver.findElement(By.xpath("//*[@id=\"gsc-i-id1\"][@placeholder='Custom Search']")).sendKeys("ededed");
      driver.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/form/table/tbody/tr/td[2]/button")).click();
    }
  }