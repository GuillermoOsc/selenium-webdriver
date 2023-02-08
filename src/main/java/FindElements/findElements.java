package FindElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


// https://www.youtube.com/watch?v=0pFwo2UMK5M&list=PLYDwWPRvXB89tBqm9K5ZurJFIYDTzV9KQ&index=6
// Tutorial de referencia
public class findElements {

    public static void main(String [] args){

        String url = "https://www.saucedemo.com/";

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        // Instance of webdriver
        WebDriver driver = new ChromeDriver();

        //Enter to a website
        driver.get(url);

        //Maximize
        driver.manage().window().maximize();

        // Credentials
        String username = "standard_user";
        String password = "secret_sauce";

        // Se identifican todos los elementos con un mismo tipo de etiqueta de manera conjunta

        List<WebElement> inputs = driver.findElements(By.tagName("input"));

        for(int i = 0; i < inputs.size(); i++){

            if(i == 0){

                inputs.get(i).sendKeys(username);

            }else if(i == 1){

                inputs.get(i).sendKeys(password);
            }
            else{

                inputs.get(i).click();
            }
        }
        driver.close();
    }
}
