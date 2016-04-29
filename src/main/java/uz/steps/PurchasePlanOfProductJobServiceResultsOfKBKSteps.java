package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PurchasePlanOfProductJobServiceResultsOfKBK;

/**
 * Вкладка Итоги по КБК
 * на странице 'План закупок товаров, работ, услуг' 
 * @author e.kuzmina 29.04.2016
 *
 */
@SuppressWarnings("serial")
public class PurchasePlanOfProductJobServiceResultsOfKBKSteps extends ScenarioSteps {


	public PurchasePlanOfProductJobServiceResultsOfKBKSteps(Pages pages) {
        super(pages);
    }
	
	PurchasePlanOfProductJobServiceResultsOfKBK applet;

	@Step("Ожидаем загрузку вкладки \"Итоги по КБК\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажать кнопку \"Закрыть\" на вкладке \"Итоги по КБК\"")
	public void clickOnButtonClose() {
		applet.clickOnButtonClose();
	}
	
}