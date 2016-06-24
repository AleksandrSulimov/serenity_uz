package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PositionsPlanGraphicsPurchesTermsOfPurchase;

/**
 * Вкладка Условия закупки
 * на странице 'Позиция плана-графика закупок' 
 * @author e.kuzmina 04.05.2016
 *
 */
@SuppressWarnings("serial")
public class PositionsPlanGraphicsPurchesTermsOfPurchaseSteps extends ScenarioSteps {


	public PositionsPlanGraphicsPurchesTermsOfPurchaseSteps(Pages pages) {
        super(pages);
    }
	
	PositionsPlanGraphicsPurchesTermsOfPurchase applet;

	@Step("Ожидаем загрузку вкладки \"Условия закупки\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	@Step("Нажать кнопку \"Завершить\" на вкладке \"Условия закупки\"")
	public void clickOnButtonClose() {
		applet.clickOnButtonClose();
	}
	
	@Step("Кликнуть чекбокс \"Требуется обеспечение заявки\" на вкладке \"Условия закупки\"")
	public void clickCheckBoxRequiresApplicationSoftware() {
		applet.clickCheckBoxRequiresApplicationSoftware();
	}
	
	@Step("Клик по полю \"Размер обеспечения заявки *\" на вкладке \"Условия закупки\"")
	public void clickOnFieldAmountOfSecurityApplication() {
		applet.clickOnFieldAmountOfSecurityApplication();
	}
	@Step("Забрать значение из поля \"Размер обеспечения заявки *\" на вкладке \"Условия закупки\"")
	public String getValueAmountOfSecurityApplication(){
		return applet.getValueAmountOfSecurityApplication();    	
	}

	@Step("Ввести текст {0} в поле \"Размер обеспечения заявки *\" на вкладке \"Общие сведения\"")
	public void setTextAmountOfSecurityApplication(String text) {
		applet.setTextAmountOfSecurityApplication(text);
	}
	@Step("Клик по полю \"Размер обеспечения заявки - НМЦК\" на вкладке \"Условия закупки\"")
	public void clickOnFieldAmountOfSecurityApplicationsNMCK() {
		applet.clickOnFieldAmountOfSecurityApplicationsNMCK();
	}
	@Step("Забрать значение из поля \"Размер обеспечения заявки - НМЦК\" на вкладке \"Условия закупки\"")
	public String getValueAmountOfSecurityApplicationsNMCK(){
		return applet.getValueAmountOfSecurityApplicationsNMCK();    	
	}
	
	@Step("Кликнуть чекбокс \"Требуется обеспечение исполнения контракта\" на вкладке \"Условия закупки\"")
	public void clickCheckBoxRequiresContractSoftware() {
		applet.clickCheckBoxRequiresContractSoftware();
	}
	
	@Step("Клик по полю \"Размер обеспечения контракта *\" на вкладке \"Условия закупки\"")
	public void clickOnFieldAmountOfSecurityContract() {
		applet.clickOnFieldAmountOfSecurityContract();
	}
	@Step("Забрать значение из поля \"Размер обеспечения контракта *\" на вкладке \"Условия закупки\"")
	public String getValueAmountOfSecurityContract(){
		return applet.getValueAmountOfSecurityContract();    	
	}
	@Step("Ввести текст {0} в поле \"Размер обеспечения контракта *\" на вкладке \"Общие сведения\"")
	public void setTextAmountOfSecurityContract(String text) {
		applet.setTextAmountOfSecurityContract(text);
	}
	@Step("Клик по полю \"Размер обеспечения контракта - НМЦК\" на вкладке \"Условия закупки\"")
	public void clickOnFieldAmountOfSecurityContractNMCK() {
		applet.clickOnFieldAmountOfSecurityContractNMCK();
	}
	@Step("Забрать значение из поля \"Размер обеспечения контракта - НМЦК\" на вкладке \"Условия закупки\"")
	public String getValueAmountOfSecurityContractNMCK(){
		return applet.getValueAmountOfSecurityContractNMCK();    	
	}

	@Step("Кликнуть чекбокс \"Организациям инвалидов (в соответствии со Статьей 29 Федерального закона № 44-ФЗ)\" на вкладке \"Условия закупки\"")
	public void clickCheckBoxOrganizationOfInvalids() {
		applet.clickCheckBoxOrganizationOfInvalids();
	}
	@Step("Кликнуть чекбокс \"Наличие/требуется\" в строке \"Организациям инвалидов (в соответствии со Статьей 29 Федерального закона № 44-ФЗ)\" на вкладке \"Условия закупки\"")
	public void clickCheckBoxAvailabilityOrganizationOfInvalids() {
		applet.clickCheckBoxAvailabilityOrganizationOfInvalids();
	}

	@Step("Ввести текст {0} в поле \"Содержание\" в строке \"Организациям инвалидов (в соответствии со Статьей 29 Федерального закона № 44-ФЗ)\" на вкладке \"Условия закупки\"")
	public void setTextContentOrganizationOfInvalids(String text) {
		applet.setTextContentOrganizationOfInvalids(text);
	}

	@Step("Кликнуть чекбокс \"Единые требования к участникам (в соответствии с частью 2.1 Статьи 31 Федерального закона № 44-ФЗ)\" на вкладке \"Условия закупки\"")
	public void clickCheckBoxUniformRequirementsForParticipants() {
		applet.clickCheckBoxUniformRequirementsForParticipants();
	}
	@Step("Кликнуть чекбокс \"Наличие/требуется\" в строке \"Единые требования к участникам (в соответствии с частью 2.1 Статьи 31 Федерального закона № 44-ФЗ)\" на вкладке \"Условия закупки\"")
	public void clickCheckBoxAvailabilityUniformRequirementsForParticipants() {
		applet.clickCheckBoxAvailabilityUniformRequirementsForParticipants();
	}

	@Step("Ввести текст {0} в поле \"Содержание\" в строке \"Единые требования к участникам (в соответствии с частью 2.1 Статьи 31 Федерального закона № 44-ФЗ)\" на вкладке \"Условия закупки\"")
	public void setTextContentUniformRequirementsForParticipants(String text) {
		applet.setTextContentUniformRequirementsForParticipants(text);
	}
}