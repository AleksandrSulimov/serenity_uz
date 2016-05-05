package uz.test;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;

import uz.utils.JSON;

@RunWith(SerenityRunner.class)
public class Approval_PPZ extends TestCasesBase{

	@Title("Согласование/Утверждение ППЗ")
    @Test
	public void approval_PPZ(){
		
		
		Serenity.setSessionVariable("start_time").to(h.getFormattedCurrentDate("dd.MM.yyyy HH:mm:ss"));
		Serenity.setSessionVariable("test_name").to("Согласование/Утверждение ППЗ");

		//String purshedNumber = "5406105211.540501001.2.16.00004.1601";
		String purshedNumber = JSON.readJSON("ppz_num", "ppz_num");

		selectPushedProcurementManagement();
			
		goToApplicationForms();

		expandProcurementManagementOnApplicationForms();
		
		expandPlanProcurementOnApplicationForms();
		
		applicationFormsSteps.clickOnLinkPositionPlanProcurement200();
		
		positionsPurchasePlan200Steps.waitingForAppletVisible();
		
		//Раскрыли фильтр
		if(!positionsPurchasePlan200Steps.isPushedLinkFilter()){
			positionsPurchasePlan200Steps.clickOnLinkFilter();
		}
		//Очистили фильтр
		if(positionsPurchasePlan200Steps.isFilterExist()){
			positionsPurchasePlan200Steps.clickOnButtonResetFilter();
		}
		
		positionsPurchasePlan200Steps.setPositionPlanPurshedInFilter(purshedNumber);
		positionsPurchasePlan200Steps.selectFirstRow();
		positionsPurchasePlan200Steps.clickOnButtonSendToMatching();

		String status = "";
		for(int i=0; i<6; i++){
			status = positionsPurchasePlan200Steps.getTextStatus();
			if(status.equals("На согласовании")){
				break;
			}
			h.sleep(3);
		}
		assertSteps.assertField("Состояние", "На согласовании", positionsPurchasePlan200Steps.getTextStatus());
		
		positionsPurchasePlan200Steps.clickOnLinkClosePPZ();
		
		applicationFormsSteps.waitingForAppletVisible();
		
		if(!applicationFormsSteps.isPushedLinkPosition200()){
			applicationFormsSteps.clickOnLinkPosition200();
		}
		

		if(!applicationFormsSteps.isPushedLinkMyDocument()){
			applicationFormsSteps.clickOnLinkMyDocument();
		}
		
		applicationFormsSteps.clickOnLinkApproval();
		
		//На утверждение
		positionsPurchasePlanApprovalSteps.waitingForAppletVisible();
		if(!positionsPurchasePlanApprovalSteps.isPushedLinkFilter()){
			positionsPurchasePlanApprovalSteps.clickOnLinkFilter();
		}
		if(positionsPurchasePlanApprovalSteps.isFilterExist()){
			positionsPurchasePlanApprovalSteps.clickOnButtonResetFilter();
		}
		
		//positionsPurchasePlanApprovalSteps.cleanPositionPlanPurshedInFilter();
		positionsPurchasePlanApprovalSteps.setPositionPlanPurshedInFilter(purshedNumber);
		positionsPurchasePlanApprovalSteps.selectFirstRow();
		positionsPurchasePlanApprovalSteps.clickOnButtonApproval();
		
		approvalPositionPurchase200DialogSteps.waitingForAppletVisible();
		approvalPositionPurchase200DialogSteps.clickOnButtonApproval();
		approvalPositionPurchase200DialogSteps.waitingForAppletVisible();
		approvalPositionPurchase200DialogSteps.clickOnButtonOk();
		
		status = "";
		for(int i=0; i<6; i++){
			status = positionsPurchasePlanApprovalSteps.getTextStatus();
			if(status.equals("Согласовано")){
				break;
			}
			h.sleep(3);
		}
		assertSteps.assertField("Состояние", "Согласовано", positionsPurchasePlanApprovalSteps.getTextStatus());
		
		positionsPurchasePlanApprovalSteps.clickOnLinkClosePPZOnApproval();
		
		
		applicationFormsSteps.waitingForAppletVisible();
		
		if(!applicationFormsSteps.isPushedLinkPosition200()){
			applicationFormsSteps.clickOnLinkPosition200();
		}
		

		if(!applicationFormsSteps.isPushedLinkMyDocument()){
			applicationFormsSteps.clickOnLinkMyDocument();
		}
		
		applicationFormsSteps.clickOnLinkStatement();

		
		
		positionsPurchasePlanStatementSteps.waitingForAppletVisible();
		if(!positionsPurchasePlanStatementSteps.isPushedLinkFilter()){
			positionsPurchasePlanStatementSteps.clickOnLinkFilter();
		}
		if(positionsPurchasePlanStatementSteps.isFilterExist()){
			positionsPurchasePlanStatementSteps.clickOnButtonResetFilter();
		}
		
		//positionsPurchasePlanStatementSteps.cleanPositionPlanPurshedInFilter();
		positionsPurchasePlanStatementSteps.setPositionPlanPurshedInFilter(purshedNumber);
		positionsPurchasePlanStatementSteps.selectFirstRow();
		positionsPurchasePlanStatementSteps.clickOnButtonStatement();
		
		statementPositionPurchase200DialogSteps.waitingForAppletVisible();
		statementPositionPurchase200DialogSteps.clickOnButtonStatement();
		statementPositionPurchase200DialogSteps.waitingForAppletVisible();
		statementPositionPurchase200DialogSteps.clickOnButtonOk();
		
		status = "";
		for(int i=0; i<6; i++){
			status = positionsPurchasePlanStatementSteps.getTextStatus();
			if(status.equals("Утверждено")){
				break;
			}
			h.sleep(3);
		}
		assertSteps.assertField("Состояние", "Утверждено", positionsPurchasePlanStatementSteps.getTextStatus());
		
		positionsPurchasePlanStatementSteps.clickOnLinkClosePPZOnStatement();
	}
	
}
