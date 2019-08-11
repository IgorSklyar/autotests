package io.test.automation.lesson5.steps

import com.codeborne.selenide.Condition
import io.test.automation.lesson5.elements.ButtonAddToCartElements
import io.test.automation.lesson5.elements.ConfirmButtonElement
import io.test.automation.lesson5.elements.CustomerData
import io.test.automation.lesson5.elements.SavinChangesElements
import io.test.automation.lesson5.pages.CartPage


class CartSteps {

    static void addToCart() {
        ButtonAddToCartElements.addToCartButton.click()
    }


    static String getUnitCost () {
        CartPage.getUnitCostElement().getText()
    }

    static void checkCartItemsCount(String desiredCount){
        CartPage.getCartItemsCounter().shouldHave(Condition.text(desiredCount))
    }

    static  getTotalPrice(){
        CartPage.getTotalPriceElement().getText()

    }

    static void goToCart() {
        checkCartItemsCount('1')
        CartPage.cartItemsCounter.click()
    }

    static void clickSubmit(){
        //Confirmation.OrderSuccessful().shouldBe(Condition.visible).wait(60000)
       // ConfirmButtonElement.submitButton.click()
        ConfirmButtonElement.submitButton.waitUntil(Condition.appear, 5000).click()
    }
//    static  void clickSavingChanges(){
//        SavinChangesElements.saveChangesButton.click()
//    }
}