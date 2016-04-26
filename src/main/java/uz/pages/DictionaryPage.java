package uz.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://eb-core-test-ssow:7777/udu-webcenter/faces/")
public class DictionaryPage extends PageObject {

	  
	public void maximizeBrowserWindow() {
		getDriver().manage().window().maximize();    
	}
}