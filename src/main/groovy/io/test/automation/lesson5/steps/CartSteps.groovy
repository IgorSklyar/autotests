package io.test.automation.lesson5.steps

import com.codeborne.selenide.Condition

import io.qameta.allure.*
import io.test.automation.lesson5.elements.ButtonAddToCartElements
import io.test.automation.lesson5.elements.ConfirmButtonElements
import io.test.automation.lesson5.helpers.WaitHelper
import io.test.automation.lesson5.pages.CartPage

class CartSteps {

    @Step ("Добавляем товар в корзину")
    static void addToCart() {
        ButtonAddToCartElements.addToCartButton.click()
    }

    static String getUnitCost() {
        CartPage.getUnitCostElement().getText()
    }

    @Step ("Количесто товаров в коризине равно:  ")
    static void checkCartItemsCount(String desiredCount) {
        CartPage.getCartItemsCounter().shouldHave(Condition.text(desiredCount))
    }

    static getTotalPrice() {
        CartPage.getTotalPriceElement().getText()
    }

    @Step ("Переходим в корзину ")
    static void goToCart() {
        CartPage.cartItemsCounter.click()
    }

    @Step ("Подтвержадем покупку ")
    static void clickSubmit() {
       ConfirmButtonElements.submitButton.waitUntil(Condition.visible, 60000).click()
       WaitHelper.waitJQueryReady()
    }
}