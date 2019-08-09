package io.test.automation.lesson5.steps

import io.test.automation.lesson5.pages.OrderSuccessfulPage
import  com.codeborne.selenide.Condition
import static com.codeborne.selenide.Selenide.page


class OrderSuccessfulSteps {

   static CheckOrder() {
        OrderSuccessfulPage Confirmation = page(OrderSuccessfulPage.class)
        Confirmation.OrderSuccessful().shouldBe(Condition.visible)
    }
}
