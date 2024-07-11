package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        // instance of ChromeDriver
        WebDriver driver= new ChromeDriver();

        // open the Chrome browser
        driver.get("https://facebook.com/");

        // Maximize the window
        driver.manage().window().maximize();
       //  driver.manage().window().fullscreen(); this line once we used full screen the upper option to make the page small and pig os not available

        // get the tittle of the webpage
        String title= driver.getTitle();
        System.out.println("the tittle of the webpage is "+title);

        // just for observation delete after you are sure
        Thread.sleep(4000); // note recommended to ues this thread sleep in our code

        driver.quit();
    }
}
