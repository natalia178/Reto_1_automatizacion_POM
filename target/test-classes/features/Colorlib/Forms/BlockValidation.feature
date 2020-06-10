#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Formulario Block Validation
  El usuario debe poder ingresar al formulario los datos requeridos.
  Cada campo del formulario realiza validaciones de obligatoriedad,
  longitud y formato, el sistema debe presentar las validadciones respectivas
  para cada campo a través de un label bajo el campo correspondiente.

  @CasoExitoso
  Scenario: Diligenciamiento exitoso del formulario Block Validation,
  					no se presenta ningun mensaje de validación.
    Given Autentico en colorlib con usuario "demo" y clave "demo" 
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio Formulario Block Validation
    	| Required | Email             | Password | CPassword | Date       | Url                   | Digit | Range |
    	| Valor1   | valor1@mail.com   | password | password  | 05/07/2020 | http://www.valor1.com | 3     | 8     |
    Then Verifico ingreso exitoso
    
  @CasoAlterno
  Scenario: Diligenciamiento con errores del formulario Block Validation,
  					Se presenta globo informativo indicando el error en el diligenciamiento de alguno de los campos.
    Given Autentico en colorlib con usuario "demo" y clave "demo" 
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio Formulario Block Validation
    	| Required | Email             | Password | CPassword | Date       | Url                   | Digit | Range |
    	| Valor1   | valor1@mail.com   |          | password  | 05/07/2020 | http://www.valor1.com | 3     | 8     |    
    Then Verificar que se presente bloque de ayuda de validacion