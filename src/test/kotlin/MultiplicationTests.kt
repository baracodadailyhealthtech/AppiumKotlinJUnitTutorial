
import org.junit.jupiter.api.Test
import org.openqa.selenium.By
import kotlin.test.assertEquals

class MultiplicationTests : AppiumSetup() {
    @Test
    fun `Simple multiplication give correct result`() {
        driver.findElement(By.id(DIGIT_5)).click()
        driver.findElement(By.id(MULTIPLICATION)).click()
        driver.findElement(By.id(DIGIT_8)).click()
        driver.findElement(By.id(EQUAL)).click()
        val result = driver.findElement(By.className("android.widget.TextView")).text
        assertEquals("40", result)
    }
}
