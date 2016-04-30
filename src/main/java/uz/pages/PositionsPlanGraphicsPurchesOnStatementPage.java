package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Позиции плана-графика закупок на утверждении
 * @author s.serov 30.04.2016
 *
 */
public class PositionsPlanGraphicsPurchesOnStatementPage extends PositionsPlanGraphicsPurchesPage {
	
			
	  public PositionsPlanGraphicsPurchesOnStatementPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//th[@title='Номер укрупненной закупки']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//th[@title='Номер укрупненной закупки']";
	  
	  @FindBy(xpath=".//th[@title='Номер укрупненной закупки']")
	  private WebElementFacade field;
	  
	  //Закрыть
	  @FindBy(xpath=".//div[button[@title[contains(.,'Позиции плана-графика закупок на утверждении')]]]/a[@title='Закрыть']")
	  private WebElementFacade closeLink;
	  
	  //Кнопка Утвердить
	  @FindBy(xpath=".//button[@title='Утвердить']")
	  private WebElementFacade statementButton;
	  
	  @FindBy(xpath=".//div/table/tbody/tr[2]/th[position() = (count(//th[contains(.,'Номер укрупненной закупки')]/preceding-sibling::*)+1)]/div/descendant::input")
	  protected WebElementFacade numberPositionPlanGraphicInFilterInput;
	  
	  /**
	   * Закрыть Позиции плана закупок на согласовании
	   */
		public void clickOnLinkClose(){
			waitForLoadJS();
			getDriver().switchTo().defaultContent();
			closeLink.waitUntilClickable().click();
			
		}
	
	  /**
	   * Клик по кнопке Утвердить
	   */
	  public void clickOnButtonStatement() {
		  waitingForFieldVisible(statementButton);
		  statementButton.waitUntilClickable().click();
	  }
	  /**
	   * Очищаем Номер позиции плана закупок в фильтре
	   */
	  public void cleanPositionPlanGraphicInFilter(){
		  waitingForFieldVisible(numberPositionPlanGraphicInFilterInput);
		  numberPositionPlanGraphicInFilterInput.waitUntilClickable().clear();
		  numberPositionPlanGraphicInFilterInput.waitUntilClickable().typeAndEnter("");
	  }
	  /**
	   * Устанавливаем Номер позиции плана закупок в фильтре
	   * @param string
	   */
	  public void setPositionPlanGraphicInFilter(String string){
		  waitingForFieldVisible(numberPositionPlanGraphicInFilterInput);
		  numberPositionPlanGraphicInFilterInput.waitUntilClickable().clear();
		  numberPositionPlanGraphicInFilterInput.waitUntilClickable().typeAndEnter(string);
	  }
	  
}