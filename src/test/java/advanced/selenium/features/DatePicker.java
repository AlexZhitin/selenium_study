package advanced.selenium.features;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;



public class DatePicker {

  ChromeDriver driver = new ChromeDriver();

  @Test

  public void Calendar() {

    driver.get("https://tickets.ua/");
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    driver.findElement(By.xpath("//*[@id=\"from_name\"]")).sendKeys("Прага");
    driver.findElement(By.xpath("//*[@id=\"to_name\"]")).sendKeys("Вена");
    driver.findElement(By.xpath("//*[@id=\"departure_date\"]")).click();

    String date = "30-December 2018";
    String splitter[] = date.split("-");
    String checkInmonth_year = splitter[1];
    String checkInday = splitter[0];

    selectDate(checkInmonth_year, checkInday);
  }

  public void selectDate(String month_year, String day) {

    List<WebElement> months = driver.findElements(By.xpath("//span[@class='ui-datepicker-month']"));
    for (WebElement i : months){
      System.out.println(i.getText());

    }

  }
}