package io.test.autotests

import org.junit.Test
import com.codeborne.selenide.CollectionCondition
import com.codeborne.selenide.Selenide
import org.openqa.selenium.By
import static com.codeborne.selenide.Selenide.$$
import static com.codeborne.selenide.Selenide.$


class LessonThree {

    @Test
    void SchedulerTest() {

        Selenide.open('https://rasp.yandex.ru/search')
        def fromField = $("#from")
        def toField = $('#to')
        def whenField = $('#when')
        def findButton = $('button.SearchForm__submit')

        fromField.value = "Великий Новгород"
        toField.value = "Москва"
        whenField.value = 'сегодня'
        findButton.click()

        def foundRecords = $$(".SearchMetaSegment > .SearchSegment_isVisible")
        foundRecords.shouldBe(CollectionCondition.sizeGreaterThan(0), 60000)

        foundRecords.each {
            def recordName = it.$(By.className("SegmentTitle__header"))
            def recordDuration = it.$(By.className("SearchSegment__duration"))

            println("$recordName.text : $recordDuration.text")

        }
    }
}