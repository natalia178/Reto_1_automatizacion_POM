package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ColorlibBlockValidationPage {
	@FindBy(id="required2")
	public WebElementFacade txtRequired;
	@FindBy(id="email2")
	public WebElementFacade txtEmail;
	@FindBy(id="password2")
	public WebElementFacade txtPass1; 
	@FindBy(id="confirm_password2")
	public WebElementFacade txtPass2; 
	@FindBy(id="date2")
	public WebElementFacade txtDate; 
	@FindBy(id="url2")
	public WebElementFacade txtUrl; 
	@FindBy(id="digits")
	public WebElementFacade txtDigits; 
	@FindBy(id="range")
	public WebElementFacade txtRange; 
	@FindBy(id="agree2")
	public WebElementFacade checkAgree; 
	@FindBy(xpath="//*[@id='block-validate']/div[10]/input")
	public WebElementFacade btnValidate;
	@FindBy(tagName="body")
	public WebElementFacade pageBody;
	
	public void required(String datoPrueba) {
		txtRequired.click();
		txtRequired.clear();
		txtRequired.sendKeys(datoPrueba);
	}
	
	public void email(String datoPrueba) {
		txtEmail.click();
		txtEmail.clear();
		txtEmail.sendKeys(datoPrueba);
	}
	
	public void pass1(String datoPrueba) {
		txtPass1.click();
		txtPass1.clear();
		txtPass1.sendKeys(datoPrueba);
	}
	
	public void pass2(String datoPrueba) {
		txtPass2.click();
		txtPass2.clear();
		txtPass2.sendKeys(datoPrueba);
	}
	
	public void date(String datoPrueba) {
		txtDate.click();
		txtDate.clear();
		txtDate.sendKeys(datoPrueba);
	}
	
	public void url(String datoPrueba) {
		txtUrl.click();
		txtUrl.clear();
		txtUrl.sendKeys(datoPrueba);
	}
	
	public void digits(String datoPrueba) {
		txtDigits.click();
		txtDigits.clear();
		txtDigits.sendKeys(datoPrueba);
	}
	
	public void range(String datoPrueba) {
		txtRange.click();
		txtRange.clear();
		txtRange.sendKeys(datoPrueba);
	}
	
	public void agree() {
		checkAgree.click();
	}
	
	public void validateBtn() {
		btnValidate.click();
	}
	
	public void sin_errores() {
		assertThat(errores(),is(false));
	}
	
	public void con_errores() {
		assertThat(errores(),is(true));
	}
	
	public boolean errores() {
		
		String texto = pageBody.getText();
		
		if(texto.contains("This field is required.") ||
				texto.contains("Please enter a valid email address.") ||
				texto.contains("Please enter at least 5 characters.") ||
				texto.contains("Please enter the same value again.") ||
				texto.contains("Please enter a valid URL.") ||
				texto.contains("Please enter only digits.") ||
				texto.contains("Please enter a value between 5 and 16.")) {
			return true;
		}
		
		else
			return false;
	}
	
	
}
