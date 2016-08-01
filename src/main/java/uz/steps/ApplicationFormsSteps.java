package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.ApplicationForms;

/**
 * Формуляры Steps
 * @author s.serov 25.04.2016
 *
 */
@SuppressWarnings("serial")
public class ApplicationFormsSteps extends ScenarioSteps {


	public ApplicationFormsSteps(Pages pages) {
        super(pages);
    }
	
	ApplicationForms applet;

	@Step("Ожидаем загрузку \"Формуляры\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}
	
    @Step("Проверяем нажат ли линк \"Управление закупками\" в \"Формуляры\"")
    public Boolean isPushedProcurementManagement() {
    	return applet.isPushedLinkProcurementManagement();
    }
    @Step("Нажимаем линк \"Управление закупками\" в \"Формуляры\"")
    public void clickOnLinkProcurementManagement(){
    	applet.clickOnLinkProcurementManagement();    	
    }
    
    @Step("Проверяем нажат ли линк \"Планирование\" в \"Формуляры\"")
    public Boolean isPushedLinkPlanning(){
    	return applet.isPushedLinkPlanning();
    }
    
    @Step("Нажимаем линк \"Планирование\" в \"Формуляры\"")
    public void clickOnLinkPlanning(){
    	applet.clickOnLinkPlanning();
    }
    
    @Step("Проверяем нажат ли линк \"План закупок\" в \"Формуляры\"")
    public Boolean isPushedLinkPlanProcurement() {
    	return applet.isPushedLinkPlanProcurement();
    }
    @Step("Нажимаем линк \"План закупок\" в \"Формуляры\"")
    public void clickOnLinkPlanProcurement(){
    	applet.clickOnLinkPlanProcurement();    	
    }
    @Step("Нажимаем линк \"План закупок\" --> \"План закупок\" в \"Формуляры\"")
    public void clickOnLinkPlanProcurementInPlanProcurement(){
    	applet.clickOnLinkPlanProcurementInPlanProcurement();
    }
    @Step("Проверяем нажат ли линк \"План закупок\" --> \"Позиции плана закупок\" в \"Формуляры\"")
    public Boolean isPushedLinkPositionsPlanProcurement(){
    	return applet.isPushedLinkPositionsPlanProcurement();
    }
    @Step("Нажимаем линк \"План закупок\" --> \"Позиции плана закупок\" в \"Формуляры\"")
    public void clickOnLinkPositionsPlanProcurement(){
    	applet.clickOnLinkPositionsPlanProcurement();
    }
    @Step("Нажимаем линк \"Позиции плана закупок - 200\" в \"Формуляры\"")
    public void clickOnLinkPositionPlanProcurement200(){
    	applet.clickOnLinkPositionPlanProcurement200();    	
    }

    @Step("Проверяем нажат ли линк \"Позиция 200\" в \"Формуляры\"")
    public boolean isPushedLinkPosition200() {
    	return applet.isPushedLinkPosition200();
	}
    @Step("Нажимаем линк \"Позиция 200\" в \"Формуляры\"")
	public void clickOnLinkPosition200() {
    	applet.clickOnLinkPosition200();
	}
    
    
    @Step("Проверяем нажат ли линк \"Мои документы\" в \"Формуляры\"")
    public boolean isPushedLinkMyDocument() {
    	return applet.isPushedLinkMyDocument();
	}
    @Step("Нажимаем линк \"Мои документы\" в \"Формуляры\"")
	public void clickOnLinkMyDocument() {
    	applet.clickOnLinkMyDocument();
	}
    
    @Step("Нажимаем линк \"Позиции плана закупок на согласовании\" в \"Формуляры\"")
  	public void clickOnLinkApproval() {
      	applet.clickOnLinkApproval();
  	}
    
    @Step("Нажимаем раскрывающийся линк \"Позиции плана закупок на утверждении\" в \"Формуляры\"")
  	public void clickOnLinkStatement() {
      	applet.clickOnLinkStatement();
  	}
    @Step("Нажимаем линк \"План закупок\" расположенный под раскрывшемся элементом \"План закупок\" в \"Формуляры\"")
	public void clickOnLinkPlanPurchase() {
    	applet.clickOnLinkPlanPurchase();
	}
    @Step("Нажимаем раскрывающийся линк \"План закупок\" расположенный под раскрывшемся элементом \"План закупок\" в \"Формуляры\"")
	public void clickOnExpandLinkPlanPurchaseAfterExpandLinkPlanPurchase() {
    	applet.clickOnExpandLinkPlanPurchaseAfterExpandLinkPlanPurchase();
	}
    @Step("Проверяем нажат ли раскрывающийся линк \"План закупок\" расположенный под раскрывшемся элементом \"План закупок\" в \"Формуляры\"")
	public boolean isPushedExpandLinkPlanPurchaseAfterExpandLinkPlanPurchase() {
		return applet.isPushedExpandLinkPlanPurchaseAfterExpandLinkPlanPurchase();
	}

    @Step("Нажимаем линк \"Мои документы\" расположенный под раскрывшемся элементом \"План закупок\" в \"Формуляры\"")
	public void clickOnLinkMyDocumentAfterPlanPurchase() {
    	applet.clickOnLinkMyDocumentAfterPlanPurchase();
	}
	@Step("Проверяем нажат ли линк \"Мои документы\" расположенный под раскрывшемся элементом \"План закупок\" в \"Формуляры\"")
	public boolean isPushedLinkMyDocumentAfterPlanPurchase() {
		return applet.isPushedLinkMyDocumentAfterPlanPurchase();
	}
	@Step("Нажимаем линк \"План закупок на согласовании\" в \"Формуляры\"")
	public void clickOnLinkPlanPurchaseApproval() {
		applet.clickOnLinkPlanPurchaseApproval();
	}
	@Step("Нажимаем линк \"План закупок на утверждении\" в \"Формуляры\"")
	public void clickOnLinkPlanPurchaseStatement() {
		applet.clickOnLinkPlanPurchaseStatement();
	}
	
	//==================
	//    	ППГ
	//==================
    @Step("Проверяем нажат ли линк \"Позиции плана-графика\" в \"Формуляры\"")
    public Boolean isPushedLinkPositionPlanGraphics() {
    	return applet.isPushedLinkPositionPlanGraphics();
    }
    @Step("Нажимаем раскрывающийся линк \"Позиции плана-графика\" в \"Формуляры\"")	
	public void clickOnLinkPositionPlanGraphics() {      	
    	applet.clickOnLinkPositionPlanGraphics();	
	}
    @Step("Нажимаем линк \"Позиции плана-графика закупок\" расположенный под раскрывшемся элементом \"Позиции плана-графика\" в \"Формуляры\"")	
	public void clickOnLinkPositionPlanGraphicsPurches() {      	
    	applet.clickOnLinkPositionPlanGraphicsPurches();	
	} 
    @Step("Проверяем нажат ли линк \"Мои документы\" расположенный под раскрывшемся элементом \"Позиции плана-графика\" в \"Формуляры\"")
	public boolean isPushedLinkMyDocumentAfterPositionPlanGraphics() {
		return applet.isPushedLinkMyDocumentAfterPositionPlanGraphics();
	}
    @Step("Нажимаем линк \"Мои документы\" расположенный под раскрывшемся элементом \"Позиции плана-графика\" в \"Формуляры\"")
   	public void clickOnLinkMyDocumentAfterPositionPlanGraphics() {
       	applet.clickOnLinkMyDocumentAfterPositionPlanGraphics();
   	}
    @Step("Нажимаем линк \"Позиции плана-графика закупок на согласовании\" в \"Формуляры\"")
	public void clickOnLinkPositionPlanGraphicsPurchesApproval() {
		applet.clickOnLinkPositionPlanGraphicsPurchesApproval();
	}
	@Step("Нажимаем линк \"Позиции плана-графика закупок на утверждении\" в \"Формуляры\"")
	public void clickOnLinkPositionPlanGraphicsPurchesStatement() {
		applet.clickOnLinkPositionPlanGraphicsPurchesStatement();
	}
	
	//==================
	//    	ПГ
	//==================
    @Step("Проверяем нажат ли линк \"План-график закупок\" под \"Планирование\" в \"Формуляры\"")
    public Boolean isPushedLinkPlanGraphicsFirstLevel() {
    	return applet.isPushedLinkPlanGraphicsFirstLevel();
    }
    @Step("Нажимаем раскрывающийся линк \"План-график закупок\" под \"Планирование\" в \"Формуляры\"")	
	public void clickOnLinkPlanGraphicsFirstLevel() {      	
    	applet.clickOnLinkPlanGraphicsFirstLevel();	
	}
    @Step("Проверяем нажат ли линк \"План-график закупок\" --> \"План-график закупок\" в \"Формуляры\"")
    public Boolean isPushedLinkPlanGraphicsSecondLevel(){
    	return applet.isPushedLinkPlanGraphicsSecondLevel();
    }
    @Step("Нажимаем раскрывающийся линк \"План-график закупок\" --> \"План-график закупок\" в \"Формуляры\"")
    public void clickOnLinkPlanGraphicsSecondLevel(){
    	applet.clickOnLinkPlanGraphicsSecondLevel();
    }
    @Step("Нажимаем линк \"План-график\" расположенный под раскрывшемся элементом \"План-график\" в \"Формуляры\"")	
	public void clickOnLinkPlanGraphicsAfterPlanGraphicsExpandLink() {      	
    	applet.clickOnLinkPlanGraphicsAfterPlanGraphicsExpandLink();	
	} 
    @Step("Проверяем нажат ли линк \"Мои документы\" расположенный под раскрывшемся элементом \"План-график\" в \"Формуляры\"")
	public boolean isPushedLinkMyDocumentAfterPlanGraphicsLink() {
		return applet.isPushedLinkMyDocumentAfterPlanGraphicsLink();
	}
    @Step("Нажимаем линк \"Мои документы\" расположенный под раскрывшемся элементом \"План-график\" в \"Формуляры\"")
   	public void clickOnLinkMyDocumentAfterPlanGraphicsLink() {
       	applet.clickOnLinkMyDocumentAfterPlanGraphicsLink();
   	}
    @Step("Нажимаем линк \"Планы-графики на согласовании\" в \"Формуляры\"")
	public void clickOnLinkPlanGraphicsApproval() {
		applet.clickOnLinkPlanGraphicsApproval();
	}
	@Step("Нажимаем линк \"Планы-графики на утверждении\" в \"Формуляры\"")
	public void clickOnLinkPlanGraphicsStatement() {
		applet.clickOnLinkPlanGraphicsStatement();
	}
}