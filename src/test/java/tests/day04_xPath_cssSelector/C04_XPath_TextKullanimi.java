package tests.day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_XPath_TextKullanimi {
    public static void main(String[] args) {


   /*
        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        2- Add Element butonuna basin
        3- Delete butonu’nun gorunur oldugunu test edin
        4- Delete tusuna basin
        5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

             */

        System.setProperty("webdriver.chrome.driver", "Kurulum_Dosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        // 2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();

        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deletebutonu = driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deletebutonu.isDisplayed()) {
            System.out.println("delete passed");
        } else {
            System.out.println("delete failed");
        }

        // 4- Delete tusuna basin
        deletebutonu.click();


        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement rEMOVEyAZISI = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));

        if (rEMOVEyAZISI.isDisplayed()) {
            System.out.println("remove passed");
        } else {
            System.out.println("remove Failed");
        }

        driver.close();
    }
}
