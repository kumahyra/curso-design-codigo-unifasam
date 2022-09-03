package junit.testeunitario;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void somar(){
		//cenario
		int a = 5;
		int b = 5;
		
		//acao
		Calculadora calc = new Calculadora();
		int resultado = calc.somar(a, b);
				
		//verificao
		Assert.assertEquals(10, resultado);		
	}
}
