package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Вкладка Основные сведения 
 * на странице 'Позиция плана закупок товаров, работ, услуг 200' 
 * @author e.kuzmina 26.04.2016
 *
 */
public class PositionsPurchasePlanOfProductJobService200BasicInformation extends BasePage {
	
			
	  public PositionsPurchasePlanOfProductJobService200BasicInformation(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
		
	  }
	  
	  @FindBy(xpath=".//span[text()='Общая информация о закупке']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//span[text()='Общая информация о закупке']";
	  
	  @FindBy(xpath=".//span[text()='Общая информация о закупке']")
	  private WebElementFacade field;
	  
	  //Поле Тип закупки
	  @FindBy(xpath=".//td[div[span='Тип закупки']]/following-sibling::td/descendant::div[1]")
	  private WebElementFacade purchaseTypeField;
	  @FindBy(xpath=".//td[div[span='Тип закупки']]/following-sibling::td[1]/div/span/input")
	  private WebElementFacade purchaseTypeInput;
	  

	  //Поле ОКПД
	  @FindBy(xpath=".//td[div[span='ОКПД *']]/following-sibling::td[1]")
	  private WebElementFacade okpdField;
	  @FindBy(xpath=".//td[div[span='ОКПД *']]/following-sibling::td[1]/span/input")
	  private WebElementFacade okpdInput;
	  @FindBy(xpath=".//td[div[span='ОКПД *']]/following-sibling::td[2]/div/button")
	  private WebElementFacade okpdOpenDictionaryButton;
	  

	  //Поле Наименование кода товара (работы, услуги) по ОКПД
	  @FindBy(xpath="//td[div[span='Наименование кода товара (работы, услуги) по ОКПД']]/following-sibling::td[1]")
	  private WebElementFacade codeProductNameField;
	  @FindBy(xpath="//td[div[span='Наименование кода товара (работы, услуги) по ОКПД']]/following-sibling::td[1]/div/textarea")
	  private WebElementFacade codeProductNameTextArea;
	  
		
	 
		
	  /**
	   * Клик по полю Тип закупки
	   */
	  public void clickOnFieldPurchaseType(){
		  waitForLoadJS();
		  purchaseTypeField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Тип закупки
	   */
	  public String getValuePurchaseType(){
		  waitForLoadJS();
		  return purchaseTypeInput.waitUntilClickable().getAttribute("value");
	  }
	  
	  /**
	   * Клик по полю ОКПД
	   */
	  public void clickOnFieldOKPD(){
		  waitForLoadJS();
		  okpdField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля ОКПД
	   */
	  public String getValueOKPD(){
		  waitForLoadJS();
		  return okpdInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Отурыть справочник в поле ОКПД
	   */
	  public void clickOnButtonOkpdOpenDictionary(){
		  waitForLoadJS();
		  okpdOpenDictionaryButton.waitUntilClickable().click();
	  }
	  
	  /**
	   * Клик по полю Наименование кода товара (работы, услуги) по ОКПД
	   */
	  public void clickOnFieldCodeProductName(){
		  waitForLoadJS();
		  codeProductNameField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Наименование кода товара (работы, услуги) по ОКПД
	   */
	  public String getValueCodeProductName(){
		  waitForLoadJS();
		  return codeProductNameTextArea.waitUntilClickable().getAttribute("value");
	  }
}