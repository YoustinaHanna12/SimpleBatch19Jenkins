package Class02;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators02 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

//        enter username
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
//        enter password
        WebElement pass = driver.findElement(By.id("ctl00_MainContent_password"));
        pass.sendKeys("test");
//        click on login
        WebElement button = driver.findElement(By.className("button"));
        button.click();

//      confirm that you have logged in
      WebElement message =  driver.findElement(By.className("login_info"));
      message.getText();
      // get the next from the webElement
      String text= message.getText();
      // print out
        System.out.println("the text is "+text);

      // get the title of the webPage
      String title=  driver.getTitle();
        System.out.println(title);
        if (title.equals("Web Orders")){
            System.out.println("you have logged in");
        }else {
            System.out.println("you haven't logged in");
        }
    }
}