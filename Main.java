class Main{
	public static void main (String[] args){

		Motor aeronauticoVeloz;
		Motor motorDireito;
		Motor motorEsquerdo;
		Aviao baraoVermelho;

		// inicializando variáveis
		motorDireito = new Motor(" ", 50.0f);
		motorEsquerdo = new Motor(" ", 50.0f);
		aeronauticoVeloz = new Motor(" ", 0.0f);
		baraoVermelho = new Aviao(" ", " ", motorEsquerdo, motorDireito);
		baraoVermelho.imprimaOk();

		// set possibilita alteração do valor do atributo
		aeronauticoVeloz.setModelo("Turbofan"); //adiciona dados em cada método getset 
		aeronauticoVeloz.setPotencia(50.0f);
		baraoVermelho.setModelo("Fokker DR1");
		baraoVermelho.setIdentificador("Freiherr");
		baraoVermelho.setAltura(60.0f);
		baraoVermelho.getMotorEsquerdo().setAtivo(true);
		baraoVermelho.getMotorDireito().setAtivo(true);
		baraoVermelho.setAcelerar(100.0f);
		baraoVermelho.setDesacelerar(100.0f);


		System.out.println("Motor: "+aeronauticoVeloz.getModelo()+
							"\nPotencia: "+aeronauticoVeloz.getPotencia()+
							"\nModelo: "+baraoVermelho.getModelo()+
							"\nId: "+baraoVermelho.getIdentificador()+
							//"\nStatus Motor: "+baraoVermelho.getMotor()+
							"\nAltura: "+baraoVermelho.getAltura()+
							"\nPassageiro: "+tripulacaoVoo.getPrimeiroNome() +tripulacaoVoo.getUltimoNome());
		
		baraoVermelho.imprimeEstadoMotor();
		aeronauticoVeloz.Ligar();
		aeronauticoVeloz.Desligar();

		System.out.println("Acelerando: "+baraoVermelho.getAcelerar()+
							"\nDesacelerando: "+baraoVermelho.getDesacelerar());


	}
}
