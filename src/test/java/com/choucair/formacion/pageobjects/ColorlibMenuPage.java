package com.choucair.formacion.pageobjects;

import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class ColorlibMenuPage extends PageObject {


	@FindBy(xpath="//*[@id='menu']/li[6]")
	public WebElementFacade formsMenu;
	
	@FindBy(xpath="//*[@id='menu']/li[6]/ul/li[2]")
	public WebElementFacade formValidationMenu;
	
	@FindBy(xpath="//*[@id='content']/div/div/div[2]/div/div/header/h5")
	public WebElementFacade formValtittle;
	
	public void formValidation()
	{
		formsMenu.click();
		formValidationMenu.click();
		String strMensaje = formValtittle.getText();
		assertThat(strMensaje, containsString("Block Validation"));
	}
	
	

	
	
	
	
	
			
	
	
}
