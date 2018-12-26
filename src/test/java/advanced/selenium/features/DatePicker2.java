package advanced.selenium.features;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DatePicker2 {

  ChromeDriver driver = new ChromeDriver();

  @Test

  public void Frames() {

    driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox");
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


    //Initializing element "a" which stands for a frame
    WebElement a = driver.findElement(By.xpath("//*[@id=\"frame_Checking_boxes_by_default\"]"));
    driver.switchTo().frame(a); //


    //Clicking the checkbox
    driver.findElement(By.xpath("//*[@id=\"music\"]")).click();


    driver.switchTo().defaultContent();//Switching back to the main page
    WebElement c = driver.findElement(By.xpath("//a[contains(text(),'Validation')]"));
    System.out.println(c.getText());

  }
}