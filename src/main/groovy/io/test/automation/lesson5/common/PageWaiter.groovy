package io.test.automation.lesson5.common

import com.codeborne.selenide.WebDriverRunner
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.WebDriverWait



    class PageWaiter {
        static boolean waitForJSandJQueryToLoad() {

            WebDriverWait wait = new WebDriverWait(driver, 30)

            // wait for jQuery to load
            ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
                @Override
                Boolean apply(WebDriver driver) {
                    try {
                        return ((Long)((JavascriptExecutor)getDriver()).executeScript("return jQuery.active") == 0)
                    }
                    catch (Exception e) {
                        // no jQuery present
                        return true
                    }
                }
            }

            // wait for Javascript to load
//            ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
//                @Override
//                Boolean apply(WebDriver driver) {
//                    return ((JavascriptExecutor)getDriver()).executeScript("return document.readyState")
//                            .toString().equals("complete")
//                }
//            }

          return wait.until(jQueryLoad)
            //&& wait.until(jsLoad)
        }







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
