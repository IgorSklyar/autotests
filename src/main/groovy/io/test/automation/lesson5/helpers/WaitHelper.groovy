package io.test.automation.lesson5.helpers

import com.codeborne.selenide.WebDriverRunner
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.TimeoutException
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.WebDriverWait

class WaitHelper {
    static void waitJQueryReady() {
        try {
            new WebDriverWait(driver, 25).until({
                try {
                    return executeJavaScript("return jQuery.active == 0")
                } catch (Throwable e) {
                    return false
                }
            })
        } catch (TimeoutException exception) {
            println("Страница не загружена: ${exception}")
        }
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
}
