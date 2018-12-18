package selenium.automation.features;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dropdown {

  ChromeDriver driver = new ChromeDriver();

  @Test

  public void SelectDropdown() {

    driver.get("https://www.rediff.com/");
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//a[contains(text(),'Create a Rediffmail account')]")).click();

    //Creating and finding of webelement "dropdown"
    WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));

    //Creating a list "option" which contains elements of dropdown (all elements with tagname "option")
    List<WebElement> option = dropdown.findElements(By.tagName("option"));
    System.out.println(option.size());


    /*

    Method 1:
    ________________________________________
    String element;

    for(int i = 0; i<option.size(); i++){
      element = option.get(i).getAttribute("value");
      if(element.equals("09")){
        option.get(i).click();
      }
    }

    }
  }*/

    /*Method 2 (easier way using for-each loop)
    ___________________________________________________*/

for(WebElement i: option){
      if(i.getAttribute("value").equals("09")){
        i.click();
      }
    }

    }
  }