package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PlanGraphicsTotalIndicatorsPlanGrafics;

/**
 * Вкладка Итоговые показатели плана-графика
 * на странице 'План-график' 
 * @author e.kuzmina 05.05.2016
 *
 */
@SuppressWarnings("serial")
public class PlanGraphicsTotalIndicatorsPlanGraficsSteps extends ScenarioSteps {


	public PlanGraphicsTotalIndicatorsPlanGraficsSteps(Pages pages) {
        super(pages);
    }
	
	PlanGraphicsTotalIndicatorsPlanGrafics applet;

	@Step("Ожидаем загрузку вкладки \"Итоговые показатели плана-графика\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}
	@Step("Нажать кнопку \"Завершить\" на вкладке \"Итоговые показатели плана-графика\"")
	public void clickOnButtonClose() {
		applet.clickOnButtonClose();
	}
	
	@Step("Нажать кнопку \"Заполнить на основании введенный позиций рядом\" под строкой \"Годовой объем закупок у субъектов малого предпринимательства, социально ориентированных некоммерческих организаций, тыс. российских рублей\" на вкладке \"Итоговые показатели плана-графика\"")
	public void clickOnButtonFillProcurementVolumeOfSubjectsSmallBusiness() {
		applet.clickOnButtonFillProcurementVolumeOfSubjectsSmallBusiness();
	}

	@Step("Нажать кнопку \"Заполнить на основании введенный позиций рядом\" под строкой \"Годовой объем закупок, осуществляемых путем запроса котировок, тыс. российских рублей\" на вкладке \"Итоговые показатели плана-графика\"")
	public void clickOnButtonFillProcurementVolumeOfImplementedByRequestQuotation() {
		applet.clickOnButtonFillProcurementVolumeOfImplementedByRequestQuotation();
	}
	
	@Step("Нажать кнопку \"Заполнить на основании введенный позиций рядом\" под строкой \"Совокупный годовой объем закупок, определенный в соответствии с п. 16 статьи 3 Федерального закона №44-ФЗ, тыс. российских рублей*\" на вкладке \"Итоговые показатели плана-графика\"")
	public void clickOnButtonFillProcurementVolumeDeterminedAccordingFederalLaw() {
		applet.clickOnButtonFillProcurementVolumeDeterminedAccordingFederalLaw();
	}
	
}