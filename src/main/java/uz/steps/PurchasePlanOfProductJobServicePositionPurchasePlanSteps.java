package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PurchasePlanOfProductJobServicePositionPurchasePlan;

/**
 * Вкладка Позиции плана закупок
 * на странице 'План закупок товаров, работ, услуг' 
 * @author e.kuzmina 29.04.2016
 *
 */
@SuppressWarnings("serial")
public class PurchasePlanOfProductJobServicePositionPurchasePlanSteps extends ScenarioSteps {


	public PurchasePlanOfProductJobServicePositionPurchasePlanSteps(Pages pages) {
        super(pages);
    }
	
	PurchasePlanOfProductJobServicePositionPurchasePlan applet;

	@Step("Ожидаем загрузку вкладки \"Позиции плана закупок\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажать кнопку \"Завершить\" на вкладке \"Позиции плана закупок\"")
	public void clickOnButtonClose() {
		applet.clickOnButtonClose();
	}
	
	@Step("Нажать кнопку \"Включить позиции плана закупок\" на вкладке \"Позиции плана закупок\"")
	public void clickOnButtonIncludePositionsPurchasePlan() {
		applet.clickOnButtonIncludePositionsPurchasePlan();
	}
	
}