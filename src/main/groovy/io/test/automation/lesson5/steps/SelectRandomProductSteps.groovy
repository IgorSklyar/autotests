package io.test.automation.lesson5.steps

import com.codeborne.selenide.SelenideElement
import io.test.automation.lesson5.pages.ProductsPage
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import static com.codeborne.selenide.Selenide.$$

class SelectRandomProductSteps {

//    static void RandomProduct() {
//        List<WebElement> allProducts = $$(By.xpath("//div[@id='box-most-popular']//ul[@class='listing-wrapper products']"))
//        Random rand = new Random()
//        int randomProduct = rand.nextInt(allProducts.size())
//        allProducts.get(randomProduct).click()
//    }


//    static void RandomProduct() {
//        List<WebElement> allProducts = $$(By.xpath("//div[@id='box-most-popular']//ul[@class='listing-wrapper products']"))
//        Random rand = new Random()
//        int randomProduct = rand.nextInt(allProducts.size())
//        allProducts.get(randomProduct).click()
//    }


    static void RandomProduct() {

        //ProductsPage.allProducts.get((int)(Math.random()) )
        List<SelenideElement> ProductsList = ProductsPage.allProducts
        Random rand = new Random()
        int randomProduct = rand.nextInt(ProductsList.size())
        ProductsList.get(randomProduct).click()

        //SelenideElement product = ProductsList.get(int)(Math.random())
    }
//                {
//        //get all Price-Info
//        List<SelenideElement> priceInfoList = $$(".price-info");
//        SelenideElement priceInfo = priceInfoList.get((int)(Math.random() * (priceInfoList.size()-1)));
//        return priceInfo;
//    }


}
