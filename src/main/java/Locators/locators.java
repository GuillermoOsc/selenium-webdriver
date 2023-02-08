package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

        // Inicializar el webdriver
        WebDriver driver = new ChromeDriver();

        // Abrir el sitio web
        driver.get("https://www.saucedemo.com/");

        //Maximizar la ventana del browser
        driver.manage().window().maximize();

        // Credenciales
        String userName = "standard_user";
        String password = "secret_sauce";

        // Selector por id
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        //WebElement loginBtn = driver.findElement(By.id("login-button"));

        // Selector por Class Name
        //WebElement loginBtn = driver.findElement(By.className("submit-button"));

        // Selector por "name"
        //WebElement loginBtn = driver.findElement(By.name("login-button"));

        // Selector por "Xpath"
        // WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

        // Selector por "CSS"
        WebElement loginBtn = driver.findElement(By.cssSelector(".submit-button"));

        // Login
        usernameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginBtn.click();


            // comentario prueba

    }
}
