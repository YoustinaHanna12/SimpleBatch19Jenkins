package Review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DDReview {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php");

        WebElement dropDown = driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
        dropDown.click();

//      find all the options
        List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));

        for(WebElement options:allOptions){
            String option = options.getText();
            if(option.equals("Peru")){
                options.click();
                break;
            }

        }
    }
}
