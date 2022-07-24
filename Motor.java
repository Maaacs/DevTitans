public class Motor{

	private String modelo;
	private float potencia;
	private boolean ativo;


	Motor(String novoModelo, float novoPotencia){
		this.setModelo(novoM);
		this.setPotencia(0.0f);
		this.setMotor(false);
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
	public void setPotencia(String novoValor){
		this.potencia = novoValor;
	}

	public boolean getAtivo(){
		return this.ativo;
	}
	public void setAtivo(boolean novoValor){
		this.ativo = novoValor;
	}

	public void ligarMotor(){
		this.setMotor(true);
		System.out.println("....VRUMMMM");
	}
	public void desligarMotor(){
		this.setMotor(false);
		System.out.println("mmmmm.......");
	}
}