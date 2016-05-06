package uz.test;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import uz.steps.CommonSteps;
import uz.steps.DictionaryPageSteps;
import uz.steps.admin.AdminLeftMenuSteps;
import uz.steps.admin.AdminLoginSteps;
import uz.steps.admin.AutoprocedureSteps;
import uz.steps.admin.ParametersRunTaskDialogSteps;
import uz.utils.Helpers;
import uz.utils.JSON;
import uz.utils.PropertyLoader;

@RunWith(SerenityRunner.class)
public class Autoprocedure_RemoveDocument {

	   
	@Managed(uniqueSession = false)
	public WebDriver webdriver;
	    
	@ManagedPages
	public Pages pages;

	@Steps
	protected DictionaryPageSteps dictionarySteps;
	@Steps
	protected CommonSteps commonSteps;
	@Steps
	protected AdminLoginSteps adminLoginSteps;
	@Steps
	protected AdminLeftMenuSteps adminLeftMenuSteps;
	@Steps
	protected AutoprocedureSteps autoprocedureSteps;
	@Steps
	protected ParametersRunTaskDialogSteps parametersRunTaskDialogSteps;
    
    protected Helpers h = new Helpers();
    
	@Title("Удаление документов через автопроцедуры")
    @Test
	public void autoprocedure_RemoveDocument(){
		
		
		Serenity.setSessionVariable("start_time").to(h.getFormattedCurrentDate("dd.MM.yyyy HH:mm:ss"));
		Serenity.setSessionVariable("test_name").to("Удаление документов через автопроцедуры");
		
		String pzz = "";
		pzz = JSON.readJSON("ppz_id", "ppz_id");
		if(!pzz.equals("")){
			pzz = pzz+";";
		}
		
		String pz = "";
		pz = JSON.readJSON("pz_id", "pz_id");
		if(!pz.equals("")){
			pz = pz+";";
		}
		
		String ppg = "";
		ppg = JSON.readJSON("ppg_id", "ppg_id");
		if(!ppg.equals("")){
			ppg = ppg+";";
		}
		
		String pg = "";
		pg = JSON.readJSON("pg_id", "pg_id");
		if(!pg.equals("")){
			pg = pg+";";
		}
		String guid = pzz+pz+ppg+pg;
		
		
		
    	//dictionarySteps.open();
		dictionarySteps.open("adm");
    	//dictionarySteps.goToUrl(PropertyLoader.loadProperty("admin_url"));
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
