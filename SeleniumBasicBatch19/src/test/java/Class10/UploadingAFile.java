package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingAFile {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/upload-image.php");

        WebElement imageUpload = driver.findElement(By.xpath("//input[@id='image-file']"));
        imageUpload.sendKeys("C://Users//wmina//OneDrive//Desktop//01.png");
    }
}

