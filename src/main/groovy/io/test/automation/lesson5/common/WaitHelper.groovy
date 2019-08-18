package io.test.automation.lesson5.common

import com.codeborne.selenide.Condition
import com.codeborne.selenide.SelenideElement
import com.codeborne.selenide.WebDriverRunner
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.WebDriverWait


class WaitHelper {
    static boolean isJQueryReady() {
            new WebDriverWait(driver, 25).until({
                try {
                    return executeJavaScript("return jQuery.active == 0")
                } catch (Throwable e) {
                }
            })
}

    static WebDriver getDriver() {
            if (WebDriverRunner.hasWebDriverStarted()) {
                return WebDriverRunner.webDriver
            } else {
                throw new Exception("Что-то пошло не так..")
            }
        }

    static <T> T executeJavaScript(String jsCode, Object... arguments) {
            return (T) ((JavascriptExecutor) driver).executeScript(jsCode, arguments)
        }

    static void waitUntilDisplayed(SelenideElement element) {
        element.waitUntil(Condition.visible, 60000)

}

}
