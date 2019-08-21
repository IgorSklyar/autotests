package io.test.automation.lesson5.pages

import org.openqa.selenium.By
import static com.codeborne.selenide.Selenide.$

class CartPage {

    static getCartItemsCounter() {
        $(By.xpath('//div[@id=\'cart\']/a[2]'))
    }

    static getTotalPriceElement() {
        $(By.xpath('//td[@class=\'sum\']'))
    }

    static getUnitCostElement() {
        $(By.xpath('//td[@class=\'unit-cost\']'))
    }
}

