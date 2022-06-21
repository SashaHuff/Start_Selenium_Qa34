import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;


public class Start {
    WebDriver wd;

    @Test
    public void start() {
        wd = new FirefoxDriver();
        wd.get("https://contacts-app.tobbymarshall815.vercel.app/home"); // without history
   //     wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login"); // save history
       /*
        wd.navigate().back();
        wd.navigate().forward();
        wd.close(); - close only one Tab

       */
        firstTestLoginSuccess();
//      wd.quit(); // close all Tab's
    }

    public void firstTestLoginSuccess() {
        wd = new FirefoxDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        WebElement loginTab = wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();

        WebElement emailTextBox = wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("Test1@gmail.com");

        WebElement passwordTextBox = wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Ttest12345$");

        WebElement loginBtn = wd.findElement(By.cssSelector("button"));
        loginBtn.click();
         /*
         open form --> click login button
         fill valid mail
         fill valid password
         click login button
         Assert - testnj library
         */
    }

    @Test
    public void startReg1Success()
    {
        wd = new FirefoxDriver();
        wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");
        WebElement loginTab = wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();
        WebElement emailTextBox = wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("Test2@gmail.com");

        WebElement passwordTextBox = wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Ttest12346$");

        List <WebElement> Reg1Btn = wd.findElements(By.cssSelector("button"));
        Reg1Btn.get(1).click();

    }

    @Test
    public void startReg2Success()
    {
        wd = new FirefoxDriver();
        wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");
        WebElement loginTab = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m>a:last-child"));
        loginTab.click();
        WebElement emailTextBox = wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("Test3@gmail.com");

        WebElement passwordTextBox = wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Ttest12347$");

        WebElement Reg2Btn = wd.findElement(By.cssSelector(".login_login__3EHKB>button:last-child"));
        Reg2Btn.click();
    }
}


