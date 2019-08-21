package io.test.automation.lesson5.pages

import org.openqa.selenium.By
import static com.codeborne.selenide.Selenide.$
import static com.codeborne.selenide.Selenide.$$

class ProductsPage {

    static getAllProducts() {
        $$(By.xpath("//div[@id='box-most-popular']//ul[@class='listing-wrapper products']"))
    }

    static getProductName() {
        $(By.xpath('//div[@id=\'box-product\']//h1[@class=\'title\']'))
    }

    static getProductPrice() {
        $(By.xpath('//div[@id=\'box-product\']//div[@class=\'price-wrapper\']/span[@class=\'price\']'))
    }
}
