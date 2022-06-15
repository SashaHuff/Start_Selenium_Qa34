import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class StartCss
{
    WebDriver wd;

    @Test

    public void startCSSLocation ()

    {
        wd = new FirefoxDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
        WebElement el1 = wd.findElement(By.id("root"));
        WebElement el2 = wd.findElement(By.tagName("a"));
        List <WebElement> list = wd.findElements(By.tagName("a"));
        wd.findElement(By.className("container"));
        wd.findElement(By.linkText("LOGIN"));// find by link text / partialinkText - half of ....

        ///////////////////////////CSS///////////////////////////////////////////////////
// tagname
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.cssSelector("button"));
        wd.findElement(By.cssSelector("input"));

// atribute - id (special #!!!), class (.smth), href
        wd.findElement(By.cssSelector("#root")); // id
        wd.findElement(By.cssSelector(".container")); // class
        wd.findElement(By.cssSelector("[href='/home']"));




    }
}
