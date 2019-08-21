package io.test.automation.lesson5.elements

import com.codeborne.selenide.ElementsContainer
import com.codeborne.selenide.SelenideElement
import org.openqa.selenium.support.FindBy

class CustomerDataElements extends ElementsContainer {

    @FindBy(xpath = "//input[@name=\'tax_id\']")
    private SelenideElement taxIdField

    @FindBy(xpath = "//input[@name='firstname']")
    private SelenideElement firstNameField

    @FindBy(xpath = "//input[@name='lastname']")
    private SelenideElement lastNameField

    @FindBy(xpath = "//input[@name='company']")
    private SelenideElement companyField

    @FindBy(xpath = '//input[@name=\'address1\']')
    private SelenideElement addressField1

    @FindBy(xpath = "//input[@name='address2']")
    private SelenideElement addressField2

    @FindBy(xpath = "//input[@name='postcode']")
    private SelenideElement postCodeField

    @FindBy(xpath = "//input[@name='city']")
    private SelenideElement cityField

    @FindBy(xpath = "//input[@name='email']")
    private SelenideElement emailField

    @FindBy(xpath = "//input[@placeholder='+7']")
    private SelenideElement phoneField

    void setTaxID(String taxIdField) {
        this.taxIdField.setValue(taxIdField)
    }

    void setFirstName(String firstNameField) {
        this.firstNameField.setValue(firstNameField)
    }

    void setLastNameField(String lastNameField) {
        this.lastNameField.setValue(lastNameField)
    }

    void setCompanyField(String companyField) {
        this.companyField.setValue(companyField)
    }

    void setAddressField1(String addressField1) {
        this.addressField1.setValue(addressField1)
    }

    void setAddressField2(String addressField2) {
        this.addressField2.setValue(addressField2)
    }

    void setPostCodeField(String postCodeField) {
        this.postCodeField.setValue(postCodeField)
    }

    void setCityField(String cityField) {
        this.cityField.setValue(cityField)
    }

    void setEmailField(String emailField) {
        this.emailField.setValue(emailField)
    }

    void setPhoneField(String phoneField) {
        this.phoneField.setValue(phoneField)
    }
}
