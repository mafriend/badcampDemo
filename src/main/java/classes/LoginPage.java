package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    private static WebDriver driver;

    public static void startDriver() {
        driver = new ChromeDriver();
    }

    public static void visitMyDrupalSite() {
        driver.get("http://badcampdemo.ddev.local/");
    }

    public static void locateDrupalLogo() {
        WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'/core/themes/bartik/logo.svg')]"));
    }

    public static void clickLoginButton() {
        driver.findElement(By.cssSelector("a[href='/user/login']")).click();
    }

    public static void enterUsername(String username) {
        driver.findElement(By.id("edit-name")).sendKeys(username);
    }

    public static void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(By.id("edit-pass"));
        passwordInput.click();
        passwordInput.sendKeys(password);
    }

    public static void clickSubmitLoginButton() {
        driver.findElement(By.id("edit-submit")).click();
    }

    public static boolean isLogoutButtonPresent() {
        if (driver.findElement(By.cssSelector("a[href='/user/logout']")).isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public static void stopDriver() {
        driver.quit();
    }
}
