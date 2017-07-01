import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class OlxTest {

    private static final String HOME_PAGE = "https://www.olx.ua/";
    private static final String BUTTON_MY_PROFILE_ID = "topLoginLink";
    private static final String INPUT_EMAIL_ID = "userEmail";
    private static final String INPUT_PASSWORD_ID = "userPass";
    private static final String BUTTON_SE_USER_LOGIN_ID = "se_userLogin";
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    @Test
    public void navigateToOlxAndLogin() throws Exception {
        String email = "NataliKovOst@ukr.net";
        String password = "zzzhhhyyy";

        driver.manage().window().maximize();
        driver.get(HOME_PAGE);
        driver.findElement(By.id(BUTTON_MY_PROFILE_ID)).click();

        WebElement inputLogin = driver.findElement(By.id(INPUT_EMAIL_ID));
        inputLogin.clear();
        inputLogin.sendKeys(email);

        WebElement inputPassword = driver.findElement(By.id(INPUT_PASSWORD_ID));
        inputPassword.clear();
        inputPassword.sendKeys(password);

        driver.findElement(By.id(BUTTON_SE_USER_LOGIN_ID)).click();
    }

    @After
    public void initialize() {
        driver.close();
    }

}
