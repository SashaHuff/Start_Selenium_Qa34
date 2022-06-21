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
        wd.findElement(By.xpath("//div"));

        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.xpath("//a"));

        wd.findElement(By.cssSelector("button"));
        wd.findElement(By.xpath("//button"));

        wd.findElement(By.cssSelector("input"));
        wd.findElement(By.xpath("//input"));

// atribute - id (special #!!!), class (.smth), href
        wd.findElement(By.cssSelector("#root")); // id
        wd.findElement(By.id("root"));
        wd.findElement(By.xpath("//*[@id='root']"));

        wd.findElement(By.cssSelector(".container")); // class
        wd.findElement(By.xpath("//*[@class='container']"));

        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.xpath("//*[@href='/home']"));

        // equals
        wd.findElement(By.cssSelector("[placeholder='Email']"));
        wd.findElement(By.xpath("//*[@placeholder='Email'"));
        //  start with "Em"
        wd.findElement(By.cssSelector("[placeholder ^='Em']"));
        wd.findElement(By.xpath("//*[starts-with(@placeholder,'Em')]"));

        // end on "il"
        wd.findElement(By.cssSelector("[placeholder $='il']"));
        wd.findElement(By.xpath("//*[contains(@placeholder,'ail')]")); // ---> il != ail

        // contains  --> "ai
        wd.findElement(By.cssSelector("[placeholder *='ai']"));

        WebElement element = wd.findElement(By.xpath("//*[contains(@placeholder,'ai')]"));
        element.findElement(By.cssSelector("#root"));

        List<WebElement> tdlist = wd.findElements(By.xpath("//table[@id]//td"));
        for (WebElement el: tdlist)
        {
            el.getText();
        }




    }
}
