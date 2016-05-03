package uz.pages.admin;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

import uz.pages.BasePage;


/**
 * Автопроцедуры
 * @author s.serov 02.05.2016
 *
 */
public class AutoprocedurePage extends BasePage {
	
			
	  public AutoprocedurePage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	
	  @FindBy(xpath=".//div[text()='Автопроцедура удаления из БД документов']") 
	  private WebElementFacade applet; 
	  private String appletXpath = ".//div[text()='Автопроцедура удаления из БД документов']";
		    
	  @FindBy(xpath=".//div[text()='Автопроцедура удаления из БД документов']")
	  private WebElementFacade field;
	  
	  //Автопроцедура удаления из БД документов
	  @FindBy(xpath=".//div[text()='Автопроцедура удаления из БД документов']")
	  private WebElementFacade autoProcedureDeleteDocFromDbRow;
	  //Кнопка Редактировать вверху страницы
	  @FindBy(xpath="(.//button[@title='Редактировать'])[1]")
	  private WebElementFacade editTopButton;
	  //Исполняемая процедура
	  @FindBy(xpath=".//a[contains(.,'Исполняемая процедура')]")
	  private WebElementFacade runnableProcedureTab;
	  //Кнопка Редактировать на вкладке Исполнимая процедура
	  @FindBy(xpath="(.//button[@title='Редактировать'])[2]")
	  private WebElementFacade editRunnableProcedureButton;
	  //Условия удаления
	  @FindBy(xpath=".//tr[contains(.,'Условия удаления')]/descendant::input")
	  private WebElementFacade removableConditionInput;
	  //Кнопка Сохранить изменение на вкладке Исполнимая процедура
	  @FindBy(xpath=".//button[@title='Сохранить изменение']")
	  private WebElementFacade saveRunnableProcedureButton;
	  //Кнопка Сохранить вверху страницы
	  @FindBy(xpath=".//button[@title='Сохранить']")
	  private WebElementFacade saveTopButton;
	  //Кнопка Запустить задание на исполнение вверху страницы
	  @FindBy(xpath=".//button[@title='Запустить задание на исполнение']")
	  private WebElementFacade runTaskTopButton;
	  
	  public void clickOnRowAutoProcedureRemoveDocumentFromDb(){
		  waitingForFieldVisible(autoProcedureDeleteDocFromDbRow);
		  autoProcedureDeleteDocFromDbRow.waitUntilClickable().click();
	  }
	  
	  public void clickOnBottonEdit(){
		  waitingForFieldVisible(editTopButton);
		  editTopButton.waitUntilClickable().click();
	  }
	  
	  public void clickOnTabRunnableProcedure(){
		  waitingForFieldVisible(runnableProcedureTab);
		  runnableProcedureTab.waitUntilClickable().click();
	  }
	  
	  public void clickOnBottonEditRunnableProcedure(){
		  waitingForFieldVisible(editRunnableProcedureButton);
		  editRunnableProcedureButton.waitUntilClickable().click();
	  }
	  
	  public void setTextRemovableCondition(String string){
		  waitingForFieldVisible(removableConditionInput);
		  removableConditionInput.waitUntilClickable().clear();
		  removableConditionInput.waitUntilClickable().sendKeys(string);;
	  }
	  
	  public void clickOnBottonSaveRunnableProcedure(){
		  waitingForFieldVisible(saveRunnableProcedureButton);
		  saveRunnableProcedureButton.waitUntilClickable().click();
	  }
	  
	  public void clickOnBottonSave(){
		  waitingForFieldVisible(saveTopButton);
		  saveTopButton.waitUntilClickable().click();
	  }
	  
	  public void clickOnBottonRun(){
		  waitingForFieldVisible(runTaskTopButton);
		  runTaskTopButton.waitUntilClickable().click();
	  }
}