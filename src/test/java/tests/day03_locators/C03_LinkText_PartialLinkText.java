package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LinkText_PartialLinkText {
    public static void main(String[] args) throws InterruptedException {


        /*
            locator olarak By.linkText() kullaniyorsak
            <a> </a> arasindaki tum karakterleri kullanmaliyiz
            bosluk, ozel karakter, harf veya rakam olmasina bakmaksizin
            tum araligi kopyalamaliyiz

            Eger tum yaziyi degil de, bir kismini kullanmak isterseniz
            By.linkText() yerine By.partialLinkText() kullanabilirsiniz

         */


        // amazon anasayfaya gidin

        // Gift Cards linkine tiklayin

        // linkin bizi Gift Cards sayfasina yonlendirdigini test edin


        System.setProperty("webdriver.chrome.driver","Kurulum_Dosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");


       // driver.findElement(By.linkText("Gift Cards")).click(); **   Calisti

        driver.findElement(By.partialLinkText("Gift")).click();

        WebElement giftCardYAziElementi=driver.findElement(By.className("nav-menu-logo"));

        if (giftCardYAziElementi.isDisplayed()){
            System.out.println(" Gift       Passed");
        }else {
            System.out.println(" gift Failed");
        }


        Thread.sleep(3000);
        driver.close();

    }
}
