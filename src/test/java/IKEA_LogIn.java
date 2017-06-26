import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by valya on 03.06.2017.
 */
public class IKEA_LogIn {

    //public static void main(String[] args) {


    @Test
    public void siteLogin() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://ikea.net.ua");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement submitElement1 = driver.findElement(By.xpath("html/body/section[1]/div/div[3]/div[2]/p/a[1]"));
        submitElement1.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement emailElement = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/form/input[1]"));
        emailElement.clear();
        emailElement.sendKeys("valyamaystro@gmail.com");

        WebElement passwordElement = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/form/input[2]"));
        passwordElement.clear();
        passwordElement.sendKeys("T2718281t");

        WebElement submitElement2 = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/form/input[4]"));
        submitElement2.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.close();
    }

}
