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
import uz.steps.ChainsOfKBKDiictionaryPageSteps;
import uz.steps.ChoosePpzForIncludeInPZDiictionaryPageSteps;
import uz.steps.CommonSteps;
import uz.steps.DictionaryPageSteps;
import uz.steps.FrequencyOfPurchasesDictionaryPageSteps;
import uz.steps.HeaderSteps;
import uz.steps.LoginPageSteps;
import uz.steps.MenuSteps;
import uz.steps.OKPD2DictionaryPageSteps;
import uz.steps.PlanPurchaseSteps;
import uz.steps.PositionsPlanGraphicsPurchesOnApprovalSteps;
import uz.steps.PositionsPlanGraphicsPurchesStatementSteps;
import uz.steps.PositionsPlanGraphicsPurchesSteps;
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
import uz.steps.dialog.ApprovalPositionPurchase200DialogSteps;
import uz.steps.dialog.ApprovalPositionsPlanGraphicsPurchesDialogSteps;
import uz.steps.dialog.SelectUserDialogSteps;
import uz.steps.dialog.StatementPositionPurchase200DialogSteps;
import uz.steps.dialog.StatementPositionsPlanGraphicsPurchesDialogSteps;
import uz.steps.dialog.TestResultsDialogSteps;
import uz.steps.tabs.MainPageTabSteps;
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
	     * Раскрыть Позиции плана-графика на Формулярах
	     */
	    public void expandPositionPlanGraphicsOnApplicationForms(){
	    	if(!applicationFormsSteps.isPushedLinkPositionPlanGraphics()){
				applicationFormsSteps.clickOnLinkPositionPlanGraphics();
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
			if(!additionalAnalyticalSignDictionaryPageSteps.getValueAdditionalAnalyticalSign().equals(value)){
				assertSteps.assertFalse("Поиск значения \""+value+"\" в справочнике", "Значение \""+value+"\" не найдено в справочнике");
			}
			additionalAnalyticalSignDictionaryPageSteps.clickOnRadioButtonAdditionalAnalyticalSign();
			additionalAnalyticalSignDictionaryPageSteps.clickOnButtonOK();
	    }
	    
	    /**
	     * Загрузить файл в диалоговом окне 'Добавление вложения'
	     * @param filePath
	     */
	    public void addAttachment(String filePath){
	    	addAttachmentPageSteps.waitingForAppletVisible(); 
			addAttachmentPageSteps.loadFile(filePath);
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
