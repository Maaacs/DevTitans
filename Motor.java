public class Motor{

	private String modelo;
	private float potencia;
	private boolean ativo;

	// construtor que inicializa o objeto "Motor" com os atributos Modelo e Potencia
	Motor(String novoModelo, float novoValor){
		this.setModelo(novoModelo);
		this.setPotencia(0.0f);
		this.setAtivo(false);
	}

	// get retorna o valor de um atributo 
	public String getModelo(){
		return this.modelo;
	}
	// set possibilita alteração do valor do atributo
	public void setModelo(String novoValor){
		this.modelo = novoValor;
	}

	public float getPotencia(){
		return this.potencia;
	}
	public void setPotencia(float novoValor){
		this.potencia = novoValor;
	}

	public boolean getAtivo(){
		return this.ativo;
	}
	public void setAtivo(boolean novoValor){
		this.ativo = novoValor;
	}

	public void ligarMotor(){
		this.setAtivo(true);
		System.out.println("....VRUMMMM");
	}
	public void desligarMotor(){
		this.setAtivo(false);
		System.out.println("mmmmm.......");
	}
}