package uz.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;

@DefaultUrl("http://is2-ssow.lanit.ru:7777/udu-webcenter/faces/")
@NamedUrls({
    @NamedUrl(name = "adm", url = "http://is2-ufosl.lanit.ru:8889/sufdclient/index.zul")
  })
public class DictionaryPage extends PageObject {
	  
	public void maximizeBrowserWindow() {
		getDriver().manage().window().maximize();    
	}

	public void goToUrl(String url){
		getDriver().navigate().to(url);
	}
}