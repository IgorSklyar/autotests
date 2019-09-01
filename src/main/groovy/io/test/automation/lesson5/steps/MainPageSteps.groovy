package io.test.automation.lesson5.steps

import com.codeborne.selenide.Selenide
import io.qameta.allure.*

class MainPageSteps {

    @Step ("Открываем главную страницу")
    static openMainPage() {
        Selenide.open("http://litecart.stqa.ru/en/")
    }
}