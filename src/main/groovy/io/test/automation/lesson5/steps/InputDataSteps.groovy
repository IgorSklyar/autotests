package io.test.automation.lesson5.steps


import  io.test.automation.lesson5.elements.CustomerData
import org.openqa.selenium.support.FindBy




public class InputDataSteps {


    @FindBy(xpath = "//div[@class='billing-address']")
    private CustomerData customerInfo


    public void setCustomerInfo(String TaxIdField, String FirstNameField, String LastNameField, String CompanyField, String AddressField1, String AddressField2, String PostCodeField, String CityField, String EmailField, String PhoneField){

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


    public void clickSubmit() {
        customerInfo.getSubmitButton().click()
    }


}

