import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyTestPipeLine {

    public static void main(String [] arr)
    {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://sumoquoteweb-qa.azurewebsites.net/new-account");
       driver.findElement(By.id("accountName")).sendKeys("TestDummy");
        driver.findElement(By.id("firstName")).sendKeys("James");
        driver.findElement(By.id("lastName")).sendKeys("Keall");
        driver.findElement(By.id("emailAddress")).sendKeys("james@gmails.coms");
        driver.findElement(By.id("phoneNumber")).sendKeys("97868657574");
        driver.findElement(By.id("Password")).sendKeys("James@1234");
        driver.findElement(By.id("repeatPassword")).sendKeys("James@1234");
       WebElement element = driver.findElement(By.id("howHeard"));
       Actions actions = new Actions(driver);
       actions.moveToElement(element).click().build().perform(); // DROP DOWN CLICK
        driver.findElement(By.xpath("(//div[@class='v-list-item__title'])[4]")).click();
        WebElement element1 = driver.findElement(By.id("disclaimerAgree"));
//        actions.moveToElement(element1).click().build().perform();
        driver.findElement(By.id("disclaimerAgree")).click();
        driver.findElement(By.xpath("//button[@type='button']//span[contains(text(),'Save')]")).click();
//        driver.close();
    }
}
