import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://moodle.itfac.mrt.ac.lk/login/index.php");
        driver.findElement(By.id("username")).sendKeys("165072p");
        driver.findElement(By.id("password")).sendKeys("19@/Ab*/");
        driver.findElement(By.id("loginbtn")).click();
        System.out.println("User login successfully");
        driver.close();

    }
}
