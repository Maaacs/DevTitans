
class Main{
	public static void main (String[] args){

		Aviao baraoVermelho;

		baraoVermelho = new Aviao("Fokker DR11", "Freiherr");
		baraoVermelho.imprimaOk();

		// set possibilita alteração do valor do atributo
		baraoVermelho.setModelo("Fokker DR1");
		baraoVermelho.setIdentificador("Freiherr");
		baraoVermelho.setMotor(false);
		baraoVermelho.setAltura(0.0f);
		baraoVermelho.ligarMotor();
		baraoVermelho.imprimeEstadoMotor();
		baraoVermelho.desligarMotor();
		baraoVermelho.imprimeEstadoMotor();

		System.out.println("Modelo: "+baraoVermelho.getModelo()+
							"\nId: "+baraoVermelho.getIdentificador()+
							"\nStatus Motor: "+baraoVermelho.getMotor()+
							"\nAltura: "+baraoVermelho.getAltura());
	}
}