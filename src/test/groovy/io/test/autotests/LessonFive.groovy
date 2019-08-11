package io.test.autotests

import com.codeborne.selenide.Condition
import io.test.automation.lesson5.common.PageWaiter
import io.test.automation.lesson5.steps.ProductPageSteps
import io.test.automation.lesson5.steps.CartSteps
import io.test.automation.lesson5.steps.InputDataSteps
import io.test.automation.lesson5.steps.MainPageSteps
import io.test.automation.lesson5.steps.OrderSuccessfulSteps
import io.test.automation.lesson5.steps.SelectRandomProductSteps
import org.junit.Test
import static com.codeborne.selenide.Selenide.page
import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.CoreMatchers.is


   class LessonFive {

    @Test
    void testStorePage() {
        MainPageSteps.openMainPage()
        SelectRandomProductSteps.RandomProduct()
        ProductPageSteps.getProductPrice()
        CartSteps.addToCart()
        CartSteps.checkCartItemsCount('1')
        CartSteps.goToCart()
        assertThat( 'сумма заказа = стоимость продукта', CartSteps.getTotalPrice(), is(CartSteps.getUnitCost ()))
        InputDataSteps inputDataSteps = page(InputDataSteps.class)
        inputDataSteps.setCustomerInfo("123455", "Tony", "Stark", "Stark Industry", "ул Ленина 25", "Гагарина 20", "101000", "Москва","stark@test.com","9991235479")
        inputDataSteps.clickSavingChanges()
       // inputDataSteps.clickSubmit()
        CartSteps.clickSubmit()
        OrderSuccessfulSteps.CheckOrder()
        println('END')

    }

}






