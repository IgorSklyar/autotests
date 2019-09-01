package io.test.automation.lesson5.steps

import io.qameta.allure.*
import io.test.automation.lesson5.pages.OrderSuccessfulPage
import com.codeborne.selenide.Condition

class OrderSuccessfulSteps {

    @Step ("Проверяем, что отображается сообщение об успешном заказе ")
    static void checkOrder() {
        OrderSuccessfulPage.orderSuccessful.shouldBe(Condition.visible)
    }
}
