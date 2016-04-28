package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Вкладка Лист согласования
 * на странице 'Позиция плана закупок товаров, работ, услуг 200' 
 * @author e.kuzmina 28.04.2016
 *
 */
public class PositionsPurchasePlanOfProductJobService200CoordinationSheet extends BasePage {
	
			
	  public PositionsPurchasePlanOfProductJobService200CoordinationSheet(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
		
	  }
	  
	  @FindBy(xpath="(.//span[text()='ФИО сотрудника'])[1]")
	  private WebElementFacade applet;
	  private String appletXpath = "(.//span[text()='ФИО сотрудника'])[1]";
	  
	  @FindBy(xpath="(.//span[text()='ФИО сотрудника'])[1]")
	  private WebElementFacade field;
	  
	  //Чекбокс Требуется согласование
	  @FindBy(xpath=".//span[@title='Установите чек-бокс если требуется согласование' and input[@type='checkbox']]/div")
	  private WebElementFacade needCoordinationCheckBox;

	  //Кнопка Добавить новую строку В таблице "Согласующие"
	  @FindBy(xpath=".//span[contains(@title, 'Номер этапа')]//ancestor::table[2]/descendant::button[@title='Добавить новую строку']")
	  private WebElementFacade addNewRecordCoordinatorsButton;

	  //Кнопка Выберите согласующего сотрудника из справочника В таблице "Согласующие"
	  @FindBy(xpath=".//button[@title='Выберите согласующего сотрудника из справочника']")
	  private WebElementFacade chooseCoordinatorButton;
	  
	  //Кнопка Выберите утверждающего сотрудника из справочника В таблице "Утверждающий"
	  @FindBy(xpath=".//button[@title='Выберите утверждающего сотрудника из справочника']")
	  private WebElementFacade chooseValidatorButton;
	  
	  /**
	   * Кликнуть чекбокс  Требуется согласование
	   */
	  public void clickOnCheckBoxNeedCoordination(){
		  waitForLoadJS();
		  needCoordinationCheckBox.waitUntilClickable().click();
	  }
	  /**
	   * Нажать кнопку "Добавить новую строку" В таблице "Согласующие"
	   */
	  public void clickOnButtonAddNewRecordCoordinators(){
		  waitForLoadJS();
		  addNewRecordCoordinatorsButton.waitUntilClickable().click();
	  }
	  /**
	   * Нажать кнопку "Выберите согласующего сотрудника из справочника" В таблице "Согласующие"
	   */
	  public void clickOnButtonChooseCoordinator(){
		  waitForLoadJS();
		  chooseCoordinatorButton.waitUntilClickable().click();
	  }
	 
	  /**
	   * Нажать кнопку "Выберите утверждающего сотрудника из справочника" В таблице "Согласующие"
	   */
	  public void clickOnButtonChooseValidator(){
		  waitForLoadJS();
		  chooseValidatorButton.waitUntilClickable().click();
	  }
	  
	  
	 
}