package io.test.automation.lesson5.steps

import com.codeborne.selenide.Condition
import io.test.automation.lesson5.common.PageWaiter
import  io.test.automation.lesson5.elements.CustomerData
import io.test.automation.lesson5.elements.SavingChangesElements
import org.openqa.selenium.support.FindBy


class InputDataSteps {

    @FindBy(xpath = "//div[@class='billing-address']")
    private CustomerData customerInfo

    void setCustomerInfo(String taxIdField, String firstNameField, String lastNameField, String companyField, String addressField1, String addressField2, String postCodeField, String cityField, String emailField, String phoneField){
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
    static  void clickSavingChanges() {
         SavingChangesElements.saveChangesButton.shouldBe(Condition.enabled).click()
         PageWaiter.isJQueryReady()
     }
}

