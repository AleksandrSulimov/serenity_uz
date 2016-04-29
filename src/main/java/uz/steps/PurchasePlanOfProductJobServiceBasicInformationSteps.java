package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PurchasePlanOfProductJobServiceBasicInformation;

/**
 * Вкладка Общие сведения 
 * на странице 'План закупок товаров, работ, услуг' 
 * @author e.kuzmina 29.04.2016
 *
 */
@SuppressWarnings("serial")
public class PurchasePlanOfProductJobServiceBasicInformationSteps extends ScenarioSteps {


	public PurchasePlanOfProductJobServiceBasicInformationSteps(Pages pages) {
        super(pages);
    }
	
	PurchasePlanOfProductJobServiceBasicInformation applet;

	@Step("Ожидаем загрузку вкладки \"Общие сведения\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажать кнопку \"Завершить\" на вкладке \"Общие сведения\"")
	public void clickOnButtonClose() {
		applet.clickOnButtonClose();
	}
	
	@Step("Нажать кнопку \"Добавить вложение\" в блоке \"Документы\" на вкладке \"Общие сведения\"")
	public void clickOnButtonAddAttachment() {
		applet.clickOnButtonAddAttachment();
	}
	
}