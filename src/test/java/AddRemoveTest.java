import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class AddRemoveTest  extends BaseTest {


    @Test
    public void addRemoveElement() {
        driver.get(URL+"/add_remove_elements/");
        driver.findElement(By.xpath("//button[text() = 'Add Element']")).click();
        driver.findElement(By.xpath("//button[text() = 'Add Element']")).click();
        driver.findElements(By.xpath("//button[text() = 'Delete']")).get(1).click();
        int deleteButtons = driver.findElements(By.xpath("//button[text() = 'Delete']")).size();
        assertEquals(deleteButtons,1,"Количество кнопок не совпало");
    }


}
