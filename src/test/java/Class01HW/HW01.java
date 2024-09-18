package Class01HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.syntaxprojects.com");
        driver.manage().window().maximize();
        String currentUrl=driver.getCurrentUrl();
        System.out.println("the current url is: "+currentUrl);
        String title=driver.getTitle();
        System.out.println("the title is: "+title);
        driver.close();
    }
}
