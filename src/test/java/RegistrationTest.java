import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class RegistrationTest {

    @Test
    public void navigateArtMarketAndRegister() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://art-market.com.ua/");

        WebElement loginButton = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div[1]/div/div[1]/ul/ul[2]/li[5]/a"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement createAccountButton = driver.findElement(By.xpath(".//*[@id='login-form']/div[2]/div[1]/div/button"));
        createAccountButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement firstNameField = driver.findElement(By.xpath(".//*[@id='firstname']"));
        firstNameField.clear();
        firstNameField.sendKeys("User");

        WebElement lastNameField = driver.findElement(By.xpath(".//*[@id='lastname']"));
        lastNameField.clear();
        lastNameField.sendKeys("Anonym");

        DateFormat df = new SimpleDateFormat("ddMMyyyyHHmmss");
        Date today = Calendar.getInstance().getTime();
        String todayDate = df.format(today);
        String newmail = "mymail+" + todayDate + "@gmail.com";

        WebElement emailField = driver.findElement(By.xpath(".//*[@id='email_address']"));
        emailField.clear();
        emailField.sendKeys(newmail);

        WebElement passwordField = driver.findElement(By.xpath(".//*[@id='password']"));
        passwordField.clear();
        passwordField.sendKeys("Plokijuh1");

        WebElement passwordConfirmationField = driver.findElement(By.xpath(".//*[@id='confirmation']"));
        passwordConfirmationField.clear();
        passwordConfirmationField.sendKeys("Plokijuh1");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement contactUsLink = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div[2]/div[1]/div[1]/div/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(contactUsLink).build().perform();

        WebElement submitFormButton = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[3]/button"));
        submitFormButton.click();


        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.close();
    }
}
