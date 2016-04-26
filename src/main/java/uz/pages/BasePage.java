package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Базовый класс для всех Applet
 * @author s.serov 
 * 12.02.2016
 */
public  class BasePage extends PageObject { //abstract
	

	 public BasePage(WebDriver driver) {
		super(driver);
	 }
	 
	 public static int waitForUnviseble = 3;

	 private static String linkXpath = ".//ul[contains(@style,'block')]/li[text()='%s']";//.//ul/li[text()='%s']
	 
	 @FindBy(xpath=".//div[@id='maskoverlay']")
	 protected WebElementFacade maskoverlay;
	 
	 /**По умолчанию считаем что это первая филда в заголовке таблицы для лист аплета и первая филда для контрола */
	 protected WebElementFacade applet;
	
	/**По умолчанию считаем что это первая филда на контроле */
	protected WebElementFacade field;

	/**По умолчанию считаем что это первая филда на контроле */
	protected String appletXpath;



	public void setField(WebElementFacade field){
		this.field = field;
	}
	
	public void setApplet(WebElementFacade applet){
		this.applet = applet;
	}
	public void setAppletXpath(String appletXpath){
		this.appletXpath = appletXpath;
	}
	public void waitForLoadJS() {
		waitFor(new ExpectedCondition<Boolean>() {
		    public Boolean apply(final WebDriver dirver) {
		    	try {
		    		Thread.sleep(100);
		    		Object obj = evaluateJavascript("return !window.ajaxActive");
		    		Object jQueryActive = evaluateJavascript("return jQuery.active;");
		    		if(obj != null && obj.toString().equals("true") &&
		    				jQueryActive.toString().equals("0") && (Boolean)evaluateJavascript("return window.jQuery != undefined && jQuery.active === 0 ")){
		    			
		    			return true;
		    		}else{
		    			return false;
		    		}

				} catch (Exception e) {
					 return false;
				}
		    }
		});
   
	}
	/**
	 * Ожидаем, когда аплет будет visible
	 */
	public void waitingForAppletVisibleInFrame(){
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
	}
	/**
	 * Ожидаем, когда поле будет UnVisible
	 */
	public void waitingForAppletUnVisible(){
		waitForLoadJS();
		waitFor(new ExpectedCondition<Boolean>() {
		    public Boolean apply(final WebDriver dirver) {
		    	try {
		    		if(!applet.isCurrentlyVisible()){
		    			return true;
		    		}else{
		    			return false;
		    		}
		    		
				} catch (Exception e) {
					 return false;
				}

		    }
		});
	}
	/**
	 * Ожидаем, когда поле будет visible
	 */
	public void waitingForFieldVisible(){
		waitForLoadJS();
		waitFor(new ExpectedCondition<Boolean>() {
		    public Boolean apply(final WebDriver dirver) {
		    	try {
		    		if(field.isCurrentlyVisible()){
		    			return true;
		    		}else{
		    			return false;
		    		}
				} catch (Exception e) {
					 return false;
				}
		    }
		});
		waitFor(ExpectedConditions.elementToBeClickable(field));
	}
	public void waitingForFieldVisible(final WebElementFacade el){
		waitForLoadJS();
		waitFor(new ExpectedCondition<Boolean>() {
		    public Boolean apply(final WebDriver dirver) {
		    	try {
		    		if(el.isCurrentlyVisible()){
		    			return true;
		    		}else{
		    			return false;
		    		}
				} catch (Exception e) {
					 return false;
				}
		    }
		});
		waitFor(ExpectedConditions.elementToBeClickable(el));
	}
	/**
	 * Ожидаем, когда поле будет UnVisible
	 */
	public void waitingForFieldUnVisible(){
		waitForLoadJS();
		waitFor(new ExpectedCondition<Boolean>() {
		    public Boolean apply(final WebDriver dirver) {
		    	try {
		    		if(!field.isCurrentlyVisible()){
		    			return true;
		    		}else{
		    			return false;
		    		}
		    		
				} catch (Exception e) {
					 return false;
				}

		    }
		});
	}
	public void waitingForFieldUnVisible(final WebElementFacade el){
		waitForLoadJS();
		waitFor(new ExpectedCondition<Boolean>() {
		    public Boolean apply(final WebDriver dirver) {
		    	try {
		    		if(!el.isCurrentlyVisible()){
		    			return true;
		    		}else{
		    			return false;
		    		}
		    		
				} catch (Exception e) {
					 return false;
				}

		    }
		});
	}
	/**
	 * Ожидаем исчезновение поля из dom и появление
	 */
	public void waitingForRefreshField() {
		waitForLoadJS();
		try {
			(new WebDriverWait(getDriver(), waitForUnviseble)).until(new ExpectedCondition<Boolean>() {
				public Boolean apply(final WebDriver dirver) {
			    	try {
			    		if(!field.isCurrentlyVisible()){
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
		waitFor(new ExpectedCondition<Boolean>() {
		    public Boolean apply(final WebDriver dirver) {
		    	try {
		    		if(field.isCurrentlyVisible()){
		    			return true;
		    		}else{
		    			return false;
		    		}
				} catch (Exception e) {
					 return false;
				}
		    }
		});
		waitFor(ExpectedConditions.elementToBeClickable(field));
		
	}
	
	/**
	 * Ожидаем загрузку
	 */
	public void waitingForLoadingOverlay() {
		waitForLoadJS();
		try {
			(new WebDriverWait(getDriver(), waitForUnviseble)).until(new ExpectedCondition<Boolean>() {
				public Boolean apply(final WebDriver dirver) {
			    	try {
			    		if(!maskoverlay.isCurrentlyVisible()){
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
		waitFor(new ExpectedCondition<Boolean>() {
		    public Boolean apply(final WebDriver dirver) {
		    	try {
		    		if(maskoverlay.isCurrentlyVisible()){
		    			return true;
		    		}else{
		    			return false;
		    		}
				} catch (Exception e) {
					 return false;
				}
		    }
		});
		
	}
	/**Поиск*/
	public void sendAltQToField(){
		field.waitUntilClickable().click();
		field.sendKeys(Keys.ALT, "q");
		waitingForRefreshField();
	}
	/**Обновление*/
	public void sendAltEnterToField(){
		field.waitUntilClickable().click();
		field.sendKeys(Keys.ALT, Keys.ENTER);
		waitingForRefreshField();
	}
	/**Поиск*/
	public void sendAltQ(){
		(new Actions(getDriver())).sendKeys(Keys.chord(Keys.ALT, "q")).perform();
		waitingForRefreshField();
	}
	/**Обновление*/
	public void sendAltEnter(){
		(new Actions(getDriver())).sendKeys(Keys.chord(Keys.ALT, Keys.ENTER)).perform();
		waitingForRefreshField();
	}
	
	/**
	 * Клик по линку выпадающего списка, текст линка передается параметром
	 * @param linkText(String) - видимый текст линка
	 */
	public void selectFromDropDownList(String linkText){  
		String xPathLocator = String.format(linkXpath, linkText); 
		waitFor(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocator)));
		getDriver().findElement(By.xpath(xPathLocator)).click();

	}

}