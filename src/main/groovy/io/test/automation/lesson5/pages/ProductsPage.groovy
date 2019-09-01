package io.test.automation.lesson5.pages

import io.qameta.allure.Attachment
import org.openqa.selenium.By
import static com.codeborne.selenide.Selenide.$
import static com.codeborne.selenide.Selenide.$$

class ProductsPage {

    static getAllProducts() {
        $$(By.xpath("//div[@id='box-most-popular']//ul[@class='listing-wrapper products']"))
    }

    @Attachment
    static getProductName() {
        $(By.xpath('//div[@id=\'box-product\']//h1[@class=\'title\']'))
    }
    @Attachment
    static getProductPrice() {
        $(By.xpath('//div[@id=\'box-product\']//div[@class=\'price-wrapper\']/span[@class=\'price\']'))
    }
}
