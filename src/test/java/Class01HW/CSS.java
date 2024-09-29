package Class01HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW06 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");
        WebElement userID=driver.findElement(By.cssSelector("input#UserID"));
        userID.sendKeys("3553");
        WebElement userName=driver.findElement(By.cssSelector("input#UserName"));
        userName.sendKeys("Jonathan Max");
        WebElement lecture=driver.findElement(By.cssSelector("input[name*=LectureIntro]"));
        lecture.sendKeys("First lecture");

        WebElement feedbackRay =driver.findElement(By.cssSelector("input[id*='FromRay']"));
        feedbackRay.sendKeys("First lecture went well");

        WebElement feedbackDucky=driver.findElement(By.cssSelector("input[id*='Ducky']"));
        feedbackDucky.sendKeys("More topics");
        WebElement clientID =driver.findElement(By.cssSelector("input[name^='Client']"));
        clientID.sendKeys("5335");
        WebElement email=driver.findElement(By.cssSelector("input[name*='email']"));
        email.sendKeys("Max@samsung.com");
        WebElement courseTopic =driver.findElement(By.cssSelector("input[name*='Topic']"));
        courseTopic.sendKeys("Python");

    }
}
