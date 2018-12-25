package advanced.selenium.features;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class UploaderTest {

  ChromeDriver driver = new ChromeDriver();

  @Test

public void UploadMac() throws IOException {

    driver.get("http://tinypic.com/");
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//input[@id='the_file']")).click();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    Runtime.getRuntime().exec("osascript " + "/Users/Sasha/Downloads/Upload.scpt");


    //The above code is used for uploading the file on Mac with the help of AppleScript

    /* AppleScript:

tell application "System Events"
	delay 3
	keystroke "G" using {command down, shift down}
	delay 3
	keystroke "/Users/Sasha/Downloads/avatars issue.png"
	delay 3
	keystroke return
	delay 3
	key code 31 using {command down}
end tell

*/

  }
}