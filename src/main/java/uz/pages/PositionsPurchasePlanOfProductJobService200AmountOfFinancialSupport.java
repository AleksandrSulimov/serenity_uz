package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


/**
 * Вкладка Объем финансового обеспечения
 * на странице 'Позиция плана закупок товаров, работ, услуг 200' 
 * @author e.kuzmina 27.04.2016
 *
 */
public class PositionsPurchasePlanOfProductJobService200AmountOfFinancialSupport extends BasePage {
	
			
	  public PositionsPurchasePlanOfProductJobService200AmountOfFinancialSupport(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
		
	  }
	  
	  @FindBy(xpath=".//span[text()='Объем финансового обеспечения на осуществление закупки']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//span[text()='Объем финансового обеспечения на осуществление закупки']";
	  
	  @FindBy(xpath=".//span[text()='Объем финансового обеспечения на осуществление закупки']")
	  private WebElementFacade field;
	  
	  //Кнопка Добавить новую строку
	  @FindBy(xpath="(.//button[@title='Добавить новую строку'])[1]")
	  private WebElementFacade createNewRecordButton;
	  
	  

	  //Поле Планируемый год размещения извещения
	  @FindBy(xpath="(.//input[contains(@name, 'publishyear')])[1]")
	  private WebElementFacade publishYearInput;
	  //Выпадающий список в поле  Планируемый год размещения извещения
	  private String publishListXpath = ".//li[span='%s']";
	  
	  /**
	   * Нажать кнопку Добавить новую строку
	   */
	  public void clickOnButtonСreateNewRecord(){
		  waitForLoadJS();
		  createNewRecordButton.waitUntilClickable().click();
	  }

	  /**
	   * Кликнуть в поле Планируемый год размещения извещения
	   */
	  public void clickOnFieldPublishYearInput(){
		  waitForLoadJS();
		  publishYearInput.waitUntilClickable().click();
	  }

	  /**
	   * Клик по линку выпадающего списка в поле Планируемый год размещения извещения
	   * @param linkText(String) - видимый текст линка
	   */
	  public void selectFromDropDownList(String linkText){  
		  	waitForLoadJS();
			String xPathLocator = String.format(publishListXpath, linkText); 
			waitFor(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocator)));
			getDriver().findElement(By.xpath(xPathLocator)).click();

		}
}