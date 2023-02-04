import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {



        WebDriver driver = new ChromeDriver(); // instantiating ChromeDriver

        driver.manage().window().fullscreen();

        driver.get("https://www.google.com/"); // Navigate to our URL

        String title = driver.getTitle();
        System.out.println(title);


        driver.quit(); // quit driver

    }

}
