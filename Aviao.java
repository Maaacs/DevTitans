
public class Aviao{

	private String modelo;
	private String identificador;
	private boolean motor;
	private float altura;

	Aviao(String novoM, String novoId){
		this.setModelo(novoM);
		this.setIdentificador(novoId);
		this.setMotor(false);
		this.setAltura(0.0f);
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

	public boolean getMotor(){
		return this.motor;
	}
	public void setMotor(boolean novoValor){
		this.motor = novoValor;
	}

	public float getAltura(){
		return this.altura;
	}
	public void setAltura(float novoValor){
		this.altura = novoValor;
	}

	public void ligarMotor(){
		this.setMotor(true);
		System.out.println("Vrummmmmmm");
	}
	public void desligarMotor(){
		this.setMotor(false);
		System.out.println("........");
	}

	public void imprimeEstadoMotor(){
		if(this.getMotor()){
			System.out.println("O motor está ligado..");
		}
		else{
			System.out.println("O motor está desligado..");
		}
	}

	public void imprimaOk(){
		System.out.println("Ok");
	}
}