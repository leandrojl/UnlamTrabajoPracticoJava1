package ar.cuentasBancariasTest;

import org.junit.Test;

import ar.cuentasBancarias.CuentaSueldo;
import junit.framework.Assert;

public class CuentaSueldoTest {
	//1) GIVEN 2) WHEN 3) THEN
		@Test
		public void unaCuentaBancariaEnCero() {
			Double valorEsperado = 0.0;
			CuentaSueldo cuenta = dadoQueExisteUnaCuenta(); //GIVEN
			Double sueldo = cuandoConsultoSuSaldo(cuenta); //WHEN
			entoncesSuSaldoEs(valorEsperado, sueldo);	//THEN
		}

		private void entoncesSuSaldoEs(Double valorEsperado, Double sueldo) {
			Assert.assertEquals(valorEsperado, sueldo);
			
		}

		private Double cuandoConsultoSuSaldo(CuentaSueldo cuenta) {
			 return cuenta.consultarSaldo();
			
		}

		private CuentaSueldo dadoQueExisteUnaCuenta() {
			CuentaSueldo cuenta = new CuentaSueldo();
			return cuenta;
		}
}
