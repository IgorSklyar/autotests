package io.test.automation.lesson5.steps


import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import static com.codeborne.selenide.Selenide.$$
import io.test.automation.lesson5.pages.ProductPage

class SelectRandomProductSteps {
        static  void RandomProduct () {
            List<WebElement> allProducts = $$(By.xpath("//div[@id='box-most-popular']//ul[@class='listing-wrapper products']"))
            Random rand = new Random()
            int randomProduct = rand.nextInt(allProducts.size())
            allProducts.get(randomProduct).click()

        }

    }



