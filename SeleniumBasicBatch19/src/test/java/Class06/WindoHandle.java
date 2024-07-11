package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindoHandle {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AaSxoQy4kLcUiWijJfCQzeB8s0Q3dSPHEksxxa7gW0_XR5Q7dFlndbXsquT2WHbojUDuIT7y7VgPvQ&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1072932938%3A1715445066972666&ddm=0");
// help

        WebElement helpBtn=driver.findElement(By.xpath("//a[text()='Help']"));

        WebElement privacyBtn=driver.findElement(By.xpath("//a[text()='Privacy']"));

        // privacy click on help and privacy btn
        helpBtn.click();
        privacyBtn.click();

        // get the window handle of teh main page and print out on the screen
        String mainPageHandle= driver.getWindowHandle();
        System.out.println(mainPageHandle);

        // switch to focus of the driver to tge privacy page
        Set<String> allHandels=driver.getWindowHandles();
        // iterate through
        for(String handle:allHandels) {
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());

            if (driver.getTitle().equalsIgnoreCase("Privacy Policy - Privacy & Terms - Google")) {

                break;
            }
        }
        System.out.println(driver.getTitle());









    }
}