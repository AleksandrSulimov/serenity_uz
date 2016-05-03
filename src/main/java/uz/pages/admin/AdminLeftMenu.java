package uz.pages.admin;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

import uz.pages.BasePage;


/**
 * Меню слева страницы
 * @author s.serov 02.05.2016
 *
 */
public class AdminLeftMenu extends BasePage {
	
			
	  public AdminLeftMenu(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	
	  }
	  
	  @FindBy(xpath=".//span[img[contains(@src,'adminNavigationTab.png')]]")
	  private WebElementFacade applet;
	  @FindBy(xpath=".//span[img[contains(@src,'adminNavigationTab.png')]]")
	  private WebElementFacade field;
	  

	  //adminNavigationTab
	  @FindBy(xpath=".//span[img[contains(@src,'adminNavigationTab.png')]]")
	  private WebElementFacade adminNavigationTab;
	  //Администрирование
	  @FindBy(xpath="(.//div[span[contains(.,'Администрирование')]]/span[1])[1]")
	  private WebElementFacade administrationExpandLink;
	  @FindBy(xpath="(.//div[span[contains(.,'Администрирование')]]/span[1]/i)[1]")
	  private WebElementFacade administrationExpandLinkInformation;
	  //Администрирование комплекса
	  @FindBy(xpath=".//div[span[contains(.,'Администрирование комплекса')]]/span[2]")
	  private WebElementFacade administrationComplexExpandLink;
	  @FindBy(xpath=".//div[span[contains(.,'Администрирование комплекса')]]/span[2]/i")
	  private WebElementFacade administrationComplexExpandLinkInformation;
	  //Автопроцедуры
	  @FindBy(xpath=".//span[contains(.,'Автопроцедуры')]")
	  private WebElementFacade autoProcedureLink;
	 
	  /**
	   * Клик по табу adminNavigation
	   */
	  public void clickOnAdminNavigationTab(){
		  waitingForFieldVisible(adminNavigationTab);
		  adminNavigationTab.waitUntilClickable().click();
		  
	  }
	  public void clickOnExpandLinkAdministration(){
		  waitingForFieldVisible(administrationExpandLink);
		  administrationExpandLink.waitUntilClickable().click();
		  
	  }
	  public Boolean isPushedExpandLinkAdministration(){
		  waitingForFieldVisible(administrationExpandLinkInformation);
		  String src = administrationExpandLinkInformation.waitUntilClickable().getAttribute("class");
		  if(src.contains("open")){
			  return true;
		  }
		  return false;
	  }
	  public void clickOnExpandLinkAdministrationComplex(){
		  waitingForFieldVisible(administrationComplexExpandLink);
		  administrationComplexExpandLink.waitUntilClickable().click();
		  
	  }
	  public Boolean isPushedAdministrationComplexExpandLinkInformation(){
		  waitingForFieldVisible(administrationComplexExpandLinkInformation);
		  String src = administrationComplexExpandLinkInformation.waitUntilClickable().getAttribute("class");
		  if(src.contains("open")){
			  return true;
		  }
		  return false;
	  }
	  public void clickOnLinkAutoProcedure(){
		  waitingForFieldVisible(autoProcedureLink);
		  autoProcedureLink.waitUntilClickable().click();
		  
	  }

}