package StepDefinitions;
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runners.WebdriverPOM;

public class EntrarAGmailStepDefinitions {
	
	
	
	@Given("^abro navegador$")
	public void abro_navegador() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebdriverPOM.AbrirNavegador();
	}

	@When("^entro a gmail$")
	public void entro_a_gmail() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebdriverPOM.entrarADireccion();
	}

	@When("^ingreso <Cuenta> y <Pass>$")
	public void ingreso_Cuenta_y_Pass_validando_con_id(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		Map<String, String> mapa = arg1.asMap(String.class, String.class); 	//convierto el datatable que envia el Feature a Map
		 for( String key : mapa.keySet()) {									//uso el tipo de dato String para iterar sobre la coleccion de datos key del mapa
			 System.out.println(key + " | " + mapa.get(key)); 				//imprimo cada uno de los datos del map usando el key
			 if(key.contains("semillerosophos")) {
				 WebdriverPOM.ingresar(key, mapa.get(key));					//envio la key y el value para ingresar a gmail
			 }
		 }
	}

	@Then("^valido que halla ingresado a la cuenta \"([^\"]*)\"$")
		public void valido_que_halla_ingresado_a_la_cuenta(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebdriverPOM.validarEntrada(arg1);
}

	@Then("^envio correo$")
		public void envio_correo() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebdriverPOM.enviarCorreo();
		WebdriverPOM.esperar();
		WebdriverPOM.cerrar();
		
}

}
