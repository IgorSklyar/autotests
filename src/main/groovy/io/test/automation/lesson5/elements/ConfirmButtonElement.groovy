package io.test.automation.lesson5.elements

import org.openqa.selenium.By
import static com.codeborne.selenide.Selenide.$

class ConfirmButtonElement {

    static getSubmitButton(){
        $(By.xpath('//button[@name=\'confirm_order\']'))
    }
}
