package uz.steps.tabs;

import uz.pages.tabs.PositionsPlanGraphicsPurchesTab;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
/**
 * Вкладки на странице 'Позиция плана-графика закупок'	
 * @author e.kuzmina 03.05.2016
 *
 */
@SuppressWarnings("serial")
public class PositionsPlanGraphicsPurchesTabSteps extends ScenarioSteps {


	public PositionsPlanGraphicsPurchesTabSteps(Pages pages) {
        super(pages);
    }
	
	PositionsPlanGraphicsPurchesTab applet;

	@Step("Ожидаем загрузку страницы \"Позиция плана-графика закупок\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	@Step("Выбрать вкладку \"Общие сведения\" на странице \"Позиция плана-графика закупок\"")
	public void selectTabBasicInformation(){
		applet.selectTabBasicInformation();    	
	}
	@Step("Выбрать вкладку \"Спецификация ТРУ\" на странице \"Позиция плана-графика закупок\"")
	public void selectTabSpecificationTRU(){
		applet.selectTabSpecificationTRU();    	
	}
	@Step("Выбрать вкладку \"Условия закупки\" на странице \"Позиция плана-графика закупок\"")
	public void selectTabTermsOfPurchase(){
		applet.selectTabTermsOfPurchase();    	
	}
	@Step("Выбрать вкладку \"Лист согласования\" на странице \"Позиция плана-графика закупок\"")
	public void selectTabCoordinationSheet(){
		applet.selectTabCoordinationSheet();    	
	}
	@Step("Нажать кнопку \"Проверить документ\" на странице \"Позиция плана-графика закупок\"")
	public void clickOnButttonCheckDocument(){
		applet.clickOnButttonCheckDocument();    	
	}	
}