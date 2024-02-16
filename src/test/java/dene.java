import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.*;

public class dene {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver=null;

        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.get("https://www.tr724.com/");
        System.out.println("Develop comment2");
        String a="Ali";



        Thread.sleep(10000);
    }
}
