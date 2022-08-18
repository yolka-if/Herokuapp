import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SortableDataTablesTest extends BaseTest {

    @Test
    public void sortableDataTables() {
        driver.get(URL + "/tables");
        String value = driver.findElement(By.xpath("//table//tr[1]//td[1]")).getAttribute("innerText");
        assertEquals(value, "Smith", "Значение не соответсвует тому, что должно быть");
        String value1 = driver.findElement(By.xpath("//table//tr[2]//td[1]")).getAttribute("innerText");
        assertEquals(value1, "Bach", "Значение не соответсвует тому, что должно быть");
        String value2 = driver.findElement(By.xpath("//table//tr[2]//td[2]")).getAttribute("innerText");
        assertEquals(value2, "Frank", "Значение не соответсвует тому, что должно быть");
        String value3 = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getAttribute("innerText");
        assertEquals(value3, "John", "Значение не соответсвует тому, что должно быть");

    }
}
