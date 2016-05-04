package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PositionsPlanGraphicsPurchesCoordinationSheet;

/**
 * Вкладка Лист согласования
 * на странице 'Позиция плана-графика закупок' 
 * @author e.kuzmina 04.05.2016
 *
 */
@SuppressWarnings("serial")
public class PositionsPlanGraphicsPurchesCoordinationSheetSteps extends ScenarioSteps {


	public PositionsPlanGraphicsPurchesCoordinationSheetSteps(Pages pages) {
        super(pages);
    }
	
	PositionsPlanGraphicsPurchesCoordinationSheet applet;

	@Step("Ожидаем загрузку вкладки \"Лист согласования\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	@Step("Нажать кнопку \"Завершить\" на вкладке \"Лист согласования\"")
	public void clickOnButtonClose() {
		applet.clickOnButtonClose();
	}
	
	@Step("Клик по полю \"ФИО сотрудника\" в блоке \"Автор\" на вкладке \"Лист согласования\"")
	public void clickOnFieldFioEmployeeAuthor() {
		applet.clickOnFieldFioEmployeeAuthor();
	}
	@Step("Забрать значение из поля \"ФИО сотрудника\" в блоке \"Автор\" на вкладке \"Лист согласования\"")
	public String getValueFioEmployeeAuthor(){
		return applet.getValueFioEmployeeAuthor();    	
	}

	@Step("Клик по полю \"Должность\" в блоке \"Автор\" на вкладке \"Лист согласования\"")
	public void clickOnFieldPositionAuthor() {
		applet.clickOnFieldPositionAuthor();
	}
	@Step("Забрать значение из поля \"Должность\" в блоке \"Автор\" на вкладке \"Лист согласования\"")
	public String getValuePositionAuthor(){
		return applet.getValuePositionAuthor();    	
	}
	@Step("Забрать значение чекбокса \"Требуется согласование\" на вкладке \"Лист согласования\"")
	public String getValueNeedCoordinationCheckBox(){
		String value = applet.getValueNeedCoordinationCheckBox();
		if(value.equals("true")){
			return "Y";
		}
		return "N";    	
	}
	@Step("Забрать значение из поля \"Этап\" в блоке \"Согласующие\" на вкладке \"Лист согласования\"")
	public String getValueStageMatcher(){
		return applet.getValueStageMatcher();    	
	}
	@Step("Забрать значение из поля \"Код группы\" в блоке \"Согласующие\" на вкладке \"Лист согласования\"")
	public String getValueCodeGroupMatcher(){
		return applet.getValueCodeGroupMatcher();    	
	}
	@Step("Забрать значение из поля \"Порядковый номер согласующего\" в блоке \"Согласующие\" на вкладке \"Лист согласования\"")
	public String getValueSequenceNumberMatching(){
		return applet.getValueSequenceNumberMatching();    	
	}
	@Step("Забрать значение из поля \"ФИО сотрудника\" в блоке \"Согласующие\" на вкладке \"Лист согласования\"")
	public String getValueFioEmployeeMatching(){
		return applet.getValueFioEmployeeMatching();    	
	}
	@Step("Забрать значение из поля \"Должность\" в блоке \"Согласующие\" на вкладке \"Лист согласования\"")
	public String getValuePositionMatching(){
		return applet.getValuePositionMatching();    	
	}
	@Step("Забрать значение из поля \"Результат согласования\" в блоке \"Согласующие\" на вкладке \"Лист согласования\"")
	public String getValueResultMatching(){
		return applet.getValueResultMatching();    	
	}
	
	@Step("Забрать значение из поля \"ФИО сотрудника\" в блоке \"Утверждающий\" на вкладке \"Лист согласования\"")
	public String getValueFioEmployeePredicating(){
		return applet.getValueFioEmployeePredicating();    	
	}

	@Step("Забрать значение из поля \"Должность\" в блоке \"Утверждающий\" на вкладке \"Лист согласования\"")
	public String getValuePositionPredicating(){
		return applet.getValuePositionPredicating();    	
	}

	@Step("Нажать кнопку \"Проверить документ\" на вкладке \"Лист согласования\"")
	public void clickOnButtonCheckDocument(){
		applet.clickOnButtonCheckDocument();    	
	}
}