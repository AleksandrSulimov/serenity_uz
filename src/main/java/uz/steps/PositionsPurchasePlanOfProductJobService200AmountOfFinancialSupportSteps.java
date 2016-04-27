package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PositionsPurchasePlanOfProductJobService200AmountOfFinancialSupport;

/**
 * Вкладка Основные сведения 
 * на странице 'Позиция плана закупок товаров, работ, услуг 200' 
 * @author e.kuzmina 26.04.2016
 *
 */
@SuppressWarnings("serial")
public class PositionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps extends ScenarioSteps {


	public PositionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps(Pages pages) {
        super(pages);
    }
	
	PositionsPurchasePlanOfProductJobService200AmountOfFinancialSupport applet;

	@Step("Ожидаем загрузку вкладки \"Объем финансового обеспечения\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	 
	@Step("Нажать кнопку \"Добавить новую строку\" В таблице \"Объем финансового обеспечения\" на вкладке \"Объем финансового обеспечения\"")
	public void clickOnButtonСreateNewRecord() {
		applet.clickOnButtonСreateNewRecord();
	}
	@Step("Клик в поле \"Планируемый год размещения извещения\" на вкладке \"Объем финансового обеспечения\"")
	public void clickOnFieldPublishYearInput() {
		applet.clickOnFieldPublishYearInput();
	}
	@Step("Клик по линку выпадающего списка в поле \"Планируемый год размещения извещения\" на вкладке \"Объем финансового обеспечения\"")
	public void selectFromDropDownList(String linkText) {
		applet.selectFromDropDownList(linkText);
	}
	
}