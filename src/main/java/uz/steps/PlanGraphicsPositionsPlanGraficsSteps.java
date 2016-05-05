package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PlanGraphicsPositionsPlanGrafics;

/**
 * Вкладка Позиции плана-графика
 * на странице 'План-график' 
 * @author e.kuzmina 05.05.2016
 *
 */
@SuppressWarnings("serial")
public class PlanGraphicsPositionsPlanGraficsSteps extends ScenarioSteps {


	public PlanGraphicsPositionsPlanGraficsSteps(Pages pages) {
        super(pages);
    }
	
	PlanGraphicsPositionsPlanGrafics applet;

	@Step("Ожидаем загрузку вкладки \"Позиции плана-графика\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	@Step("Нажать кнопку \"Завершить\" на вкладке \"Позиции плана-графика\"")
	public void clickOnButtonClose() {
		applet.clickOnButtonClose();
	}
	
	@Step("Нажать кнопку \"Включить позиции в план-график\" на вкладке \"Позиции плана-графика\"")
	public void clickOnButtonIncludePositionsInPlanGrafic() {
		applet.clickOnButtonIncludePositionsInPlanGrafic();
	}
	
}