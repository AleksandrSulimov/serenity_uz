package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PlanGraphicsResultsOfKBK;

/**
 * Вкладка Итоги по КБК
 * на странице 'План-график' 
 * @author e.kuzmina 05.05.2016
 *
 */
@SuppressWarnings("serial")
public class PlanGraphicsResultsOfKBKSteps extends ScenarioSteps {


	public PlanGraphicsResultsOfKBKSteps(Pages pages) {
        super(pages);
    }
	
	PlanGraphicsResultsOfKBK applet;

	@Step("Ожидаем загрузку вкладки \"Итоги по КБК\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	@Step("Нажать кнопку \"Завершить\" на вкладке \"Итоги по КБК\"")
	public void clickOnButtonClose() {
		applet.clickOnButtonClose();
	}
	
	
}