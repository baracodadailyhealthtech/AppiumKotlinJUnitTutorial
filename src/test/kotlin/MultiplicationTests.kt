/*
 * Copyright (C) 2021 Baracoda Daily Healthtech
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and limitations
 * under the License.
 */
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
