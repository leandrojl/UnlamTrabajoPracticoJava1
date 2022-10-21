package ar.cuentasBancarias;

public class CuentaCorriente extends CuentaBancaria{
	
	
	
	@Override
	public void extraerDinero(Double extraerDinero) {
		
		
			if(extraerDinero > 0 && extraerDinero > this.saldoEnCuenta) {
				Double valorInteresDescubierto = (extraerDinero - this.saldoEnCuenta)*0.05;
					
				this.saldoEnCuenta -= (extraerDinero+valorInteresDescubierto);
				
			}
			
		
		
	}

}
