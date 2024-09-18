package Class01HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW03 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");

        driver.manage().window().maximize();

        WebElement fullName =driver.findElement(By.id("fullName"));
        fullName.sendKeys("Joyan mark");

        WebElement email=driver.findElement(By.name("yourEmail"));
        email.sendKeys("www.Joyan@23.com");

        WebElement ClientName=driver.findElement(By.id("clientNameId"));
        ClientName.sendKeys("Peter");

        WebElement ClientId=driver.findElement(By.name("ClientId"));
        ClientId.sendKeys("23123");

        WebElement ClientFeedback=driver.findElement(By.id("ClientfeedbackId"));
        ClientFeedback.sendKeys("okay");

        WebElement projectName =driver.findElement(By.name("ProjectName"));
        projectName.sendKeys("Home Works");

        WebElement ProjectDeadLine=driver.findElement(By.id("ProjectTimeId"));
        ProjectDeadLine.sendKeys("20/9/24");

        WebElement currentAddress=driver.findElement(By.name("CurrentAddress"));
        currentAddress.sendKeys("Amsterdam");

        WebElement PermanentAddress=driver.findElement(By.id("PermanentAddressId"));
        PermanentAddress.sendKeys("Amsterdam Central");

        WebElement Submit=driver.findElement(By.name("btn-submit"));
        Submit.click();

        WebElement clickHere=driver.findElement(By.linkText("Click Here."));
        clickHere.click();
    }
}
