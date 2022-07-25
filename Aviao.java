import java.util.Date;
//package material.heranca;

public class Aviao{

	private String modelo;
	private String identificador;
	private float altura;
	private boolean motorEsquerdo;
	private boolean motorDireito;
	private boolean estadoMotor;
	private float acelerar;
	private float desacelerar;

	// construtor que inicializa o objeto "Aviao" com os seguintes atributos:
	Aviao(String novoM, String novoId){
		this.setModelo(novoM);
		this.setIdentificador(novoId);
		this.setAltura(0.0f);
		this.setMotorEsquerdo(false);
		this.setMotorDireito(false);
		//this.estadoMotor(false);
		//this.acelerar(0.0f);
		//this.desacelerar(0.0f);
	}

	// get retorna o valor de um atributo 
	public String getModelo(){
		return this.modelo;
	}
	// set possibilita alteração do valor do atributo
	public void setModelo(String novoValor){
		this.modelo = novoValor;
	}


	public String getIdentificador(){
		return this.identificador;
	}
	public void setIdentificador(String novoValor){
		this.identificador = novoValor;
	}

	public boolean getMotorEsquerdo(){
		return this.motorEsquerdo;
	}
	public void setMotorEsquerdo(boolean novoValor){
		this.motorEsquerdo = novoValor;
	}

	public boolean getMotorDireito(){
		return this.motorDireito;
	}
	public void setMotorDireito(boolean novoValor){	
		this.motorDireito = novoValor;
	}

	public float getAltura(){
		return this.altura;
	}
	public void setAltura(float novoValor){
		this.altura = novoValor;
	}

	// continuar os métodos ligar e desligar motor
	public void ligarMotor(){
		this.getMotorEsquerdo();
		this.getMotorDireito();
	}

	public void desligarMotor(){
		this.getMotorEsquerdo();
		this.getMotorDireito();
	}

	public boolean getEstadoMotor(){
		if(this.getMotorEsquerdo() || this.getMotorDireito()){
			return(true);
		}
		else{
			return(false);
		}	
	}
	public void setEstadoMotor(boolean novoValor){
		this.estadoMotor = novoValor;
	}

	public void imprimeEstadoMotor(){
		if(this.getMotorEsquerdo() & this.getMotorDireito()){
			System.out.println("Os motores estão ligados..");
		}
		else if (this.getMotorEsquerdo()){
			System.out.println("Somento o motor Esquerdo está ligado..");
		}
		else if (this.getMotorDireito()){
			System.out.println("Somente o motor Direito está ligado..");
		}
		else{
			System.out.println("Os motores estão desligados..");
		}
	}

	//corrigir os métodos Acelerar e Desacelerar
	/*public float getAcelerar(){
		return this.acelerar;
	}
	public void setAcelerar(float novoValor){
		if(ligarMotor()){ //corrigir 
			this.acelerar = novoValor;
		}

	}
	public float getDesacelerar(){
		return this.desacelerar;
	}
	public void setDesacelerar(float novoValor){
		if (desligarMotor()){ //corrigir 
			this.desacelerar = novoValor;

		}
	}*/

	public void imprimaOk(){
		System.out.println("Ok");
	}
}