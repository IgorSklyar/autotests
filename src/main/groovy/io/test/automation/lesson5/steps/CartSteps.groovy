package io.test.automation.lesson5.steps

import com.codeborne.selenide.Condition
import io.test.automation.lesson5.elements.ButtonAddToCartElements
import io.test.automation.lesson5.elements.ConfirmButtonElements
import io.test.automation.lesson5.helpers.WaitHelper
import io.test.automation.lesson5.pages.CartPage

class CartSteps {

    static void addToCart() {
        ButtonAddToCartElements.addToCartButton.click()
    }

    static String getUnitCost() {
        CartPage.getUnitCostElement().getText()
    }

    static void checkCartItemsCount(String desiredCount) {
        CartPage.getCartItemsCounter().shouldHave(Condition.text(desiredCount))
    }

    static getTotalPrice() {
        CartPage.getTotalPriceElement().getText()
    }

    static void goToCart() {
        CartPage.cartItemsCounter.click()
    }

    static void clickSubmit() {
       ConfirmButtonElements.submitButton.waitUntil(Condition.visible, 60000).click()
       WaitHelper.waitJQueryReady()
    }
}