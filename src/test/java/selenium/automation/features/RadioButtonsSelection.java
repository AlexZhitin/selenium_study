package selenium.automation.features;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class RadioButtonsSelection {

    WebDriver driver = new ChromeDriver();

    @Test

    public void RadioButtons(){

        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_radio");
        List<WebElement> list = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/input[@name='gender']"));

        for(WebElement e: list){
            System.out.println(e.getAttribute("Male"));
            System.out.println(e.isSelected());
        }


    }
}


test