
import org.openqa.selenium.firefox.FirefoxDriver;//especificamos el navegador
import org.openqa.selenium.WebDriver;//importamos el controlador 
import org.openqa.selenium.By;//importamos la forma de busqueda

public class main {

	public static void main(String[] args) {
		//le decimos al sistema que el controlador para firefox está en la siguiente direccion
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\drivers\\Mozilla\\geckodriver.exe");
		//instanciamos el driver
		WebDriver azul = new FirefoxDriver();
		//vamos a una pagina
		azul.get("http://www.google.com.co");
		
	}

}
