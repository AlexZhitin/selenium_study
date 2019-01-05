package advanced.selenium.features;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Javascript {

    ChromeDriver driver = new ChromeDriver();

    @Test

    public void JS() {

        driver.get("http://demo.guru99.com/V4/index.php#");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr172316");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("bAjYgab");

        //Method 1

        /*((JavascriptExecutor) driver).executeScript("document.getElementsByName('btnLogin')[0].click()");*/


        //Method 2

        WebElement button = driver.findElement(By.name("btnLogin"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);

        //Shows up the Alert
        ((JavascriptExecutor) driver).executeScript("alert('Welcome to Guru99');");
    }
}


//More on JavaScriptExecutor in Selenium WebDriver With Examples: https://www.softwaretestingmaterial.com/javascriptexecutor-selenium-webdriver/