package tests.day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_XPath {
    public static void main(String[] args) {
        /*
        2- https://www.amazon.com/ adresine gidin
        3- Browseri tam sayfa yapin
        4- Sayfayi “refresh” yapin
        5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        6- Gift Cards sekmesine basin
        7- Birthday butonuna basin
        8- Best Seller bolumunden ilk urunu tiklayin
        9- Gift card details’den 25 $’i secin
        10-Urun ucretinin 25$ oldugunu test edin
        11-Sayfayi kapatin

        */

        System.setProperty("webdriver.chrome.driver","Kurulum_Dosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      //  2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();

        // 4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedTitle="Spend less";
        String actualtitle=driver.getTitle();

        if (actualtitle.contains(expectedTitle)){
            System.out.println("Title PASSED");
        }else{
            System.out.println("Title FAILED");
        }

            //6- Gift Cards sekmesine basin
        driver.findElement(By.linkText("Gift Cards")).click();

            //7- Birthday butonuna basin
        driver.findElement(By.linkText("Specialty Gift Cards")).click();

            //8-ilk urunu tiklayin
        driver.findElement(By.xpath("(//li[@class='a-carousel-card acswidget-carousel__card'])[1]")).click();

        //9- Gift card details’den 25 $’i secin
        driver.findElement(By.id("gc-mini-picker-amount-2")).click();

        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement urunFiyati=driver.findElement(By.xpath("//div[@id='gc-live-preview-amount-container']"));
        System.out.println(urunFiyati.getText());
        String expectedUunUcreti="25$";
        String actualUcret=urunFiyati.getText();

            if (actualUcret.equals(expectedUunUcreti)){
                System.out.println(" Ucret Passed");
            }else {
                System.out.println("Ucret Failed");
            }


        //  11-Sayfayi kapatin
        driver.close();

    }
}
