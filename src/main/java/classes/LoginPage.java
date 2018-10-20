package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    private static WebDriver driver;
    private Object currentPage;

    public void startDriver() {
        driver = new ChromeDriver();
    }

    public static void visitUmamiSite() {
        driver.get("http://127.0.0.1:8888/");
    }

    public static void locateUmamiLogo() {
        WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'/core/profiles/demo_umami/themes/umami/logo.svg')]"));
    }

    public static void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.cssSelector("a[href='/user/login']"));
        loginButton.click();
    }

    public static void enterUsername() {
        WebElement usernameField = ((ChromeDriver) driver).findElementById("id='edit-name'");
        usernameField.click();
    }
}
