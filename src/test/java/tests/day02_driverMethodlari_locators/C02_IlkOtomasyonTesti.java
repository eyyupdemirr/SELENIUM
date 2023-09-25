package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkOtomasyonTesti {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Kurulum_Dosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

      //  2. Yeni bir class olusturalim : C03_GetMethods
      //  3. Amazon sayfasina gidelim. https://www.amazon.com/

        driver.get("https://www.amazon.com");

      //  4. Sayfa basligini(title) yazdirin

        System.out.println("Title  "+driver.getTitle());

        // 5. Sayfa basliginin “Amazon” icerdigini test edin

        String baslik="Amazon";
        String gBaslik=driver.getTitle();
        if (gBaslik.contains(baslik)){
            System.out.println( "   baslik PASSED");
        }else {
            System.out.println("baslik FAILED");
        }

      //  6. Sayfa adresini(url) yazdirin

        System.out.println("Url "+driver.getCurrentUrl());

        // 7. Sayfa url’inin “amazon” icerdigini test edin.

        String url="amazon";
        String gUrl=driver.getCurrentUrl();

        if (gUrl.contains(url)){
            System.out.println("  url PASSED  ");
        }else {
            System.out.println(" url FAILED");
        }

      //  8. Sayfa handle degerini yazdirin

        System.out.println("handle   "+driver.getWindowHandle());

        // 9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin

        String htmlicerik="alisveris";
        String gHtmlIcerik=driver.getPageSource();

        if (gHtmlIcerik.contains(htmlicerik)){
            System.out.println(" html  PASSSED");
        }else {
            System.out.println("   html FAILED");
            System.out.println("sayfa kaynak  kodlari '"+htmlicerik+" ' kelimesi icermiyor.");
        }


      //  10. Sayfayi kapatin.
        Thread.sleep(3000);
        driver.close();



    }
}
