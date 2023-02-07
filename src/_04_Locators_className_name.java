import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Waiter;

public class _04_Locators_className_name {
    public static void main(String[] args) {

    /*
    Go to https://techglobal-training.netlify.app/
    Select “Frontend Testing” from the “Practices” dropdown
    Select the “Locators” card
    Validate the “Kiwi”, “Orange” and “Grapes” items are displayed

     */
             try {
                 //1- Set up
                 WebDriver driver = Driver.getDriver();

                 //2- Validation
                 driver.get("https://techglobal-training.netlify.app/");
                 Waiter.pause(2);

                 driver.findElement(By.id("dropdown-button")).click();
                 driver.findElement(By.id("frontend-option")).click();




             } catch (Exception e) {
                 System.out.println("TEST FAILED due to: " + e.getMessage());
             }

             finally {
                 //3-Teardown
                 Driver.quitDriver();
             }


    }
}