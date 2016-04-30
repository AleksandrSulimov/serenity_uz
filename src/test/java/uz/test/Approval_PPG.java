package uz.test;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class Approval_PPG extends TestCasesBase{

	@Title("Согласование/Утверждение ППГ")
    @Test
	public void approval_PPZ(){
		
		
		Serenity.setSessionVariable("start_time").to(h.getFormattedCurrentDate("dd.MM.yyyy HH:mm:ss"));
		Serenity.setSessionVariable("test_name").to("Согласование/Утверждение ППГ");

		String purshedNumber = "5406105211.540501001.2.16.00011.1601.003";
		

		selectPushedProcurementManagement();
			
		goToApplicationForms();

		expandProcurementManagementOnApplicationForms();
		
		expandPositionPlanGraphicsOnApplicationForms();
		
		applicationFormsSteps.clickOnLinkPositionPlanGraphicsPurches();
		
		positionsPlanGraphicsPurchesSteps.waitingForAppletVisible();
		
		//Раскрыли фильтр
		if(!positionsPlanGraphicsPurchesSteps.isPushedLinkFilter()){
			positionsPlanGraphicsPurchesSteps.clickOnLinkFilter();
		}
		//Очистили фильтр
		if(positionsPlanGraphicsPurchesSteps.isFilterExist()){
			positionsPlanGraphicsPurchesSteps.clickOnButtonResetFilter();
		}
		
		positionsPlanGraphicsPurchesSteps.setPositionPlanGraphicInFilter(purshedNumber);
		positionsPlanGraphicsPurchesSteps.selectFirstRow();
		positionsPlanGraphicsPurchesSteps.clickOnButtonSendToMatching();

		String status = "";
		for(int i=0; i<6; i++){
			status = positionsPlanGraphicsPurchesSteps.getTextStatus();
			if(status.equals("На согласовании")){
				break;
			}
			h.sleep(3);
		}
		assertSteps.assertField("Состояние", "На согласовании", positionsPlanGraphicsPurchesSteps.getTextStatus());
		
		positionsPlanGraphicsPurchesSteps.clickOnLinkClose();
		
		applicationFormsSteps.waitingForAppletVisible();
		
		if(!applicationFormsSteps.isPushedLinkPositionPlanGraphics()){
			applicationFormsSteps.clickOnLinkPositionPlanGraphics();
		}
		
		if(!applicationFormsSteps.isPushedLinkMyDocumentAfterPositionPlanGraphics()){
			applicationFormsSteps.clickOnLinkMyDocumentAfterPositionPlanGraphics();
		}
		
		applicationFormsSteps.clickOnLinkPositionPlanGraphicsPurchesApproval();
		
		//На утверждение
		positionsPlanGraphicsPurchesOnApprovalSteps.waitingForAppletVisible();
		if(!positionsPlanGraphicsPurchesOnApprovalSteps.isPushedLinkFilter()){
			positionsPlanGraphicsPurchesOnApprovalSteps.clickOnLinkFilter();
		}
		if(positionsPlanGraphicsPurchesOnApprovalSteps.isFilterExist()){
			positionsPlanGraphicsPurchesOnApprovalSteps.clickOnButtonResetFilter();
		}
		
		positionsPlanGraphicsPurchesOnApprovalSteps.setPositionPlanGraphicInFilter(purshedNumber);
		positionsPlanGraphicsPurchesOnApprovalSteps.selectFirstRow();
		positionsPlanGraphicsPurchesOnApprovalSteps.clickOnButtonApproval();
		
		approvalPositionsPlanGraphicsPurchesDialogSteps.waitingForAppletVisible();
		approvalPositionsPlanGraphicsPurchesDialogSteps.clickOnButtonApproval();
		approvalPositionsPlanGraphicsPurchesDialogSteps.waitingForAppletVisible();
		approvalPositionsPlanGraphicsPurchesDialogSteps.clickOnButtonOk();
		
		status = "";
		for(int i=0; i<6; i++){
			status = positionsPlanGraphicsPurchesOnApprovalSteps.getTextStatus();
			if(status.equals("Согласовано")){
				break;
			}
			h.sleep(3);
		}
		assertSteps.assertField("Состояние", "Согласовано", positionsPlanGraphicsPurchesOnApprovalSteps.getTextStatus());
		
		positionsPlanGraphicsPurchesOnApprovalSteps.clickOnLinkClose();
		
		
		applicationFormsSteps.waitingForAppletVisible();
		
		if(!applicationFormsSteps.isPushedLinkPositionPlanGraphics()){
			applicationFormsSteps.clickOnLinkPositionPlanGraphics();
		}

		if(!applicationFormsSteps.isPushedLinkMyDocumentAfterPositionPlanGraphics()){
			applicationFormsSteps.clickOnLinkMyDocumentAfterPositionPlanGraphics();
		}
		
		applicationFormsSteps.clickOnLinkPositionPlanGraphicsPurchesStatement();

		
		
		positionsPlanGraphicsPurchesStatementSteps.waitingForAppletVisible();
		if(!positionsPlanGraphicsPurchesStatementSteps.isPushedLinkFilter()){
			positionsPlanGraphicsPurchesStatementSteps.clickOnLinkFilter();
		}
		if(positionsPlanGraphicsPurchesStatementSteps.isFilterExist()){
			positionsPlanGraphicsPurchesStatementSteps.clickOnButtonResetFilter();
		}
		
		positionsPlanGraphicsPurchesStatementSteps.setPositionPlanGraphicInFilter(purshedNumber);
		positionsPlanGraphicsPurchesStatementSteps.selectFirstRow();
		positionsPlanGraphicsPurchesStatementSteps.clickOnButtonStatement();
		
		statementPositionPurchase200DialogSteps.waitingForAppletVisible();
		statementPositionPurchase200DialogSteps.clickOnButtonStatement();
		statementPositionPurchase200DialogSteps.waitingForAppletVisible();
		statementPositionPurchase200DialogSteps.clickOnButtonOk();
		
		status = "";
		for(int i=0; i<6; i++){
			status = positionsPlanGraphicsPurchesStatementSteps.getTextStatus();
			if(status.equals("Утверждено")){
				break;
			}
			h.sleep(3);
		}
		assertSteps.assertField("Состояние", "Утверждено", positionsPlanGraphicsPurchesStatementSteps.getTextStatus());
		
		positionsPlanGraphicsPurchesStatementSteps.clickOnLinkClose();
	}
	
}
