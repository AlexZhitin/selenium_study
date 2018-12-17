package selenium.automation.features;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragDropResize {

  ChromeDriver driver = new ChromeDriver();

  @Test

  public void Drag(){

    driver.get("https://code.makery.ch/library/dart-drag-and-drop/");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    //declaring, finding and switching to frame "f"
    WebElement f = driver.findElement(By.xpath("/html/body/div/article/div/div/iframe[4]"));
    driver.switchTo().frame(f);

    //declaring of a WebElement "d" which is to be dragged
    WebElement d = driver.findElement(By.xpath("/html/body/div/div"));


    //declaring of variable "dragging which stands for action"
    Actions dragging = new Actions(driver);
    dragging.moveToElement(d).dragAndDropBy(d, 500, 100).build().perform();

  }
}
