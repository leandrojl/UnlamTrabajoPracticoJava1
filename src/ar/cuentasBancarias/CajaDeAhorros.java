package ar.cuentasBancarias;

public class CajaDeAhorros extends CuentaBancaria{

	private Integer numeroDeExtracciones= 0;
	
	@Override
	public void extraerDinero(Double extraerDinero) {
		
		if(extraerDinero <= this.saldoEnCuenta) {
			if(extraerDinero > 0) {
				numeroDeExtracciones++;
				if(this.numeroDeExtracciones >5) {
					this.saldoEnCuenta -= extraerDinero+6;
				}else {
					this.saldoEnCuenta -= extraerDinero;
				}
				
				
			}
			
		}
		
	}

	public void cuanddoRealizoSeisExtraccionesDeDineroDeLaCuenta(CajaDeAhorros caja, Double dineroExtraido) {
		for(int i=0; i < 6;i++) {
			caja.extraerDinero(dineroExtraido);
		}
	}
}
