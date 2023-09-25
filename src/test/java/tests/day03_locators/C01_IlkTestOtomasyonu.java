package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_IlkTestOtomasyonu {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Kurulum_Dosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // amazon anasayfaya gidin

        driver.get("https://www.amazon.com");

        // arama kutusuna "Nutella" yazdirip aratin


        // once arama kutusunu findElement() ve Locator ile driver'a tanitip
        // o webelemnti bu class'da kullanabilecegim sekilde kaydetmeliyim

        //   driver.findElement(By.id("twotabsearchtextbox"));  // burasi web elementi getirir.

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));  //webelementobjesine atadik.

        // arama kutusuna "Nutella" yazdirip aratin
          /*
        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();

        bu islemi 2 satirda yapmak yerine isterseniz
        asagidaki gibi de yapabilirsiniz
         */

        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        // arama sonuclarinin "Nutella" icerdigini test edin



        // arama sonuclarinin "Nutella" icerdigini test edin


        // By.className locator'i class attribute'unun degeri bosluk icerdiginde
        // saglikli CALISMAZ
        // Cogunlukla class ismi ayni ozelliklerdeki webelementleri gruplandirmak icin kullanilir
        // Biz de class degeri sg-col-inner arattigimizda 73 tane webelement buldu.

      //  WebElement aramaSonucElementi = driver.findElement(By.className("sg-col-inner"));


        // WebElement aramaSonucElementi=driver.findElement(By.className("a-section a-spacing-small a-spacing-top-small"));


       // System.out.println("a1" + aramaSonucElementi);                   // referansi yazdirir
       // System.out.println("a2" + aramaSonucElementi.getText());        //  normal yazdirir

        driver.findElements(By.className("sg-col-inner"));
        List<WebElement> elementlerListesi=driver.findElements(By.className("sg-col-inner"));
        String actualAramaSonuclari=elementlerListesi.get(0).getText();

        System.out.println(actualAramaSonuclari);
        String expectedIcerik="Nutella";

        if (actualAramaSonuclari.contains(expectedIcerik)){
            System.out.println("Nutella passed");
        }else {
            System.out.println("Nutella  failled");
        }


        Thread.sleep(4000);
        driver.close();
    }
}
