import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Start
{
    WebDriver wd;
    @Test
     public void start()
     {
         wd = new FirefoxDriver();
         wd.get("https://contacts-app.tobbymarshall815.vercel.app/home"); // without history
         wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login"); // save history
       /*
        wd.navigate().back();
        wd.navigate().forward();
        wd.close(); - close only one Tab

       */

         wd.quit(); // close all Tab's
     }
     public void firstTest()
     {
         wd = new FirefoxDriver();
         wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

         WebElement loginTab;
         loginTab.click();

         WebElement emailTextBox;
         emailTextBox.click();
         emailTextBox.clear();
         emailTextBox.sendKeys("test@gmail.com");

         WebElement passwordTextBox;
         passwordTextBox.click();
         passwordTextBox.clear();
         passwordTextBox.sendKeys("Tt12345$");

         WebElement loginBtn;
         loginBtn.click();
         /*
         open form --> click login button
         fill valid mail
         fill valid password
         click login button
         Assert - testnj library
         */
     }
}
