package Class01HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("www.google.com");
        driver.navigate().to("https://www.syntaxprojects.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();
    }
}
