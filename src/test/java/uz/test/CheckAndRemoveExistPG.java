package uz.test;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;

import uz.utils.PropertyLoader;

@RunWith(SerenityRunner.class)
public class CheckAndRemoveExistPG extends TestCasesBase{

	@Title("Проверка наличия ранее созданного ПГ и его удаление")
    @Test
	public void checkAndRemoveExistPG() {
		
		
		Serenity.setSessionVariable("start_time").to(h.getFormattedCurrentDate("dd.MM.yyyy HH:mm:ss"));
		Serenity.setSessionVariable("test_name").to("Проверка наличия ранее созданного ПГ и его удаление");
		Boolean flag = false;
		selectPushedProcurementManagement();
		goToApplicationForms();
		expandProcurementManagementOnApplicationForms();
		expandPlanGraphicsOnApplicationForms();
		applicationFormsSteps.clickOnLinkPlanGraphicsAfterPlanGraphicsExpandLink();
		
		planGraphicsSteps.waitingForAppletVisible();

		//Раскрыли фильтр
		if(!planGraphicsSteps.isPushedLinkFilter()){
			planGraphicsSteps.clickOnLinkFilter();
		}
		//Очистили фильтр
		if(planGraphicsSteps.isFilterExist()){
			planGraphicsSteps.clickOnButtonResetFilter();
		}
		if(planGraphicsSteps.isFirstRowExist()){
			
			planGraphicsSteps.selectFirstRow();
			
			purchasePlanTabSteps.waitingForAppletVisible();
			purchasePlanTabSteps.selectTabAttributes();
			
			attributesPageSteps.waitingForAppletVisible();
			String pgId = attributesPageSteps.getTextId();
			commonSteps.log("Идентификатор плана-графика = "+pgId);
			System.out.println("Идентификатор плана-графика = "+pgId);
			Serenity.setSessionVariable("pgId").to(pgId);
			flag = true;
		}

		planGraphicsSteps.clickOnLinkClose();
		
		if (flag){
			String guid = Serenity.sessionVariableCalled("pgId").toString();
	    	//dictionarySteps.open();
			//dictionarySteps.open("adm");
	    	dictionarySteps.goToUrl(PropertyLoader.loadProperty("admin_url"));
			dictionarySteps.maximizeWindow();
			adminLoginSteps.waitingForAppletVisible();
			adminLoginSteps.enterLogin(PropertyLoader.loadProperty("admin_user"));
			adminLoginSteps.enterPassword(PropertyLoader.loadProperty("admin_pass"));
			adminLoginSteps.clickOkButton();
			
			adminLeftMenuSteps.waitingForAppletVisible();
			adminLeftMenuSteps.clickOnAdminNavigationTab();
			
			if(!adminLeftMenuSteps.isPushedExpandLinkAdministration()){
				adminLeftMenuSteps.clickOnExpandLinkAdministration();
			}
			
			if(!adminLeftMenuSteps.isPushedAdministrationComplexExpandLinkInformation()){
				adminLeftMenuSteps.clickOnExpandLinkAdministrationComplex();
			}

			adminLeftMenuSteps.clickOnLinkAutoProcedure();
			
			//autoprocedureSteps.waitingForAppletVisible();
			autoprocedureSteps.clickOnRowAutoProcedureRemoveDocumentFromDb();
			autoprocedureSteps.clickOnBottonEdit();
			autoprocedureSteps.clickOnTabRunnableProcedure();
			autoprocedureSteps.clickOnBottonEditRunnableProcedure();
			autoprocedureSteps.setTextRemovableCondition(guid);
			autoprocedureSteps.clickOnBottonSaveRunnableProcedure();
			autoprocedureSteps.clickOnBottonSave();
			autoprocedureSteps.clickOnRowAutoProcedureRemoveDocumentFromDb();
			autoprocedureSteps.clickOnBottonRun();
			
			parametersRunTaskDialogSteps.clickOnButtonRun();
		}
	
	}
	
}
