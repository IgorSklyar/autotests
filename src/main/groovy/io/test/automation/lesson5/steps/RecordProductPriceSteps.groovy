package io.test.automation.lesson5.steps

import io.test.automation.lesson5.pages.ProductsPage

class RecordProductPriceSteps {

    static void getProductPrice() {
        System.out.println("The random product is " + ProductsPage.productName.getText() + " and it cost is " + ProductsPage.productPrice.getText() + ".")
    }
}

