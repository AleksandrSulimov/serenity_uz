package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Вкладка Спецификация ТРУ
 * на странице 'Позиция плана-графика закупок' 
 * @author e.kuzmina 03.05.2016
 *
 */
public class PositionsPlanGraphicsPurchesSpecificationTRU extends BasePage {
	
			
	  public PositionsPlanGraphicsPurchesSpecificationTRU(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
		
	  }
	  
	  @FindBy(xpath=".//span[text()='Код ОКПД2']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//span[text()='Код ОКПД2']";
	  
	  @FindBy(xpath=".//span[text()='Код ОКПД2']")
	  private WebElementFacade field;

	  //Кнопка Закрыть
	  @FindBy(xpath=".//span[text()='Позиция плана-графика закупок']/ancestor::table[3]/descendant::button[@title='Закрыть окно']")
	  private WebElementFacade closeButton;
	  
	  //Поле Код ОКПД2
	  @FindBy(xpath=".//td[div/span='Код ОКПД2']/following-sibling::td[1]/div")
	  private WebElementFacade codeOkpd2Field;
	  @FindBy(xpath=".//td[div/span='Код ОКПД2']/following-sibling::td[1]/div/input")
	  private WebElementFacade codeOkpd2Input;

	  //Поле Наименование кода товара (работы, услуги) по ОКПД 2
	  @FindBy(xpath=".//td[div/span='Код ОКПД2']/following-sibling::td[3]/div")
	  private WebElementFacade nameOfProductCodeField;
	  @FindBy(xpath=".//td[div/span='Код ОКПД2']/following-sibling::td[3]/div/textarea")
	  private WebElementFacade nameOfProductCodeTextarea;

	  //Чекбокс в первой строке таблицы ТРУ
	  @FindBy(xpath=".//div[text()='Код ОКПД 2']/ancestor::table[1]/ancestor::div[1]/following-sibling::div[2]/descendant::td[1]/div/span[contains(@class,'checkbox')]")
	  private WebElementFacade truFirstRowCheckBox;

	  //Кнопка Открыть строку на редактирование
	  @FindBy(xpath=".//button[@title='Открыть строку на редактирование']")
	  private WebElementFacade editingRowButton;
	  

		
	  /**
	   * Нажать кнопку Завершить
	   */
	  public void clickOnButtonClose(){
		  waitForLoadJS();
		  closeButton.waitUntilClickable().click();
		  closeButton.waitUntilNotVisible();
	  }
	  
	  /**
	   * Клик по полю Код ОКПД2
	   */
	  public void clickOnFieldCodeOKPD2(){
		  waitForLoadJS();
		  codeOkpd2Field.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Код ОКПД2
	   */
	  public String getValueCodeOKPD2(){
		  waitForLoadJS();
		  return codeOkpd2Input.getAttribute("value");
	  }
	  /**
	   * Клик по полю Наименование кода товара (работы, услуги) по ОКПД 2
	   */
	  public void clickOnFieldNameOfProductCode(){
		  waitForLoadJS();
		  nameOfProductCodeField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Наименование кода товара (работы, услуги) по ОКПД 2
	   */
	  public String getValueNameOfProductCode(){
		  waitForLoadJS();
		  return nameOfProductCodeTextarea.getAttribute("value");
	  }
	  
	  /**
	   * Кликнуть чекбокс в первой строке таблицы ТРУ
	   */
	  public void clickCheckBoxTruFirstRow(){
		  waitForLoadJS();
		  truFirstRowCheckBox.waitUntilClickable().click();
	  }
	  /**
	   * Нажать кнопку Открыть строку на редактирование
	   */
	  public void clickOnButtonEditingRow(){
		  waitForLoadJS();
		  editingRowButton.waitUntilClickable().click();
	  }
}