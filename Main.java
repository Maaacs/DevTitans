import java.util.ArrayList;

class Main{
	public static void main (String[] args){

		Motor aeronauticoVeloz;
		Motor motorDireito;
		Motor motorEsquerdo;
		Aviao baraoVermelho;
		Passageiro tripulacaoVoo;

		// inicializando variáveis // adiciona dados direto no construtor da classe
		motorDireito = new Motor(" ", 50.0f);
		motorEsquerdo = new Motor(" ", 50.0f);
		aeronauticoVeloz = new Motor(" ", 0.0f);
		baraoVermelho = new Aviao(" ", " ", motorEsquerdo, motorDireito);

		Passageiro[] ListaPassageiros = new Passageiro[5];
		ListaPassageiros[0] = new Passageiro("Cruzes", "Vales", "22233344455");
		ListaPassageiros[1] = new Passageiro("Jorginho", "Jovem", "33344455566");
		ListaPassageiros[2] = new Passageiro("Yakisoba", "Kents", "44455566677");
		ListaPassageiros[3] = new Passageiro("Macarrones", "Frius", "55566677788");
		ListaPassageiros[4] = new Passageiro("Vegetas", "Maduro", "66677788899");

		//ArrayList<Passageiro> ListaPassageiros2 = new ArrayList<Passageiro>();


		// set possibilita alteração do valor do atributo
		baraoVermelho.setModelo("Fokker DR1");
		aeronauticoVeloz.setModelo("Turbofan"); //adiciona dados em cada método getset 
		aeronauticoVeloz.setPotencia(50.0f);
		baraoVermelho.setIdentificador("Freiherr");
		baraoVermelho.setAltura(0.0f);

		baraoVermelho.imprimaOk();
		System.out.println("\nModelo: "+baraoVermelho.getModelo()+
							"\nMotor: "+aeronauticoVeloz.getModelo()+
							"\nPotencia: "+aeronauticoVeloz.getPotencia()+
							"\nId: "+baraoVermelho.getIdentificador()+
							"\nAltura: "+baraoVermelho.getAltura());

		System.out.println("\n");
		//baraoVermelho.getMotorEsquerdo().Ligar();
		//baraoVermelho.getMotorDireito().Desligar();

		// FOR do AdicionarPassageiro Get Set
		/*for (int i = 0; i < ListaPassageiros.length;i++){
			if(ListaPassageiros[i] != null)
				baraoVermelho.setAdicionarPassageiro(ListaPassageiros[i]);
		}*/

		baraoVermelho.ligarMotor();
		//Embarcandos os passageiros
		for (int i = 0; i < ListaPassageiros.length;i++){
			if(ListaPassageiros[i] != null){
				System.out.println("\n"+ListaPassageiros[i].getPrimeiroNome()+" "+ListaPassageiros[i].getUltimoNome()+" "+"embarcou na aeronave!" );
				baraoVermelho.adicionarPassageiro(ListaPassageiros[i]);
			}
		}

		baraoVermelho.acelerar();
		baraoVermelho.acelerar();
		baraoVermelho.imprimirListaDePassageiros();
		baraoVermelho.getBuscarPassageiroPorCPF("66677788899");
		baraoVermelho.desembarcarPassageiros();
		baraoVermelho.desacelerar();
		baraoVermelho.desacelerar();
		baraoVermelho.desembarcarPassageiros();

		//System.out.println(baraoVermelho.getBuscarPassageiroPorCPF("66677788899").getCPF()); 

	}
}

