package ar.cuentasBancariasTest;

import org.junit.Assert;
import org.junit.Test;

import ar.cuentasBancarias.CuentaCorriente;

public class CuentaCorrienteTest {
	//GIVEN WHEN THEN
	
	@Test
	public void queAlRetirarUnMontoEnDescubiertoSeCobreUnRecargo() {
		CuentaCorriente caja = new CuentaCorriente();
		caja.ingresarSaldo(100.0);
		caja.extraerDinero(200.0);
		Double valorEsperado = -105.0;
		Double valorObtenido = caja.consultarSaldo();
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}
