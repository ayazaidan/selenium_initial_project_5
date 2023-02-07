import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Locators_id {
    public static void main(String[] args) throws InterruptedException {
        /*
        Go to https://techgobal-training.netlify.app/
        Validate that company logo
         */

        //1- Setup - before action

        System.setProperty("webdriver.com.driver", "C:\\Users\\user\\IdeaProjects\\initial_selenium_project_5\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- validation - action

        driver.get("https://techgobal-training.netlify.app/");
        Thread.sleep(2000);

        WebElement logo = driver.findElement(By.id("logo"));
        if (logo.isDisplayed()) System.out.println("Logo validation passed");
        else System.out.println("logo Validation FAILED");


        //3- Teardown - after action

        driver.quit();


    }
}
