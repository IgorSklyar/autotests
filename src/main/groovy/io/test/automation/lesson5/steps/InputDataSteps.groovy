package io.test.automation.lesson5.steps

import com.codeborne.selenide.Condition
import io.test.automation.lesson5.elements.CustomerDataElements
import io.test.automation.lesson5.elements.SavingChangesElements
import io.test.automation.lesson5.helpers.WaitHelper
import org.openqa.selenium.support.FindBy

class InputDataSteps {

    @FindBy(xpath = "//div[@class='billing-address']")
    private CustomerDataElements customerInfo

    void setCustomerInfo(String taxIdField, String firstNameField, String lastNameField, String companyField, String addressField1, String addressField2, String postCodeField, String cityField, String emailField, String phoneField) {
        customerInfo.setTaxID(taxIdField)
        customerInfo.setFirstName(firstNameField)
        customerInfo.setLastNameField(lastNameField)
        customerInfo.setCompanyField(companyField)
        customerInfo.setAddressField1(addressField1)
        customerInfo.setAddressField2(addressField2)
        customerInfo.setPostCodeField(postCodeField)
        customerInfo.setCityField(cityField)
        customerInfo.setEmailField(emailField)
        customerInfo.setPhoneField(phoneField)
    }

    static void clickSavingChanges() {
        SavingChangesElements.saveChangesButton.shouldBe(Condition.enabled).click()
        WaitHelper.waitJQueryReady()
    }
}

