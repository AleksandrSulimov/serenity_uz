package uz.test;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import uz.steps.AddAttachmentPageSteps;
import uz.steps.AdditionalAnalyticalSignDictionaryPageSteps;
import uz.steps.ApplicationFormsSteps;
import uz.steps.AssertSteps;
import uz.steps.ChainsOfKBKDiictionaryPageSteps;
import uz.steps.CommonSteps;
import uz.steps.DictionaryPageSteps;
import uz.steps.FrequencyOfPurchasesDictionaryPageSteps;
import uz.steps.HeaderSteps;
import uz.steps.LoginPageSteps;
import uz.steps.MenuSteps;
import uz.steps.OKPD2DictionaryPageSteps;
import uz.steps.PositionsPurchasePlan200Steps;
import uz.steps.PositionsPurchasePlanApprovalSteps;
import uz.steps.PositionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps;
import uz.steps.PositionsPurchasePlanOfProductJobService200BasicInformationSteps;
import uz.steps.PositionsPurchasePlanOfProductJobService200CoordinationSheetSteps;
import uz.steps.PositionsPurchasePlanStatementSteps;
import uz.steps.dialog.ApprovalPositionPurchase200DialogSteps;
import uz.steps.dialog.SelectUserDialogSteps;
import uz.steps.dialog.StatementPositionPurchase200DialogSteps;
import uz.steps.dialog.TestResultsDialogSteps;
import uz.steps.tabs.MainPageTabSteps;
import uz.steps.tabs.PositionsPurchasePlanOfProductJobService200TabSteps;
import uz.utils.Helpers;
import uz.utils.PropertyLoader;

public class TestCasesBase {
	
	   @Managed(uniqueSession = false)
	    public WebDriver webdriver;
	    
	    @ManagedPages
	    public Pages pages;

	    @Steps
	    protected DictionaryPageSteps dictionarySteps;
	    @Steps
	    protected CommonSteps commonSteps;
	    @Steps
	    protected LoginPageSteps loginSteps;
	    @Steps
	    protected HeaderSteps headerSteps;
	    @Steps
	    protected AssertSteps assertSteps;
	    @Steps
	    protected MenuSteps menuSteps;
	    @Steps
	    protected MainPageTabSteps mainPageTabSteps;
	    @Steps
	    protected ApplicationFormsSteps applicationFormsSteps;
	    @Steps
	    protected PositionsPurchasePlan200Steps positionsPurchasePlan200Steps;
	    @Steps
	    protected PositionsPurchasePlanApprovalSteps positionsPurchasePlanApprovalSteps;
	    @Steps
	    protected PositionsPurchasePlanStatementSteps positionsPurchasePlanStatementSteps;
	    @Steps
	    protected PositionsPurchasePlanOfProductJobService200TabSteps positionsPurchasePlanOfProductJobService200TabSteps;
	    @Steps
	    protected PositionsPurchasePlanOfProductJobService200BasicInformationSteps positionsPurchasePlanOfProductJobService200BasicInformationSteps;
	    @Steps
	    protected OKPD2DictionaryPageSteps okpd2DictionaryPageSteps;
	    @Steps
	    protected ApprovalPositionPurchase200DialogSteps approvalPositionPurchase200DialogSteps;
	    @Steps
	    protected StatementPositionPurchase200DialogSteps statementPositionPurchase200DialogSteps;
	    @Steps
	    protected FrequencyOfPurchasesDictionaryPageSteps frequencyOfPurchasesDictionaryPageSteps;
	    @Steps
	    protected AddAttachmentPageSteps addAttachmentPageSteps;
	    @Steps 
	    protected PositionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps;
	    @Steps 
	    protected ChainsOfKBKDiictionaryPageSteps chainsOfKBKDiictionaryPageSteps;
	    @Steps 
	    protected AdditionalAnalyticalSignDictionaryPageSteps additionalAnalyticalSignDictionaryPageSteps;
	    @Steps 
	    protected PositionsPurchasePlanOfProductJobService200CoordinationSheetSteps positionsPurchasePlanOfProductJobService200CoordinationSheetSteps;
	    @Steps 
	    protected SelectUserDialogSteps selectUserDialogSteps;
	    @Steps
	    protected TestResultsDialogSteps testResultsDialogSteps;
	    
	    protected Helpers h = new Helpers();
	    
	    @Before
	    public void init(){
			dictionarySteps.open();
			dictionarySteps.maximizeWindow();
			loginSteps.waitingForAppletVisible();
			loginSteps.enterLogin(PropertyLoader.loadProperty("stand_user"));
			loginSteps.enterPassword(PropertyLoader.loadProperty("stand_pass"));
			loginSteps.clickOnEnterButton();
			//commonSteps.pageLoadedFull();
			
	    }
	    
	    @After
	    public void report(){
	    	
	    	headerSteps.clickOnButtonExit();
	    		    	
	    } 
	    /**
	     * Выбрать в меню Управление закупками
	     */
	    public void selectPushedProcurementManagement(){
	    	menuSteps.waitingForAppletVisible();
	    	if(!menuSteps.isPushedProcurementManagement()){
				menuSteps.clickOnLinkProcurementManagement();
			}
	    }
	    /**
	     * Перейти на Формуляры
	     */
	    public void goToApplicationForms(){
	    	mainPageTabSteps.waitingForAppletVisible();
			mainPageTabSteps.clickOnTabApplicationForms();
	    }
	    /**
	     * Раскрыть Управление закупками на Формулярах
	     */
	    public void expandProcurementManagementOnApplicationForms(){
	    	applicationFormsSteps.waitingForAppletVisible();
			if(!applicationFormsSteps.isPushedProcurementManagement()){
				applicationFormsSteps.clickOnLinkProcurementManagement();
			}
	    }
	    /**
	     * Раскрыть План закупок на Формулярах
	     */
	    public void expandPlanProcurementOnApplicationForms(){
	    	if(!applicationFormsSteps.isPushedLinkPlanProcurement()){
				applicationFormsSteps.clickOnLinkPlanProcurement();
			}
	    }
	    /**
	     * Нажать на иконку фильтра для отображения полей фильтра на Позиции плана закупок 200
	     */
	    public void expandFilterOnPurchasePlan200(){
	    	
	    }
}
