package io.test.automation.lesson5.pages

import org.openqa.selenium.By
import static com.codeborne.selenide.Selenide.$

class OrderSuccessfulPage {

    static getOrderSuccessful() {
        $(By.xpath('//div[@id=\'box-order-success\']'))
    }
}