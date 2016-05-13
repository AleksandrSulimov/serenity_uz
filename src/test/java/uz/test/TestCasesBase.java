package uz.test;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import uz.steps.AddAttachmentPageSteps;
import uz.steps.AdditionalAnalyticalSignDictionaryPageSteps;
import uz.steps.ApplicationFormsSteps;
import uz.steps.AssertSteps;
import uz.steps.AttributesPageSteps;
import uz.steps.AutoItSteps;
import uz.steps.ChainsOfKBKDiictionaryPageSteps;
import uz.steps.ChoosePpgForIncludeInPGDiictionaryPageSteps;
import uz.steps.ChoosePpzForIncludeInPZDiictionaryPageSteps;
import uz.steps.CommonSteps;
import uz.steps.DictionaryPageSteps;
import uz.steps.FrequencyOfPurchasesDictionaryPageSteps;
import uz.steps.HeaderSteps;
import uz.steps.LoginPageSteps;
import uz.steps.MenuSteps;
import uz.steps.MethodForDeterminingSupplierDictionaryPageSteps;
import uz.steps.NameOfMeasureDictionaryPageSteps;
import uz.steps.OKPD2DictionaryPageSteps;
import uz.steps.OkvedDictionaryPageSteps;
import uz.steps.PlanGraphicsBasicInformationSteps;
import uz.steps.PlanGraphicsCoordinationSheetSteps;
import uz.steps.PlanGraphicsOnApprovalSteps;
import uz.steps.PlanGraphicsPositionsPlanGraficsSteps;
import uz.steps.PlanGraphicsResultsOfKBKSteps;
import uz.steps.PlanGraphicsSpecialPurchasesSteps;
import uz.steps.PlanGraphicsStatementSteps;
import uz.steps.PlanGraphicsSteps;
import uz.steps.PlanGraphicsTotalIndicatorsPlanGraficsSteps;
import uz.steps.PlanPurchaseOnApprovalSteps;
import uz.steps.PlanPurchaseStatementSteps;
import uz.steps.PlanPurchaseSteps;
import uz.steps.PositionsPlanGraphicsPurchesBasicInformationSteps;
import uz.steps.PositionsPlanGraphicsPurchesCoordinationSheetSteps;
import uz.steps.PositionsPlanGraphicsPurchesOnApprovalSteps;
import uz.steps.PositionsPlanGraphicsPurchesSpecificationTRUSteps;
import uz.steps.PositionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps;
import uz.steps.PositionsPlanGraphicsPurchesStatementSteps;
import uz.steps.PositionsPlanGraphicsPurchesSteps;
import uz.steps.PositionsPlanGraphicsPurchesTermsOfPurchaseSteps;
import uz.steps.PositionsPurchasePlan200Steps;
import uz.steps.PositionsPurchasePlanApprovalSteps;
import uz.steps.PositionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps;
import uz.steps.PositionsPurchasePlanOfProductJobService200BasicInformationSteps;
import uz.steps.PositionsPurchasePlanOfProductJobService200CoordinationSheetSteps;
import uz.steps.PositionsPurchasePlanStatementSteps;
import uz.steps.PurchasePlanOfProductJobServiceBasicInformationSteps;
import uz.steps.PurchasePlanOfProductJobServiceCoordinationSheetSteps;
import uz.steps.PurchasePlanOfProductJobServicePositionPurchasePlanSteps;
import uz.steps.PurchasePlanOfProductJobServiceResultsOfKBKSteps;
import uz.steps.PurchasePlanOfProductJobServiceSpecialPurchasesSteps;
import uz.steps.PurchasePlanSteps;
import uz.steps.SelectPositionOfProcurementPlanDiictionaryPageSteps;
import uz.steps.SelectYearOfPlanGraficsPageSteps;
import uz.steps.admin.AdminLeftMenuSteps;
import uz.steps.admin.AdminLoginSteps;
import uz.steps.admin.AutoprocedureSteps;
import uz.steps.admin.ParametersRunTaskDialogSteps;
import uz.steps.dialog.ApprovalPlanGraphicsDialogSteps;
import uz.steps.dialog.ApprovalPlanPurchaseDialogSteps;
import uz.steps.dialog.ApprovalPositionPurchase200DialogSteps;
import uz.steps.dialog.ApprovalPositionsPlanGraphicsPurchesDialogSteps;
import uz.steps.dialog.SelectTypeOfProcurementAndProcurementPlanPPZDialogSteps;
import uz.steps.dialog.SelectUserDialogSteps;
import uz.steps.dialog.StatementPlanGraphicsDialogSteps;
import uz.steps.dialog.StatementPlanPurchaseDialogSteps;
import uz.steps.dialog.StatementPositionPurchase200DialogSteps;
import uz.steps.dialog.StatementPositionsPlanGraphicsPurchesDialogSteps;
import uz.steps.dialog.TestResultsDialogSteps;
import uz.steps.tabs.MainPageTabSteps;
import uz.steps.tabs.PlanGraphicsTabSteps;
import uz.steps.tabs.PositionsPlanGraphicsPurchesTabSteps;
import uz.steps.tabs.PositionsPurchasePlanOfProductJobService200TabSteps;
import uz.steps.tabs.PurchasePlanOfProductJobServiceTabSteps;
import uz.steps.tabs.PurchasePlanTabSteps;
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
	    @Steps
	    protected PlanPurchaseSteps planPurchaseSteps;
	    @Steps
	    protected PurchasePlanTabSteps purchasePlanTabSteps;
	    @Steps
	    protected AttributesPageSteps attributesPageSteps;
	    @Steps
	    protected PurchasePlanSteps purchasePlanSteps;
	    @Steps
	    protected PurchasePlanOfProductJobServiceTabSteps purchasePlanOfProductJobServiceTabSteps;
	    @Steps
	    protected PurchasePlanOfProductJobServiceBasicInformationSteps purchasePlanOfProductJobServiceBasicInformationSteps;
	    @Steps
	    protected PurchasePlanOfProductJobServicePositionPurchasePlanSteps purchasePlanOfProductJobServicePositionPurchasePlanSteps;
	    @Steps
	    protected ChoosePpzForIncludeInPZDiictionaryPageSteps choosePpzForIncludeInPZDiictionaryPageSteps;
	    @Steps
	    protected PurchasePlanOfProductJobServiceSpecialPurchasesSteps purchasePlanOfProductJobServiceSpecialPurchasesSteps;
	    @Steps
	    protected PurchasePlanOfProductJobServiceResultsOfKBKSteps purchasePlanOfProductJobServiceResultsOfKBKSteps;
	    @Steps
	    protected PurchasePlanOfProductJobServiceCoordinationSheetSteps purchasePlanOfProductJobServiceCoordinationSheetSteps;
	    @Steps
	    protected PositionsPlanGraphicsPurchesSteps positionsPlanGraphicsPurchesSteps;
	    @Steps
	    protected PositionsPlanGraphicsPurchesOnApprovalSteps positionsPlanGraphicsPurchesOnApprovalSteps;
	    @Steps
	    protected PositionsPlanGraphicsPurchesStatementSteps positionsPlanGraphicsPurchesStatementSteps;
	    @Steps
	    protected ApprovalPositionsPlanGraphicsPurchesDialogSteps approvalPositionsPlanGraphicsPurchesDialogSteps;
	    @Steps
	    protected StatementPositionsPlanGraphicsPurchesDialogSteps statementPositionsPlanGraphicsPurchesDialogSteps;
		@Steps
		protected PlanPurchaseOnApprovalSteps planPurchaseOnApprovalSteps;
		@Steps
		protected PlanPurchaseStatementSteps planPurchaseStatementSteps;
		@Steps
		protected ApprovalPlanPurchaseDialogSteps approvalPlanPurchaseDialogSteps;
		@Steps
		protected StatementPlanPurchaseDialogSteps statementPlanPurchaseDialogSteps;
		@Steps
		protected AutoItSteps autoItSteps;
		@Steps
		protected PlanGraphicsSteps planGraphicsSteps;
		@Steps
		protected PlanGraphicsOnApprovalSteps planGraphicsOnApprovalSteps;
		@Steps
		protected ApprovalPlanGraphicsDialogSteps approvalPlanGraphicsDialogSteps;
		@Steps
		protected PlanGraphicsStatementSteps planGraphicsStatementSteps;
		@Steps
		protected StatementPlanGraphicsDialogSteps statementPlanGraphicsDialogSteps;
		
		@Steps
		protected AdminLoginSteps adminLoginSteps;
		@Steps
		protected AdminLeftMenuSteps adminLeftMenuSteps;
		@Steps
		protected AutoprocedureSteps autoprocedureSteps;
		@Steps
		protected ParametersRunTaskDialogSteps parametersRunTaskDialogSteps;
		@Steps
		protected SelectTypeOfProcurementAndProcurementPlanPPZDialogSteps selectTypeOfProcurementAndProcurementPlanPPZDialogSteps;
		@Steps
		protected SelectPositionOfProcurementPlanDiictionaryPageSteps selectPositionOfProcurementPlanDiictionaryPageSteps;
		@Steps
		protected PositionsPlanGraphicsPurchesTabSteps positionsPlanGraphicsPurchesTabSteps;
		@Steps
		protected PositionsPlanGraphicsPurchesBasicInformationSteps positionsPlanGraphicsPurchesBasicInformationSteps;
		@Steps
		protected MethodForDeterminingSupplierDictionaryPageSteps methodForDeterminingSupplierDictionaryPageSteps;
		@Steps
		protected PositionsPlanGraphicsPurchesSpecificationTRUSteps positionsPlanGraphicsPurchesSpecificationTRUSteps;
		@Steps
		protected PositionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps positionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps;
		@Steps
		protected OkvedDictionaryPageSteps okvedDictionaryPageSteps;
		@Steps
		protected NameOfMeasureDictionaryPageSteps nameOfMeasureDictionaryPageSteps;
		@Steps
		protected PositionsPlanGraphicsPurchesTermsOfPurchaseSteps positionsPlanGraphicsPurchesTermsOfPurchaseSteps;
		@Steps
		protected PositionsPlanGraphicsPurchesCoordinationSheetSteps positionsPlanGraphicsPurchesCoordinationSheetSteps;
		@Steps
		protected SelectYearOfPlanGraficsPageSteps selectYearOfPlanGraficsPageSteps;
		@Steps
		protected PlanGraphicsTabSteps planGraphicsTabSteps;
		@Steps
		protected PlanGraphicsBasicInformationSteps planGraphicsBasicInformationSteps;
		@Steps
		protected PlanGraphicsPositionsPlanGraficsSteps planGraphicsPositionsPlanGraficsSteps;
		@Steps
		protected ChoosePpgForIncludeInPGDiictionaryPageSteps choosePpgForIncludeInPGDiictionaryPageSteps;
		@Steps
		protected PlanGraphicsSpecialPurchasesSteps planGraphicsSpecialPurchasesSteps;
		@Steps
		protected PlanGraphicsTotalIndicatorsPlanGraficsSteps planGraphicsTotalIndicatorsPlanGraficsSteps;
		@Steps
		protected PlanGraphicsResultsOfKBKSteps planGraphicsResultsOfKBKSteps;
		@Steps
		protected PlanGraphicsCoordinationSheetSteps planGraphicsCoordinationSheetSteps;
		
	    protected Helpers h = new Helpers();

	    @Before
	    public void init(){
	   
	    	FirefoxProfile myProfile = new FirefoxProfile();
	    	myProfile.setAcceptUntrustedCertificates(true);
	    	myProfile.setPreference("plugin.state.npjinnbrowserplugin",2);
	    	myProfile.setPreference("plugin.state.java",2);

			  //myProfile.setPreference("network.proxy.socks_port",9999);
			  //myProfile.setAlwaysLoadNoFocusLib(true);
			  //myProfile.setEnableNativeEvents(true);
	    	Serenity.useFirefoxProfile(myProfile);
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
	    	/*
	    	try {
	    		headerSteps.clickOnButtonExit();
			} catch (Exception e) {

			}
	    	*/
	    		    	
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
	     * Раскрыть Позиции плана-графика на Формулярах
	     */
	    public void expandPositionPlanGraphicsOnApplicationForms(){
	    	if(!applicationFormsSteps.isPushedLinkPositionPlanGraphics()){
				applicationFormsSteps.clickOnLinkPositionPlanGraphics();
			}
	    }
	    /**
	     * Раскрыть План-график на Формулярах
	     */
	    protected void expandPlanGraphicsOnApplicationForms() {
	    	if(!applicationFormsSteps.isPushedLinkPlanGraphics()){
				applicationFormsSteps.clickOnLinkPlanGraphics();
			}
		}
	    /**
	     * Нажать на иконку фильтра для отображения полей фильтра на Позиции плана закупок 200
	     */
	    public void expandFilterOnPurchasePlan200(){
	    	
	    }
	    /**
	     * Выбрать значение в справочнике 'Периодичность осуществления закупки'
	     * @param value
	     */
	    public void selectValueInFrequencyOfPurchasesDictionary(String value){
	    	frequencyOfPurchasesDictionaryPageSteps.waitingForAppletVisible();
			if(frequencyOfPurchasesDictionaryPageSteps.checkFilterOn()){
				frequencyOfPurchasesDictionaryPageSteps.clickFilter();
			}
			frequencyOfPurchasesDictionaryPageSteps.clickOnFieldFrequency();
			frequencyOfPurchasesDictionaryPageSteps.setTextFrequency(value);
			frequencyOfPurchasesDictionaryPageSteps.clickOnButtonRefresh();
			if(!frequencyOfPurchasesDictionaryPageSteps.getValueFrequency().equals(value)){
				assertSteps.assertFalse("Поиск значения \""+value+"\" в справочнике", "Значение \""+value+"\" не найдено в справочнике");
			}
			frequencyOfPurchasesDictionaryPageSteps.clickOnRadioButtonFrequency();
			frequencyOfPurchasesDictionaryPageSteps.clickOnButtonOK();
	    }
	    /**
	     * Выбрать значение в справочнике 'Цепочки КБК '
	     * @param value
	     */
	    public void selectValueInChainsOfKBKDiictionary(String value){
	    	chainsOfKBKDiictionaryPageSteps.waitingForAppletVisible();
			if(chainsOfKBKDiictionaryPageSteps.checkFilterOn()){
				chainsOfKBKDiictionaryPageSteps.clickFilter();
			}
			chainsOfKBKDiictionaryPageSteps.clickOnFieldChainsOfKBK();
			chainsOfKBKDiictionaryPageSteps.setTextChainsOfKBK(value);
			chainsOfKBKDiictionaryPageSteps.clickOnButtonRefresh();
			if(!chainsOfKBKDiictionaryPageSteps.getValueChainsOfKBK().equals(value)){
				assertSteps.assertFalse("Поиск значения \""+value+"\" в справочнике", "Значение\""+value+"\" не найдено в справочнике");
			}
			chainsOfKBKDiictionaryPageSteps.clickOnFieldChainsOfKBK(value);
			chainsOfKBKDiictionaryPageSteps.clickOnButtonOK();
	    }
	    /**
	     * Выбрать значение в справочнике 'Дополнительный аналитический признак'
	     * @param value
	     */
	    public void selectValueInAdditionalAnalyticalSignDictionary(String value){
	    	additionalAnalyticalSignDictionaryPageSteps.waitingForAppletVisible();
			if(additionalAnalyticalSignDictionaryPageSteps.checkFilterOn()){
				additionalAnalyticalSignDictionaryPageSteps.clickFilter();
			}
			additionalAnalyticalSignDictionaryPageSteps.clickOnFieldAdditionalAnalyticalSign();
			additionalAnalyticalSignDictionaryPageSteps.setTextAdditionalAnalyticalSign(value);
			additionalAnalyticalSignDictionaryPageSteps.clickOnButtonRefresh();
			try{
				String currentValue = additionalAnalyticalSignDictionaryPageSteps.getValueAdditionalAnalyticalSign();
				if(!currentValue.equals(value)){
					assertSteps.assertFalse("Поиск значения \""+value+"\" в справочнике", "Значение \""+value+"\" не найдено в справочнике");
				}
			}catch(Exception e){
				assertSteps.assertFalse("Поиск значения \""+value+"\" в справочнике", "Значение \""+value+"\" не найдено в справочнике");
			}
			additionalAnalyticalSignDictionaryPageSteps.clickOnRadioButtonAdditionalAnalyticalSign();
			additionalAnalyticalSignDictionaryPageSteps.clickOnButtonOK();
	    }
	    /**
	     * Выбрать значение в справочнике 'Способ определения поставщика'
	     * @param value
	     */
	    public void selectValueInMethodForDeterminingSupplierDictionary(String value){
	    	methodForDeterminingSupplierDictionaryPageSteps.waitingForAppletVisible();
			if(methodForDeterminingSupplierDictionaryPageSteps.checkFilterOn()){
				methodForDeterminingSupplierDictionaryPageSteps.clickFilter();
			}
			methodForDeterminingSupplierDictionaryPageSteps.clickOnFieldName();
			methodForDeterminingSupplierDictionaryPageSteps.setTextName(value);
			methodForDeterminingSupplierDictionaryPageSteps.clickOnButtonRefresh();
			if(!methodForDeterminingSupplierDictionaryPageSteps.getValueName().equals(value)){
				assertSteps.assertFalse("Поиск значения \""+value+"\" в справочнике", "Значение \""+value+"\" не найдено в справочнике");
			}
			methodForDeterminingSupplierDictionaryPageSteps.clickOnRadioButtonName();
			methodForDeterminingSupplierDictionaryPageSteps.clickOnButtonOK();
	    }
	    /**
	     * Выбрать значение в справочнике 'Справочник ОКВЭД'
	     * @param value
	     */
	    public void selectValueInOkvedDictionary(String value){
	    	okvedDictionaryPageSteps.waitingForAppletVisible();
			if(okvedDictionaryPageSteps.checkFilterOn()){
				okvedDictionaryPageSteps.clickFilter();
			}
			okvedDictionaryPageSteps.clickOnFieldCode();
			okvedDictionaryPageSteps.setTextCode(value);
			okvedDictionaryPageSteps.clickOnButtonRefresh();
			if(!okvedDictionaryPageSteps.getValueCode().equals(value)){
				assertSteps.assertFalse("Поиск значения \""+value+"\" в справочнике", "Значение \""+value+"\" не найдено в справочнике");
			}
			okvedDictionaryPageSteps.clickOnRadioButtonCode();
			okvedDictionaryPageSteps.clickOnButtonOK();
	    }
	    /**
	     * Выбрать значение в справочнике 'Наименование единицы измерения'
	     * @param value
	     */
	    public void selectValueInNameOfMeasureDictionary(String value){
	    	nameOfMeasureDictionaryPageSteps.waitingForAppletVisible();
			if(nameOfMeasureDictionaryPageSteps.checkFilterOn()){
				nameOfMeasureDictionaryPageSteps.clickFilter();
			}
			nameOfMeasureDictionaryPageSteps.clickOnFieldName();
			nameOfMeasureDictionaryPageSteps.setTextName(value);
			nameOfMeasureDictionaryPageSteps.clickOnButtonRefresh();
			if(!nameOfMeasureDictionaryPageSteps.getValueName().equals(value)){
				assertSteps.assertFalse("Поиск значения \""+value+"\" в справочнике", "Значение \""+value+"\" не найдено в справочнике");
			}
			nameOfMeasureDictionaryPageSteps.clickOnRadioButtonName();
			nameOfMeasureDictionaryPageSteps.clickOnButtonOK();
	    }
	    /**
	     * Выбрать значение в справочнике 'Выбрать позицию плана закупок'
	     * @param value
	     */
	    public void selectValueInSelectPositionOfProcurementPlanDiictionaryByName(String value){
	    	selectPositionOfProcurementPlanDiictionaryPageSteps.waitingForAppletVisible();
			if(selectPositionOfProcurementPlanDiictionaryPageSteps.checkFilterOn()){
				selectPositionOfProcurementPlanDiictionaryPageSteps.clickFilter();
			}
			selectPositionOfProcurementPlanDiictionaryPageSteps.clickOnFieldObjectOfTenderName();
			selectPositionOfProcurementPlanDiictionaryPageSteps.setTextObjectOfTenderName(value);
			selectPositionOfProcurementPlanDiictionaryPageSteps.clickOnButtonRefresh();
			if(!selectPositionOfProcurementPlanDiictionaryPageSteps.getValueObjectOfTenderName().equals(value)){
				assertSteps.assertFalse("Поиск значения \""+value+"\" в справочнике", "Значение \""+value+"\" не найдено в справочнике");
			}
			selectPositionOfProcurementPlanDiictionaryPageSteps.clickOnButtonOK();
	    }
	    /**
	     * Выбрать значение в справочнике 'Выбрать позицию плана закупок'
	     * @param value
	     */
	    public void selectValueInSelectPositionOfProcurementPlanDiictionaryByOKPD2(String value){
	    	selectPositionOfProcurementPlanDiictionaryPageSteps.waitingForAppletVisible();
			if(selectPositionOfProcurementPlanDiictionaryPageSteps.checkFilterOn()){
				selectPositionOfProcurementPlanDiictionaryPageSteps.clickFilter();
			}
			selectPositionOfProcurementPlanDiictionaryPageSteps.clickOnFieldOKPD2();
			selectPositionOfProcurementPlanDiictionaryPageSteps.setTextOKPD2(value);
			selectPositionOfProcurementPlanDiictionaryPageSteps.clickOnButtonRefresh();
			if(!selectPositionOfProcurementPlanDiictionaryPageSteps.getValueOKPD2().equals(value)){
				assertSteps.assertFalse("Поиск значения \""+value+"\" в справочнике", "Значение \""+value+"\" не найдено в справочнике");
			}
			selectPositionOfProcurementPlanDiictionaryPageSteps.clickOnButtonOK();
	    }
	    /**
	     * Выбрать значение в справочнике 'Выбрать позицию плана закупок'
	     * @param value
	     */
	    public void selectValueInSelectPositionOfProcurementPlanDiictionaryByPPZ(String value){
	    	selectPositionOfProcurementPlanDiictionaryPageSteps.waitingForAppletVisible();
			if(selectPositionOfProcurementPlanDiictionaryPageSteps.checkFilterOn()){
				selectPositionOfProcurementPlanDiictionaryPageSteps.clickFilter();
			}
			//selectPositionOfProcurementPlanDiictionaryPageSteps.clickOnFieldProcurementPlanPositionNumber();
			selectPositionOfProcurementPlanDiictionaryPageSteps.setTextProcurementPlanPositionNumber(value);
			selectPositionOfProcurementPlanDiictionaryPageSteps.clickOnButtonRefresh();
			selectPositionOfProcurementPlanDiictionaryPageSteps.clickOnFieldProcurementPlanPositionNumber();
			if(!selectPositionOfProcurementPlanDiictionaryPageSteps.getValueProcurementPlanPositionNumber().equals(value)){
				assertSteps.assertFalse("Поиск значения \""+value+"\" в справочнике", "Значение \""+value+"\" не найдено в справочнике");
			}
			selectPositionOfProcurementPlanDiictionaryPageSteps.clickOnButtonOK();
	    }
	    /**
	     * Выбрать значение в справочнике 'Выбор ППГ для включения в ПГ'
	     * @param value
	     */
	    public void selectValueInChoosePpgForIncludeInPGDiictionaryByPPZ(String value){
	    	choosePpgForIncludeInPGDiictionaryPageSteps.waitingForAppletVisible();
			if(choosePpgForIncludeInPGDiictionaryPageSteps.checkFilterOn()){
				choosePpgForIncludeInPGDiictionaryPageSteps.clickFilter();
			}
			choosePpgForIncludeInPGDiictionaryPageSteps.clickOnFieldPpgNumber();
			choosePpgForIncludeInPGDiictionaryPageSteps.setTextPpgNumber(value);
			choosePpgForIncludeInPGDiictionaryPageSteps.clickOnButtonRefresh();
			if(!choosePpgForIncludeInPGDiictionaryPageSteps.getValuePpgNumber().equals(value)){
				assertSteps.assertFalse("Поиск значения \""+value+"\" в справочнике", "Значение \""+value+"\" не найдено в справочнике");
			}
			choosePpgForIncludeInPGDiictionaryPageSteps.clickOnButtonOK();
	    }
	    /**
	     * Выбрать значение в справочнике 'Выбор ППЗ для включения в ПЗ'
	     * @param value
	     */
	    public void selectValueInChoosePpzForIncludeInPZDiictionaryByPPZ(String value){
	    	choosePpzForIncludeInPZDiictionaryPageSteps.waitingForAppletVisible();
			if(choosePpzForIncludeInPZDiictionaryPageSteps.checkFilterOn()){
				choosePpzForIncludeInPZDiictionaryPageSteps.clickFilter();
			}
			choosePpzForIncludeInPZDiictionaryPageSteps.clickOnFieldProcurementPlanPositionNumber();
			choosePpzForIncludeInPZDiictionaryPageSteps.setTextProcurementPlanPositionNumber(value);
			choosePpzForIncludeInPZDiictionaryPageSteps.clickOnButtonRefresh();
			if(!choosePpzForIncludeInPZDiictionaryPageSteps.getValueProcurementPlanPositionNumber().equals(value)){
				assertSteps.assertFalse("Поиск значения \""+value+"\" в справочнике", "Значение \""+value+"\" не найдено в справочнике");
			}
			choosePpzForIncludeInPZDiictionaryPageSteps.clickOnButtonOK();
	    }
	    /**
	     * Загрузить файл в диалоговом окне 'Добавление вложения'
	     * @param filePath
	     */
	    public void addAttachment(String filePath){
	    	addAttachmentPageSteps.waitingForAppletVisible(); 
			addAttachmentPageSteps.loadFile(filePath);
	    	autoItSteps.selectFileInFireFox();
			addAttachmentPageSteps.clickOnButtonSave();
	    }
	    /**
	     * Загрузить файл в диалоговом окне 'Добавление вложения'
	     * @param filePath
	     * @param attachmentType
	     */
	    public void addAttachmentWithType(String filePath, String attachmentType){
	    	addAttachmentPageSteps.waitingForAppletVisible(); 
	    	addAttachmentPageSteps.clickOnFieldAttachmentType(attachmentType);
			addAttachmentPageSteps.loadFile(filePath);
	    	autoItSteps.selectFileInFireFox();
			addAttachmentPageSteps.clickOnButtonSave();
	    }
	    /**
	     * Выбрать пользователя в диалоговом окне 'Выбрать пользователя'
	     * @param fio
	     */
	    public void selectUser(String fio){
	    	selectUserDialogSteps.waitingForAppletVisible();
			selectUserDialogSteps.clickOnFieldUserFIO(fio);
			selectUserDialogSteps.clickOnButtonOk();
	    }
	    
	    /**
	     * Нажать кнопку сохранить в диалоговом окне 'Результаты проверки'
	     */
	    public void saveTestResults(){
	    	testResultsDialogSteps.waitingForAppletVisible();
			if(!testResultsDialogSteps.checkSaveButtonEists()){
				assertSteps.assertFalse("Проверка существования кнопки Сохранить", "Кнопка Сохранить не найдена!");
			}
			testResultsDialogSteps.clickOnButtonSave();
	    }
}
