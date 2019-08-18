package io.test.automation.lesson5.steps

import io.test.automation.lesson5.pages.ProductsPage
import org.openqa.selenium.By
import static com.codeborne.selenide.Selenide.$


class RecordProductPriceSteps {

    static void getProductPrice() {
//        String productName = $(By.xpath('//div[@id=\'box-product\']//h1[@class=\'title\']')).getText()
//        String price = $(By.xpath('//div[@id=\'box-product\']//div[@class=\'price-wrapper\']/span[@class=\'price\']')).getText()
//        System.out.println("The 1st random product is " + productName + " and it cost is " + price + ".")
//     ProductsPage.productName.getText()
       ProductsPage.productPrice.getText()
       System.out.println("The random product is " + ProductsPage.productName.getText() + " and it cost is " + ProductsPage.productPrice.getText() + ".")

    }


}

