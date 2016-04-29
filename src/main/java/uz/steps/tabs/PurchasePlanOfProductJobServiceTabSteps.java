package uz.steps.tabs;

import uz.pages.tabs.PurchasePlanOfProductJobServiceTab;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
/**
 * Вкладки на странице 'План закупок товаров, работ, услуг'	
 * @author e.kuzmina 29.04.2016
 *
 */
@SuppressWarnings("serial")
public class PurchasePlanOfProductJobServiceTabSteps extends ScenarioSteps {


	public PurchasePlanOfProductJobServiceTabSteps(Pages pages) {
        super(pages);
    }
	
	PurchasePlanOfProductJobServiceTab applet;

	@Step("Ожидаем загрузку страницы \"План закупок товаров, работ, услуг\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	@Step("Выбрать вкладку \"Общие сведения\" на странице \"План закупок товаров, работ, услуг\"")
	public void selectTabBasicInformation(){
		applet.selectTabBasicInformation();    	
	}
	@Step("Выбрать вкладку \"Позиции плана закупок\" на странице \"План закупок товаров, работ, услуг\"")
	public void selectTabPositionPurchasePlan(){
		applet.selectTabPositionPurchasePlan();    	
	}
	@Step("Выбрать вкладку \"Особые закупки\" на странице \"План закупок товаров, работ, услуг\"")
	public void selectTabSpecialPurchases(){
		applet.selectTabSpecialPurchases();    	
	}
	@Step("Нажать кнопку \"Итоги по КБК\" на странице \"План закупок товаров, работ, услуг\"")
	public void selectTabResultsOfKBK(){
		applet.selectTabResultsOfKBK();    	
	}	
	@Step("Нажать кнопку \"Лист согласования\" на странице \"План закупок товаров, работ, услуг\"")
	public void selectTabCoordinationSheet(){
		applet.selectTabCoordinationSheet();    	
	}
	@Step("Нажать кнопку \"Проверить документ\" на странице \"Позиция плана закупок товаров, работ, услуг 200	\"")
	public void clickOnButttonCheckDocument(){
		applet.clickOnButttonCheckDocument();    	
	}
}