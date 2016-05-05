package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;


/**
 * Вкладка Итоговые показатели плана-графика
 * на странице 'План-график' 
 * @author e.kuzmina 05.05.2016
 *
 */
public class PlanGraphicsTotalIndicatorsPlanGrafics extends BasePage {
	
			
	  public PlanGraphicsTotalIndicatorsPlanGrafics(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
		
	  }
	  
	  @FindBy(xpath=".//span[text()='Суммарный объем закупок и размер выплат по исполнению контрактов в текущем году']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//span[text()='Суммарный объем закупок и размер выплат по исполнению контрактов в текущем году']";
	  
	  @FindBy(xpath=".//span[text()='Суммарный объем закупок и размер выплат по исполнению контрактов в текущем году']")
	  private WebElementFacade field;

	  //Кнопка Закрыть
	  @FindBy(xpath=".//span[text()='План-график']/ancestor::table[3]/descendant::button[@title='Закрыть окно']")
	  private WebElementFacade closeButton;

	  //Кнопка 'Заполнить на основании введенный позиций рядом' с полем 'Годовой объем закупок у субъектов малого предпринимательства, социально ориентированных некоммерческих организаций, тыс. российских рублей'
	  @FindBy(xpath=".//span[text()='Годовой объем закупок у субъектов малого предпринимательства, социально ориентированных некоммерческих организаций, тыс. российских рублей*']/ancestor::tr[1]/following-sibling::tr[1]/descendant::button[contains(.,'Заполнить на основании введенных позиций')]")
	  private WebElementFacade fillProcurementVolumeOfSubjectsSmallBusinessButton;

	  //Кнопка 'Заполнить на основании введенный позиций рядом' с полем 'Годовой объем закупок, осуществляемых путем запроса котировок, тыс. российских рублей'
	  @FindBy(xpath=".//span[text()='Годовой объем закупок, осуществляемых путем запроса котировок, тыс. российских рублей*']/ancestor::tr[1]/following-sibling::tr[1]/descendant::button[contains(.,'Заполнить на основании введенных позиций')]")
	  private WebElementFacade fillProcurementVolumeOfImplementedByRequestQuotationButton;

	  //Кнопка 'Заполнить на основании введенный позиций рядом' с полем 'Совокупный годовой объем закупок, определенный в соответствии с п. 16 статьи 3 Федерального закона №44-ФЗ, тыс. российских рублей*'
	  @FindBy(xpath=".//span[text()='Совокупный годовой объем закупок, определенный в соответствии с п. 16 статьи 3 Федерального закона №44-ФЗ, тыс. российских рублей*']/ancestor::tr[1]/following-sibling::tr[1]/descendant::button[contains(.,'Заполнить на основании введенных позиций')]")
	  private WebElementFacade fillProcurementVolumeDeterminedAccordingFederalLawButton;

		
	  /**
	   * Нажать кнопку Завершить
	   */
	  public void clickOnButtonClose(){
		  waitForLoadJS();
		  closeButton.waitUntilClickable().click();
		  closeButton.waitUntilNotVisible();
	  }

	  /**
	   * Нажать кнопку Заполнить на основании введенный позиций рядом
	   * рядом с полем Годовой объем закупок у субъектов малого предпринимательства, социально ориентированных некоммерческих организаций, тыс. российских рублей
	   */
	  public void clickOnButtonFillProcurementVolumeOfSubjectsSmallBusiness(){
		  waitForLoadJS();
		  fillProcurementVolumeOfSubjectsSmallBusinessButton.waitUntilClickable().click();
	  }

	  /**
	   * Нажать кнопку Заполнить на основании введенный позиций рядом
	   * рядом с полем Годовой объем закупок, осуществляемых путем запроса котировок, тыс. российских рублей*
	   */
	  public void clickOnButtonFillProcurementVolumeOfImplementedByRequestQuotation(){
		  waitForLoadJS();
		  fillProcurementVolumeOfImplementedByRequestQuotationButton.waitUntilClickable().click();
	  }
	  /**
	   * Нажать кнопку Заполнить на основании введенный позиций рядом
	   * рядом с полем 'Годовой объем закупок, осуществляемых путем запроса котировок, тыс. российских рублей
	   */
	  public void clickOnButtonFillProcurementVolumeDeterminedAccordingFederalLaw(){
		  waitForLoadJS();
		  fillProcurementVolumeOfImplementedByRequestQuotationButton.waitUntilClickable().click();
	  }
	  
}