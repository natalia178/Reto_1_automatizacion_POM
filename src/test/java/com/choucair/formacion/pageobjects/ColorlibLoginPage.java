package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("https://colorlib.com/polygon/metis/login.html")
public class ColorlibLoginPage  extends  PageObject {

	//campo usuario
		@FindBy(xpath ="//*[@id=\"login\"]/form/input[1]")
		public WebElementFacade  txtUsername;
		
		//campo password 
		@FindBy(xpath = "//*[@id=\"login\"]/form/input[2]")
		public WebElementFacade txtpassword;
		
		//Botón
		@FindBy(xpath = "//*[@id=\"login\"]/form/button")
		public WebElementFacade btnSignIn; 
		
		//label del home a verificar
		@FindBy(xpath = "//*[@id=\"bootstrap-admin-template\"]")
		public WebElementFacade lblHomePpal;
	
	
	
	
		public void IngresarDatos (String strUsuario, String strPass) {
			
			txtUsername.sendKeys(strUsuario);
			txtpassword.sendKeys(strPass);
			btnSignIn.click();
		}
		
		public void VericaHome () {
			
			String labelv ="Bootstrap-Admin-Template";
			String strmensaje = lblHomePpal.getText();
			assertThat(strmensaje,containsString(labelv));
			
			
		}
  
	
}
