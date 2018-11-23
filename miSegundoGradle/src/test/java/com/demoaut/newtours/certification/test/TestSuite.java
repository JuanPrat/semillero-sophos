package com.demoaut.newtours.certification.test;

import static org.junit.Assert.*;//para hacer validaciones


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;//para especificar con qu� runner hacer las pruebas
import org.junit.runners.Suite;//el runner designado. �ste no solo indica los test a hacer sino el orden
import org.junit.runners.Suite.SuiteClasses;//especifica las clases a testear

@RunWith(Suite.class)//ac� especificamos el runner a usar
@SuiteClasses({NewtoursLogin.class, NewtoursLogin2.class, NewtoursLogin3.class 	})//ac� escojemos el orden y las clases a usar

public class TestSuite {

}
