package uz.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


/**
 * Справочник ОКПД 2
 * @author e.kuzmina 26.04.2016
 *
 */
public class OKPD2DictionaryPage extends BasePage {
	
			
	  public OKPD2DictionaryPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	
	  }
	  
	  @FindBy(xpath=".//tr[@title='Корневые']")
	  private WebElementFacade applet;
	  
	  @FindBy(xpath=".//tr[@title='Корневые']")
	  private WebElementFacade field;
	  
	  //Элемент в дереве, по номеру
	  private static String elementLevelField = ".//tr[@title='%s']/descendant::td";
	  private static String elementLevelSpan = ".//tr[@title='%s']/descendant::span[contains(@id,'open')]";

	  //Элемент в списке справа, по номеру
	  private static String elementListField = ".//td[@title='%s']";

	 
	 
	 
	  /**
	   * Клик по элементу первого уровня
	   * @param type
	   */
	  public void clickOnElementFirstLevel(String value){
		  field.waitUntilClickable().sendKeys(Keys.END);
		  field.waitUntilClickable().sendKeys(Keys.END);
		  field.waitUntilClickable().sendKeys(Keys.END);
		  String xPathLocator = String.format(elementLevelField, value);
		  waitFor(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocator)));
		  getDriver().findElement(By.xpath(xPathLocator)).click();
	  }
	  /**
	   * Раскрыть список первого уровня
	   * @param type
	   */
	  public void openListFirstLevel(String value){
		  String  xPathLocator = String.format(elementLevelSpan, value);
		  waitFor(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocator)));
		  getDriver().findElement(By.xpath(xPathLocator)).click();
	  }
	  /**
	   * Клик по элементу второго и ниже уровня
	   * @param type
	   */
	  public void clickOnElementSecondLevel(String value){
		  String xPathLocator = String.format(elementLevelField, value);
		  waitFor(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocator)));
		  getDriver().findElement(By.xpath(xPathLocator)).click();
	  }
	  /**
	   * Раскрыть список второго и ниже уровня
	   * @param type
	   */
	  public void openListSecondLevel(String value){
		  String xPathLocator = String.format(elementLevelSpan, value);
		  waitFor(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocator)));
		  getDriver().findElement(By.xpath(xPathLocator)).click();
	  }
	  /**
	   * Проверить существование элемента в дереве
	   * @param type
	   */
	  public void checkElementTreeExists(String value){
		  String xPathLocator = String.format(elementLevelField, value);
		  try{
			  waitFor(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocator)));
		  } catch (Exception e) {
			  System.out.println("В справочнике не найден элемент со значением '"+value+"' !!!");
			  MatcherAssert.assertThat("В справочнике не найден элемент со значением '"+value+"' !!!", false);
		  }
	  }
	  /**
	   * Проверить существование элемента в списке справа
	   * @param type
	   */
	  public void checkElementListExists(String value){
		  String xPathLocator = String.format(elementListField, value);
		  try{
			  waitFor(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocator)));
		  } catch (Exception e) {
			  System.out.println("В справочнике не найден элемент со значением '"+value+"' !!!");
			  MatcherAssert.assertThat("В справочнике не найден элемент со значением '"+value+"' !!!", false);
		  }
	  }
	  /**
	   * Клик по элементу в списке справа
	   * @param type
	   */
	  public void clickOnElementList(String value){
		  String xPathLocator = String.format(elementListField, value);
		  waitFor(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocator)));
		  getDriver().findElement(By.xpath(xPathLocator)).click();
	  }
	  
}