import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Driver_Navigation {

    /*
      Go to https://www.techglobalschool.com
      Refresh the page
      Navigate to https://www.amazon.com/
      Navigate back to TechGlobal website
      Navigate forward Amazon website
      Validate the URL of the page
      Validate the title of the page

EXPECTED RESULT:
URL  = https://www.amazon.com/
Title = Amazon.com. Spend less. Smile more.

 */

    public static void main(String[] args) {

        // 1 - Set up
        System.setProperty("webdriver.com.driver", "C:\\Users\\user\\IdeaProjects\\initial_selenium_project_5\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 2- Validation
        driver.get("https://www.techglobalschool.com");
        driver.navigate().refresh();
        driver.navigate().to(" https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();

        if(driver.getCurrentUrl().equals("https://www.amazon.com/"))
            System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED");

      if(driver.getTitle().equals("Amazon.com. Spend less. Smile more.")) System.out.println("Title validation PASSED");
      else System.out.println("Title validation FAILED ");


        // 3- Teardown

        driver.quit();

    }

}
