package uz.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
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

	  //Поле Код
	  @FindBy(xpath="(.//tr[th/div[text()='Код']]/following-sibling::tr/descendant::td[input])[1]")
	  private WebElementFacade codeField;
	  private static String codeFieldXpath = "(.//tr[th/div[text()='Код']]/following-sibling::tr/descendant::td[input])[1]";
	  @FindBy(xpath=".//tr[th/div[text()='Код']]/following-sibling::tr/descendant::input[1]")
	  private WebElementFacade codeInput;

	  //Кнопка Обновить
	  @FindBy(xpath=".//button[@title='Обновить']")
	  private WebElementFacade refreshButton;

	  //Кнопка OK
	  @FindBy(xpath=".//button[text()='OK']")
	  private WebElementFacade okButton;

	  //Значок Видимость фильтров ON
	  private static String filterOn = ".//table[tbody/tr/th//div='Код']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_on')]";
	  //Значок Видимость фильтров OFF
	  private static String filterOff = ".//table[tbody/tr/th//div='Код']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_off')]";
	 
	 
	  /**
		 * Ожидаем, когда аплет будет visible
		 */
		public void waitingForAppletVisible(){
			waitForLoadJS();
			waitFor(new ExpectedCondition<Boolean>() {
			    public Boolean apply(final WebDriver dirver) {
			    	try {
			    		if(applet.isCurrentlyVisible()){
			    			return true;
			    		}else{
			    			return false;
			    		}
					} catch (Exception e) {
						 return false;
					}
			    }
			});
			waitFor(ExpectedConditions.elementToBeClickable(applet));
			field.waitUntilClickable().sendKeys(Keys.END);
			field.waitUntilClickable().sendKeys(Keys.END);
			field.waitUntilClickable().sendKeys(Keys.END);
		}
		
	  /**
	   * Клик по элементу первого уровня
	   * @param type
	   */
	  public void clickOnElementFirstLevel(String value){
		  String xPathLocator = String.format(elementLevelField, value);
		  waitFor(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocator)));
		  getDriver().findElement(By.xpath(xPathLocator)).click();
	  }
	  /**
	   * Клик по элементу первого уровня
	   * @param type
	   */
	  public void clickOnElementFirstLevel(String value, int num){
		  String xPathLocator = "("+String.format(elementLevelField, value)+")["+num+"]";
		  waitFor(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocator)));
		  getDriver().findElement(By.xpath(xPathLocator)).click();
	  }
	  /**
	   * Раскрыть список первого уровня
	   * @param type
	   */
	  public void openListFirstLevel(String value, int num){
		  String xPathLocator = "("+String.format(elementLevelSpan, value)+")["+num+"]";
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
	  /**
	   * Клик в поле Код
	   */
	  public void clickOnFieldCode(){
		  getDriver().findElement(By.xpath(codeFieldXpath)).click();
	  }
	  /**
	   * Ввести текст в поле Код
	   * @param text
	   */
	  public void setTextCode(String text){
		  codeInput.waitUntilClickable().clear();
		  codeInput.waitUntilClickable().sendKeys(text);
	  }
	  /**
	   * Забрать значение из поля Код
	   * @return text
	   */
	  public String getValueCode(){
		  return codeInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Нажать кнопку Обновить
	   */
	  public void clickOnButtonRefresh(){
		  refreshButton.waitUntilClickable().click();
	  }
	  /**
	   * Нажать кнопку OK
	   */
	  public void clickOnButtonOK(){
		  okButton.waitUntilClickable().click();
	  }
	  /**
	   * Возвращает количество найденных элементов дереве
	   */
	  public int getCountOfElemetTree(String value){
		  String xPathLocator = String.format(elementLevelField, value);
		  return getDriver().findElements(By.xpath(xPathLocator)).size();
	  }
	  /**
	   * Клик по элементу в дереве
	   * @param value
	   * @param num
	   */
	  public void clickOnElementTree(String value, int num){
		  String xPathLocator = "("+String.format(elementLevelSpan, value)+")["+num+"]";
		  waitFor(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocator)));
		  getDriver().findElement(By.xpath(xPathLocator)).click();
	  }
	  /**
	   * Раскрыть список в дереве
	   * @param value
	   * @param num
	   */
	  public void openListTree(String value, int num){
		  String xPathLocator = "("+String.format(elementLevelSpan, value)+")["+num+"]";
		  waitFor(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocator)));
		  getDriver().findElement(By.xpath(xPathLocator)).click();
	  }
	  /**
	   * Проверить нажата ли кнопка Видимость фильтров
	   * @return boolean
	   */
	  public boolean checkFilterOn(){
		  int count = getDriver().findElements(By.xpath(filterOn)).size();
		  if(count>0){
			  return true;
		  }
		  return false;
	  }
	  /**
	   * Нажать кнопку Видимость фильтров
	   */
	  public void clickFilter(){
		  getDriver().findElement(By.xpath(filterOn)).click();
		  getDriver().findElement(By.xpath(filterOff));
	  }
	  
}