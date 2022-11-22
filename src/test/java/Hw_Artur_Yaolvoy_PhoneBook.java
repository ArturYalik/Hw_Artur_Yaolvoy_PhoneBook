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
//        WebElement home = wd.findElement(By.linkText("HOME"));
//        WebElement about = wd.findElement(By.linkText("ABOUT"));
//        WebElement login = wd.findElement(By.linkText("LOGIN"));
        List<WebElement> elements = wd.findElements(By.tagName("div"));
        List<WebElement> a = wd.findElements(By.tagName("a"));
        List<WebElement> br = wd.findElements(By.tagName("br"));
        List<WebElement> h1 = wd.findElements(By.tagName("h1"));
//        wd.findElements(By.cssSelector());
        wd.findElements(By.cssSelector("[href='/login']"));
        wd.findElements(By.cssSelector("[href^='/lo']"));
        wd.findElements(By.cssSelector("[href*='og']"));
        wd.findElements(By.cssSelector("[href$='in']"));
        List<WebElement> butons = wd.findElements(By.tagName("button"));


        System.out.println(elements.size());
        System.out.println(a.size());
        System.out.println(br.size());
        System.out.println(h1.size());

    }


    @AfterMethod
    public void pastCondition() {
//        wd.close();
        wd.quit();

    }
}
