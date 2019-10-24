import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
    WebDriver driver;

    @BeforeTest
    public void invokeBrowser(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://hrm.pragmatictestlabs.com/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Ptl@#321");
        driver.findElement(By.id("btnLogin")).click();
    }

    @Test(priority = 1)
    public void assignLeave(){ driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/span")).click();
       driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys("Johann Adella Abshire");
       WebElement a = driver.findElement(By.id("assignleave_txtLeaveType"));
       a.findElement(By.xpath("//*[@id=\"assignleave_txtLeaveType\"]/option[3]"));
       driver.findElement(By.id("assignleave_txtFromDate")).sendKeys("2019-10-28");
       driver.findElement(By.id("assignleave_txtToDate")).sendKeys("2020-01-10");
    }

}