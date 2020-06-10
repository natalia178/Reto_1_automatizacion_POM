package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ColorlibLoginPage;
import com.choucair.formacion.pageobjects.ColorlibMenuPage;

import net.thucydides.core.annotations.Step;

public class BlockValidationSteps {
	
	ColorlibLoginPage loginPage;
	ColorlibMenuPage menuPage;
	
	@Step
	public void login_colorlib(String strUsername, String strPassword) {
		//a. abrir navegador con la url de prueba
		loginPage.open();
		//b. ingresar usuario demo
		//c. ingresar password demo
		//d. click en ingresar
		loginPage.IngresarDatos(strUsername, strPassword);
		//e. verificar la autenticacion (label en home)
		loginPage.VericaHome();
	}
	
	@Step
	public void form_validation_menu() {
		menuPage.formValidation();
	}

}
