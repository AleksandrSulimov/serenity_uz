package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.SelectPositionOfProcurementPlanDiictionaryPage;

/**
 * Справочник 'Выбрать позицию плана закупок'
 * @author e.kuzmina 03.05.2016
 *
 */
@SuppressWarnings("serial")
public class SelectPositionOfProcurementPlanDiictionaryPageSteps extends ScenarioSteps {


	public SelectPositionOfProcurementPlanDiictionaryPageSteps(Pages pages) {
        super(pages);
    }
	
	SelectPositionOfProcurementPlanDiictionaryPage applet;

	@Step("Ожидаем загрузку справочника \"Выбрать позицию плана закупок\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}
	 
	@Step("Клик в поле \"Наименование объекта закупки (предмет контракта)\" в справочнике \"Выбрать позицию плана закупок\"")
	public void clickOnFieldObjectOfTenderName(){
		applet.clickOnFieldObjectOfTenderName();    	
	}
	@Step("Ввести текст {0} в поле \"Наименование объекта закупки (предмет контракта)\" в справочнике \"Выбрать позицию плана закупок\"")
	public void setTextObjectOfTenderName(String text){
		applet.setTextObjectOfTenderName(text);    	
	}
	@Step("Забрать значение из поля \"Наименование объекта закупки (предмет контракта)\" в справочнике \"Выбрать позицию плана закупок\"")
	public String getValueObjectOfTenderName(){
		return applet.getValueObjectOfTenderName();    	
	}

	@Step("Клик в поле \"ОКПД 2\" в справочнике \"Выбрать позицию плана закупок\"")
	public void clickOnFieldOKPD2(){
		applet.clickOnFieldOKPD2();    	
	}
	@Step("Ввести текст {0} в поле \"ОКПД 2\" в справочнике \"Выбрать позицию плана закупок\"")
	public void setTextOKPD2(String text){
		applet.setTextOKPD2(text);    	
	}
	@Step("Забрать значение из поля \"ОКПД 2\" в справочнике \"Выбрать позицию плана закупок\"")
	public String getValueOKPD2(){
		return applet.getValueOKPD2();    	
	}
	@Step("Клик в поле \"Номер позиции плана закупок\" в справочнике \"Выбрать позицию плана закупок\"")
	public void clickOnFieldProcurementPlanPositionNumber(){
		applet.clickOnFieldProcurementPlanPositionNumber();    	
	}
	@Step("Ввести текст {0} в поле \"Номер позиции плана закупок\" в справочнике \"Выбрать позицию плана закупок\"")
	public void setTextProcurementPlanPositionNumber(String text){
		applet.setTextProcurementPlanPositionNumber(text);    	
	}
	@Step("Забрать значение из поля \"Номер позиции плана закупок\" в справочнике \"Выбрать позицию плана закупок\"")
	public String getValueProcurementPlanPositionNumber(){
		return applet.getValueProcurementPlanPositionNumber();    	
	}
	@Step("Нажать кнопку Enter в справочнике \"Выбрать позицию плана закупок\"")
	public void clickOnEnter(){
		applet.clickOnEnter();    	
	}
	@Step("Нажать кнопку \"OK\" в справочнике \"Выбрать позицию плана закупок\"")
	public void clickOnButtonOK(){
		applet.clickOnButtonOK();    	
	}
	@Step("Проверить нажата ли кнопка \"Видимость фильтров\" в справочнике \"Выбрать позицию плана закупок\"")
	public boolean checkFilterOn(){
		return applet.checkFilterOn();    	
	}
	@Step("Нажать кнопку \"Видимость фильтров\" в справочнике \"Выбрать позицию плана закупок\"")
	public void clickFilter(){
		applet.clickFilter();    	
	}
	@Step("Клик в поле \"Номер позиции плана закупок\" со значением {0} в справочнике \"Выбрать позицию плана закупок\"")
	public void clickOnFieldProcurementPlanPositionNumber(String text){
		applet.clickOnFieldProcurementPlanPositionNumber(text);    	
	}
	@Step("Проверка наличия окна 'Недостаточно финансового обеспечения'")
	public boolean windowNotEnoughFinObIsVisible() {
		return applet.windowNotEnoughFinObIsVisible();
	}
	@Step("Нажать на кнопку 'Создать' в окне 'Недостаточно финансового обеспечения'")
	public void clickOnButtonCreateInWindowNotEnough() {
		applet.clickOnButtonCreateInWindowNotEnough();		
	}
}