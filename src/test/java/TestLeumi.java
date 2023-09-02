import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.awt.SystemColor.text;

public class TestLeumi {

    WebDriver wd;
    @BeforeMethod
    public void precondition(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.leumi.co.il/");
    }
    @Test
    public void testCSS() {
        pause(10000);
        String text = wd.findElement(By.linkText("פרטי")).getText();
        Assert.assertEquals(text,"פרטי");
        System.out.println(text);
    }

    private void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}