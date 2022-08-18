import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTest {

    @Test
    public void dropdown() {
        driver.get(URL + "/dropdown");
        WebElement element = driver.findElement(By.id("dropdown"));
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText("Option 1");
        boolean isSekected = dropdown.getFirstSelectedOption().isSelected();
        assertTrue(isSekected, "Element is not selected");
        dropdown.selectByVisibleText("Option 2");
        boolean isSekected2 = dropdown.getFirstSelectedOption().isSelected();
        assertTrue(isSekected2, "Element is not selected");
        int numberOfElements = driver.findElements(By.xpath("//option")).size();
        assertEquals(numberOfElements, 3, "Количесво элементов в дропдауне не равно трём.");
    }
}
