package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Справочник Дополнительный аналитический признак
 * @author e.kuzmina 28.04.2016
 *
 */
public class AdditionalAnalyticalSignDictionaryPage extends BasePage {
	
			
	  public AdditionalAnalyticalSignDictionaryPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	
	  }
	  
	  @FindBy(xpath=".//div[text()='Дополнительный аналитический признак']")
	  private WebElementFacade applet;
	  
	  @FindBy(xpath=".//div[text()='Дополнительный аналитический признак']")
	  private WebElementFacade field;
	  
	  //Поле Дополнительный аналитический признак в фильтре
	  @FindBy(xpath="(.//tr[th/div[text()='Дополнительный аналитический признак']]/following-sibling::tr/descendant::td[input])[2]")
	  private WebElementFacade additionalAnalyticalSignFilterField;
	  @FindBy(xpath=".//tr[th/div[text()='Дополнительный аналитический признак']]/following-sibling::tr/descendant::input[2]")
	  private WebElementFacade additionalAnalyticalSignFilterInput;

	  //Поле Дополнительный аналитический признак
	  @FindBy(xpath=".//tr[th/div[text()='Дополнительный аналитический признак']]/ancestor::div[1]/following-sibling::div[2]/descendant::tr[1]/td[3]/div")
	  private WebElementFacade additionalAnalyticalSignField;
	  
	  //Радиокнопка в поле Дополнительный аналитический признак
	  @FindBy(xpath="(.//span[contains(@class,'radio')])[1]")
	  private WebElementFacade additionalAnalyticalSignRadioButton;

	  //Кнопка Обновить
	  @FindBy(xpath=".//div[contains(text(),'Выбор записи из справочника')]/following-sibling::div//td/button[@title='Обновить список документов' and img[contains(@src,'refresh')]]")
	  private WebElementFacade refreshButton;

	  //Кнопка OK
	  @FindBy(xpath=".//button[text()='OK']")
	  private WebElementFacade okButton;

	  //Значок Видимость фильтров ON
	 // private static String filterOn = ".//table[tbody/tr/th//div='Дополнительный аналитический признак']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_on')]";
	  @FindBy(xpath=".//table[tbody/tr/th//div='Дополнительный аналитический признак']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_on')]")
	  private WebElementFacade filterOnEl;
	  //Значок Видимость фильтров OFF
	  //private static String filterOff = ".//table[tbody/tr/th//div='Дополнительный аналитический признак']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_off')]";
	  @FindBy(xpath=".//table[tbody/tr/th//div='Дополнительный аналитический признак']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_off')]")
	  private WebElementFacade filterOffEl;
	 
		
	  /**
	   * Клик в поле Дополнительный аналитический признак
	   */
	  public void clickOnFieldAdditionalAnalyticalSign(){
		  waitingForFieldVisible(additionalAnalyticalSignFilterField);
		  additionalAnalyticalSignFilterField.waitUntilClickable().click();
	  }
	  /**
	   * Ввести текст в поле Дополнительный аналитический признак
	   * @param text
	   */
	  public void setTextAdditionalAnalyticalSign(String text){
		  waitingForFieldVisible(additionalAnalyticalSignFilterInput);
		  additionalAnalyticalSignFilterInput.waitUntilClickable().clear();
		  waitingForFieldVisible(additionalAnalyticalSignFilterInput);
		  additionalAnalyticalSignFilterInput.waitUntilClickable().sendKeys(text);
	  }
	  /**
	   * Забрать значение из поля Дополнительный аналитический признак
	   * @return text
	   */
	  public String getValueAdditionalAnalyticalSign(){
		  waitingForFieldVisible(additionalAnalyticalSignField);
		  return additionalAnalyticalSignField.waitUntilClickable().getText();
	  }
	  /**
	   * Нажать кнопку Enter
	   */
	  public void clickOnEnter(){
		  waitForLoadJS();
		  additionalAnalyticalSignFilterInput.waitUntilClickable().sendKeys(Keys.ENTER);
//		  waitingForFieldVisible(refreshButton);
//		  refreshButton.waitUntilClickable().click();
	  }
	  /**
	   * Нажать кнопку OK
	   */
	  public void clickOnButtonOK(){
		  waitingForFieldVisible(okButton);
		  okButton.waitUntilClickable().click();
	  }
	  /**
	   * Нажать радиокнопку в поле Дополнительный аналитический признак
	   */
	  public void clickOnRadioButtonAdditionalAnalyticalSign(){
		  waitingForFieldVisible(additionalAnalyticalSignRadioButton);
		  additionalAnalyticalSignRadioButton.waitUntilClickable().click();
	  }
	  /**
	   * Проверить нажата ли кнопка Видимость фильтров
	   * @return boolean
	   */
	  public boolean checkFilterOn(){
		  /*
		  waitForLoadJS();
		  int count = getDriver().findElements(By.xpath(filterOn)).size();
		  if(count>0){
			  return true;
		  }
		  return false;
		  */
		  try {
			  (new WebDriverWait(getDriver(), waitForUnviseble)).until(new ExpectedCondition<Boolean>() {
					public Boolean apply(final WebDriver dirver) {
				    	try {
				    		if(!filterOnEl.isCurrentlyVisible()){
				    			return true;
				    		}else{
				    			return false;
				    		}
				    		
						} catch (Exception e) {
							 return false;
						}
		
				    }
				});
				
			} catch (Exception e) {
			}
		return filterOnEl.isCurrentlyVisible();
	  }
	  /**
	   * Нажать кнопку Видимость фильтров
	   */
	  public void clickFilter(){
		  /*
		  waitForLoadJS();
		  getDriver().findElement(By.xpath(filterOn)).click();
		  getDriver().findElement(By.xpath(filterOff));
		  */
		  waitingForFieldVisible(filterOnEl);
		  filterOnEl.waitUntilClickable().click();
		  waitingForFieldVisible(filterOffEl);
	  }
	  
}