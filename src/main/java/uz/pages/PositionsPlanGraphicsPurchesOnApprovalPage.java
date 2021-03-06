package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Позиции плана-графика закупок на согласовании
 * @author s.serov 30.04.2016
 *
 */
public class PositionsPlanGraphicsPurchesOnApprovalPage extends  PositionsPlanGraphicsPurchesPage {
	
			
	  public PositionsPlanGraphicsPurchesOnApprovalPage(WebDriver driver) {
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
	  
	  //Закрыть ППЗ
	  @FindBy(xpath=".//div[button[@title[contains(.,'Позиции плана-графика закупок на согласовании')]]]/a[@title='Закрыть']")
	  private WebElementFacade closeLink;
	  
	  //Кнопка Согласовать закупку
	  @FindBy(xpath=".//button[@title='Согласовать']")
	  private WebElementFacade approvalButton;
	 
	  
	  //Номер позиции плана закупок
	  @FindBy(xpath=".//div[3]/table/tbody/tr[1]/td[position() = (count(//th[contains(.,'Номер закупки')]/preceding-sibling::*)+1)]/div")
	  protected WebElementFacade numberPositionPlanGraphicField;
	  //Номер позиции плана закупок в фильтре
	  @FindBy(xpath=".//div/table/tbody/tr[2]/th[position() = (count(//th[contains(.,'Номер закупки')]/preceding-sibling::*)+1)]/div/descendant::input")
	  protected WebElementFacade numberPositionPlanGraphicInFilterInput;
	  
	  /**
	   * Закрыть Позиции плана-графика закупок на согласовании
	   */
		public void clickOnLinkClose(){
			waitForLoadJS();
			getDriver().switchTo().defaultContent();
			closeLink.waitUntilClickable().click();
		}
	
	  /**
	   * Клик по кнопке Согласовать закупку
	   */
	  public void clickOnButtonApproval() {
		  waitingForFieldVisible(approvalButton);
		  approvalButton.waitUntilClickable().click();
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