package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    public static void visitUmamiSite() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:8888/");
        //locateUmamiLogo
        WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'/core/profiles/demo_umami/themes/umami/logo.svg')]"));
        //clickLoginButton
        WebElement loginButton = driver.findElement(By.cssSelector("a[href='/user/login']"));
        loginButton.click();
        //enterUsername
        WebElement usernameField = ((ChromeDriver) driver).findElementById("id='edit-name'");
        usernameField.click();

    }

    public static void locateUmamiLogo() {
//        WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'/core/profiles/demo_umami/themes/umami/logo.svg')]"));
    }

    public static void clickLoginButton() {

    }

    public static void enterUsername() {
    }
}
