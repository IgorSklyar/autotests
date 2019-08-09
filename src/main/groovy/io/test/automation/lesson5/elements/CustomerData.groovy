package io.test.automation.lesson5.elements


import com.codeborne.selenide.ElementsContainer
import com.codeborne.selenide.SelenideElement
import org.openqa.selenium.support.FindBy



class CustomerData extends ElementsContainer {



    @FindBy(xpath = "//input[@name=\'tax_id\']")
    private  SelenideElement TaxIdField


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



    @FindBy(xpath = "//button[@name='confirm_order']")
    private SelenideElement getSubmitButton




     void setTaxID(String TaxIdField) {
        this.TaxIdField.setValue(TaxIdField)
    }



    void setFirstName (String FirstNameField){
       this.FirstNameField.setValue(FirstNameField)
   }


      void setLastNameField (String LastNameField){

        this.LastNameField.setValue(LastNameField)
    }


    void  setCompanyField (String CompanyField) {
       this.CompanyField.setValue(CompanyField)
   }


   void  setAddressField1(String  AddressField1){

       this.AddressField1.setValue( AddressField1)
   }

      void setAddressField2(String AddressField2){
        this.AddressField2.setValue(AddressField2)
    }


     void setPostCodeField(String PostCodeField){
        this.PostCodeField.setValue(PostCodeField)
    }

     void setCityField(String CityField){
        this.CityField.setValue(CityField)
    }

      void setEmailField (String EmailField){
        this.EmailField.setValue(EmailField)
    }
     void setPhoneField(String PhoneField){
        this.PhoneField.setValue(PhoneField)
    }



     SelenideElement getSubmitButton() {
        return getSubmitButton

    }


}
