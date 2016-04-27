package uz.test;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class Approval_PPZ extends TestCasesBase{

	@Title("Согласование/Утверждение ППЗ")
    @Test
	public void approval_PPZ(){
		
		
		Serenity.setSessionVariable("start_time").to(h.getFormattedCurrentDate("dd.MM.yyyy HH:mm:ss"));
		Serenity.setSessionVariable("test_name").to("Согласование/Утверждение ППЗ");

		menuSteps.waitingForAppletVisible();
		
		/*
		menuSteps.clickOnLinkAll();
		
		if(menuSteps.isPushedAll()){
			menuSteps.clickOnLinkAll();
		}
		*/
		if(!menuSteps.isPushedProcurementManagement()){
			menuSteps.clickOnLinkProcurementManagement();
		}
		
		
		mainPageTabSteps.waitingForAppletVisible();
		mainPageTabSteps.clickOnTabApplicationForms();
		
		applicationFormsSteps.waitingForAppletVisible();
		
		if(!applicationFormsSteps.isPushedProcurementManagement()){
			applicationFormsSteps.clickOnLinkProcurementManagement();
		}
		
		if(!applicationFormsSteps.isPushedLinkPlanProcurement()){
			applicationFormsSteps.clickOnLinkPlanProcurement();
		}
		
		applicationFormsSteps.clickOnLinkPositionPlanProcurement200();
		
		positionsPurchasePlan200Steps.waitingForAppletVisible();
		if(!positionsPurchasePlan200Steps.isPushedLinkFilter()){
			positionsPurchasePlan200Steps.clickOnLinkFilter();
		}
		
		positionsPurchasePlan200Steps.cleanPositionPlanPurshedInFilter();
		positionsPurchasePlan200Steps.setPositionPlanPurshedInFilter("5406105211.540501001.2.16.00003.1601");
		positionsPurchasePlan200Steps.selectFirstRow();
		positionsPurchasePlan200Steps.clickOnButtonSendToMatching();
		
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
		
		
		

	}
	
}
