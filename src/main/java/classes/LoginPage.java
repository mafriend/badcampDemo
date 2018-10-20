package classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    public static void visitUmamiSite() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:8888/");
    }

    public static void locateUmamiLogo() {
        WebElement logo = driver.findElement(By.)
    }
}
