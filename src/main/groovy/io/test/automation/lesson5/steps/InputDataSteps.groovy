package io.test.automation.lesson5.steps

import com.codeborne.selenide.Condition
import io.test.automation.lesson5.elements.ConfirmButtonElement
import  io.test.automation.lesson5.elements.CustomerData
import io.test.automation.lesson5.elements.SavinChangesElements
import org.openqa.selenium.support.FindBy




 class InputDataSteps {


    @FindBy(xpath = "//div[@class='billing-address']")
    private CustomerData customerInfo

     void setCustomerInfo(String TaxIdField, String FirstNameField, String LastNameField, String CompanyField, String AddressField1, String AddressField2, String PostCodeField, String CityField, String EmailField, String PhoneField){

        customerInfo.setTaxID(TaxIdField)
        customerInfo.setFirstName(FirstNameField)
        customerInfo.setLastNameField(LastNameField)
        customerInfo.setLastNameField(LastNameField)
        customerInfo.setCompanyField(CompanyField)
        customerInfo.setAddressField1(AddressField1)
        customerInfo.setAddressField2(AddressField2)
        customerInfo.setPostCodeField(PostCodeField)
        customerInfo.setCityField(CityField)
        customerInfo.setEmailField(EmailField)
        customerInfo.setPhoneField(PhoneField)

}

//
//     void clickSubmit() {
//         customerInfo.getSubmitButton().click()
//     }

//    static void clickSubmit() {
//       CustomerData.submitButton.click()
//    }

     static  void clickSavingChanges(){
         //SavinChangesElements.saveChangesButton.click()
         SavinChangesElements.saveChangesButton.waitUntil(Condition.appear, 5000).click()
     }
}

