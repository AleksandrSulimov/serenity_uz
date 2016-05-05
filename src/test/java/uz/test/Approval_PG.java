package uz.test;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;

import uz.utils.JSON;

@RunWith(SerenityRunner.class)
public class Approval_PG extends TestCasesBase{


	@Title("Согласование/Утверждение ПГ")
    @Test
	public void approval_PG(){
		
		
		Serenity.setSessionVariable("start_time").to(h.getFormattedCurrentDate("dd.MM.yyyy HH:mm:ss"));
		Serenity.setSessionVariable("test_name").to("Согласование/Утверждение ПГ");
		//String purshedNumber = "5406105211.540501001.2016.01";
		String purshedNumber = JSON.readJSON("pg_num", "pg_num");
		String status = "";

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
		
		planGraphicsSteps.setPlanGraphicsInFilter(purshedNumber);
		planGraphicsSteps.selectFirstRow();
		planGraphicsSteps.clickOnButtonSendToMatching();
		planGraphicsSteps.clickOnButtonRefreshListOfDocument();
		
		status = "";
		for(int i=0; i<6; i++){
			status = planGraphicsSteps.getTextStatus();
			if(status.equals("На согласовании")){
				break;
			}
			h.sleep(3);
		}
		assertSteps.assertField("Состояние", "На согласовании", planGraphicsSteps.getTextStatus());
		
		planGraphicsSteps.clickOnLinkClose();
		
		//Согласование
		applicationFormsSteps.waitingForAppletVisible();
		
		expandPlanGraphicsOnApplicationForms();
		

		if(!applicationFormsSteps.isPushedLinkMyDocumentAfterPlanGraphicsLink()){
			applicationFormsSteps.clickOnLinkMyDocumentAfterPlanGraphicsLink();
		}
		
		applicationFormsSteps.clickOnLinkPlanGraphicsApproval();
		
		
		planGraphicsOnApprovalSteps.waitingForAppletVisible();
		if(!planGraphicsOnApprovalSteps.isPushedLinkFilter()){
			planGraphicsOnApprovalSteps.clickOnLinkFilter();
		}
		if(planGraphicsOnApprovalSteps.isFilterExist()){
			planGraphicsOnApprovalSteps.clickOnButtonResetFilter();
		}
		
		planGraphicsOnApprovalSteps.setPlanGraphicsInFilter(purshedNumber);
		planGraphicsOnApprovalSteps.selectFirstRow();
		planGraphicsOnApprovalSteps.clickOnButtonApproval();
		
		approvalPlanGraphicsDialogSteps.waitingForAppletVisible();
		approvalPlanGraphicsDialogSteps.clickOnButtonApproval();
		approvalPlanGraphicsDialogSteps.waitingForAppletVisible();
		approvalPlanGraphicsDialogSteps.clickOnButtonOk();

		status = "";
		for(int i=0; i<6; i++){
			status = planGraphicsOnApprovalSteps.getTextStatus();
			if(status.equals("Согласовано")){
				break;
			}
			h.sleep(3);
		}
		assertSteps.assertField("Состояние", "Согласовано", planGraphicsOnApprovalSteps.getTextStatus());
		
		planGraphicsOnApprovalSteps.clickOnLinkClose();
		
		//Утверждение
		applicationFormsSteps.waitingForAppletVisible();
		
		expandPlanGraphicsOnApplicationForms();

		if(!applicationFormsSteps.isPushedLinkMyDocumentAfterPlanGraphicsLink()){
			applicationFormsSteps.clickOnLinkMyDocumentAfterPlanGraphicsLink();
		}
		
		applicationFormsSteps.clickOnLinkPlanGraphicsStatement();

		planGraphicsStatementSteps.waitingForAppletVisible();
		if(!planGraphicsStatementSteps.isPushedLinkFilter()){
			planGraphicsStatementSteps.clickOnLinkFilter();
		}
		if(planGraphicsStatementSteps.isFilterExist()){
			planGraphicsStatementSteps.clickOnButtonResetFilter();
		}
		
		planGraphicsStatementSteps.setPlanGraphicsInFilter(purshedNumber);
		planGraphicsStatementSteps.selectFirstRow();
		planGraphicsStatementSteps.clickOnButtonStatement();
		
		statementPlanGraphicsDialogSteps.waitingForAppletVisible();
		statementPlanGraphicsDialogSteps.clickOnButtonStatementBeforeJinnClient();
		//autoItSteps.signInJinnClient();
		//autoItSteps.selectFirstCertificateInJinnClient();
		autoItSteps.signInJinnClientAndSelectFirstCertificateInJinnClient();
		statementPlanGraphicsDialogSteps.waitingForAppletVisible();
		statementPlanGraphicsDialogSteps.clickOnButtonOk();
		
		status = "";
		for(int i=0; i<6; i++){
			status = planGraphicsStatementSteps.getTextStatus();
			if(status.equals("Утверждено")){
				break;
			}
			h.sleep(3);
		}
		assertSteps.assertField("Состояние", "Утверждено", planGraphicsStatementSteps.getTextStatus());
		
		planGraphicsStatementSteps.clickOnLinkClose();
	}



	
	
}
