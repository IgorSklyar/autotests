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




    public void setTaxID(String TaxIdField) {
        this.TaxIdField.setValue(TaxIdField)
    }



   public void setFirstName (String FirstNameField){
       this.FirstNameField.setValue(FirstNameField)
   }


    public  void setLastNameField (String LastNameField){

        this.LastNameField.setValue(LastNameField)
    }


   public void  setCompanyField (String CompanyField) {
       this.CompanyField.setValue(CompanyField)
   }


   public void  setAddressField1(String  AddressField1){

       this.AddressField1.setValue( AddressField1)
   }

    public  void setAddressField2(String AddressField2){
        this.AddressField2.setValue(AddressField2)
    }


    public void setPostCodeField(String PostCodeField){
        this.PostCodeField.setValue(PostCodeField)
    }

    public void setCityField(String CityField){
        this.CityField.setValue(CityField)
    }

    public  void setEmailField (String EmailField){
        this.EmailField.setValue(EmailField)
    }
    public  void setPhoneField(String PhoneField){
        this.PhoneField.setValue(PhoneField)
    }



    public SelenideElement getSubmitButton() {
        return getSubmitButton

    }



}
