package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Формуляры
 * @author s.serov 25.04.2016
 *
 */
public class ApplicationForms extends BasePage {
	
			
	  public ApplicationForms(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	
	  }
	  
	  @FindBy(xpath=".//span[span[contains(.,'Управление закупками')]]/a")
	  private WebElementFacade applet;
	  @FindBy(xpath=".//span[span[contains(.,'Управление закупками')]]/a")
	  private WebElementFacade field;
	  

	  //Управление закупками
	  @FindBy(xpath=".//div[span[2]/span[@style[contains(.,'font-weight')]][contains(.,'Управление закупками')]]/span[1]/a")//div[span/span[contains(.,'Управление закупками')]]/span[1]/a
	  private WebElementFacade procurementManagementLink;
	  //План закупок
	  @FindBy(xpath=".//div[span/span[contains(.,'План закупок')]]/span[1]/a")
	  private WebElementFacade planProcurementLink;
	  
	  //План закупок --> План закупок
	  @FindBy(xpath=".//span[text()='План закупок']/ancestor::tr/descendant::a[span[text()='План закупок']]")
	  private WebElementFacade planProcurementInPlanProcurementLink;
	  
	  
	  //Позиции плана закупок 200
	  @FindBy(xpath=".//a[span[text()='Позиция плана закупок - 200']]")
	  private WebElementFacade positionPlanProcurement200Link;
	  
	  //Позиция 200
	  @FindBy(xpath=".//div[span/span[contains(.,'Позиция 200')]]/span[1]/a")
	  private WebElementFacade position200Link;
	  
	  //Мои документы
	  @FindBy(xpath=".//div[span/span[contains(.,'Мои документы')]]/span[1]/a")
	  private WebElementFacade myDocLink;
	  

	  //Позиции плана закупок на согласовании
	  @FindBy(xpath=".//a[span[text()='Позиции плана закупок на согласовании']]")
	  private WebElementFacade approvalLink;
	  

	  //Позиция 200
	  @FindBy(xpath=".//a[span[text()='Позиции плана закупок на утверждении']]")
	  private WebElementFacade statementLink;
	  
	  //План закупок расположенный под раскрывшемся элементом План закупок
	  @FindBy(xpath=".//div[span/span[contains(.,'План закупок')]]/following::a[span[text()='План закупок']]")
	  private WebElementFacade planPurchaseLink;
	  //Раскрывающийся План закупок расположенный под раскрывшемся элементом План закупок
	  @FindBy(xpath=".//div[span/span[contains(.,'План закупок')]]/following::div[span/span[contains(.,'План закупок')]]/span[1]/a")
	  private WebElementFacade planPurchaseExpandLink;
	  //Мои документы после Раскрывающийся План закупок
	  @FindBy(xpath=".//div[span/span[contains(.,'План закупок')]]/following::div[span/span[contains(.,'Мои документы')]]/span[1]/a")
	  private WebElementFacade myDocumentAfterPlanPurchaseLink;
	  //План закупок на согласовании
	  @FindBy(xpath=".//div[span/span[contains(.,'План закупок')]]/following::a[span[text()='План закупок на согласовании']]")
	  private WebElementFacade approvalPlanPurchaseLink;
	  //План закупок на утверждении
	  @FindBy(xpath=".//div[span/span[contains(.,'План закупок')]]/following::a[span[text()='План закупок на утверждении']]")
	  private WebElementFacade statementPlanPurchaseLink;
	  
	  //ППГ
	  //Раскрывающийся линк Позиции плана-графика под управление закупками
	  @FindBy(xpath=".//div[span/span[contains(.,'Позиции плана-графика')]]/span[1]/a")
	  private WebElementFacade positionPlanGraphicFirstLevelExpandLink;
	  //Позиции плана-графика закупок
	  @FindBy(xpath=".//div[span/span[contains(.,'Позиции плана-графика')]]/following::a[span[text()='Позиции плана-графика закупок']]")
	  private WebElementFacade positionPlanGraphicPurchesLink;
	  //Мои документы после Раскрывающийся План закупок
	  @FindBy(xpath=".//div[span/span[contains(.,'Позиции плана-графика')]]/following::div[span/span[contains(.,'Мои документы')]]/span[1]/a")
	  private WebElementFacade myDocumentAfterPositionPlanGraphicLink;
	  //Позиции плана-графика закупок на согласовании
	  @FindBy(xpath=".//div[span/span[contains(.,'Позиции плана-графика')]]/following::a[span[text()='Позиции плана-графика закупок на согласовании']]")
	  private WebElementFacade approvalPositonPlanGraphicPurchaseLink;
	  //Позиции плана-графика закупок на утверждении
	  @FindBy(xpath=".//div[span/span[contains(.,'Позиции плана-графика')]]/following::a[span[text()='Позиции плана-графика закупок на утверждении']]")
	  private WebElementFacade statementPositonPlanGraphicPurchaseLink;
	  
