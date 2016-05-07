package uz.steps.tabs;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.tabs.PlanGraphicsTab;
/**
 * Вкладки на странице 'План-график'	
 * @author e.kuzmina 05.05.2016
 *
 */
@SuppressWarnings("serial")
public class PlanGraphicsTabSteps extends ScenarioSteps {


	public PlanGraphicsTabSteps(Pages pages) {
        super(pages);
    }
	
	PlanGraphicsTab applet;

	@Step("Ожидаем загрузку страницы \"План-график\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	@Step("Выбрать вкладку \"Общие сведения\" на странице \"План-график\"")
	public void selectTabBasicInformation(){
		applet.selectTabBasicInformation();    	
	}
	@Step("Выбрать вкладку \"Позиции плана-графика\" на странице \"План-график\"")
	public void selectTabPositionsPlanGrafics(){
		applet.selectTabPositionsPlanGrafics();    	
	}
	@Step("Выбрать вкладку \"Особые закупки\" на странице \"План-график\"")
	public void selectTabSpecialPurchases(){
		applet.selectTabSpecialPurchases();    	
	}
	@Step("Выбрать вкладку \"Итоговые показатели плана-графика\" на странице \"План-график\"")
	public void selectTabTotalIndicatorsPlanGrafics(){
		applet.selectTabTotalIndicatorsPlanGrafics();    	
	}
	@Step("Выбрать вкладку \"Итоги по КБК\" на странице \"План-график\"")
	public void selectTabResultsOfKBK(){
		applet.selectTabResultsOfKBK();    	
	}
	@Step("Выбрать вкладку \"Лист согласования\" на странице \"План-график\"")
	public void selectTabCoordinationSheet(){
		applet.selectTabCoordinationSheet();    	
	}
	@Step("Нажать кнопку \"Проверить документ\" на странице \"План-график\"")
	public void clickOnButttonCheckDocument(){
		applet.clickOnButttonCheckDocument();    	
	}	
}