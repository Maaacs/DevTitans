//atributos
public class Aviao{

	private String modelo;
	private String identificador;
	private float altura;
	private Motor motorEsquerdo;// classe do tipo Motor
	private Motor motorDireito;// classe do tipo Motor
	private boolean estadoMotor;
	private float acelerar;
	private float desacelerar;

	// construtor que inicializa o objeto "Aviao" com os seguintes atributos:
	Aviao(String novoM, String novoId, Motor novoMotorEsquerdo, Motor novoMotorDireito){
		this.setModelo(novoM);
		this.setIdentificador(novoId);
		this.setAltura(0.0f);
		this.setMotorEsquerdo(novoMotorEsquerdo);
		this.setMotorDireito(novoMotorDireito);
		this.setAcelerar(0.0f);
		this.setDesacelerar(0.0f);
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

	public Motor getMotorEsquerdo(){
		return this.motorEsquerdo;
	}
	public void setMotorEsquerdo(Motor novoValor){
		this.motorEsquerdo = novoValor;
	}

	public Motor getMotorDireito(){
		return this.motorDireito;
	}
	public void setMotorDireito(Motor novoValor){	
		this.motorDireito = novoValor;
	}

	public float getAltura(){
		return this.altura;
	}
	public void setAltura(float novoValor){
		this.altura = novoValor;
	}

	public void ligarMotor(){
		this.getMotorEsquerdo().Ligar();//método ligar do objeto do tipo motor
		this.getMotorDireito().Ligar();
	}

	public void desligarMotor(){
		this.getMotorEsquerdo().Desligar();////método desligar do objeto do tipo motor
		this.getMotorDireito().Desligar();
	}

	public boolean getEstadoMotor(){
		if(this.getMotorEsquerdo().getAtivo() || this.getMotorDireito().getAtivo()){
			return true;
		}
		else{
			return false;
		}	
	}
	public void setEstadoMotor(boolean novoValor){
		this.estadoMotor = novoValor;
	}

	public void imprimeEstadoMotor(){ 
		if(this.getMotorEsquerdo().getAtivo() & this.getMotorDireito().getAtivo()){ 
			System.out.println("Os motores estão ligados.."); 
		} else if (this.getMotorEsquerdo().getAtivo()){ 
			System.out.println("Somento o motor Esquerdo está ligado.."); 
		} else if (this.getMotorDireito().getAtivo()){ 
			System.out.println("Somente o motor Direito está ligado.."); 
		} else {
			System.out.println("Os motores estão desligados.."); 
		}
	}

	public float getAcelerar(){
		return this.acelerar;
	}
	public void setAcelerar(float novoValor){
		if(this.getMotorEsquerdo().getAtivo() & this.getMotorDireito().getAtivo() ){
			this.acelerar = novoValor;
		}
		else if (this.getMotorEsquerdo().getAtivo() || this.getMotorDireito().getAtivo()){
			this.acelerar = novoValor - 50.0f;
		}
	}
	
	public float getDesacelerar(){
		return this.desacelerar;
	}
	public void setDesacelerar(float novoValor){
		if ((this.getMotorEsquerdo().getAtivo() == false & this.getMotorDireito().getAtivo()) == false){ 
			this.desacelerar = novoValor - 100.0f;
		}else if (this.getMotorEsquerdo().getAtivo() == false){ 
			this.desacelerar = novoValor - 50.0f;
		}else if (this.getMotorDireito().getAtivo() == false){ 
			this.desacelerar = novoValor - 50.0f;
		}
	}

	public void imprimaOk(){
		System.out.println("Ok");
	}
}