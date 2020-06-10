 package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.BlockValidationSteps;
import com.choucair.formacion.steps.ColorlibBlockValidationSteps;
import cucumber.api.DataTable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BlockValidationDefinition {
	@Steps
	BlockValidationSteps blockSteps;
	@Steps
	ColorlibBlockValidationSteps colorlibBlockValidationSteps;
	
	@Given("^Autentico en colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void autentico_en_colorlib_con_usuario_y_clave(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions}
		blockSteps.login_colorlib(username, password);
	}

	@Given("^Ingreso a la funcionalidad Forms Validation$")
	public void ingreso_a_la_funcionalidad_Forms_Validation() {
	    // Write code here that turns the phrase above into concrete actions
		blockSteps.form_validation_menu();
	}

	@When("^Diligencio Formulario Block Validation$")
	public void diligencio_Formulario_Block_Validation(DataTable dtDatosForm) {
	    // Write code here that turns the phrase above into concrete actions
		List<List<String>> data = dtDatosForm.raw();
		
		for(int i=1; i<data.size(); i++) {
			colorlibBlockValidationSteps.diligenciar_popup_datos_tabla(data,i);
		}
	}

	@Then("^Verifico ingreso exitoso$")
	public void verifico_ingreso_exitoso() {
	    // Write code here that turns the phrase above into concrete actions
		colorlibBlockValidationSteps.form_sin_errores();
	}
	
	@Then("^Verificar que se presente bloque de ayuda de validacion$")
	public void verificar_que_se_presente_bloque_de_ayuda_de_validacion() {
	    // Write code here that turns the phrase above into concrete actions
		colorlibBlockValidationSteps.form_con_errores();
	}

}
