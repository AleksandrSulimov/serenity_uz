package uz.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;


/**
 * Позиции плана закупок 200
 * @author s.serov 26.04.2016
 *
 */
public class PositionsPurchasePlan200Page extends BasePage {
	
			
	  public PositionsPurchasePlan200Page(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//th[@title='Номер позиции плана закупок']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//th[@title='Номер позиции плана закупок']";
	  
	  @FindBy(xpath=".//th[@title='Номер позиции плана закупок']")
	  private WebElementFacade field;
	  
	  //Кнопка Создать новый документ
	  @FindBy(xpath=".//button[@title='Создать новый документ']")
	  private WebElementFacade creteNewDocumentButton;

	  //Отправить на согласование
	  @FindBy(xpath=".//img[contains(@src,'ico_dollar.png')]/..")
	  private WebElementFacade sendToMatchingButton;
	  
	  //Фильтр
	  @FindBy(xpath=".//img[@title='Видимость фильтров']")
	  private WebElementFacade filterLink;
	  
	  //Номер позиции плана закупок
	  @FindBy(xpath=".//div[3]/table/tbody/tr[1]/td[position() = (count(//th[contains(.,'Номер позиции плана закупок')]/preceding-sibling::*)+1)]/div")
	  private WebElementFacade numberPositionPlanPurshedInput;
	  //Номер позиции плана закупок в фильтре
	  @FindBy(xpath=".//div[3]/table/tbody/tr[1]/td[position() = (count(//th[contains(.,'Номер позиции плана закупок')]/preceding-sibling::*)+1)]/div")
	  private WebElementFacade numberPositionPlanPurshedInFilterInput;
	  
	  //Бокс выбрать первую позицию
	  @FindBy(xpath=".//div[3]/table/tbody/tr[1]/td[1]/div/span")
	  private WebElementFacade checkBoxOnFirstRow;
	 
		
	  /**
		 * Ожидаем, когда аплет будет visible
		 */
		public void waitingForAppletVisible(){
			waitForLoadJS();
			waitFor(new ExpectedCondition<Boolean>() {
			    public Boolean apply(final WebDriver dirver) {
			    	getDriver().switchTo().defaultContent();
			    	try {
			    		int countFrame = getDriver().findElements(By.xpath(".//iframe")).size();
			    		for(int i=1; i<=countFrame; i++){
			    			getDriver().switchTo().defaultContent();
			    			getDriver().switchTo().frame(getDriver().findElement(By.xpath("(.//iframe)["+i+"]")));
			    			if(getDriver().findElements(By.xpath(appletXpath)).size() > 0){
				    			return true;
				    		}
			    		}
			    		return false;
			    		
					} catch (Exception e) {
						 return false;
					}
			    }
			});
			waitFor(ExpectedConditions.elementToBeClickable(applet));
			//getDriver().switchTo().defaultContent();
		}
		
	  /**
	   * Клик по кнопке Создать новый документ
	   */
	  public void clickOnButtonCreteNewDocument(){
		  waitForLoadJS();
		  creteNewDocumentButton.waitUntilClickable().click();
	  }
	  
	  /**
	   * Клик по кнопке Отправить на согласование
	   */
	  public void clickOnButtonSendToMatching(){
		  waitForLoadJS();
		  sendToMatchingButton.waitUntilClickable().click();
	  }
	  /**
	   * Проверяем нажат ли фильтр
	   * @return Boolean (true - если линк нажат)
	   */
	  public Boolean isPushedLinkFilter(){
		  waitForLoadJS();
		  String src = filterLink.waitUntilClickable().getAttribute("src");
		  if(src.contains("filter_on")){
			  return true;
		  }
		  return false;
	  }
	  /**
	   * Клик по линку Фильтр
	   */
	  public void clickOnLinkFilter(){
		  waitForLoadJS();
		  filterLink.waitUntilClickable().click();
	  }
	  /**
	   * Очищаем Номер позиции плана закупок в фильтре
	   */
	  public void cleanPositionPlanPurshedInFilter(){
		  waitForLoadJS();
		  numberPositionPlanPurshedInFilterInput.waitUntilClickable().clear();
		  numberPositionPlanPurshedInFilterInput.waitUntilClickable().typeAndEnter("");
	  }
	  /**
	   * Устанавливаем Номер позиции плана закупок в фильтре
	   * @param string
	   */
	  public void setPositionPlanPurshedInFilter(String string){
		  waitForLoadJS();
		  numberPositionPlanPurshedInFilterInput.waitUntilClickable().clear();
		  numberPositionPlanPurshedInFilterInput.waitUntilClickable().typeAndEnter(string);
	  }
	  /**
	   * Клик по чекбоксу выбора строки в первой строке
	   */
	  public void selectFirstRow(){
		  checkBoxOnFirstRow.waitUntilClickable().click();
	  }
}