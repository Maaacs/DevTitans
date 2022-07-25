class Main{
	public static void main (String[] args){

		Motor aeronauticoVeloz;
		Aviao baraoVermelho;

		// inicializando variáveis
		aeronauticoVeloz = new Motor(" ", 0.0f);
		baraoVermelho = new Aviao(" ", " ");
		baraoVermelho.imprimaOk();

		// set possibilita alteração do valor do atributo
		aeronauticoVeloz.setModelo("Turbofan");
		aeronauticoVeloz.setPotencia(50.0f);
		baraoVermelho.setModelo("Fokker DR1");
		baraoVermelho.setIdentificador("Freiherr");
		baraoVermelho.setAltura(0.0f);
		baraoVermelho.setMotorEsquerdo(false);
		baraoVermelho.setMotorDireito(true);



		System.out.println("Motor: "+aeronauticoVeloz.getModelo()+
							"\nPotencia: "+aeronauticoVeloz.getPotencia()+
							"\nModelo: "+baraoVermelho.getModelo()+
							"\nId: "+baraoVermelho.getIdentificador()+
							//"\nStatus Motor: "+baraoVermelho.getMotor()+
							"\nAltura: "+baraoVermelho.getAltura());

		baraoVermelho.imprimeEstadoMotor();
		//baraoVermelho.imprimeEstadoMotor();
		aeronauticoVeloz.Ligar();
		aeronauticoVeloz.Desligar();

	}
}
