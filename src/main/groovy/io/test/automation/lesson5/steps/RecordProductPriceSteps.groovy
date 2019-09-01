package io.test.automation.lesson5.steps

import io.qameta.allure.*
import io.test.automation.lesson5.pages.ProductsPage

class RecordProductPriceSteps {

    @Step("Получаем название и стоимость продукта ")
    static void getProductPrice() {
        System.out.println("The random product is " + ProductsPage.productName.getText() + " and it cost is " + ProductsPage.productPrice.getText() + ".")
    }
}

