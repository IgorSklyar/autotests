package io.test.automation.lesson5.steps

import io.test.automation.lesson5.elements.ButtonAddToCartElements



class AddToCart {

    static void Add() {

        def button = ButtonAddToCartElements.getAddToCartButton()
       button.click()
    }

}