package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;



public class LoginPage extends BasePage{
	

	  public LoginPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	  }
	  
	  @FindBy(id="title")
	  private WebElementFacade applet;
	  @FindBy(id="username")
	  private WebElementFacade field;
	
	  @FindBy(id="title")
	  private WebElementFacade logo;
	  
	  @FindBy(id="username")
	  private WebElementFacade userNameField;
	  
	  @FindBy(id="password")
	  private WebElementFacade userPasswordField; 
	  
	  @FindBy(xpath=".//input[@value='Вход в систему']")//div[@id='title']/descendant::input[@value='Вход в систему']
	  private WebElementFacade submitButton; 
	  /**
	   * На странице авторизации вводим логин пользователя
	   * @param text - логин пользователя
	   * @return LoginPage
	   */
	  public LoginPage setUserName(String text){
		  userNameField.type(text);
		  return this;
	  }
	  /**
	   * На странице авторизации вводим пароль пользователя
	   * @param text - пароль пользователя
	   * @return LoginPage
	   */
	  public LoginPage setUserPassword(String text){
		  userPasswordField.type(text);
		  return this;
	  }
	  /**
	   * На странице авторизации Нажимаем кнопку Вход
	   */
	  public void clickSubmitButton() {
		  submitButton.click();
	  }

}