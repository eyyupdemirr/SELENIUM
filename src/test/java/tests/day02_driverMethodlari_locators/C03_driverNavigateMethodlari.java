package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_driverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();   // Selenium'un kendi webdriver'ini kullanir.
        driver.get("https://www.amazon.com");


        // sayfa basliginin "smile more" icerdigini test edin

        String expectedTitleIcerik = "smile more";
        String actualTitleIcerik = driver.getTitle();
        if (actualTitleIcerik.contains(expectedTitleIcerik)) {
            System.out.println("Title    :     Passed");
        } else {
            System.out.println("Title   :Failed");
            System.out.println(actualTitleIcerik);
        }

        // youtube anasayfaya gidin

        driver.navigate().to("https://www.youtube.com");

        // url'in "youtube" icerdigini test edin

        String expectedUrlIcerik = "youtube";
        String actualUrlIcerik = driver.getCurrentUrl();

        if (actualUrlIcerik.contains(expectedUrlIcerik)) {
            System.out.println("Url    :  passed");
        } else {
            System.out.println("url       :   failed");
        }

        // tekrar amazon anasayfaya donun

        driver.navigate().back();

        // ve url'in "ramazon" icermedigini test edin

        String unExpectedUrlicerik = "ramazon";

        actualUrlIcerik = driver.getCurrentUrl();
        if (actualUrlIcerik.contains(unExpectedUrlicerik)) {
            System.out.println("url ramazon failed");
        } else {
            System.out.println("url ramazon passed");
        }


        // tekrar youtube anasayfaya gidin

        driver.navigate().back();

        // sayfa kaynak kodlarinda "music" gectigini test edin
        String expectedSayfaIcerik = "music";
        String actualSayfaKaynakKodlari = driver.getPageSource();

        if (actualSayfaKaynakKodlari.contains(expectedSayfaIcerik)) {
            System.out.println("kaynak kodlari Passed");
        } else {
            System.out.println("kaynak kodlari failed");
        }


        // sayfayi kapatin

        Thread.sleep(3000);
        driver.close();


    }
}
