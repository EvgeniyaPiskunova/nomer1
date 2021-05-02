package exemple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/eapiskunova/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //xPath
        WebElement input = driver.findElement(By.className("gLFyf"));
        input.sendKeys( "123\n");
        WebElement result = driver.findElement(By.xpath("//h3[text(='Jess Glynne -123[Official Live Video]-You Tube']"));
        input.sendKeys();
        Thread.sleep(5000);
        driver.quit();


    }


}


