package io.test.autotests

import org.junit.Test
import org.openqa.selenium.By

import static com.codeborne.selenide.Selenide.*
import static com.codeborne.selenide.Condition.*

class LessonTwo {
    @Test
    void debugTest() {

        def searchRequest = "Cat"
        open("https://google.com/")
        def searchInput = $(By.name("q"))
        searchInput.value = searchRequest
        searchInput.pressEnter()

        def found = $$("#ires .g")
        found.shouldBe()
        assert found.size() > 0
        assert found.first().text.contains(searchRequest)

        println("END")
    }
}
