package miPrimerHamcrest;

import static org.hamcrest.MatcherAssert.assertThat; //para las validaciones
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.Matcher.*;//
import junit.framework.TestCase; 


import junit.framework.TestCase;

public class BiscuitTest extends TestCase { 
  
	public void testEquals() { 
    Biscuit theBiscuit = new Biscuit("Ginger"); 
    Biscuit Biscuit = new Biscuit("Ginger");
	    //assertThat(theBiscuit, is(equalTo(Biscuit)));    //HAMCREST QUE LANZA FALSE
    	assertThat(theBiscuit, is(equalTo(theBiscuit))); //HAMCREST QUE LANZA TRUE
  } 
} 