	  //ПГ
	  //Раскрывающийся линк План-график под управление закупками
	  @FindBy(xpath=".//div[span/span[contains(.,'План-график')]]/span[1]/a")
	  private WebElementFacade planGraphicsFirstLevelExpandLink;
	  //План-график под Раскрывающийся линк План-график
	  @FindBy(xpath=".//div[span/span[contains(.,'План-график')]]/following::a[span[text()='План-график']]")
	  private WebElementFacade planGraphicsAfterPlanGraphicsExpandLink;
	  //Мои документы после Раскрывающийся План-график
	  @FindBy(xpath=".//div[span/span[contains(.,'План-график')]]/following::div[span/span[contains(.,'Мои документы')]]/span[1]/a")
	  private WebElementFacade myDocumentAfterPlanGraphicsLink;
	  //Планы-графики на согласовании
	  @FindBy(xpath=".//div[span/span[contains(.,'План-график')]]/following::a[span[text()='Планы-графики на согласовании']]")
	  private WebElementFacade approvalPlanGraphicsLink;
	  //Планы-графики на утверждении
	  @FindBy(xpath=".//div[span/span[contains(.,'План-график')]]/following::a[span[text()='Планы-графики на утверждении']]")
	  private WebElementFacade statementPlanGraphicsLink;
	  
	  /**
	   * Клик по линку Управление закупками
	   */
	  public void clickOnLinkProcurementManagement(){
		  waitingForFieldVisible(procurementManagementLink);
		  procurementManagementLink.waitUntilClickable().click();
	  }
	  /**
	   * Проверяем нажат ли линк Управление закупками
	   * @return Boolean (true - если линк нажат)
	   */
	  public Boolean isPushedLinkProcurementManagement(){
		  waitingForFieldVisible(procurementManagementLink);
		  String title = procurementManagementLink.waitUntilClickable().getAttribute("title");
		  if(title.contains("Свернуть")){
			  return true;
		  }
		  return false;
	  }
	
	  
	  /**
	   * Клик по линку План закупок
	   */
	  public void clickOnLinkPlanProcurement(){
		  waitingForFieldVisible(planProcurementLink);
		  planProcurementLink.waitUntilClickable().click();
	  }
	  /**
	   * Клик по линку План закупок --> План закупок
	   */
	  public void clickOnLinkPlanProcurementInPlanProcurement(){
		 waitingForFieldVisible(planProcurementInPlanProcurementLink);
		 planProcurementInPlanProcurementLink.waitUntilClickable().click();
		// getDriver().findElement(By.xpath(".//span[text()='План закупок']/ancestor::tr/descendant::a[span[text()='План закупок']]")).click();
	  }
	  /**
	   * Проверяем нажат ли линк План закупок
	   * @return Boolean (true - если линк нажат)
	   */
	  public Boolean isPushedLinkPlanProcurement(){
		  waitingForFieldVisible(planProcurementLink);
		  String title = planProcurementLink.waitUntilClickable().getAttribute("title");
		  if(title.contains("Свернуть")){
			  return true;
		  }
		  return false;
	  }
	  
	  /**
	   * Клик по линку Позиции плана закупок - 200
	   */
	  public void clickOnLinkPositionPlanProcurement200(){
		  waitingForFieldVisible(positionPlanProcurement200Link);
		  positionPlanProcurement200Link.waitUntilClickable().click();
	  }
	  
	
	  /**
	   * Проверяем нажат ли линк Позиция 200
	   * @return Boolean (true - если линк нажат)
	   */
	  public boolean isPushedLinkPosition200() {
		  waitingForFieldVisible(position200Link);
		  String title = position200Link.waitUntilClickable().getAttribute("title");
		  if(title.contains("Свернуть")){
			  return true;
		  }
		  return false;
	  }
	  /**
	   * Клик по линку Позиция 200
	   */
	  public void clickOnLinkPosition200() {
		  waitingForFieldVisible(position200Link);
		  position200Link.waitUntilClickable().click();
	  }
	  

