import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_URL_and_Title_Validation {
    public static void main(String[] args) throws InterruptedException {

        /*
        Test case :
        go to https://techglobalschool.com
        get current URL
        Get title and validate it

        Expected result
        URL : https://techglobalschool.com/
        Title : SDET Bootcamp | TechGlobal
         */


        //1. Set up

        System.setProperty("webdriver.com.driver", "C:\\Users\\user\\IdeaProjects\\initial_selenium_project_5\\chromedriver.exe" );

        WebDriver driver = new ChromeDriver();


        //2. Validation
        driver.get("https://techglobalschool.com/"); // no caches

        if(driver.getTitle().equals("SDET Bootcamp | TechGlobal")) System.out.println("Title validation Passed");
        else System.out.println("Test Validation FAILED");

        if (driver.getCurrentUrl().equals("https://techglobalschool.com/")) System.out.println("URL validation PASSED ");
        else System.out.println("Test Validation Failed");


         //  Teardown
         Thread.sleep(2000);
        driver.quit();

    }
}
