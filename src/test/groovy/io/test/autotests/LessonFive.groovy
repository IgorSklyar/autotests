package io.test.autotests


import io.test.automation.lesson5.pages.MainPage
import io.test.automation.lesson5.pages.ProductPage
import io.test.automation.lesson5.steps.CartSteps
import io.test.automation.lesson5.steps.InputDataSteps
import io.test.automation.lesson5.pages.OrderSuccessfullPage
import io.test.automation.lesson5.steps.MainPageSteps
import io.test.automation.lesson5.steps.SelectRandomProductSteps
import org.junit.Test
import  com.codeborne.selenide.Condition
import static com.codeborne.selenide.Selenide.page
import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.CoreMatchers.is



   class LessonFive {

    @Test
    void testStorePage() {
       // MainPage.open()
        MainPageSteps.openMainPage()
//       MainPage cart = new MainPage()
//        cart.open()
        SelectRandomProductSteps.RandomProduct()
        ProductPage.ProductPrice()
        CartSteps.addToCart()
        CartSteps.checkCartItemsCount('1')
        CartSteps.goToCart()
        assertThat( 'сумма заказа = стоимость продукта', CartSteps.getTotalPrice(), is(CartSteps.getUnitCost ()))
        InputDataSteps inputDataSteps = page(InputDataSteps.class)
        inputDataSteps.setCustomerInfo("123455", "Tony", "Stark", "Stark Industry", "ул Ленина 25", "Гагарина 20", "1223456", "Москва","stark@test.com","9991235479")
        inputDataSteps.clickSubmit()
        OrderSuccessfullPage Confirmation = page( OrderSuccessfullPage.class)
        Confirmation.OrderSuccessfull().shouldBe(Condition.visible)



    }



}






