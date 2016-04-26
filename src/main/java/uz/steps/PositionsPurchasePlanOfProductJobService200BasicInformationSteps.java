package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PositionsPurchasePlanOfProductJobService200BasicInformation;

/**
 * Вкладка Основные сведения 
 * на странице 'Позиция плана закупок товаров, работ, услуг 200' 
 * @author e.kuzmina 26.04.2016
 *
 */
@SuppressWarnings("serial")
public class PositionsPurchasePlanOfProductJobService200BasicInformationSteps extends ScenarioSteps {


	public PositionsPurchasePlanOfProductJobService200BasicInformationSteps(Pages pages) {
        super(pages);
    }
	
	PositionsPurchasePlanOfProductJobService200BasicInformation applet;

	@Step("Ожидаем загрузку вкладки \"Основные сведения\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	 
	@Step("Клик по полю \"Тип закупки\" на вкладке \"Основные сведения\"")
	public void clickOnFieldPurchaseType() {
		applet.clickOnFieldPurchaseType();
	}
	@Step("Забрать значение из поля \"Тип закупки\" на вкладке \"Основные сведения\"")
	public String getValuePurchaseType(){
		return applet.getValuePurchaseType();    	
	}

	@Step("Клик по полю \"ОКПД\" на вкладке \"Основные сведения\"")
	public void clickOnFieldOKPD() {
		applet.clickOnFieldOKPD();
	}
	@Step("Забрать значение из поля \"ОКПД\" на вкладке \"Основные сведения\"")
	public String getValueOKPD(){
		return applet.getValueOKPD();    	
	}
	@Step("Открыть справочник в поле \"ОКПД\" на вкладке \"Основные сведения\"")
	public void clickOnButtonOkpdOpenDictionary(){
		applet.clickOnButtonOkpdOpenDictionary();    	
	}
	
	@Step("Клик по полю \"Наименование кода товара (работы, услуги) по ОКПД\" на вкладке \"Основные сведения\"")
	public void clickOnFieldCodeProductName() {
		applet.clickOnFieldCodeProductName();
	}
	@Step("Забрать значение из поля \"Наименование кода товара (работы, услуги) по ОКПД\" на вкладке \"Основные сведения\"")
	public String getValueCodeProductName(){
		return applet.getValueCodeProductName();    	
	}
}