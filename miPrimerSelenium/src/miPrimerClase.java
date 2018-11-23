//PASO 1 traer imports para automatizar
import org.openqa.selenium.chrome.ChromeDriver;//especificar el navegador
import org.openqa.selenium.WebDriver;//controlador
import org.openqa.selenium.By;//especificar forma de busqueda

public class miPrimerClase {

	public static void main(String[] args) {
		//PASO 2 ubicamos el controlador
		//le decimos al sistema que el controlador para chrome està en la direccion y se llama asì:
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		//creamos el web driver
		WebDriver zoe = new ChromeDriver();
		//ahora vamos a cualquier pagina con el siguiente comando
		zoe.get("http://www.google.com.co");
		//ahora escribimos en la barra de busqueda que tiene name = q, gmail
		zoe.findElement(By.name("q")).sendKeys("gmail");
		zoe.findElement(By.name("btnK")).submit();
		
	}
}
