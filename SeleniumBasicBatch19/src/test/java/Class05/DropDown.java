package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

         // find the element with the select tag
        WebElement DD = driver.findElement(By.xpath("//select[@id='select-demo']"));
        //  select class
        Select sel=new Select(DD);
       //  select by index
        sel.selectByIndex(3);
       // for observation
        Thread.sleep(2000); // this line to slow the code
        // select by value
        sel.selectByValue("Sunday");

        Thread.sleep(3000); // this line to slow the code
       // select by visible text
        sel.selectByVisibleText("Monday");

        // multiple  DD
        WebElement multipleDD= driver.findElement(By.xpath("//select[@id='multi-select']"));
        // select class
        Select select1=new Select(multipleDD);
        select1.selectByValue("Florida"); // this select by value we have to add the value name
        select1.selectByVisibleText("New York");// this select by visible tex we have to add the value name
        select1.selectByIndex(0);// this select by value we have to add the value as a number(value number in to inspect search)

        // option in multiselect
        select1.deselectByIndex(0);
        System.out.println("the dropdown2 is multiselect "+select1.isMultiple() );
        System.out.println("the dropdown1 is multiselect "+select1.isMultiple());

    }
}
