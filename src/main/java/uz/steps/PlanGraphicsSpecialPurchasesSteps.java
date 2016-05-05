package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PlanGraphicsSpecialPurchases;

/**
 * Вкладка Особые закупки
 * на странице 'План-график' 
 * @author e.kuzmina 05.05.2016
 *
 */
@SuppressWarnings("serial")
public class PlanGraphicsSpecialPurchasesSteps extends ScenarioSteps {


	public PlanGraphicsSpecialPurchasesSteps(Pages pages) {
        super(pages);
    }
	
	PlanGraphicsSpecialPurchases applet;

	@Step("Ожидаем загрузку вкладки \"Особые закупки\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}
	@Step("Нажать кнопку \"Завершить\" на вкладке \"Особые закупки\"")
	public void clickOnButtonClose() {
		applet.clickOnButtonClose();
	}
	
}