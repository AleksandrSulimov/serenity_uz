package uz.utils;
import java.io.File;

import org.hamcrest.MatcherAssert;

import autoitx4java.AutoItX;

import com.jacob.com.LibraryLoader;
/**
* AutoIt
* Класс для работы с библиотекой AutoIt и JACOB
* @author s.serov 24.11.2015
*
*/
public class AutoIt {

	 final String JACOB_DLL_TO_USE = System.getProperty("sun.arch.data.model").contains("32") ?
	          "jacob-1.18-x86.dll" : "jacob-1.18-x64.dll";
	 
	 private AutoItX control;
	 
	 public AutoIt(){
		 File file = new File(System.getProperty("user.dir")+"\\lib", JACOB_DLL_TO_USE);
		  System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());
		  
		  control = new AutoItX();
	 }
	/**
	 * Выбираем сертификат
	 */
	 public void selectCertInJinnClient(){
		 System.out.println("Жду появление окна: Jinn-Client");
		 control.winWait("Jinn-Client", "", 20); //[Title:Jinn-Client]
		if(control.winExists("Jinn-Client")){
			System.out.println("Появилось окно: Jinn-Client");
			control.winActivate("Jinn-Client");
			System.out.println("Сделал окно активным: Jinn-Client.");
			/*
			control.controlClick("", "Обновить", "");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			*/
			control.controlClick("Jinn-Client", "", "[CLASS:Edit; INSTANCE:1]");
			System.out.println("Клик на поле ввода в окне: Jinn-Client.");
			control.controlSend("Jinn-Client","","[CLASS:Edit; INSTANCE:1]","12345678");
			System.out.println("Ввел текст в поле ввода в окне: Jinn-Client.");
			control.controlClick("Jinn-Client", "", "[CLASS:Button; INSTANCE:2]");
			System.out.println("Нажал кнопку в окне: Jinn-Client.");
			System.out.println("Жду исчезновение окна: Jinn-Client.");
			Boolean isClose = control.winWaitClose("Jinn-Client", "", 20);
			if(!isClose){
				System.out.println("Окно не исчезло: Jinn-Client.");
				MatcherAssert.assertThat("Окно Jinn-Clien не закрылось", false);
			}
			System.out.println("Окно исчезло: Jinn-Client.");
		}else{
			System.out.println("Окно Jinn-Client для выбора сертификата не появилось");
			//MatcherAssert.assertThat("Окно Jinn-Client. Просмотр документа перед формированием подписи не появилось", false);
		}
	 }
	 
	 public void signInJinnClient(){
		 System.out.println("Жду появление окна: Jinn-Client. Просмотр документа перед формированием подписи не появилось");
		 control.winWait("Jinn-Client. Просмотр документа перед формированием подписи", "", 20);
		if(control.winExists("Jinn-Client. Просмотр документа перед формированием подписи")){
			System.out.println("Появилось окно: Jinn-Client. Просмотр документа перед формированием подписи не появилось");
			control.winActivate("Jinn-Client. Просмотр документа перед формированием подписи");
			 System.out.println("Сделал окно активным: Jinn-Client. Просмотр документа перед формированием подписи не появилось");
			control.controlClick("Jinn-Client. Просмотр документа перед формированием подписи", "", "[CLASS:Button; INSTANCE:1]");
			 System.out.println("Нажал кнопку в окне: Jinn-Client. Просмотр документа перед формированием подписи не появилось");
			 System.out.println("Жду исчезновение окна: Jinn-Client. Просмотр документа перед формированием подписи не появилось");
			Boolean isClose = control.winWaitClose("Jinn-Client. Просмотр документа перед формированием подписи", "", 20);
			
			if(!isClose){
				System.out.println("Окно не исчезло: Jinn-Client. Просмотр документа перед формированием подписи не появилось");
				MatcherAssert.assertThat("Jinn-Client. Просмотр документа перед формированием подписи", false);
			}
			System.out.println("Окно исчезло: Jinn-Client. Просмотр документа перед формированием подписи не появилось");
		}else{
			System.out.println("Окно Jinn-Client. Просмотр документа перед формированием подписи не появилось");
			//MatcherAssert.assertThat("Окно Jinn-Client. Просмотр документа перед формированием подписи не появилось", false);
		}
	 }
	 
	 public void selectFileInFireFox(){
		 File f = new File("src/main/resources/test.txt");
		 String path = f.getAbsolutePath();
		 control.winWait("Выгрузка файла", "", 10); //[Title:Jinn-Client]
		if(control.winExists("Выгрузка файла")){
			control.winActivate("Выгрузка файла");
			control.controlClick("Выгрузка файла", "", "[CLASS:Edit; INSTANCE:1]");
			control.controlSend("Выгрузка файла","","[CLASS:Edit; INSTANCE:1]",path);
			control.controlClick("Выгрузка файла", "", "[CLASS:Button; INSTANCE:1]");
			Boolean isClose = control.winWaitClose("Выгрузка файла", "", 10);
			if(!isClose){
				MatcherAssert.assertThat("Окно Выгрузка файла не закрылось", false);
			}
		}else{
			System.out.println("Окно Выгрузка файла не появилось");
			//MatcherAssert.assertThat("Окно Jinn-Client. Просмотр документа перед формированием подписи не появилось", false);
		}
	 }
	 
}
