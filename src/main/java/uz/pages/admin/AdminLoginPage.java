package uz.pages.admin;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

import uz.pages.BasePage;



public class AdminLoginPage extends BasePage{
	

	  public AdminLoginPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	  }
	  
	  @FindBy(id="user")
	  private WebElementFacade applet;
	  @FindBy(id="user")
	  private WebElementFacade field;
	
	  @FindBy(id="user")
	  private WebElementFacade userNameField;
	  
	  @FindBy(id="psw")
	  private WebElementFacade userPasswordField; 
	  
	  @FindBy(id="okButton")//div[@id='title']/descendant::input[@value='Вход в систему']
	  private WebElementFacade okButton; 
	  /**
	   * На странице авторизации вводим логин пользователя
	   * @param text - логин пользователя
	   * @return LoginPage
	   */
	  public AdminLoginPage setUserName(String text){
		  userNameField.type(text);
		  return this;
	  }
	  /**
	   * На странице авторизации вводим пароль пользователя
	   * @param text - пароль пользователя
	   * @return LoginPage
	   */
	  public AdminLoginPage setUserPassword(String text){
		  userPasswordField.type(text);
		  return this;
	  }
	  /**
	   * На странице авторизации Нажимаем кнопку Вход
	   */
	  public void clickOkButton() {
		  okButton.click();
	  }

}