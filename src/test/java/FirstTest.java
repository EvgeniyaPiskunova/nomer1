import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public static void titleTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/eapiskunova/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        //  navigate to url
        driver.get("https://www.selenium.dev/");

        //click on Documentation text button on header
        WebElement documentationTextButton = driver.findElement(By.xpath("//nav/a[3]"));
        documentationTextButton.click();

        //type 'element' in search field
        Thread.sleep(1000);
        driver.findElement(By.id("search-by")).sendKeys("element");

        // click first result
        Thread.sleep(1000);
        WebElement firstResult = driver.findElement(By.xpath("//div[@data-title='Web element']"));
        firstResult.click();
        
        // assert text 'web element' on header
        WebElement pageTitleWE = driver.findElement(By.tagName("h1"));
        String pageTitle = pageTitleWE.getText();
        Assert.assertEquals(pageTitle, "Web element");
        driver.quit();
    }
//    @Test
//    public void simpleTest() {
//        System.out.println(
//                "Sergey".equals(StringUtils.capitalize("sergey")));
//    }
//
//    @Test
//    public void numberTest() {
////        System.out.println(
////                "12345".equals(StringUtils.capitalize("12345")));
////
//        Assert.assertEquals(
//                Main.pad("Sergey", 10, "!"),
//                "Sergey!!!");
//
//    }
//
//    @Test
//    public void nullTest() {
//        System.out.println(
//                null == StringUtils.capitalize(null));
//    }
//
//    @Test
//    public void emptyTest() {
////        System.out.println(
//        Main.pad(null, 10, "!");// что это?
//        // " ".equals(StringUtils.capitalize(" ")));
//    }
//
//    @Test(expectedExceptions = RuntimeException.class)
//    public void errorTest() {
//        Main.pad("Sergey", 10, "!");
//    }
}


