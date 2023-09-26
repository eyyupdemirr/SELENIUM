package tests.day04_xPath_cssSelector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_RelativeLocators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Kurulum_Dosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));






    }
}
