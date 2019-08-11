package io.test.automation.lesson5.pages


import com.codeborne.selenide.SelenideElement
import org.openqa.selenium.By
import org.openqa.selenium.support.FindBy

import static com.codeborne.selenide.Selenide.$


class OrderSuccessfulPage {


    static  getOrderSuccessful(){
        $(By.xpath('//div[@id=\'box-order-success\']'))
    }

//    @FindBy(xpath = '//div[@id=\'box-order-success\']')
//    private SelenideElement OrderSuccessful
//
//
//     SelenideElement OrderSuccessful() {
//        return OrderSuccessful
//    }
}