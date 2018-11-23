package runners;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;//para especificar unidades de tiempo

import org.openqa.selenium.By;//para buscar elementos
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;//para usar webdrivers
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;//para implementar codigo con condiciones esperadas
import org.openqa.selenium.support.ui.WebDriverWait;//para poner a esperar el driver
import org.openqa.selenium.WebElement;//para usar web elements
import org.junit.Assert;

public class WebdriverPOM {
	//variables POM
	static WebDriver zoe;
	static String ruta = "https://www.gmail.com";
	static private String destinatario= "semillerosophos@gmail.com";
	static private String asunto= "automata";
	
	public WebdriverPOM() {
		
	}
	
	
	static public void AbrirNavegador() {
		//especificamos el tipo de driver y la direccion del .exe
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		zoe = new ChromeDriver();
	}
	
	static public void esperar() {
		WebElement mensajeDeConfirmacionDeEnvio = zoe.findElement(By.className("vh"));
		Boolean myDynamicElement = (new WebDriverWait(zoe, 10)).until(ExpectedConditions.textToBePresentInElement(mensajeDeConfirmacionDeEnvio, "Mensaje enviado."));
	}
	
	static public void entrarADireccion() {
		zoe.get(ruta);
	}
	
	static public void ingresar(String cuenta, String pass)  {
		zoe.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);						//el web driver espera 50 segundos a que la pagina cargue
		//ingresamos cuenta y contraseña
		zoe.findElement(By.name("identifier")).sendKeys(cuenta);
		zoe.findElement(By.id("identifierNext")).click();
		WebElement myDynamicElement = (new WebDriverWait(zoe, 10)).until(ExpectedConditions.elementToBeClickable(By.name("password")));//ponemos el driver a esperar con explicit wait hasta que el elemento sea clickeable
		zoe.findElement(By.name("password")).sendKeys(pass);
		zoe.findElement(By.id("passwordNext")).click();
	}
	
	static public void enviarCorreo() {
		zoe.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();			//clickeamos el boton de redactar de gmail		
		zoe.findElement(By.name("to")).click();			
		zoe.findElement(By.name("to")).sendKeys(destinatario);								//escribe los destinatarios del correo
		zoe.findElement(By.name("subjectbox")).sendKeys(asunto);							//escribe el asunto del correo																				
		zoe.findElement(By.className("btA")).click();										//damos clic en el boton enviar
		//
		
	}
	static public void cerrar() throws InterruptedException {		
		zoe.close();
	}
	
	static public void validarEntrada(String cuenta) {
		//esperamos a que el boton de perfil sea clickeable
		WebElement redactarButton = (new WebDriverWait(zoe, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")));
		//esperamos que la pagina cargue
		zoe.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//tomamos el nombre de la cuenta que me trae gmail luego de loguearme
		WebElement cuentaObtenida = zoe.findElement(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[1]/div[4]/header[1]/div[2]/div[3]/div[1]/div[2]/div[1]/a[1]"));
		//valido que la cuenta obtenida contenga el nombre de la cuenta esperada
		assertTrue(cuentaObtenida.getAttribute("aria-label").contains(cuenta));
	}
	
}
