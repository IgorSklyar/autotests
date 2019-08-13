package io.test.automation.lesson5.steps

import org.openqa.selenium.By
import static com.codeborne.selenide.Selenide.$



class ProductPageSteps {

    static void getProductPrice() {
        String productName = $(By.xpath('//div[@id=\'box-product\']//h1[@class=\'title\']')).getText()
        String Price = $(By.xpath('//div[@id=\'box-product\']//div[@class=\'price-wrapper\']/span[@class=\'price\']')).getText()
        System.out.println("The 1st random product is " + productName + " and it cost is " + Price + ".")
    }
}

