package io.test.automation.lesson5.elements

import org.openqa.selenium.By
import static com.codeborne.selenide.Selenide.$


class SavingChangesElements {

    static getSaveChangesButton(){

        def saveButton = $(By.cssSelector('.billing-address button'))
        return saveButton

    }

}