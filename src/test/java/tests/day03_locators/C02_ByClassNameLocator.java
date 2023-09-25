package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassNameLocator {
    public static void main(String[] args) throws InterruptedException {


        /*
        1- Bir test class’i olusturun ilgili ayarlari yapin
        2- https://www.automationexercise.com/ adresine gidin
        3- Category bolumundeki elementleri locate edin
        4- Category bolumunde 3 element oldugunu test edin
        5- Category isimlerini yazdirin
        6- Sayfayi kapatin
        automationexercise.com
        Automation Exercise
        This is for automation practice
         */


        //1- Bir test class’i olusturun ilgili ayarlari yapin

        System.setProperty("webdriver.chrome.driver","Kurulum_Dosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 2- https://www.automationexercise.com/ adresine gidin

        driver.get("https://www.automationexercise.com/");

        // 3- Category bolumundeki elementleri locate edin

        List<WebElement> categoryList=driver.findElements(By.className("panel-title"));

        //4- Category bolumunde 3 element oldugunu test edin

        int expectedCtegorySayisi=3;
        int actualCategorySAyisi=categoryList.size();


        if (actualCategorySAyisi==expectedCtegorySayisi){
            System.out.println("Category sayisi Passed");
        }else {
            System.out.println(" Category sayisi Failed");
        }

       // 5- Category isimlerini yazdirin

      //  System.out.println(categoryList);             ***Referanslari yazdirir
        
        // Webelement'lerden olusan bir listeyi, direk yazdiramayiz
        // WebElementler uzerindeki yazilari yazdirmak istersek
        // for-each loop ile her WebElementi ele alip
        // uzerindeki yaziyo yazdirabiliriz

        for (WebElement each:categoryList
             ) {
            System.out.println(each.getText());
        }
        

        // 6- Sayfayi kapatin

        Thread.sleep(3000);
        driver.close();

    }
}
