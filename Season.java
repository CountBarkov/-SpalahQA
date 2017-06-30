import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by Zver on 29.06.2017.
 */
public class Season {
    @Test
    public void navigeteToSeasonvarpensomepage()
    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://seasonvar.ru/");
        WebElement Button = driver.findElement(By.cssSelector(".svico-user"));
        Button.click();
        WebElement reg = driver.findElement(By.cssSelector(".loginbox-login-u>a"));
        reg.click();

        WebElement inputField = driver.findElement(By.xpath(".//*[@id='svmodal-in']/div/div/form/div[1]/input[1]"));
        inputField.sendKeys("qattojiti-1045@yopmail.com");
        WebElement pas = driver.findElement(By.xpath(".//*[@id='svmodal-in']/div/div/form/div[1]/input[2]"));
        pas.click();
        pas.sendKeys("456G0987");
        WebElement pas2 = driver.findElement(By.xpath(".//*[@id='svmodal-in']/div/div/form/div[1]/input[3]"));
        pas2.click();
        pas2.sendKeys("456G0987");

        WebElement Button2 = driver.findElement(By.xpath(".//*[@id='svmodal-in']/div/div/form/div/button"));
        Button2.click();

    }
}
