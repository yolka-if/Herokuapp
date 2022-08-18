import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoversTest extends BaseTest {

    @Test
    public void hovers() {
        driver.get(URL + "/hovers");
        Actions action = new Actions(driver);
        WebElement img = driver.findElement(By.xpath("//img[@src='/img/avatar-blank.jpg']"));
        action.moveToElement(img).moveToElement(driver.findElement(By.xpath("//a[text() = 'View profile']"))).click().build().perform();
    }
}
