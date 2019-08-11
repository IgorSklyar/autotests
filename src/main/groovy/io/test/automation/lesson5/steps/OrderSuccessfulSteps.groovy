package io.test.automation.lesson5.steps

import com.codeborne.selenide.CollectionCondition
import io.test.automation.lesson5.pages.OrderSuccessfulPage
import  com.codeborne.selenide.Condition
import static com.codeborne.selenide.Selenide.page


class OrderSuccessfulSteps {

   static void CheckOrder() {

       OrderSuccessfulPage.orderSuccessful.waitUntil(Condition.visible, 9000)
//        OrderSuccessfulPage Confirmation = page(OrderSuccessfulPage.class)
//        Confirmation.OrderSuccessful().waitUntil(Condition.visible, 9000)
        //Confirmation.OrderSuccessful().shouldBe(Condition.visible).wait(60000)
    }
}
