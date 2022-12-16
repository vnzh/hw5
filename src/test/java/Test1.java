import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test1 {

    private WebDriver driver;

    @BeforeAll
    public void iGetGooglePage() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
                options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com/");
    }

    @Test
    void test1 (){
        driver.get("https://www.livejournal.com/");
        WebElement webElement1 = driver.findElement(By.xpath(
                "//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[2]/ul/li[2]/a[@href=\"https://www.livejournal.com/login.bml?returnto=https://www.livejournal.com/&ret=1\"]"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.xpath("//*[@id=\"user\"]"));
        webElement2.click();
        webElement2.sendKeys("capiw71256");


        WebElement webElement3 = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div/div[2]/form[1]/div/div[3]/div/label[2]"));
        webElement3.click();
        WebElement webElement4 = driver.findElement(By.xpath("//*[@id=\"lj_loginwidget_password\"]"));
        webElement4.click();
        webElement4.sendKeys("Lfplhfgthvf!1");
        webElement4.submit();

    }

}
