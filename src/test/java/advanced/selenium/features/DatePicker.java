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

    public void Calendar() throws InterruptedException {

        driver.get("https://tickets.ua/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"from_name\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"from_name\"]")).sendKeys("Прага");
        /*driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@id='ui-id-27']")).click();
        Thread.sleep(1000);*/
        driver.findElement(By.xpath("//*[@id=\"to_name\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"to_name\"]")).sendKeys("Вена");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@id='ui-id-5']")).click();
        driver.findElement(By.xpath("//*[@id=\"departure_date\"]")).click();


        String date = "20-Январь";
        String splitter[] = date.split("-");
        String checkInmonth_year = splitter[1];
        String checkInday = splitter[0];


        selectDate(checkInmonth_year, checkInday);

        //driver.findElement(By.xpath("//*[@id=\"departure_date_1\"]")).click();

        date = "10-Февраль";
        splitter = date.split("-");
        String checkOutmonth_year = splitter[1];
        String checkOutday = splitter[0];

        selectDate(checkOutmonth_year, checkOutday);

        driver.findElement(By.xpath("//input[contains(@value,'Поиск')]")).click();

        Thread.sleep(4000);
        driver.quit();


    }

    public void selectDate(String month_year, String day) throws InterruptedException {

        List<WebElement> months = driver.findElements(By.xpath("//span[@class='ui-datepicker-month']"));
        for (WebElement i : months) {
            System.out.println(i.getText());
            if (i.getText().equals(month_year)) {
                List<WebElement> days = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[starts-with(@class, \"ui-datepicker-group\")]/table/tbody/tr/td[@class]/a"));
                for (WebElement d : days) {
                    System.out.println(d.getText());
                    if (d.getText().equals(day)) {
                        d.click();
                        return;
                    }
                }
            }

        }

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();

        selectDate(month_year, day);
        Thread.sleep(3000);
    }
}