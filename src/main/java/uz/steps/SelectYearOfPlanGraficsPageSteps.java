package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.SelectYearOfPlanGraficsPage;

/**
 * Выбор года плана-графика закупок
 * @author e.kuzmina 05.05.2016
 *
 */
@SuppressWarnings("serial")
public class SelectYearOfPlanGraficsPageSteps extends ScenarioSteps {


	public SelectYearOfPlanGraficsPageSteps(Pages pages) {
        super(pages);
    }
	
	SelectYearOfPlanGraficsPage applet;

	@Step("Ожидаем загрузку справочника \"Выбор года плана-графика закупок\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}
	 
	@Step("Клик в поле \"Заказчик\" в справочнике \"Выбор года плана-графика закупок\"")
	public void clickOnFieldCustomer(){
		applet.clickOnFieldCustomer();    	
	}
	@Step("Забрать значение из поля \"Заказчик\" в справочнике \"Выбор года плана-графика закупок\"")
	public String getValueCustomer(){
		return applet.getValueCustomer();    	
	}
 
//	@Step("Клик в поле \"Год плана-графика*\" в справочнике \"Выбор года плана-графика закупок\"")
//	public void clickOnFieldYearPlanGrafics(){
//		applet.clickOnFieldYearPlanGrafics();    	
//	}
	
	@Step("Забрать значение из поля \"Год плана-графика*\" в справочнике \"Выбор года плана-графика закупок\"")
	public String getValueYearPlanGrafics(){
		return applet.getValueYearPlanGrafics();    	
	}
	@Step("Нажать кнопку \"Выбрать\" в справочнике \"Выбор года плана-графика закупок\"")
	public void clickOnButtonSelect(){
		applet.clickOnButtonSelect();    	
	}
}