	  /**
	   * Проверяем нажат ли линк Мои документы
	   * @return Boolean (true - если линк нажат)
	   */
	  public boolean isPushedLinkMyDocument() {
		  waitingForFieldVisible(myDocLink);
		  String title = myDocLink.waitUntilClickable().getAttribute("title");
		  if(title.contains("Свернуть")){
			  return true;
		  }
		  return false;
	  }
	  /**
	   * Клик по линку Мои документы
	   */
	  public void clickOnLinkMyDocument() {
		  waitingForFieldVisible(myDocLink);
		  myDocLink.waitUntilClickable().click();
	  }
	  
	  /**
	   * Клик по линку Позиции плана закупок на согласовании
	   */
	  public void clickOnLinkApproval() {
		  waitingForFieldVisible(approvalLink);
		  approvalLink.waitUntilClickable().click();
	  }
	  

	  /**
	   * Клик по линку Позиции плана закупок на утверждении
	   */
	  public void clickOnLinkStatement() {
		  waitingForFieldVisible(statementLink);
		  statementLink.waitUntilClickable().click();
	  }
	
	  /**
	   * Клик по линку План закупок расположенный под раскрывшемся элементом План закупок
	   */
	  public void clickOnLinkPlanPurchase() {
		  waitingForFieldVisible(planPurchaseLink);
		  planPurchaseLink.waitUntilClickable().click();
	  }
	  /**
	   * Клик по раскрывающийся линк План закупок расположенный под раскрывшемся элементом План закупок
	   */
	  public void clickOnExpandLinkPlanPurchaseAfterExpandLinkPlanPurchase() {
		  waitingForFieldVisible(planPurchaseExpandLink);
		  planPurchaseExpandLink.waitUntilClickable().click();
	  }
	
	  /**
	   * Проверяем нажат ли раскрывающийся линк План закупок расположенный под раскрывшемся элементом План закупок
	   * @return Boolean (true - если линк нажат)
	   */
	  public boolean isPushedExpandLinkPlanPurchaseAfterExpandLinkPlanPurchase() {
		  waitingForFieldVisible(planPurchaseExpandLink);
		  String title = planPurchaseExpandLink.waitUntilClickable().getAttribute("title");
		  if(title.contains("Свернуть")){
			  return true;
		  }
		  return false;
	  }
	  /**
	   * Нажимаем линк \"Мои документы\" расположенный под раскрывшемся элементом \"План закупок\"
	   */
	  public void clickOnLinkMyDocumentAfterPlanPurchase() {
		  waitingForFieldVisible(myDocumentAfterPlanPurchaseLink);
		  myDocumentAfterPlanPurchaseLink.waitUntilClickable().click();
	  }
	  /**
	   * Проверяем нажат ли линк \"Мои документы\" расположенный под раскрывшемся элементом \"План закупок\"
	   * @return Boolean (true - если линк нажат)
	   */
	  public boolean isPushedLinkMyDocumentAfterPlanPurchase() {
		  waitingForFieldVisible(myDocumentAfterPlanPurchaseLink);
		  String title = myDocumentAfterPlanPurchaseLink.waitUntilClickable().getAttribute("title");
		  if(title.contains("Свернуть")){
			  return true;
		  }
		  return false;
	  }
	  /**
	   * Клик по линку План закупок на согласовании
	   */
	  public void clickOnLinkPlanPurchaseApproval() {
		  waitingForFieldVisible(approvalPlanPurchaseLink);
		  approvalPlanPurchaseLink.waitUntilClickable().click();
	  }
	  /**
	   *  Клик по линку План закупок на утверждении
	   */
	  public void clickOnLinkPlanPurchaseStatement() {
		  waitingForFieldVisible(statementPlanPurchaseLink);
		  statementPlanPurchaseLink.waitUntilClickable().click();
	  }
	  
	  
	  //==================
	  //    	ППГ
	  //==================
	  /**
	   * Проверяем нажат ли линк Позиции плана-графика
	   * @return Boolean (true - если линк нажат)
	   */
	  public Boolean isPushedLinkPositionPlanGraphics(){
		  waitingForFieldVisible(positionPlanGraphicFirstLevelExpandLink);
		  String title = positionPlanGraphicFirstLevelExpandLink.waitUntilClickable().getAttribute("title");
		  if(title.contains("Свернуть")){
			  return true;
		  }
		  return false;
	  }
	  /**
	   * Клик по линку Позиции плана-графика
	   */
	  public void clickOnLinkPositionPlanGraphics() {
		  waitingForFieldVisible(positionPlanGraphicFirstLevelExpandLink);
		  positionPlanGraphicFirstLevelExpandLink.waitUntilClickable().click();
	  }
	  /**
	   * Клик по линку Позиции плана-графика закупок расположенный под раскрывшемся элементом Позиции плана-графика
	   */
	  public void clickOnLinkPositionPlanGraphicsPurches() {
		  waitingForFieldVisible(positionPlanGraphicPurchesLink);
		  positionPlanGraphicPurchesLink.waitUntilClickable().click();
	  }
	  /**
	   * Нажимаем линк Мои документы расположенный под раскрывшемся элементом Позиции плана-графика
	   */
	  public void clickOnLinkMyDocumentAfterPositionPlanGraphics() {
		  waitingForFieldVisible(myDocumentAfterPositionPlanGraphicLink);
		  myDocumentAfterPositionPlanGraphicLink.waitUntilClickable().click();
	  }
	  /**
	   * Проверяем нажат ли линк \"Мои документы\" расположенный под раскрывшемся элементом \"План закупок\"
	   * @return Boolean (true - если линк нажат)
	   */
	  public boolean isPushedLinkMyDocumentAfterPositionPlanGraphics() {
		  waitingForFieldVisible(myDocumentAfterPositionPlanGraphicLink);
		  String title = myDocumentAfterPositionPlanGraphicLink.waitUntilClickable().getAttribute("title");
		  if(title.contains("Свернуть")){
			  return true;
		  }
		  return false;
	  }
	  /**
	   * Клик по линку Позиции плана-графика закупок на согласовании
	   */
	  public void clickOnLinkPositionPlanGraphicsPurchesApproval() {
		  waitingForFieldVisible(approvalPositonPlanGraphicPurchaseLink);
		  approvalPositonPlanGraphicPurchaseLink.waitUntilClickable().click();
	  }
	  /**
	   *  Клик по линку Позиции плана-графика закупок на утверждении
	   */
	  public void clickOnLinkPositionPlanGraphicsPurchesStatement() {
		  waitingForFieldVisible(statementPositonPlanGraphicPurchaseLink);
		  statementPositonPlanGraphicPurchaseLink.waitUntilClickable().click();
	  }
	  

