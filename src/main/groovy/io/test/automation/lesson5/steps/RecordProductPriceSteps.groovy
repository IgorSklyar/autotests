package io.test.automation.lesson5.steps

import io.qameta.allure.*
import io.test.automation.lesson5.pages.ProductsPage

class RecordProductPriceSteps {

    @Step("Получаем стоимость продукта ")
    @Attachment
    static String getProductPrice() {
        ProductsPage.productPrice.text
    }
}

