class Main{

	public static void main(String[] args){
	
	     Aviao baraoVermelho;
	     Motor motor1,motor2;
	     Passageiro pass01,pass02,pass03;
	     MotorTurbinado nitro;
	     
	    nitro = new MotorTurbinado(" ", 0.0f); 
	    pass01 = new Passageiro("Fulano","de XPTO","1234");
	    pass02 = new Passageiro("Beltrana","de XPTO","3456");
	    pass03 = new Passageiro("Cicraninho","de XPTO","6789"); 
	          
	     motor1 = new Motor("Siemens-Halske", 50f);
	     motor2 = new Motor("Siemens-Halske", 50f);  
	     baraoVermelho = new Aviao("Fokker DR1","Freiherr",motor1,motor2);     
	     baraoVermelho.imprimaOk();
          
	     System.out.println("Modelo: "+baraoVermelho.getModelo()+
	     			"\nId: "+baraoVermelho.getIdentificador()+
	     			"\nAltura: "+baraoVermelho.getAltura());
	     			
	     			
	     			
	     nitro.ligar();			     
	   /* baraoVermelho.ligarMotor();
	    baraoVermelho.adicionarPassageiro(pass01);
	    baraoVermelho.adicionarPassageiro(pass02);
	    baraoVermelho.adicionarPassageiro(pass03);
	    baraoVermelho.imprimeEstadoMotor(); 		
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



