package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


//import org.openqa.selenium.WebDriver
public class testngIntroduction {

    private String url = "https://demoqa.com/";
    WebDriver driver;

    @BeforeTest
    public void setBaseUrl(){

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(url);

    }

    @Test
    public void titleTest(){
        String expectedTitle = "DEMOQA";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void urlTest(){

        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, url);
        }

    @AfterTest
    public void closeSession(){
        driver.quit();
    }



}


