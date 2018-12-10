package selenium.automation.features;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

    ChromeDriver driver = new ChromeDriver();

    @Test

    public void BackForwardRefresh() throws InterruptedException  {

        driver.navigate().to("https://www.rediff.com/");
        driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[.='Sign in']")).click();

        Thread.sleep(5000);

        driver.navigate().refresh();

        Thread.sleep(5000);

        driver.navigate().back();

        Thread.sleep(5000);

        driver.navigate().forward();

        Thread.sleep(3000);

    }
}
