<<<<<<< HEAD
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
=======
class Main{

	public static void main(String[] args){
	
	     Aviao baraoVermelho;
	     Motor motor1,motor2;
	     Passageiro pass01,pass02,pass03;
	     MotorTurbinado nitro;
	     AguiaGigante aguiaTenebrosa;
	     AguiaGigante aguiaBranca;
	     

	    aguiaTenebrosa = new AguiaGigante(1.000f, " ", 200.0f, true);
	    aguiaBranca = new AguiaGigante(1.000f, " ", 200.0f, true); 
	    nitro = new MotorTurbinado(" ", 0.0f); 
	    pass01 = new Passageiro("Cruzes", "Vales", "22233344455");
	    pass02 = new Passageiro("Jorginho", "Jovem", "33344455566");
	    pass03 = new Passageiro("Yakisoba", "Kents", "44455566677"); 
	          
	     motor1 = new Motor("Siemens-Halske", 50f);
	     motor2 = new Motor("Siemens-Halske", 50f);  
	     baraoVermelho = new Aviao("Fokker DR1","Freiherr",motor1,motor2);     
	     baraoVermelho.imprimaOk();
          
	     System.out.println("Modelo: "+baraoVermelho.getModelo()+
	     			"\nId: "+baraoVermelho.getIdentificador()+
	     			"\nAltura: "+baraoVermelho.getAltura());
	     			
	     			
	    baraoVermelho.setMotorEsquerdo(aguiaBranca);
	    baraoVermelho.setMotorDireito(aguiaTenebrosa);
	    aguiaTenebrosa.ligar();
	    aguiaTenebrosa.desligar();
	    aguiaBranca.ligar(); 
	    aguiaBranca.desligar();
	    baraoVermelho.ligarMotor();
		nitro.ligar();	

	   	/*baraoVermelho.ligarMotor();
	    baraoVermelho.adicionarPassageiro(pass01);
	    baraoVermelho.adicionarPassageiro(pass02);
	    baraoVermelho.adicionarPassageiro(pass03);
	    baraoVermelho.imprimirListaDePassageiros();
	    baraoVermelho.desembarcaPassageiros();*/
	    /*baraoVermelho.imprimeEstadoMotor(); 		
	    baraoVermelho.desligarMotor();
	    baraoVermelho.imprimeEstadoMotor();  
	    
	    baraoVermelho.ligarMotor();	    
	    baraoVermelho.acelerar();
	    baraoVermelho.acelerar();
	    baraoVermelho.desligarMotor();
	    baraoVermelho.acelerar();
	    
	    baraoVermelho.ligarMotor();
	    baraoVermelho.desacelerar();
	    baraoVermelho.desacelerar();
	    baraoVermelho.desacelerar();
	    baraoVermelho.desligarMotor();
	    baraoVermelho.desacelerar();
	    
	    baraoVermelho.ligarMotor();
	    baraoVermelho.acelerar();
	    baraoVermelho.acelerar();	
	    baraoVermelho.acelerar();
	    baraoVermelho.acelerar();    
	    baraoVermelho.acelerar();    
	    baraoVermelho.desacelerar();
	    baraoVermelho.desacelerar();
	    baraoVermelho.desacelerar();
	    baraoVermelho.desacelerar();
	    baraoVermelho.desacelerar();
	    baraoVermelho.desacelerar();*/
	   
	    	 			
	}
}


/*
 
 baraoVermelho.setModelo("Fokker DR1");
	     baraoVermelho.setIdentificador("Freiherr");
	     baraoVermelho.setMotor(false);
	     baraoVermelho.setAltura(0.0f);
	     
	    Passageiro pass01,pass02,pass03;
	     
	    pass01 = new Passageiro("Fulano","de XPTO","1234");
	    pass02 = new Passageiro("Beltrana","de XPTO","3456");
	    pass03 = new Passageiro("Cicraninho","de XPTO","6789"); 
	     
	    baraoVermelho.adicionarPassageiro(pass01);
	    baraoVermelho.adicionarPassageiro(pass02);
	    baraoVermelho.adicionarPassageiro(pass03);
	     
	    baraoVermelho.imprimirListaDePassageiros();
	    System.out.println(baraoVermelho.buscaPassageiroPorCpf("1234").getPrimeiroNome());	
	    
	    baraoVermelho.imprimirListaDePassageiros();
	    baraoVermelho.desembarcaPassageiros(); 
	     
	     
*/


>>>>>>> LAB03

