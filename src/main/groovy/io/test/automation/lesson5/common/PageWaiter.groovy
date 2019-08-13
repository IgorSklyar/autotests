package io.test.automation.lesson5.common

import com.codeborne.selenide.WebDriverRunner
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.WebDriverWait



    class PageWaiter {

        static boolean isJQueryReady() {

            new WebDriverWait(driver, 25).until({
                try {
                    return executeJavaScript("return jQuery.active == 0")
                } catch (Throwable e) {
                    return false
                }
            })
        }

        static WebDriver getDriver() {
            if (WebDriverRunner.hasWebDriverStarted()) {
                return WebDriverRunner.webDriver
            } else {
                return null
            }
        }

        static <T> T executeJavaScript(String jsCode, Object... arguments) {
            return (T) ((JavascriptExecutor) driver).executeScript(jsCode, arguments)
        }

    }
