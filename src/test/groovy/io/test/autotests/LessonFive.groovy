package io.test.autotests


import io.qameta.allure.*
import io.test.automation.lesson5.pages.ProductsPage
import io.test.automation.lesson5.steps.CartSteps
import io.test.automation.lesson5.steps.InputDataSteps
import io.test.automation.lesson5.steps.MainPageSteps
import io.test.automation.lesson5.steps.OrderSuccessfulSteps
import io.test.automation.lesson5.steps.RecordProductPriceSteps
import io.test.automation.lesson5.steps.SelectRandomProductSteps
import org.junit.Test
import static com.codeborne.selenide.Selenide.page
import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.CoreMatchers.is

@Epic("Тестовый эпик")
@Feature("Тестовая фича")
@Link("http://litecart.stqa.ru")
@Issue("TICKET-1")
class LessonFive {

    @Test
    @Description("Пример теста")
    @Severity(SeverityLevel.TRIVIAL)
    @TmsLink("TC-1")
    @Epic("Тестовый эпик")
    @Story("покупка одного утенка")
    void testStorePage() {
        MainPageSteps.openMainPage()
        SelectRandomProductSteps.randomProduct()
        System.out.println("Стоимость продукта равна " + RecordProductPriceSteps.getProductPrice())
        CartSteps.addToCart()
        CartSteps.checkCartItemsCount('1')
        CartSteps.goToCart()
        assertThat( 'сумма заказа = стоимость продукта', CartSteps.getTotalPrice(), is(CartSteps.getUnitCost ()))
        InputDataSteps inputDataSteps = page(InputDataSteps.class)
        inputDataSteps.setCustomerInfo("123455", "Tony", "Stark", "Stark Industry", "ул Ленина 25", "Гагарина 20", "101000", "Москва","stark@test.com","9991235479")
        inputDataSteps.clickSavingChanges()
        CartSteps.clickSubmit()
        OrderSuccessfulSteps.checkOrder()
    }
}






