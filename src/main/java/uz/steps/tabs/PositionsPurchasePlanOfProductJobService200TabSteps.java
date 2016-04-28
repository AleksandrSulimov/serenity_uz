package uz.steps.tabs;

import uz.pages.tabs.PositionsPurchasePlanOfProductJobService200Tab;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
/**
 * Вкладки на странице 'Позиция плана закупок товаров, работ, услуг 200'	
 * @author e.kuzmina 26.04.2016
 *
 */
@SuppressWarnings("serial")
public class PositionsPurchasePlanOfProductJobService200TabSteps extends ScenarioSteps {


	public PositionsPurchasePlanOfProductJobService200TabSteps(Pages pages) {
        super(pages);
    }
	
	PositionsPurchasePlanOfProductJobService200Tab applet;

	@Step("Ожидаем загрузку страницы \"Позиция плана закупок товаров, работ, услуг 200	\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	@Step("Выбрать вкладку \"Основные сведения\" на странице \"Позиция плана закупок товаров, работ, услуг 200	\"")
	public void selectTabBasicInformation(){
		applet.selectTabBasicInformation();    	
	}
	@Step("Выбрать вкладку \"Объем финансового обеспечения\" на странице \"Позиция плана закупок товаров, работ, услуг 200	\"")
	public void selectTabAmountOfFinancialSupport(){
		applet.selectTabAmountOfFinancialSupport();    	
	}
	@Step("Выбрать вкладку \"Лист согласования\" на странице \"Позиция плана закупок товаров, работ, услуг 200	\"")
	public void selectTabCoordinationSheet(){
		applet.selectTabCoordinationSheet();    	
	}
	@Step("Нажать кнопку \"Проверить документ\" на странице \"Позиция плана закупок товаров, работ, услуг 200	\"")
	public void clickOnButttonCheckDocument(){
		applet.clickOnButttonCheckDocument();    	
	}	
}