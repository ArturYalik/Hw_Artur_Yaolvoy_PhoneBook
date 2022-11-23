import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Hw_Artur_Yaolvoy_PhoneBook {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }
    @Test
    public void testLogin(){
        System.out.println("Test Started");
        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.linkText("LOGIN"));
        wd.findElements(By.tagName("div"));
        wd.findElements(By.tagName("a"));
        wd.findElements(By.tagName("br"));
        wd.findElements(By.tagName("h1"));
        wd.findElements(By.tagName("button"));
        wd.findElements(By.cssSelector("[href='/login']"));
        wd.findElement(By.cssSelector("[href*='h']"));
        wd.findElement(By.cssSelector("[href$='ut']"));
        wd.findElements(By.cssSelector("div"));
        wd.findElements(By.cssSelector("a"));
        wd.findElements(By.cssSelector("br"));
        wd.findElements(By.cssSelector("h1"));
        wd.findElements(By.cssSelector("button"));

    }


    @AfterMethod
    public void pastCondition() {
//        wd.close();
        wd.quit();

    }
}
