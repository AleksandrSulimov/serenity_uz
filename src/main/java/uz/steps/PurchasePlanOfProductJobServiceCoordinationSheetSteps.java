package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PurchasePlanOfProductJobServiceCoordinationSheet;

/**
 * Вкладка Лист согласования
 * на странице 'План закупок товаров, работ, услуг' 
 * @author e.kuzmina 29.04.2016
 *
 */
@SuppressWarnings("serial")
public class PurchasePlanOfProductJobServiceCoordinationSheetSteps extends ScenarioSteps {


	public PurchasePlanOfProductJobServiceCoordinationSheetSteps(Pages pages) {
        super(pages);
    }
	
	PurchasePlanOfProductJobServiceCoordinationSheet applet;

	@Step("Ожидаем загрузку вкладки \"Лист согласования\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	 
	@Step("Кликнуть чекбокс \"Требуется согласование\" на вкладке \"Объем финансового обеспечения\" на вкладке \"Лист согласования\"")
	public void clickOnCheckBoxNeedCoordination() {
		applet.clickOnCheckBoxNeedCoordination();
	}
	@Step("Нажать кнопку \"Добавить новую строку\" в таблице \"Согласующие\" на вкладке \"Лист согласования\"")
	public void clickOnButtonAddNewRecordCoordinators() {
		applet.clickOnButtonAddNewRecordCoordinators();
	}
	@Step("Нажать кнопку \"Выберите согласующего сотрудника из справочника\" в таблице \"Согласующие\" на вкладке \"Лист согласования\"")
	public void clickOnButtonChooseCoordinator() {
		applet.clickOnButtonChooseCoordinator();
	}
	@Step("Нажать кнопку \"Выберите утверждающего сотрудника из справочника\" в таблице \"Согласующие\" на вкладке \"Лист согласования\"")
	public void clickOnButtonChooseValidator() {
		applet.clickOnButtonChooseValidator();
	}
	
}