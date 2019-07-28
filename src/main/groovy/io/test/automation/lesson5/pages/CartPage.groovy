package io.test.automation.lesson5.pages

import com.codeborne.selenide.Condition
import org.openqa.selenium.By

import static com.codeborne.selenide.Selenide.$



class CartPage {

    static void cart() {

        def next = $(By.xpath('//div[@id=\'cart\']/a[2]')).shouldHave(Condition.text('1'))
        next.click()


    }



    public static  String getTotalPrice(){

return  $(By.xpath('//td[@class=\'sum\']')).getText()


    }


    public static String getUnitCost () {

        return   $(By.xpath('//td[@class=\'unit-cost\']')).getText()


    }


}

