package io.test.autotests

import com.codeborne.selenide.commands.ShouldBe
import com.codeborne.selenide.conditions.Visible

import static com.codeborne.selenide.Selenide.*
import com.codeborne.selenide.CollectionCondition
import com.codeborne.selenide.Selenide
import org.junit.Test
import org.openqa.selenium.By


class LiteCurt {

    @Test

    void CheckConutry () {

        Selenide.open('http://litecart.stqa.ru/en/')

        def FindButton = $(By.xpath("//a[@class='fancybox-region']"))
        FindButton.click()

      //  def Country = $(By.xpath("//select[@name=\'country_code\']"))
        //Country.click()

        def CheckCountry = $(By.xpath("//option[@value ='US']"))
        CheckCountry.click()
       // def State = $(By.xpath('//select[@name=\'zone_code\']'))
        //State.click()
        def CheckState =$(By.xpath('//option[contains(text(),\'Florida\')]'))
        CheckState.click()



    }




    //select[@name='country_code']
}
