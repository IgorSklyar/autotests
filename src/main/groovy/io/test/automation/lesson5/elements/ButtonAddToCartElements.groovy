package io.test.automation.lesson5.elements

import org.openqa.selenium.By
import static com.codeborne.selenide.Selenide.$

class ButtonAddToCartElements {

     static getAddToCartButton(){
        $(By.xpath('//button[@name=\'add_cart_product\']'))
    }
}