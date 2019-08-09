package io.test.autotests


import static com.codeborne.selenide.Selenide.*
import org.junit.Test
import org.openqa.selenium.By


class LiteCurt {

    @Test
    void checkCountry() {

        open('http://litecart.stqa.ru/en/')
        def FindButton = $(By.xpath("//a[@class='fancybox-region']"))
        FindButton.click()
        def CheckCountry = $(By.xpath("//option[@value ='US']"))
        CheckCountry.click()
        def CheckState =$(By.xpath('//option[contains(text(),\'Florida\')]'))
        CheckState.click()

    }
}
