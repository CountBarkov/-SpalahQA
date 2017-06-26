import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by valya on 19.06.2017.
 */
public class IKEA_registration {

    @Test
    public void registration() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://ikea.net.ua");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement submitElement1 = driver.findElement(By.xpath(".//*[@id='line']/div/div[3]/div[2]/p/a[2]"));
        submitElement1.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement nameElemant = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/form/input[1]"));
        nameElemant.sendKeys("Валентина");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement submitElement2 = driver.findElement(By.xpath("html/body/div[2]"));
        submitElement2.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement emailElement = driver.findElement(By.xpath("html/body/div[2]"));
        emailElement.sendKeys("valyamaystro@gmail.com");

        WebElement submitElement3 = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/form/input[3]"));
        submitElement3.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement passwordElement = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/form/input[3]"));
        passwordElement.sendKeys("0996681223");

        WebElement addsElement = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/form/textarea"));
        addsElement.sendKeys("Отделение № 23, г. Харьков, ул. Академика Павлова, д. 134/16");

        WebElement passElement = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/form/input[4]"));
        passElement.sendKeys("T2718281t");

        WebElement repassElement = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/form/input[5]"));
        repassElement.sendKeys("T2718281t");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement submitElement4 = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/form/input[7]"));
        submitElement4.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.close();
    }

}
