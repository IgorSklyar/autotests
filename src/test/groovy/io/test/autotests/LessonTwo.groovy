package io.test.autotests

import com.codeborne.selenide.CollectionCondition
import org.junit.Test
import org.openqa.selenium.By
import static com.codeborne.selenide.Selenide.*

class LessonTwo {
    @Test
    void debugTest() {

        def searchRequest = "Cat"
        open("https://google.com/")
        def searchInput = $(By.name("q"))
        searchInput.value = searchRequest
        searchInput.pressEnter()
        def found = $$x('//div[@id=\'rso\']/div[5]')
        found.shouldBe(CollectionCondition.sizeGreaterThan(0),6000)
        assert found.size() > 0
        assert found.first().text.contains(searchRequest)

        println("END")
    }
}
