package uz.pages.dialog;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

import uz.pages.BasePage;


/**
 * Диалоговое окно 'Выбрать тип закупки и вид расходов позиции плана закупок'
 * @author e.kuzmina 03.05.2016
 *
 */
public class SelectTypeOfProcurementAndProcurementPlanPPZDialog extends BasePage {
	
			
	  public SelectTypeOfProcurementAndProcurementPlanPPZDialog(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//div[text()='Выбрать тип закупки и вид расходов позиции плана закупок']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//div[text()='Выбрать тип закупки и вид расходов позиции плана закупок']";
	  
	  @FindBy(xpath=".//div[text()='Выбрать тип закупки и вид расходов позиции плана закупок']")
	  private WebElementFacade field;
	  
	  //Выбранная радиокнопка
	  @FindBy(xpath=".//input[@type='radio' and @checked='checked']/following-sibling::label")
	  private WebElementFacade checkedRadioButton;
	  
	  //Кнопка Выбрать
	  @FindBy(xpath=".//button[text()='Выбрать']")
	  private WebElementFacade selectButton;
	  

	  /**
	   * Клик по кнопке Выбрать
	   */
	  public void clickOnButtonSelect() {
		  waitingForFieldVisible(selectButton);
		  selectButton.waitUntilClickable().click();
		  waitingForFieldUnVisible(selectButton);
	  }
	  /**
	   * Вернуть значение выбранной радиокнопки
	   */
	  public String getValueCheckedRadioButton() {
		  waitingForFieldVisible(checkedRadioButton);
		  return checkedRadioButton.waitUntilClickable().getTextValue();
	  }
	  
}