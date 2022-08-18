import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class NotificationMessagesTest extends BaseTest {


    @Test
    public void notificationMessages() {
        driver.get(URL + "/notification_message_rendered");
        driver.findElement(By.xpath("//a [text() = 'Click here']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boolean notice = driver.findElement(By.xpath("//div[@class='flash notice']")).isDisplayed();
        assertTrue(notice, "Cообщение не отображается");
    }
}
