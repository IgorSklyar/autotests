package io.test.automation.lesson5.steps

import com.codeborne.selenide.SelenideElement
import io.qameta.allure.*
import io.test.automation.lesson5.pages.ProductsPage

class SelectRandomProductSteps {

    @Step ("Выбираем случайный продукт")
    static void randomProduct() {
        List<SelenideElement> productsList = ProductsPage.allProducts
        Random rand = new Random()
        int randomProduct = rand.nextInt(productsList.size())
        productsList.get(randomProduct).click()
    }
}