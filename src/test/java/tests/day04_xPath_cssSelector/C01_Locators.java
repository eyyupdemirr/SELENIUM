package tests.day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Locators {
    public static void main(String[] args) throws InterruptedException {

    /*
    1- https://www.amazon.com/ sayfasına gidin.
    2- Arama kutusuna “city bike” yazip aratin
    3- Görüntülenen sonuçların sayısını yazdırın
     4- Listeden ilk urunun resmine tıklayın.
    */

        System.setProperty("webdriver.chrome.driver", "Kurulum_Dosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

        WebElement sonucSayisi = driver.findElement(By.className("sg-col-inner"));
        System.out.println(sonucSayisi.getText());

        driver.findElement(By.className("aok-relative")).click();

        List<WebElement> urunlerListesi=driver.findElements(By.className("s-image"));
        urunlerListesi.get(12).click();

        Thread.sleep(3000);
      driver.close();


    }

}
