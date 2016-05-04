package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PositionsPlanGraphicsPurchesSpecificationTRU;

/**
 * Вкладка Спецификация ТРУ
 * на странице 'Позиция плана-графика закупок' 
 * @author e.kuzmina 03.05.2016
 *
 */
@SuppressWarnings("serial")
public class PositionsPlanGraphicsPurchesSpecificationTRUSteps extends ScenarioSteps {


	public PositionsPlanGraphicsPurchesSpecificationTRUSteps(Pages pages) {
        super(pages);
    }
	
	PositionsPlanGraphicsPurchesSpecificationTRU applet;

	@Step("Ожидаем загрузку вкладки \"Спецификация ТРУ\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	@Step("Нажать кнопку \"Завершить\" на вкладке \"Спецификация ТРУ\"")
	public void clickOnButtonClose() {
		applet.clickOnButtonClose();
	}
	
	@Step("Клик по полю \"Код ОКПД2\" на вкладке \"Спецификация ТРУ\"")
	public void clickOnFieldCodeOKPD2() {
		applet.clickOnFieldCodeOKPD2();
	}
	@Step("Забрать значение из поля \"Код ОКПД2\" на вкладке \"Спецификация ТРУ\"")
	public String getValueCodeOKPD2(){
		return applet.getValueCodeOKPD2();    	
	}
	
	@Step("Клик по полю \"Наименование кода товара (работы, услуги) по ОКПД 2\" на вкладке \"Спецификация ТРУ\"")
	public void clickOnFieldNameOfProductCode() {
		applet.clickOnFieldNameOfProductCode();
	}
	@Step("Забрать значение из поля \"Наименование кода товара (работы, услуги) по ОКПД 2\" на вкладке \"Спецификация ТРУ\"")
	public String getValueNameOfProductCode(){
		return applet.getValueNameOfProductCode();    	
	}

	@Step("Кликнуть чекбокс в первой строке таблицы \"ТРУ\" на вкладке \"Спецификация ТРУ\"")
	public void clickCheckBoxTruFirstRow() {
		applet.clickCheckBoxTruFirstRow();
	}
	@Step("Нажать кнопку \"Открыть строку на редактирование\" на вкладке \"Спецификация ТРУ\"")
	public void clickOnButtonEditingRow() {
		applet.clickOnButtonEditingRow();
	}
}