	  //==================
	  //    	ПГ
	  //==================
	  /**
	   * Проверяем нажат ли линк План-график
	   * @return Boolean (true - если линк нажат)
	   */
	  public Boolean isPushedLinkPlanGraphics(){
		  waitingForFieldVisible(planGraphicsFirstLevelExpandLink);
		  String title = planGraphicsFirstLevelExpandLink.waitUntilClickable().getAttribute("title");
		  if(title.contains("Свернуть")){
			  return true;
		  }
		  return false;
	  }
	  /**
	   * Клик по линку План-график
	   */
	  public void clickOnLinkPlanGraphics() {
		  waitingForFieldVisible(planGraphicsFirstLevelExpandLink);
		  planGraphicsFirstLevelExpandLink.waitUntilClickable().click();
	  }
	  /**
	   * Клик по линку План-график закупок расположенный под раскрывшемся элементом План-график
	   */
	  public void clickOnLinkPlanGraphicsAfterPlanGraphicsExpandLink() {
		  waitingForFieldVisible(planGraphicsAfterPlanGraphicsExpandLink);
		  planGraphicsAfterPlanGraphicsExpandLink.waitUntilClickable().click();
	  }
	  /**
	   * Нажимаем линк Мои документы расположенный под раскрывшемся элементом План-график
	   */
	  public void clickOnLinkMyDocumentAfterPlanGraphicsLink() {
		  waitingForFieldVisible(myDocumentAfterPlanGraphicsLink);
		  myDocumentAfterPlanGraphicsLink.waitUntilClickable().click();
	  }
	  /**
	   * Проверяем нажат ли линк Мои документы расположенный под раскрывшемся элементом План-график
	   * @return Boolean (true - если линк нажат)
	   */
	  public boolean isPushedLinkMyDocumentAfterPlanGraphicsLink() {
		  waitingForFieldVisible(myDocumentAfterPlanGraphicsLink);
		  String title = myDocumentAfterPlanGraphicsLink.waitUntilClickable().getAttribute("title");
		  if(title.contains("Свернуть")){
			  return true;
		  }
		  return false;
	  }
	  /**
	   * Клик по линку Планы-графики на согласовании на согласовании
	   */
	  public void clickOnLinkPlanGraphicsApproval() {
		  waitingForFieldVisible(approvalPlanGraphicsLink);
		  approvalPlanGraphicsLink.waitUntilClickable().click();
	  }
	  /**
	   *  Клик по линку Планы-графики на согласованиик на утверждении
	   */
	  public void clickOnLinkPlanGraphicsStatement() {
		  waitingForFieldVisible(statementPlanGraphicsLink);
		  statementPlanGraphicsLink.waitUntilClickable().click();
	  }
}