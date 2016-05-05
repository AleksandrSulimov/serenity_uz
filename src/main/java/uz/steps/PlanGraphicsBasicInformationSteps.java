package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PlanGraphicsBasicInformation;

/**
 * Вкладка Общие сведения 
 * на странице 'План-график' 
 * @author e.kuzmina 05.05.2016
 *
 */
@SuppressWarnings("serial")
public class PlanGraphicsBasicInformationSteps extends ScenarioSteps {


	public PlanGraphicsBasicInformationSteps(Pages pages) {
        super(pages);
    }
	
	PlanGraphicsBasicInformation applet;

	@Step("Ожидаем загрузку вкладки \"Общие сведения\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	@Step("Нажать кнопку \"Завершить\" на вкладке \"Общие сведения\"")
	public void clickOnButtonClose() {
		applet.clickOnButtonClose();
	}
	
	@Step("Клик по полю \"Фамилия\" на вкладке \"Общие сведения\"")
	public void clickOnFieldLastName() {
		applet.clickOnFieldLastName();
	}
	@Step("Забрать значение из поля \"Фамилия\" на вкладке \"Общие сведения\"")
	public String getValueLastName(){
		return applet.getValueLastName();    	
	}
	@Step("Ввести текст {0} в поле\"Фамилия\" на вкладке \"Общие сведения\"")
	public void setTextLastName(String text) {
		applet.setTextLastName(text);
	}

	@Step("Клик по полю \"Имя\" на вкладке \"Общие сведения\"")
	public void clickOnFieldFirstName() {
		applet.clickOnFieldFirstName();
	}
	@Step("Забрать значение из поля \"Имя\" на вкладке \"Общие сведения\"")
	public String getValueFirstName(){
		return applet.getValueFirstName();    	
	}
	@Step("Ввести текст {0} в поле\"Имя\" на вкладке \"Общие сведения\"")
	public void setTextFirstName(String text) {
		applet.setTextFirstName(text);
	}

	@Step("Клик по полю \"Отчество\" на вкладке \"Общие сведения\"")
	public void clickOnFieldMiddleName() {
		applet.clickOnFieldMiddleName();
	}
	@Step("Забрать значение из поля \"Отчество\" на вкладке \"Общие сведения\"")
	public String getValueMiddleName(){
		return applet.getValueMiddleName();    	
	}
	@Step("Ввести текст {0} в поле\"Отчество\" на вкладке \"Общие сведения\"")
	public void setTextMiddleName(String text) {
		applet.setTextMiddleName(text);
	}

	@Step("Клик по полю \"Телефон\" на вкладке \"Общие сведения\"")
	public void clickOnFieldPhone() {
		applet.clickOnFieldPhone();
	}
	@Step("Забрать значение из поля \"Телефон\" на вкладке \"Общие сведения\"")
	public String getValuePhone(){
		return applet.getValuePhone();    	
	}
	@Step("Ввести текст {0} в поле\"Телефон\" на вкладке \"Общие сведения\"")
	public void setTextPhone(String text) {
		applet.setTextPhone(text);
	}
	@Step("Клик по полю \"Факс\" на вкладке \"Общие сведения\"")
	public void clickOnFieldFax() {
		applet.clickOnFieldFax();
	}
	@Step("Забрать значение из поля \"Факс\" на вкладке \"Общие сведения\"")
	public String getValueFax(){
		return applet.getValueFax();    	
	}
	@Step("Ввести текст {0} в поле\"Факс\" на вкладке \"Общие сведения\"")
	public void setTextFax(String text) {
		applet.setTextFax(text);
	}

	@Step("Клик по полю \"Адрес электронной почты\" на вкладке \"Общие сведения\"")
	public void clickOnFieldEmail() {
		applet.clickOnFieldEmail();
	}
	@Step("Забрать значение из поля \"Адрес электронной почты\" на вкладке \"Общие сведения\"")
	public String getValueEmail(){
		return applet.getValueEmail();    	
	}
	@Step("Ввести текст {0} в поле\"Адрес электронной почты\" на вкладке \"Общие сведения\"")
	public void setTextEmail(String text) {
		applet.setTextEmail(text);
	}

	@Step("Нажать кнопку \"Добавить вложение\" на вкладке \"Общие сведения\"")
	public void clickOnButtonAddAttachment() {
		applet.clickOnButtonAddAttachment();
	}
	
}