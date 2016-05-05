package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PlanGraphicsCoordinationSheet;

/**
 * Вкладка Лист согласования
 * на странице 'План-график' 
 * @author e.kuzmina 05.05.2016
 *
 */
@SuppressWarnings("serial")
public class PlanGraphicsCoordinationSheetSteps extends ScenarioSteps {


	public PlanGraphicsCoordinationSheetSteps(Pages pages) {
        super(pages);
    }
	
	PlanGraphicsCoordinationSheet applet;

	@Step("Ожидаем загрузку вкладки \"Лист согласования\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
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
	@Step("Забрать значение из поля \"Телефон\" в блоке \"Автор\" на вкладке \"Лист согласования\"")
	public String getValuePhoneAuthor(){
		return applet.getValuePhoneAuthor();    	
	}
	@Step("Ввести текст {0} в поле \"Телефон\" в блоке \"Автор\" на вкладке \"Лист согласования\"")
	public void setTextPhoneAuthor(String text){
		applet.setTextPhoneAuthor(text);    	
	}
	@Step("Кликнуть чекбокс \"Требуется согласование\" на вкладке \"Лист согласования\"")
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
	@Step("Клик по полю \"Телефон\" в блоке \"Утверждающий\" на вкладке \"Лист согласования\"")
	public void clickOnFieldPhoneValidator() {
		applet.clickOnFieldPhoneValidator();
	}
	@Step("Забрать значение из поля \"Телефон\" в блоке \"Утверждающий\" на вкладке \"Лист согласования\"")
	public String getValuePhoneValidator(){
		return applet.getValuePhoneValidator();    	
	}
	@Step("Ввести текст {0} в поле \"Телефон\" в блоке \"Утверждающий\" на вкладке \"Лист согласования\"")
	public void setTextPhoneValidator(String text){
		applet.setTextPhoneValidator(text);    	
	}
	@Step("Нажать кнопку \"Проверить документ\" на странице \"Лист согласования\"")
	public void clickOnButttonCheckDocument(){
		applet.clickOnButttonCheckDocument();    	
	}
}