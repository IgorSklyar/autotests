package io.test.automation.lesson5.pages

import com.codeborne.selenide.Selenide

class MainPage {


    String pageUrl = ('http://litecart.stqa.ru/en/')

    public MainPage open() {

        Selenide.open(pageUrl)
        return this

    }
}
