package io.test.autotests


import io.test.automation.lesson5.pages.CartPage
import io.test.automation.lesson5.pages.MainPage
import io.test.automation.lesson5.pages.ProductPage
import io.test.automation.lesson5.steps.AddToCart
import io.test.automation.lesson5.steps.InputDataSteps
import io.test.automation.lesson5.pages.OrderSuccessfullPage
import io.test.automation.lesson5.steps.SelectRandomProductSteps
import org.junit.Test
import  com.codeborne.selenide.Condition
import static com.codeborne.selenide.Selenide.page
import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.CoreMatchers.is



public class LessonFive {

    @Test
    void testStorePage() {

       MainPage cart = new MainPage()
        cart.open()
        SelectRandomProductSteps.RandomProduct()
        ProductPage.ProductPrice()
        AddToCart.Add()
        CartPage.cart()
        assertThat( 'сумма заказа = стоимость продукта', CartPage.getTotalPrice(), is(CartPage.getUnitCost ()))
        InputDataSteps inputDataSteps = page(InputDataSteps.class)
        inputDataSteps.setCustomerInfo("123455", "Tony", "Stark", "Stark Industry", "ул Ленина 25", "Гагарина 20", "1223456", "Москва","stark@test.com","9991235479")
        inputDataSteps.clickSubmit()
        OrderSuccessfullPage Confirmation = page( OrderSuccessfullPage.class)
        Confirmation.OrderSuccessfull().shouldBe(Condition.visible)



    }



}






