package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class oldStyleDropdown {
    public static void main(String [] args){

        String url = "https://demoqa.com/select-menu";

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();

        // Declare the object of UI Select

        Select oldStyleMenu = new Select(driver.findElement(By.id("oldSelectMenu")));

        //oldStyleMenu.selectByIndex(1);
        //oldStyleMenu.selectByValue("8");
        oldStyleMenu.selectByVisibleText("Magenta");

        //driver.close();
    }
}
