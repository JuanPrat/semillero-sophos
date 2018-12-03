package exceptions;

public class NoMatchingBuyButtonIsVisible extends AssertionError{ 
	//assertionError indica que ha ocurrido un error de aplicacion y no un error de pruebas
	
	private static final String UNABLE_TO_FOUND_YELLOW_BUTTON = "Unable to found the yellow buy button";
	
	//Constructor que llama al constructor de la clase padre AssertionError
	public NoMatchingBuyButtonIsVisible(String message, Throwable cause) {       
        super(message, cause);
	}
	
	public static String getUnableToFoundButton() {
		return UNABLE_TO_FOUND_YELLOW_BUTTON;
	}
}
