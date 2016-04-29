package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PurchasePlanOfProductJobServiceSpecialPurchases;

/**
 * Вкладка Особые закупки
 * на странице 'План закупок товаров, работ, услуг' 
 * @author e.kuzmina 29.04.2016
 *
 */
@SuppressWarnings("serial")
public class PurchasePlanOfProductJobServiceSpecialPurchasesSteps extends ScenarioSteps {


	public PurchasePlanOfProductJobServiceSpecialPurchasesSteps(Pages pages) {
        super(pages);
    }
	
	PurchasePlanOfProductJobServiceSpecialPurchases applet;

	@Step("Ожидаем загрузку вкладки \"Особые закупки\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажать кнопку \"Завершить\" на вкладке \"Особые закупки\"")
	public void clickOnButtonClose() {
		applet.clickOnButtonClose();
	}
	
}