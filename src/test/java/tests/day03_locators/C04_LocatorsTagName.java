package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_LocatorsTagName {
    public static void main(String[] args) throws InterruptedException {
        /*
        1- Bir test class’i olusturun ilgili ayarlari yapin
        2- https://www.automationexercise.com/ adresine gidin
        3- Sayfada 147 adet link bulundugunu test edin.
        4- Products linkine tiklayin
        5- special offer yazisinin gorundugunu test edin
        6- Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver","Kurulum_Dosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.automationexercise.com/");

        List<WebElement> linkListesi=driver.findElements(By.tagName("a"));

        int expactedLinkSayisi=147;
        int actualLInkSayisi=linkListesi.size();
        if (actualLInkSayisi==expactedLinkSayisi){
            System.out.println("Test Passed");
        }else {
        System.out.println("Test Failed");}

        driver.findElement(By.partialLinkText("Products")).click();



        Thread.sleep(4000);
        driver.close();

    }
}
