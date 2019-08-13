package io.test.automation.lesson5.steps


import io.test.automation.lesson5.pages.OrderSuccessfulPage
import  com.codeborne.selenide.Condition


class OrderSuccessfulSteps {

   static void CheckOrder() {
         OrderSuccessfulPage.orderSuccessful.shouldBe(Condition.visible)
    }
}
