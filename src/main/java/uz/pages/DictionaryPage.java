package uz.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;

@DefaultUrl("http://eb-core-test-ssow:7777/udu-webcenter/faces/")
@NamedUrls({
    @NamedUrl(name = "adm", url = "http://eb-core-test-ufosl:8889/sufdclient/index.zul")
  })
public class DictionaryPage extends PageObject {
	  
	public void maximizeBrowserWindow() {
		getDriver().manage().window().maximize();    
	}

	public void goToUrl(String url){
		getDriver().navigate().to(url);
	}
}