package io.test.autotests

import com.codeborne.selenide.Selenide
import org.junit.Test
import org.openqa.selenium.By

import static com.codeborne.selenide.Selenide.*
import static com.codeborne.selenide.Condition.*



import com.codeborne.selenide.CollectionCondition
import com.codeborne.selenide.Selenide
import org.openqa.selenium.By


import static com.codeborne.selenide.Selenide.$
import static com.codeborne.selenide.Selenide.$$

class LessonThree {

    @Test

    void SchedullerTest() {

        Selenide.open('https://rasp.yandex.ru/search')
        def Fromfield = $("#from")
        def ToField = $('#to')
        def WhenField = $('#when')
        def findButton = $('button.SearchForm__submit')

        Fromfield.value = "Великий Новгород"
        ToField.value = "Москва"
        WhenField.value = 'сегодня'
        findButton.click()


        def foundRecords = $$("article.SearchSegment_isVisible")

        foundRecords.shouldBe(CollectionCondition.sizeGreaterThan(1))

        foundRecords.each {
            def recordName = it.$(By.className("SegmentTitle__header"))
            def recordDuration = it.$(By.className("SearchSegment__duration"))

            println("$recordName.text : $recordDuration.text")

        }
    }
}