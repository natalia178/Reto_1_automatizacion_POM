package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ColorlibBlockValidationPage;
import java.util.List;

import net.thucydides.core.annotations.Step;

public class ColorlibBlockValidationSteps {

ColorlibBlockValidationPage colorlibBlockValidationPage; 
	
	@Step
	public void diligenciar_popup_datos_tabla(List<List<String>> data, int i) {
		// TODO Auto-generated method stub
		colorlibBlockValidationPage.required(data.get(i).get(0).trim());
		colorlibBlockValidationPage.email(data.get(i).get(1).trim());
		colorlibBlockValidationPage.pass1(data.get(i).get(2).trim());
		colorlibBlockValidationPage.pass2(data.get(i).get(3).trim());
		colorlibBlockValidationPage.date(data.get(i).get(4).trim());
		colorlibBlockValidationPage.url(data.get(i).get(5).trim());
		colorlibBlockValidationPage.digits(data.get(i).get(6).trim());
		colorlibBlockValidationPage.range(data.get(i).get(7).trim());
		colorlibBlockValidationPage.agree();
		colorlibBlockValidationPage.validateBtn();
	}

	@Step
	public void form_sin_errores() {
		colorlibBlockValidationPage.sin_errores();
	}
	
	@Step
	public void form_con_errores() {
		colorlibBlockValidationPage.con_errores();
	}
	
}
