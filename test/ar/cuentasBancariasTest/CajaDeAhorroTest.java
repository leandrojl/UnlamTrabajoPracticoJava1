package ar.cuentasBancariasTest;

import org.junit.Assert;
import org.junit.Test;

import ar.cuentasBancarias.CajaDeAhorros;

public class CajaDeAhorroTest {

	
	
	@Test
	public void queAlRealizarUnaSextaExtraccionSeCobreUnRecargo() {
		//GIVEN WHEN THEN
		CajaDeAhorros caja1 = new CajaDeAhorros();
		caja1.ingresarSaldo(2000.0);
		caja1.cuanddoRealizoSeisExtraccionesDeDineroDeLaCuenta(caja1, 100.0);
		Double valorEsperado = 1394.0;
		Double valorObtenido = caja1.consultarSaldo();
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
}
