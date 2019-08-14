package io.test.automation.lesson5.elements

import com.codeborne.selenide.ElementsContainer
import com.codeborne.selenide.SelenideElement
import org.openqa.selenium.support.FindBy

class CustomerData extends ElementsContainer {

    @FindBy(xpath = "//input[@name=\'tax_id\']")
    private  SelenideElement taxIdField

    @FindBy(xpath = "//input[@name='firstname']")
    private  SelenideElement FirstNameField

    @FindBy(xpath = "//input[@name='lastname']")
    private  SelenideElement LastNameField

    @FindBy(xpath = "//input[@name='company']")
    private  SelenideElement CompanyField

    @FindBy(xpath = '//input[@name=\'address1\']')
    private  SelenideElement AddressField1

    @FindBy(xpath = "//input[@name='address2']")
    private  SelenideElement AddressField2

    @FindBy(xpath = "//input[@name='postcode']")
    private  SelenideElement PostCodeField

    @FindBy(xpath = "//input[@name='city']")
    private  SelenideElement CityField

    @FindBy(xpath = "//input[@name='email']")
    private  SelenideElement EmailField

    @FindBy(xpath = "//input[@placeholder='+7']")
    private  SelenideElement PhoneField

//    @FindBy(xpath = "//button[@name='confirm_order']")
//    private SelenideElement getSubmitButton

    void setTaxID(String taxIdField) {
        this.taxIdField.setValue(taxIdField)
    }
    void setFirstName (String firstNameField){
       this.FirstNameField.setValue(firstNameField)
   }
    void setLastNameField (String lastNameField){
        this.LastNameField.setValue(lastNameField)
    }
    void  setCompanyField (String companyField) {
       this.CompanyField.setValue(companyField)
   }
    void  setAddressField1(String  addressField1){
       this.AddressField1.setValue( addressField1)
   }
    void setAddressField2(String addressField2){
        this.AddressField2.setValue(addressField2)
    }
    void setPostCodeField(String postCodeField){
        this.PostCodeField.setValue(postCodeField)
    }
    void setCityField(String cityField){
        this.CityField.setValue(cityField)
    }
    void setEmailField (String emailField){
        this.EmailField.setValue(emailField)
    }
    void setPhoneField(String phoneField){
        this.PhoneField.setValue(phoneField)
    }
}
