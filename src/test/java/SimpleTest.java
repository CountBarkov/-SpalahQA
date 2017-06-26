import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleTest {

    @Test
    public void navigateToPuzzleEnglishAndLogin() {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://puzzle-english.com/");

        WebElement loginButton = driver.findElement(By.cssSelector(".puzzle-header__menu__login__btn>span"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement loginTub = driver.findElement(By.cssSelector(".video-carousel__link.js-tab-link"));
        loginTub.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement loginField = driver.findElement(By.xpath(".//*[@id='sign_in_popup_form']/input[1]"));
        loginField.clear();
        loginField.sendKeys("micorazonaudrey@gmail.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement passwordField = driver.findElement(By.xpath(".//*[@id='sign_in_popup_form']/input[2]"));
        passwordField.clear();
        passwordField.sendKeys("-moneys-35");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement SubmitButton = driver.findElement(By.cssSelector(".button.button-big.button-style-4.button-green.reg_btn.js-sign-in-submit"));
        SubmitButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.close();

    }

}
