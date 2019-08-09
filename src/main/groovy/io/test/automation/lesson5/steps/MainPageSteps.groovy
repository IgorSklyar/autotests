package io.test.automation.lesson5.steps

import com.codeborne.selenide.Selenide

class MainPageSteps {

    static openMainPage() {
        Selenide.open("http://litecart.stqa.ru/en/")
    }
}